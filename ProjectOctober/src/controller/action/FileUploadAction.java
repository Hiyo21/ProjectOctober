package controller.action;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.common.VOFactory;
import model.dao.EnterpriseDAO;
import model.vo.Enterprise;
import model.vo.PhotoLocation;

public class FileUploadAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private String etpNum;
	private String etpEmail;
	private File fileToUpload;
	private String fileToUploadContentType;		
	private String fileToUploadFileName;
	private boolean uploaded;
	private EnterpriseDAO etpDAO;
	private String locAddress;
	private PhotoLocation loc;
	File saveFile;
	
	private File imageToUpload;
	private String imageToUploadContentType;		
	private String imageToUploadFileName;
	
	private Map<String, Object> session;
	
	public FileUploadAction() {
		etpDAO = DAOFactory.createEnterpriseDAO();
	}
	
	public String uploadRegCard() throws Exception{
		System.err.println(etpNum);
		System.err.println(etpEmail);
		String uploadPath = getText("file.uploadRegCardPath");
		System.err.println(ServletActionContext.getServletContext().getRealPath("/") + uploadPath);
		File dir = new File(uploadPath);
		if (!dir.isDirectory()) dir.mkdirs();
		
		if(fileToUpload != null && fileToUpload.exists()){
			locAddress = uploadPath + "/" + etpNum + "_" + fileToUploadFileName;
			if(etpNum != null) saveFile = new File(ServletActionContext.getServletContext().getRealPath("/") + locAddress);
			else saveFile = new File(uploadPath + fileToUploadFileName);
			FileUtils.copyFile(fileToUpload, saveFile);
		}else{
			uploaded= false;
		}
		uploaded = true;
		Enterprise etp = etpDAO.selectByEtpNum(etpNum);
		loc = VOFactory.createPhotoLocation().setEtpEmail(etp.getEtpEmail()).setEtpNum(etp.getEtpNum()).setPhtUsage("reg").setPhtAddress(locAddress).setPhtDescription("사업자: " + etp.getEtpEmail() + "의 사업자 등록증입니다.");
		
		int result = etpDAO.uploadRegCard(loc);
		if(result == 0) return "input";
		else return "success";
	}
	
	public String uploadImage() throws Exception{
		etpEmail = (String)session.get("loginId");
		etpNum = (String)session.get("loginEtpNum");
		System.err.println(etpNum);
		System.err.println(etpEmail);
		String uploadPath = getText("file.uploadGalleryPath");
		System.err.println(ServletActionContext.getServletContext().getRealPath("/") + uploadPath);
		File dir = new File(uploadPath);
		if (!dir.isDirectory()) dir.mkdirs();
		
		if(imageToUpload != null && imageToUpload.exists()){
			locAddress = uploadPath + "/" + etpNum + "_" + imageToUploadFileName;
			if(etpNum != null) saveFile = new File(ServletActionContext.getServletContext().getRealPath("/") + locAddress);
			else saveFile = new File(uploadPath + imageToUploadFileName);
			FileUtils.copyFile(imageToUpload, saveFile);
		}else{
			uploaded= false;
		}
		uploaded = true;
		Enterprise etp = etpDAO.selectByEtpNum(etpNum);
		loc = VOFactory.createPhotoLocation().setEtpEmail(etp.getEtpEmail()).setEtpNum(etp.getEtpNum()).setPhtUsage("gal").setPhtAddress(locAddress).setPhtDescription("사업자: " + etp.getEtpEmail() + "의 업체 이미지입니다.");
		int result = etpDAO.uploadImage(loc);
		if(result == 0) return "input";
		else return "success";
	}
	
	public String uploadLogoImage() throws Exception{
		etpEmail = (String)session.get("loginId");
		etpNum = (String)session.get("loginEtpNum");
		System.err.println(etpNum);
		System.err.println(etpEmail);
		String uploadPath = getText("file.uploadLogoPath");
		System.err.println(ServletActionContext.getServletContext().getRealPath("/") + uploadPath);
		File dir = new File(uploadPath);
		if (!dir.isDirectory()) dir.mkdirs();
		
		if(imageToUpload != null && imageToUpload.exists()){
			locAddress = uploadPath + "/" + etpNum + "_" + imageToUploadFileName;
			if(etpNum != null) saveFile = new File(ServletActionContext.getServletContext().getRealPath("/") + locAddress);
			else saveFile = new File(uploadPath + imageToUploadFileName);
			FileUtils.copyFile(imageToUpload, saveFile);
		}else{
			uploaded= false;
		}
		uploaded = true;
		Enterprise etp = etpDAO.selectByEtpNum(etpNum);
		loc = VOFactory.createPhotoLocation().setEtpEmail(etp.getEtpEmail()).setEtpNum(etp.getEtpNum()).setPhtUsage("logo").setPhtAddress(locAddress).setPhtDescription("사업자: " + etp.getEtpEmail() + "의 업체 로고 이미지입니다.");
		int result = etpDAO.uploadLogoImage(loc);
		if(result == 0) return "input";
		else return "success";
	}
	
	public String uploadInfoImage() throws Exception{
		etpEmail = (String)session.get("loginId");
		etpNum = (String)session.get("loginEtpNum");
		System.err.println(etpNum);
		System.err.println(etpEmail);
		String uploadPath = getText("file.uploadInfoPath");
		System.err.println(ServletActionContext.getServletContext().getRealPath("/") + uploadPath);
		File dir = new File(uploadPath);
		if (!dir.isDirectory()) dir.mkdirs();
		
		if(imageToUpload != null && imageToUpload.exists()){
			locAddress = uploadPath + "/" + etpNum + "_" + imageToUploadFileName;
			if(etpNum != null) saveFile = new File(ServletActionContext.getServletContext().getRealPath("/") + locAddress);
			else saveFile = new File(uploadPath + imageToUploadFileName);
			FileUtils.copyFile(imageToUpload, saveFile);
		}else{
			uploaded= false;
		}
		uploaded = true;
		Enterprise etp = etpDAO.selectByEtpNum(etpNum);
		loc = VOFactory.createPhotoLocation().setEtpEmail(etp.getEtpEmail()).setEtpNum(etp.getEtpNum()).setPhtUsage("info").setPhtAddress(locAddress).setPhtDescription("사업자: " + etp.getEtpEmail() + "의 업체 정보 이미지입니다.");
		int result = etpDAO.uploadInfoImage(loc);
		if(result == 0) return "input";
		else return "success";
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

	public String getEtpNum() {
		return etpNum;
	}

	public void setEtpNum(String etpNum) {
		this.etpNum = etpNum;
	}

	public boolean isUploaded() {
		return uploaded;
	}

	public void setUploaded(boolean uploaded) {
		this.uploaded = uploaded;
	}

	public String getLocAddress() {
		return locAddress;
	}

	public void setLocAddress(String locAddress) {
		this.locAddress = locAddress;
	}

	public PhotoLocation getLoc() {
		return loc;
	}

	public void setLoc(PhotoLocation loc) {
		this.loc = loc;
	}

	public String getEtpEmail() {
		return etpEmail;
	}

	public void setEtpEmail(String etpEmail) {
		this.etpEmail = etpEmail;
	}

	public File getImageToUpload() {
		return imageToUpload;
	}

	public void setImageToUpload(File imageToUpload) {
		this.imageToUpload = imageToUpload;
	}

	public String getImageToUploadContentType() {
		return imageToUploadContentType;
	}

	public void setImageToUploadContentType(String imageToUploadContentType) {
		this.imageToUploadContentType = imageToUploadContentType;
	}

	public String getImageToUploadFileName() {
		return imageToUploadFileName;
	}

	public void setImageToUploadFileName(String imageToUploadFileName) {
		this.imageToUploadFileName = imageToUploadFileName;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	
	
	
}