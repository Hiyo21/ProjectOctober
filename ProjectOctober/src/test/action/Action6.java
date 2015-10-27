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
		List<Highchart6Add> timelist1 = new ArrayList<Highchart6Add>();
		for(Highchart6 temp : list){
			
			if(temp.getTimeHour().equals("00")){
				vo.setTime00(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("01")){
				vo.setTime01(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("02")){
				vo.setTime02(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("03")){
				vo.setTime03(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("04")){
				vo.setTime04(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("05")){
				vo.setTime05(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("06")){
				vo.setTime06(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("07")){
				vo.setTime07(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("08")){
				vo.setTime08(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("09")){
				vo.setTime09(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("10")){
				vo.setTime010(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("11")){
				vo.setTime011(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("12")){
				vo.setTime012(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("13")){
				vo.setTime013(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("14")){
				vo.setTime014(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("15")){
				vo.setTime015(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("16")){
				vo.setTime016(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("17")){
				vo.setTime017(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("18")){
				vo.setTime018(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("19")){
				vo.setTime019(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("20")){
				vo.setTime020(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("21")){
				vo.setTime021(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("22")){
				vo.setTime022(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("23")){
				vo.setTime023(temp.getAmountSum());
			}else if(temp.getTimeHour().equals("24")){
				vo.setTime024(temp.getAmountSum());
			}
			
			
		}
		timelist1.add(vo);
		
		request.put("timelist1", timelist1);
		System.out.println(timelist1.toString()+"highchart6");
		
		
		
		
		
		return SUCCESS;
	}
	
	
	
	
}
