package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;


import test.dao.DAO;
import test.vo.Highchart2;


public class Action2 extends ActionSupport implements RequestAware {
	private Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request =request;
	}

	public String highchart2(){
		DAO dao = new DAO();
		List<Highchart2> list = dao.highchart2Dao();
		
		List<Highchart2> list10 = new ArrayList<Highchart2>();
		List<Highchart2> list20 = new ArrayList<Highchart2>();
		List<Highchart2> list30 = new ArrayList<Highchart2>();
		List<Highchart2> list40 = new ArrayList<Highchart2>();
		List<Highchart2> list50 = new ArrayList<Highchart2>();
	
		for(Highchart2 temp : list){
			int agetype = temp.getAge();
			if(agetype==1){
				list10.add(temp);
			}else if(agetype == 2){
				list20.add(temp);
			}else if(agetype ==3 ){
				list30.add(temp);
			}else if(agetype == 4){
				list40.add(temp);
			}else{
				list50.add(temp);
			}
			
		}
	/*	System.out.println(list10.toString());*/
		
		request.put("list10", list10);
		request.put("list20", list20);
		request.put("list30", list30);
		request.put("list40", list40);
		request.put("list50", list50);
		
		
		
		return SUCCESS;
	}
	
	
	
}
