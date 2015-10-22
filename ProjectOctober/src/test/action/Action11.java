package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import test.dao.DAO;
import test.vo.Highchart11;
import test.vo.Highchart4;

public class Action11 extends ActionSupport implements RequestAware {
	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request= request;
	}
	
	public String highchart11(){
		DAO dao = new DAO();
		List<Highchart11> list = dao.highchart11DAO();
		List<Highchart11> listJubu = new ArrayList<Highchart11>();
		List<Highchart11> listFree = new ArrayList<Highchart11>();
		List<Highchart11> listOther = new ArrayList<Highchart11>();
		List<Highchart11> listCompany = new ArrayList<Highchart11>();
		List<Highchart11> listStudent = new ArrayList<Highchart11>();
		List<Highchart11> listExpert = new ArrayList<Highchart11>();
		
		for(Highchart11 temp : list){
			if(temp.getJob().equals("주부")){
				listJubu.add(temp);
			}else if(temp.getJob().equals("프리랜서")){
				listFree.add(temp);
			}else if(temp.getJob().equals("기타")){
				listOther.add(temp);
			}else if(temp.getJob().equals("회사원")){
				listCompany.add(temp);
			}else if(temp.getJob().equals("학생")){
				listStudent.add(temp);
			}else if(temp.getJob().equals("전문직")){
				listExpert.add(temp);
			}
		}
		
		System.out.println(listJubu.toString());
			
		request.put("listJubu",listJubu);
		request.put("listFree",listFree);
		request.put("listOther",listOther);
		request.put("listCompany",listCompany);
		request.put("listStudent",listStudent);
		request.put("listExpert",listExpert);
		
		
		return SUCCESS;
	}
	
	
}
