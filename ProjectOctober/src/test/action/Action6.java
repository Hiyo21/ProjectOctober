package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.EnterpriseDAO;
import model.vo.Enterprise;
import test.dao.DAO;
import test.vo.Highchart6;
import test.vo.Highchart6Add;

public class Action6 extends ActionSupport implements RequestAware {
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
	
	public String highchart6(){
		DAO dao = new DAO();
		Enterprise e = enterprise.selectByEtpEmail(etpEmail);
		System.err.println(e);
		List<Highchart6> list = dao.highchart6DAO(e);
		
		Highchart6Add vo = new Highchart6Add();
		List<Highchart6Add> timelist = new ArrayList<Highchart6Add>();
		for(Highchart6 temp : list){
			
			if(temp.getTimeHour().equals("00")){
				vo.setTime0(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("01")){
				vo.setTime1(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("02")){
				vo.setTime2(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("03")){
				vo.setTime3(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("04")){
				vo.setTime4(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("05")){
				vo.setTime5(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("06")){
				vo.setTime6(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("07")){
				vo.setTime7(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("08")){
				vo.setTime8(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("09")){
				vo.setTime9(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("10")){
				vo.setTime10(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("11")){
				vo.setTime11(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("12")){
				vo.setTime12(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("13")){
				vo.setTime13(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("14")){
				vo.setTime14(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("15")){
				vo.setTime15(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("16")){
				vo.setTime16(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("17")){
				vo.setTime17(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("18")){
				vo.setTime18(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("19")){
				vo.setTime19(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("20")){
				vo.setTime20(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("21")){
				vo.setTime21(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("22")){
				vo.setTime22(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("23")){
				vo.setTime23(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("24")){
				vo.setTime24(temp.getAmountSum());
			}
			
			
		}
		timelist.add(vo);
		
		request.put("timelist", timelist);
		System.out.println(timelist.toString());
		
		
		
		
		
		return SUCCESS;
	}
	
	
	
	
}
