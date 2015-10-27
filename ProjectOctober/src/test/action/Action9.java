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
import test.vo.Highchart9Add;
import test.vo.Highchart9;

public class Action9 extends ActionSupport implements RequestAware{
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
	
	public String highchart9(){
		DAO dao = new DAO();
		
		Enterprise e = enterprise.selectByEtpEmail(etpEmail);
		System.err.println(e);		
		List<Highchart9> list = dao.highchart9DAO(e);
		
		Highchart9Add vo = new Highchart9Add();
		List<Highchart9Add> timelist2 = new ArrayList<Highchart9Add>();
		for(Highchart9 temp : list){
			
			if(temp.getTime().equals("00")){
				vo.setTime0(temp.getTotal());
			}else if(temp.getTime().equals("01")){
				vo.setTime1(temp.getTotal());
			}else if(temp.getTime().equals("02")){
				vo.setTime2(temp.getTotal());
			}else if(temp.getTime().equals("03")){
				vo.setTime3(temp.getTotal());
			}else if(temp.getTime().equals("04")){
				vo.setTime4(temp.getTotal());
			}else if(temp.getTime().equals("05")){
				vo.setTime5(temp.getTotal());
			}else if(temp.getTime().equals("06")){
				vo.setTime6(temp.getTotal());
			}else if(temp.getTime().equals("07")){
				vo.setTime7(temp.getTotal());
			}else if(temp.getTime().equals("08")){
				vo.setTime8(temp.getTotal());
			}else if(temp.getTime().equals("09")){
				vo.setTime9(temp.getTotal());
			}else if(temp.getTime().equals("10")){
				vo.setTime10(temp.getTotal());
			}else if(temp.getTime().equals("11")){
				vo.setTime11(temp.getTotal());
			}else if(temp.getTime().equals("12")){
				vo.setTime12(temp.getTotal());
			}else if(temp.getTime().equals("13")){
				vo.setTime13(temp.getTotal());
			}else if(temp.getTime().equals("14")){
				vo.setTime14(temp.getTotal());
			}else if(temp.getTime().equals("15")){
				vo.setTime15(temp.getTotal());
			}else if(temp.getTime().equals("16")){
				vo.setTime16(temp.getTotal());
			}else if(temp.getTime().equals("17")){
				vo.setTime17(temp.getTotal());
			}else if(temp.getTime().equals("18")){
				vo.setTime18(temp.getTotal());
			}else if(temp.getTime().equals("19")){
				vo.setTime19(temp.getTotal());
			}else if(temp.getTime().equals("20")){
				vo.setTime20(temp.getTotal());
			}else if(temp.getTime().equals("21")){
				vo.setTime21(temp.getTotal());
			}else if(temp.getTime().equals("22")){
				vo.setTime22(temp.getTotal());
			}else if(temp.getTime().equals("23")){
				vo.setTime23(temp.getTotal());
			}else if(temp.getTime().equals("24")){
				vo.setTime24(temp.getTotal());
			}
			
			
		}
		timelist2.add(vo);
		request.put("timelist2", timelist2);
		System.out.println(timelist2.toString()+"action9프린트 출력");
		return SUCCESS;
	}
	
	
}
