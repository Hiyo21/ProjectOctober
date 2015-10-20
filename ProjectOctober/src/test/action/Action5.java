package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import test.dao.DAO;
import test.vo.Highchart5;
import test.vo.Highchart5Add;

public class Action5 extends ActionSupport implements RequestAware{
	private Map<String, Object> request;
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public String highchart5(){
		DAO dao = new DAO();
		List<Highchart5> list = dao.highchart5DAO();
		
		Highchart5Add vo = new Highchart5Add();
		List<Highchart5Add> daylist = new ArrayList<Highchart5Add>();
		System.out.println(list.toString()+"1");
		
		for(Highchart5 temp : list){
			if(temp.getDayby().equals("월요일")){
				vo.setMon(temp.getRs());
			}else if(temp.getDayby().equals("화요일")){
				vo.setTue(temp.getRs());
			}else if(temp.getDayby().equals("수요일")){
				vo.setWed(temp.getRs());
			}else if(temp.getDayby().equals("목요일")){
				vo.setThur(temp.getRs());
			}else if(temp.getDayby().equals("금요일")){
				vo.setFri(temp.getRs());
			}else if(temp.getDayby().equals("토요일")){
				vo.setSat(temp.getRs());
			}else if(temp.getDayby().equals("일요일")){
				vo.setSun(temp.getRs());
			}
			
			
		}
		daylist.add(vo);
		request.put("dayForReservation", daylist);
		
		System.out.println(daylist.toString()+"2");
		
		
		
		return SUCCESS;
	}
}
