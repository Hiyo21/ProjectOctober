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
		
		
		
		List<Highchart4Add> listJubu1 = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listFree1 = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listOther1 = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listCompany1 = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listStudent1 = new ArrayList<Highchart4Add>();
		List<Highchart4Add> listExpert1 = new ArrayList<Highchart4Add>();
		

		for(Highchart4 temp : list){
			if(temp.getCstJob().equals("주부")){
				vo1.setJubu1(temp.getMoneyflow());
			}else if(temp.getCstJob().equals("프리랜서")){
				vo2.setFree1(temp.getMoneyflow());
			}else if(temp.getCstJob().equals("기타")){
				vo3.setOther1(temp.getMoneyflow());
			}else if(temp.getCstJob().equals("회사원")){
				vo4.setCompany1(temp.getMoneyflow());
			}else if(temp.getCstJob().equals("학생")){
				vo5.setStudent1(temp.getMoneyflow());
			}else if(temp.getCstJob().equals("전문직")){
				vo6.setExpert1(temp.getMoneyflow());
			}
		}
		
		
		listJubu1.add(vo1);
		listFree1.add(vo2);
		listOther1.add(vo3);
		listCompany1.add(vo4);
		listStudent1.add(vo5);
		listExpert1.add(vo6);
		
		
		
		
		
			
		request.put("listJubu1",listJubu1);
		request.put("listFree1",listFree1);
		request.put("listOther1",listOther1);
		request.put("listCompany1",listCompany1);
		request.put("listStudent1",listStudent1);
		request.put("listExpert1",listExpert1);
		
				
		return SUCCESS;
	}


}
