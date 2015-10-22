package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import test.dao.DAO;
import test.vo.Highchart4;
import test.vo.Highchart4Add;

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
		
		Highchart4Add vo1 = new Highchart4Add();
		Highchart4Add vo2 = new Highchart4Add();
		Highchart4Add vo3 = new Highchart4Add();
		Highchart4Add vo4 = new Highchart4Add();
		Highchart4Add vo5 = new Highchart4Add();
		Highchart4Add vo6 = new Highchart4Add();
		
		List<Highchart4Add> listJubu = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listFree = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listOther = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listCompany = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listStudent = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listExpert = new ArrayList<Highchart4Add>();
		Highchart4Add vo1 = new Highchart4Add();
		Highchart4Add vo2 = new Highchart4Add();
		Highchart4Add vo3 = new Highchart4Add();
		Highchart4Add vo4 = new Highchart4Add();
		Highchart4Add vo5 = new Highchart4Add();
		Highchart4Add vo6 = new Highchart4Add();
		
		
		
		List<Highchart4Add> listJubu1 = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listFree1 = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listOther1 = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listCompany1 = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listStudent1 = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listExpert1 = new ArrayList<Highchart4Add>();
		

		for(Highchart4 temp : list){
			if(temp.getCstJob().equals("주부")){
				vo1.setJubu(temp.getMoneyflow());
			}else if(temp.getCstJob().equals("프리랜서")){
				vo2.setFree(temp.getMoneyflow());
			}else if(temp.getCstJob().equals("기타")){
				vo3.setOther(temp.getMoneyflow());
			}else if(temp.getCstJob().equals("회사원")){
				vo4.setCompany(temp.getMoneyflow());
			}else if(temp.getCstJob().equals("학생")){
				vo5.setStudent(temp.getMoneyflow());
			}else if(temp.getCstJob().equals("전문직")){
				vo6.setExpert(temp.getMoneyflow());
			}
		}
		
		
		listJubu.add(vo1);
		listFree.add(vo2);
		listOther.add(vo3);
		listCompany.add(vo4);
		listStudent.add(vo5);
		listExpert.add(vo6);
		
		
		
		
		
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
