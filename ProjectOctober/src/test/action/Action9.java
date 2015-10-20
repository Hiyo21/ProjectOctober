package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import test.dao.CostDAO;
import test.vo.Highchart10;
import test.vo.Highchart11;
import test.vo.Highchart1Add;
import test.vo.Highchart6Add;
import test.vo.Highchart9;
import test.vo.Highchart9Add;


public class Action9 extends ActionSupport implements RequestAware{
	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request =request;		
	}
	

	public String highchartCost(){
		CostDAO dao = new CostDAO();
		//유료 통계서비스 1
		List<Highchart9> list = dao.highchart9DAO();
		
		Highchart9Add vo1 = new Highchart9Add();
		Highchart9Add vo2 = new Highchart9Add();
		Highchart9Add vo3 = new Highchart9Add();
		Highchart9Add vo4 = new Highchart9Add();
		Highchart9Add vo5 = new Highchart9Add();
		Highchart9Add vo6 = new Highchart9Add();
		Highchart9Add vo7 = new Highchart9Add();
		Highchart9Add vo8 = new Highchart9Add();
		Highchart9Add vo9 = new Highchart9Add();
		Highchart9Add vo10 = new Highchart9Add();
		
		
			
		for(Highchart9 temp : list){
			System.out.println(temp.getRank());
			if(temp.getRank()==1){
				System.out.println("1��");
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
		
		
		
		List<Highchart9Add> rank1 = new ArrayList<Highchart9Add>();
		List<Highchart9Add> rank2 = new ArrayList<Highchart9Add>();
		List<Highchart9Add> rank3 = new ArrayList<Highchart9Add>();
		List<Highchart9Add> rank4 = new ArrayList<Highchart9Add>();
		List<Highchart9Add> rank5 = new ArrayList<Highchart9Add>();
		List<Highchart9Add> rank6 = new ArrayList<Highchart9Add>();
		List<Highchart9Add> rank7 = new ArrayList<Highchart9Add>();
		List<Highchart9Add> rank8 = new ArrayList<Highchart9Add>();
		List<Highchart9Add> rank9 = new ArrayList<Highchart9Add>();
		List<Highchart9Add> rank10 = new ArrayList<Highchart9Add>();
		
		
		
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
		List<Highchart10> list1 = dao.highchart10DAO();
		
		System.out.println(list.toString());
		
		Highchart6Add time = new Highchart6Add();
		List<Highchart6Add> timelist2 = new ArrayList<Highchart6Add>();
		for(Highchart10 temp : list1){
			
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
		List<Highchart11> list2 = dao.highchart11DAO();
		System.out.println(list.toString());
		Highchart1Add v1 = new Highchart1Add();
		Highchart1Add v2 = new Highchart1Add();
		Highchart1Add v3 = new Highchart1Add();
		Highchart1Add v4 = new Highchart1Add();
		Highchart1Add v5 = new Highchart1Add();
		
		for(Highchart11 temp : list2){
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
		
		
		return SUCCESS;
	}
	
		
}
