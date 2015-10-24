package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.EnterpriseDAO;
import model.vo.Enterprise;
import test.dao.DAO;
import test.vo.Highchart1;
import test.vo.Highchart1Add;

public class Action1 extends ActionSupport implements RequestAware{
	private Map<String, Object> request;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	
	public String highchart1(){
		DAO dao = new DAO();
		List<Highchart1> list = dao.highchart1DAO();
		
		Highchart1Add av1 =  new Highchart1Add();
		Highchart1Add av2 =  new Highchart1Add();
		Highchart1Add av3 =  new Highchart1Add();
		Highchart1Add av4 =  new Highchart1Add();
	
	
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for(Highchart1 temp : list){
			
			
			if(temp.getRsvGender().equals("M")){
				if(temp.getcGender().equals("M")){ 
					
					if(temp.getAge()==1){
						av1.setFirst(temp.getCountGender());
					
					}else if(temp.getAge()==2){
						av1.setSecond(temp.getCountGender());
					
					}else if(temp.getAge()==3){
						av1.setThird(temp.getCountGender());
					}else if(temp.getAge()==4){
						av1.setForth(temp.getCountGender());
						
					}else{
						a += temp.getCountGender();
					}
				}else if(temp.getcGender().equals("F")){
					// ���� ����
					if(temp.getAge()==1){
						av2.setFirst(temp.getCountGender());
					}else if(temp.getAge()==2){
						av2.setSecond(temp.getCountGender());
					}else if(temp.getAge()==3){
						av2.setThird(temp.getCountGender());
					}else if(temp.getAge()==4){
						av2.setForth(temp.getCountGender());
					}else{
						b += temp.getCountGender();
					}
				}
			}else{
			// ����
				if(temp.getcGender().equals("M")){
					// ���� ����
					// ���� ����
					if(temp.getAge()==1){
						av3.setFirst(temp.getCountGender());
					}else if(temp.getAge()==2){
						av3.setSecond(temp.getCountGender());
					}else if(temp.getAge()==3){
						av3.setThird(temp.getCountGender());
					}else if(temp.getAge()==4){
						av3.setForth(temp.getCountGender());
					}else{
						c += temp.getCountGender();
					}
				}else if(temp.getcGender().equals("F")){
					// ���� ����
					if(temp.getAge()==1){
						av4.setFirst(temp.getCountGender());
					}else if(temp.getAge()==2){
						av4.setSecond(temp.getCountGender());
					}else if(temp.getAge()==3){
						av4.setThird(temp.getCountGender());
					}else if(temp.getAge()==4){
						av4.setForth(temp.getCountGender());
					}else{
						d += temp.getCountGender();
					}
				}
			}
		}
		
		av1.setFifth(a);
		av2.setFifth(b);
		av3.setFifth(c);
		av4.setFifth(d);
		
	
		List<Highchart1Add> resultList1 = new ArrayList();
		List<Highchart1Add> resultList2 = new ArrayList();
		List<Highchart1Add> resultList3 = new ArrayList();
		List<Highchart1Add> resultList4 = new ArrayList();
		
		resultList1.add(av1);
		resultList2.add(av2);
		resultList3.add(av3);
		resultList4.add(av4);
	
		request.put("resultList1", resultList1);
		request.put("resultList2", resultList2);
		request.put("resultList3", resultList3);
		request.put("resultList4", resultList4);
		
		
		System.out.println(resultList1.toString());
		
		
		return SUCCESS;
	}
}
