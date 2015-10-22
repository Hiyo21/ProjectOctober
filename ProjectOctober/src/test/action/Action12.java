package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.EnterpriseDAO;
import model.vo.Enterprise;
import test.dao.DAO;
import test.vo.Highchart11;
import test.vo.Highchart12;

public class Action12 extends ActionSupport implements RequestAware{
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
	
	public String highchart12(){
		DAO dao = new DAO();
		Enterprise e = enterprise.selectByEtpEmail(etpEmail);
		System.err.println(e);
		List<Highchart12> list = dao.highchart12DAO(e);
		
		List<Highchart12> service1 = new ArrayList<Highchart12>();
		List<Highchart12> service2 = new ArrayList<Highchart12>();
		List<Highchart12> service3 = new ArrayList<Highchart12>();
		List<Highchart12> service4 = new ArrayList<Highchart12>();
		List<Highchart12> service5 = new ArrayList<Highchart12>();
		List<Highchart12> service6 = new ArrayList<Highchart12>();
		List<Highchart12> service7 = new ArrayList<Highchart12>();
		List<Highchart12> service8 = new ArrayList<Highchart12>();
		List<Highchart12> service9 = new ArrayList<Highchart12>();
		
				
		for(Highchart12 temp : list){
			if(temp.getService().equals("경락마사지")){
				service1.add(temp);
			}else if(temp.getService().equals("슬리밍케어")){
				service2.add(temp);
			}else if(temp.getService().equals("타이마사지")){
				service3.add(temp);
			}else if(temp.getService().equals("발마사지")){
				service4.add(temp);
			}else if(temp.getService().equals("웨딩관리")){
				service5.add(temp);
			}else if(temp.getService().equals("카이로프랙틱")){
				service6.add(temp);
			}else if(temp.getService().equals("바디마사지")){
				service7.add(temp);
			}else if(temp.getService().equals("페이스마사지")){
				service8.add(temp);
			}else if(temp.getService().equals("아로마마사지")){
				service9.add(temp);
			}			
		}
		
		
			
		request.put("service1",service1);
		request.put("service2",service2);
		request.put("service3",service3);
		request.put("service4",service4);
		request.put("service5",service5);
		request.put("service6",service6);
		request.put("service7",service7);
		request.put("service8",service8);
		request.put("service9",service9);
		
		
		return SUCCESS;
	}




}
