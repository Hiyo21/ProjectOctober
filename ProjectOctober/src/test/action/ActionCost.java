package test.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.EnterpriseDAO;
import model.vo.Enterprise;
import test.dao.CostDAO;
import test.vo.AutoHighchartCost1;
import test.vo.AutoHighchartCost1Add;
import test.vo.AutoHighchartCost2;
import test.vo.AutoHighchartCost3;
import test.vo.Highchart10Cost;
import test.vo.Highchart11Cost;
import test.vo.Highchart1Add;
import test.vo.Highchart6Add;
import test.vo.Highchart9Cost;
import test.vo.Highchart9AddCost;


public class ActionCost extends ActionSupport implements RequestAware, SessionAware, ApplicationAware{
	private static final long serialVersionUID = 1L;
	private Map<String, Object> request;
	private Map<String, Object> session;
	private String etpEmail;
	EnterpriseDAO enterprise = new EnterpriseDAO();
	private Map<String, Object> application;
	
	
	
	public String getEtpEmail() {
		return etpEmail;
	}


	public void setEtpEmail(String etpEmail) {
		this.etpEmail = etpEmail;
	}


	@Override
	public void setRequest(Map<String, Object> request) {
		this.request =request;		
	}
	

	public String highchartCost(){
		CostDAO dao = new CostDAO();
		//유료 통계서비스 1
		List<Highchart9Cost> list = dao.highchart9DAO();
		
		Highchart9AddCost vo1 = new Highchart9AddCost();
		Highchart9AddCost vo2 = new Highchart9AddCost();
		Highchart9AddCost vo3 = new Highchart9AddCost();
		Highchart9AddCost vo4 = new Highchart9AddCost();
		Highchart9AddCost vo5 = new Highchart9AddCost();
		Highchart9AddCost vo6 = new Highchart9AddCost();
		Highchart9AddCost vo7 = new Highchart9AddCost();
		Highchart9AddCost vo8 = new Highchart9AddCost();
		Highchart9AddCost vo9 = new Highchart9AddCost();
		Highchart9AddCost vo10 = new Highchart9AddCost();
		
		
			
		for(Highchart9Cost temp : list){
			/*System.out.println(temp.getRank());*/
			if(temp.getRank()==1){
				
				vo1.setSale1(temp.getSale());
			}else if(temp.getRank()== 2){
				vo2.setSale2(temp.getSale());
			}else if(temp.getRank()== 3){
				vo3.setSale3(temp.getSale());
			}else if(temp.getRank()== 4){
				vo4.setSale4(temp.getSale());
			}else if(temp.getRank()== 5){
				vo5.setSale5(temp.getSale());
			}else if(temp.getRank()== 6){
				vo6.setSale6(temp.getSale());
			}else if(temp.getRank()== 7){
				vo7.setSale7(temp.getSale());
			}else if(temp.getRank()== 8){
				vo8.setSale8(temp.getSale());
			}else if(temp.getRank()== 9){
				vo9.setSale9(temp.getSale());
			}else if(temp.getRank()== 10){
				vo10.setSale10(temp.getSale());
			}		
			
			
		}
		
		
		
		List<Highchart9AddCost> rank1 = new ArrayList<Highchart9AddCost>();
		List<Highchart9AddCost> rank2 = new ArrayList<Highchart9AddCost>();
		List<Highchart9AddCost> rank3 = new ArrayList<Highchart9AddCost>();
		List<Highchart9AddCost> rank4 = new ArrayList<Highchart9AddCost>();
		List<Highchart9AddCost> rank5 = new ArrayList<Highchart9AddCost>();
		List<Highchart9AddCost> rank6 = new ArrayList<Highchart9AddCost>();
		List<Highchart9AddCost> rank7 = new ArrayList<Highchart9AddCost>();
		List<Highchart9AddCost> rank8 = new ArrayList<Highchart9AddCost>();
		List<Highchart9AddCost> rank9 = new ArrayList<Highchart9AddCost>();
		List<Highchart9AddCost> rank10 = new ArrayList<Highchart9AddCost>();
		
		
		
		rank1.add(vo1);
		rank2.add(vo2);
		rank3.add(vo3);
		rank4.add(vo4);
		rank5.add(vo5);
		rank6.add(vo6);
		rank7.add(vo7);
		rank8.add(vo8);
		rank9.add(vo9);
		rank10.add(vo10);
		
		request.put("rank1", rank1);
		request.put("rank2", rank2);
		request.put("rank3", rank3);
		request.put("rank4", rank4);
		request.put("rank5", rank5);
		request.put("rank6", rank6);
		request.put("rank7", rank7);
		request.put("rank8", rank8);
		request.put("rank9", rank9);
		request.put("rank10", rank10);
		//유료 통계서비스 1
		
		//유료 통계서비스2
		if(application.get("loginId") == null){
			application.put("loginId", session.get("loginId"));
		}
		
		/*System.err.println("application :" + String.valueOf(application.get("loginId")));
		
		System.err.println("etpEmail :" + etpEmail);
		System.err.println("session :" + session == null);
		System.err.println(session.size());
		System.err.println(session.toString());
		System.err.println("Error?" + (session.get("loginId") == null));
		System.err.println("Error?? " + session.get("loginId"));
		System.err.println(application.get("loginId"));*/
		String x = String.valueOf(application.get("loginId"));
		/*System.err.println(x);*/
		Enterprise e = enterprise.selectByEtpEmail(x);
		/*System.err.println(e+"ActionCost");*/
		String enterAddress= e.getEtpAddress();
		/*System.err.println(enterAddress+"ActionCost");*/
		List<Highchart10Cost> list1 = dao.highchart10DAO(enterAddress);
		
		/*System.out.println(list.toString());*/
		
		Highchart6Add time = new Highchart6Add();
		List<Highchart6Add> timelist2 = new ArrayList<Highchart6Add>();
		for(Highchart10Cost temp : list1){
			
			if(temp.getTimeSet().equals("00")){
				time.setTime0(temp.getCountNum());
			}else if(temp.getTimeSet().equals("01")){
				time.setTime1(temp.getCountNum());
			}else if(temp.getTimeSet().equals("02")){
				time.setTime2(temp.getCountNum());
			}else if(temp.getTimeSet().equals("03")){
				time.setTime3(temp.getCountNum());
			}else if(temp.getTimeSet().equals("04")){
				time.setTime4(temp.getCountNum());
			}else if(temp.getTimeSet().equals("05")){
				time.setTime5(temp.getCountNum());
			}else if(temp.getTimeSet().equals("06")){
				time.setTime6(temp.getCountNum());
			}else if(temp.getTimeSet().equals("07")){
				time.setTime7(temp.getCountNum());
			}else if(temp.getTimeSet().equals("08")){
				time.setTime8(temp.getCountNum());
			}else if(temp.getTimeSet().equals("09")){
				time.setTime9(temp.getCountNum());
			}else if(temp.getTimeSet().equals("10")){
				time.setTime10(temp.getCountNum());
			}else if(temp.getTimeSet().equals("11")){
				time.setTime11(temp.getCountNum());
			}else if(temp.getTimeSet().equals("12")){
				time.setTime12(temp.getCountNum());
			}else if(temp.getTimeSet().equals("13")){
				time.setTime13(temp.getCountNum());
			}else if(temp.getTimeSet().equals("14")){
				time.setTime14(temp.getCountNum());
			}else if(temp.getTimeSet().equals("15")){
				time.setTime15(temp.getCountNum());
			}else if(temp.getTimeSet().equals("16")){
				time.setTime16(temp.getCountNum());
			}else if(temp.getTimeSet().equals("17")){
				time.setTime17(temp.getCountNum());
			}else if(temp.getTimeSet().equals("18")){
				time.setTime18(temp.getCountNum());
			}else if(temp.getTimeSet().equals("19")){
				time.setTime19(temp.getCountNum());
			}else if(temp.getTimeSet().equals("20")){
				time.setTime20(temp.getCountNum());
			}else if(temp.getTimeSet().equals("21")){
				time.setTime21(temp.getCountNum());
			}else if(temp.getTimeSet().equals("22")){
				time.setTime22(temp.getCountNum());
			}else if(temp.getTimeSet().equals("23")){
				time.setTime23(temp.getCountNum());
			}else if(temp.getTimeSet().equals("24")){
				time.setTime24(temp.getCountNum());
			}
			
			
		}
		timelist2.add(time);
		
		request.put("timelist2", timelist2);
		//유료통계서비스2
		
		//유료통계서비스3
		e = enterprise.selectByEtpEmail(application.get("loginId").toString());
		List<Highchart11Cost> list2 = dao.highchart11DAO(e);
		
		/*System.out.println(list.toString());*/
		Highchart1Add v1 = new Highchart1Add();
		Highchart1Add v2 = new Highchart1Add();
		Highchart1Add v3 = new Highchart1Add();
		Highchart1Add v4 = new Highchart1Add();
		Highchart1Add v5 = new Highchart1Add();
		
		for(Highchart11Cost temp : list2){
			if(temp.getAge()==10){
				v1.setFirst(temp.getCustomerNum());
			}else if(temp.getAge()==20){
				v2.setSecond(temp.getCustomerNum());
			}else if(temp.getAge()==30){
				v3.setThird(temp.getCustomerNum());
			}else if(temp.getAge()==40){
				v4.setForth(temp.getCustomerNum());
			}else{
				v5.setFifth(temp.getCustomerNum());
			}
		}
		
		
	
		List<Highchart1Add> resultList1 = new ArrayList();
		List<Highchart1Add> resultList2 = new ArrayList();
		List<Highchart1Add> resultList3 = new ArrayList();
		List<Highchart1Add> resultList4 = new ArrayList();
		List<Highchart1Add> resultList5 = new ArrayList();
		resultList1.add(v1);
		resultList2.add(v2);
		resultList3.add(v3);
		resultList4.add(v4);
		resultList5.add(v5);
		
		request.put("resultList1", resultList1);
		request.put("resultList2", resultList2);
		request.put("resultList3", resultList3);
		request.put("resultList4", resultList4);
		request.put("resultList5", resultList5);
		
		//유료통계서비스3
		
		
		//유료통계서비스1- 자동문구 생성1시작
		Enterprise e1 = enterprise.selectByEtpEmail(application.get("loginId").toString());
		System.out.println(e1+"자동");
		List<AutoHighchartCost1> list3 = dao.autoHighchartCost1(e1);
		System.out.println(list3.toString()+"생성");
	
		AutoHighchartCost1Add c1 = new AutoHighchartCost1Add();
		AutoHighchartCost1Add c2 = new AutoHighchartCost1Add();
		AutoHighchartCost1Add c3 = new AutoHighchartCost1Add();
		AutoHighchartCost1Add c4 = new AutoHighchartCost1Add();
		AutoHighchartCost1Add c5 = new AutoHighchartCost1Add();
		AutoHighchartCost1Add c6 = new AutoHighchartCost1Add();
		AutoHighchartCost1Add c7 = new AutoHighchartCost1Add();
		AutoHighchartCost1Add c8 = new AutoHighchartCost1Add();
		AutoHighchartCost1Add c9 = new AutoHighchartCost1Add();
		
		
		
		List<AutoHighchartCost1Add> autoList = new ArrayList<AutoHighchartCost1Add>();
		for(AutoHighchartCost1 temp : list3){
			System.out.println(temp.toString()+"temp");
			System.out.println("야야야야");
			if(temp.getSvcCode().equals("웨딩관리")){
				if(temp != null){
					c1.setWedding(temp.getSvcCode());
					c1.setWeddingCost(temp.getDifferCost());
					autoList.add(c1);
					System.out.println(c1);
					System.out.println(autoList+"지희여기");
				}
			}else if(temp.getSvcCode().equals("경락마사지")){
				if(temp != null){
				c2.setGyung(temp.getSvcCode());
				c2.setGyungCost(temp.getDifferCost());	
				autoList.add(c1);
				}
			}else if(temp.getSvcCode().equals("카이로프랙틱")){
				if(temp != null){
				c3.setKairo(temp.getSvcCode());
				c3.setKairoCost(temp.getDifferCost());
				autoList.add(c3);
				}
			}else if(temp.getSvcCode().equals("발마사지")){
				if(temp != null){
				c4.setBal(temp.getSvcCode());
				c4.setBalCost(temp.getDifferCost());
				autoList.add(c4);
				}
			}else if(temp.getSvcCode().equals("바디마사지")){
				if(temp != null){
				c5.setBody(temp.getSvcCode());
				c5.setBodyCost(temp.getDifferCost());
				autoList.add(c5);
				}
			}else if(temp.getSvcCode().equals("페이스마사지")){
				if(temp != null){
				c6.setFace(temp.getSvcCode());
				c6.setFaceCost(temp.getDifferCost());
				autoList.add(c6);
				}
			}else if(temp.getSvcCode().equals("아로마마사지")){
				if(temp != null){
				c7.setAroma(temp.getSvcCode());
				c7.setAromaCost(temp.getDifferCost());
				autoList.add(c7);
				}
			}else if(temp.getSvcCode().equals("슬리밍케어")){
				if(temp != null){
				c8.setSleeming(temp.getSvcCode());
				c8.setSleemingCost(temp.getDifferCost());
				autoList.add(c8);
				}
			}else if(temp.getSvcCode().equals("타이마사지")){
				if(temp != null){
				c9.setTai(temp.getSvcCode());
				c9.setTaiCost(temp.getDifferCost());
				autoList.add(c9);
				
				}
			}
			request.put("autoList", autoList);
		}
		//유료통계서비스1- 자동문구 생성1끝
	
		
		//유료통계서비스2- 자동문구 생성2시작
		Enterprise e2 = enterprise.selectByEtpEmail(application.get("loginId").toString());
		System.err.println(e2.getEtpAddress()+"여기주소는");
		List<AutoHighchartCost2> list4 = dao.autoHighchartCost2(e2);
		List<AutoHighchartCost2> list5 = dao.autoHighchartCost21(e2);
		
		System.out.println(list4+"list4");
		System.out.println(list5+"list5");
		
		request.put("TotalCnt", list4);
		request.put("PersonalCnt", list5);		
		//유료통계서비스2- 자동문구 생성2끝
		
		
		
		//유료통계서비스3- 자동문구 생성3시작
		Enterprise e3 = enterprise.selectByEtpEmail(application.get("loginId").toString());
		List<AutoHighchartCost3> list6 = dao.autoHighchartCost3(e3);
		List<AutoHighchartCost3> list7 = dao.autoHighchartCost31(e3);
		
		System.out.println(list6+"list6");
		System.out.println(list7+"list7");
		
		request.put("TotalAge", list6);
		request.put("PersonalAge", list7);
		
		//유료통계서비스3- 자동문구 생성3끝
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return SUCCESS;
	}
	
	public String emptyAction() throws Exception{
		System.err.println(etpEmail);
		return SUCCESS;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
		
	}
	
		
}
