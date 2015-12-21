package test.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import test.dao.DAO;
import test.vo.Highchart13;

public class Action13 extends ActionSupport implements RequestAware{
	private Map<String, Object> request;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	
	public String highchart13(){
		DAO dao = new DAO();
		List<Highchart13> list = dao.highchart13DAO();
		List<Highchart13> list1 = dao.highchart13DAO1();
		List<Highchart13> list2 = dao.highchart13DAO2();
		List<Highchart13> list3 = dao.highchart13DAO3();
		List<Highchart13> list4 = dao.highchart13DAO4();
		
		return SUCCESS;
	}



}
