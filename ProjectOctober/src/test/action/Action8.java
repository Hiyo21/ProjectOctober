package test.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.EnterpriseDAO;
import model.vo.Enterprise;
import test.dao.DAO;
import test.vo.Highchart8;

public class Action8 extends ActionSupport implements RequestAware{
	private Map<String, Object> request;
	private String etpEmail;
	EnterpriseDAO enterprise = new EnterpriseDAO();
	
	public String getEtpEmail() {
		return etpEmail;
	}


	public void setEtpEmail(String etpEmail) {
		this.etpEmail = etpEmail;
	}


	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
		
	
	public String highchart8(){
		DAO dao = new DAO();
				
		List<Highchart8> list = dao.highchart8DAO();
		List<Highchart8> list1 = dao.highchart8DAO1();
		
		System.out.println(list.toString());
		System.out.println(list1.toString());
		
		
		request.put("notDiscount", list);
		request.put("discount", list1);
		
		
		return SUCCESS;
	}





	
	
}
