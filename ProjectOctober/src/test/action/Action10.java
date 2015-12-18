package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.EnterpriseDAO;
import model.vo.Enterprise;
import test.dao.DAO;
import test.vo.Highchart10;
import test.vo.Highchart10Add;


public class Action10 extends ActionSupport implements RequestAware{
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
	
	public String highchart10(){
		DAO dao = new DAO();
		Enterprise e = enterprise.selectByEtpEmail(etpEmail);
		List<Highchart10> list = dao.highchart10DAO(e);
		
		Highchart10Add vo = new Highchart10Add();
		List<Highchart10Add> amountList = new ArrayList<Highchart10Add>();
		
		for(Highchart10 temp : list){

			if(temp.getMonthA().equals("1월 ")){
				vo.setAmount0(temp.getAvgAmount());
			}else if(temp.getMonthA().equals("2월 ")){
				vo.setAmount1(temp.getAvgAmount());
			}else if(temp.getMonthA().equals("3월 ")){
				vo.setAmount2(temp.getAvgAmount());
			}else if(temp.getMonthA().equals("4월 ")){
				vo.setAmount3(temp.getAvgAmount());
			}else if(temp.getMonthA().equals("5월 ")){
				vo.setAmount4(temp.getAvgAmount());
			}else if(temp.getMonthA().equals("6월 ")){
				vo.setAmount5(temp.getAvgAmount());
			}else if(temp.getMonthA().equals("7월 ")){
				vo.setAmount6(temp.getAvgAmount());
			}else if(temp.getMonthA().equals("8월 ")){
				vo.setAmount7(temp.getAvgAmount());
			}else if(temp.getMonthA().equals("9월 ")){
				vo.setAmount8(temp.getAvgAmount());
			}else if(temp.getMonthA().equals("10월")){
				vo.setAmount9(temp.getAvgAmount());
			}else if(temp.getMonthA().equals("11월")){
				vo.setAmount10(temp.getAvgAmount());
			}else if(temp.getMonthA().equals("12월")){
				vo.setAmount11(temp.getAvgAmount());
			}
			
		}
		amountList.add(vo);
		request.put("amountList", amountList);
		
		
		return SUCCESS;
	}


	
}
