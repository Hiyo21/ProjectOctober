package test.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import test.dao.DAO;
import test.vo.Highchart14;

public class Action14 extends ActionSupport implements RequestAware{
	private Map<String, Object> request;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	
	public String highchart14(){
		DAO dao = new DAO();
		List<Highchart14> gunList = dao.highchart14DAO();	
		
		request.put("gunList", gunList);
		return SUCCESS;
	}
	
	


	public Map<String, Object> getRequest() {
		return request;
	}



}
