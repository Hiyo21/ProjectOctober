package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import test.dao.DAO;
import test.vo.Highchart4;

public class Action4 extends ActionSupport implements RequestAware{
	private Map<String, Object> request;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	public String highchart4(){
		DAO dao = new DAO();
		List<Highchart4> list = dao.highchart4DAO();
		System.out.println(list.toString()+"여기");
		
		List<Highchart4> listJubu = new ArrayList<Highchart4>();
		List<Highchart4> listFree = new ArrayList<Highchart4>();
		List<Highchart4> listOther = new ArrayList<Highchart4>();
		List<Highchart4> listCompany = new ArrayList<Highchart4>();
		List<Highchart4> listStudent = new ArrayList<Highchart4>();
		List<Highchart4> listExpert = new ArrayList<Highchart4>();
		

		for(Highchart4 temp : list){
			if(temp.getCstJob().equals("주부")){
				listJubu.add(temp);
			}else if(temp.getCstJob().equals("프리랜서")){
				listFree.add(temp);
			}else if(temp.getCstJob().equals("기타")){
				listOther.add(temp);
			}else if(temp.getCstJob().equals("회사원")){
				listCompany.add(temp);
			}else if(temp.getCstJob().equals("학생")){
				listStudent.add(temp);
			}else if(temp.getCstJob().equals("전문직")){
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
