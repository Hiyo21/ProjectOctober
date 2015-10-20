package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import test.dao.DAO;
import test.vo.Highchart2;
import test.vo.Highchart7;


public class Action7 extends ActionSupport implements RequestAware{
	private Map<String, Object> request;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	public String highchart7(){
		DAO dao = new DAO();
		List<Highchart7> list = dao.highchart7DAO();
		System.out.println(list.toString()+"여기");
		Highchart7 vo = new Highchart7();
		Highchart7 vo1 = new Highchart7();
		Highchart7 vo2 = new Highchart7();
		Highchart7 vo3 = new Highchart7();
		List<Highchart7> review = new ArrayList<Highchart7>();
		List<Highchart7> review1 = new ArrayList<Highchart7>();
		List<Highchart7> review2 = new ArrayList<Highchart7>();
		List<Highchart7> review3 = new ArrayList<Highchart7>();
		
		
		for(Highchart7 temp : list){
			
			if(temp.getQuater().equals("1")){
				vo.setHygiene(temp.getHygiene());
				vo.setComfort(temp.getComfort());
				vo.setPrice(temp.getPrice());
				vo.setService(temp.getService());
				vo.setTechnique(temp.getTechnique());
				
			}else if(temp.getQuater().equals("2")){
				vo1.setHygiene(temp.getHygiene());
				vo1.setComfort(temp.getComfort());
				vo1.setPrice(temp.getPrice());
				vo1.setService(temp.getService());
				vo1.setTechnique(temp.getTechnique());
			}else if(temp.getQuater().equals("3")){
				vo2.setHygiene(temp.getHygiene());
				vo2.setComfort(temp.getComfort());
				vo2.setPrice(temp.getPrice());
				vo2.setService(temp.getService());
				vo2.setTechnique(temp.getTechnique());
			}else if(temp.getQuater().equals("4")){
				vo3.setHygiene(temp.getHygiene());
				vo3.setComfort(temp.getComfort());
				vo3.setPrice(temp.getPrice());
				vo3.setService(temp.getService());
				vo3.setTechnique(temp.getTechnique());
			}
			
			
		}
		
		review.add(vo);
		review1.add(vo1);
		review2.add(vo2);
		review3.add(vo3);
		
		request.put("review", review);
		request.put("review1", review1);
		request.put("review2", review2);
		request.put("review3", review3);
		
		
		
		return SUCCESS;
	}

	
}
