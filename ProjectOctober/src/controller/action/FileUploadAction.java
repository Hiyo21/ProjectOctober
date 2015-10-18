package controller.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport implements ServletRequestAware{
	private static final long serialVersionUID = 1L;

	//private static final String uploadPath = servletReques; //끝나는 라인에 / 꼭 넣기.
	
	private File fileToUpload;
	private String fileToUploadContentType;		
	private String fileToUploadFileName;
	private HttpServletRequest servletRequest;
	
	File saveFile;
	
	public String execute() throws Exception{
		String uploadPath = servletRequest.getSession().getServletContext().getRealPath("/");
		System.out.println(uploadPath);
		
		if(fileToUpload != null && fileToUpload.exists()){
			saveFile = new File(uploadPath + fileToUploadFileName);
			FileUtils.copyFile(fileToUpload, saveFile);
		}
		
		
		return "success";
	}

	public File getFileToUpload() {
		return fileToUpload;
	}

	public String getFileToUploadContentType() {
		return fileToUploadContentType;
	}

	public String getFileToUploadFileName() {
		return fileToUploadFileName;
	}

	public void setFileToUpload(File fileToUpload) {
		this.fileToUpload = fileToUpload;
	}

	public void setFileToUploadContentType(String fileToUploadContentType) {
		this.fileToUploadContentType = fileToUploadContentType;
	}

	public void setFileToUploadFileName(String fileToUploadFileName) {
		this.fileToUploadFileName = fileToUploadFileName;
	}

	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.servletRequest = request;
	}
}
