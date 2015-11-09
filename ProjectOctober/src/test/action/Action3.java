package test.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.EnterpriseDAO;
import model.vo.Enterprise;
import test.dao.DAO;
import test.vo.Highchart3;
import test.vo.Highchart3Add;


public class Action3 extends ActionSupport implements RequestAware{
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

	public String highchart3(){
		DAO dao = new DAO();
		Enterprise e = enterprise.selectByEtpEmail(etpEmail);
		System.err.println(e);
		List<Highchart3> list = dao.highchart3DAO(e);
		
		
		List<Highchart3Add> list1 = new ArrayList<Highchart3Add>();
		List<Highchart3Add> list2 = new ArrayList<Highchart3Add>();
		List<Highchart3Add> list3 = new ArrayList<Highchart3Add>();
		List<Highchart3Add> list4 = new ArrayList<Highchart3Add>();
		List<Highchart3Add> list5 = new ArrayList<Highchart3Add>();
		List<Highchart3Add> list6 = new ArrayList<Highchart3Add>();
		List<Highchart3Add> list7 = new ArrayList<Highchart3Add>();
		List<Highchart3Add> list8 = new ArrayList<Highchart3Add>();
		List<Highchart3Add> list9 = new ArrayList<Highchart3Add>();
		
		
		Highchart3Add vo1 = new Highchart3Add();
		Highchart3Add vo2 = new Highchart3Add();
		Highchart3Add vo3 = new Highchart3Add();
		Highchart3Add vo4 = new Highchart3Add();
		Highchart3Add vo5 = new Highchart3Add();
		Highchart3Add vo6 = new Highchart3Add();
		Highchart3Add vo7 = new Highchart3Add();
		Highchart3Add vo8 = new Highchart3Add();
		Highchart3Add vo9 = new Highchart3Add();
		
		for(Highchart3 temp : list) {
			if(temp.getTitle().equals("타이마사지")){
				if(temp.getWea().equals("봄")){
					vo1.setSpring(temp.getCnt());
				}else if(temp.getWea().equals("여름")){
					vo1.setSummer(temp.getCnt());
				}else if(temp.getWea().equals("가을")){
					vo1.setFall(temp.getCnt());
				}else if(temp.getWea().equals("겨울")){
					vo1.setWinter(temp.getCnt());
				}
			}else if(temp.getTitle().equals("경락마사지")){
				if(temp.getWea().equals("봄")){
					vo2.setSpring(temp.getCnt());
				}else if(temp.getWea().equals("여름")){
					vo2.setSummer(temp.getCnt());
				}else if(temp.getWea().equals("가을")){
					vo2.setFall(temp.getCnt());
				}else if(temp.getWea().equals("겨울")){
					vo2.setWinter(temp.getCnt());
				}
			}else if(temp.getTitle().equals("카이로프랙틱")){
				if(temp.getWea().equals("봄")){
					vo3.setSpring(temp.getCnt());
				}else if(temp.getWea().equals("여름")){
					vo3.setSummer(temp.getCnt());
				}else if(temp.getWea().equals("가을")){
					vo3.setFall(temp.getCnt());
				}else if(temp.getWea().equals("겨울")){
					vo3.setWinter(temp.getCnt());
				}
			}else if(temp.getTitle().equals("발마사지")){
				if(temp.getWea().equals("봄")){
					vo4.setSpring(temp.getCnt());
				}else if(temp.getWea().equals("여름")){
					vo4.setSummer(temp.getCnt());
				}else if(temp.getWea().equals("가을")){
					vo4.setFall(temp.getCnt());
				}else if(temp.getWea().equals("겨울")){
					vo4.setWinter(temp.getCnt());
				}
			}else if(temp.getTitle().equals("바디마사지")){
				if(temp.getWea().equals("봄")){
					vo5.setSpring(temp.getCnt());
				}else if(temp.getWea().equals("여름")){
					vo5.setSummer(temp.getCnt());
				}else if(temp.getWea().equals("가을")){
					vo5.setFall(temp.getCnt());
				}else if(temp.getWea().equals("겨울")){
					vo5.setWinter(temp.getCnt());
				}
			}else if(temp.getTitle().equals("페이스마사지")){
				if(temp.getWea().equals("봄")){
					vo6.setSpring(temp.getCnt());
				}else if(temp.getWea().equals("여름")){
					vo6.setSummer(temp.getCnt());
				}else if(temp.getWea().equals("가을")){
					vo6.setFall(temp.getCnt());
				}else if(temp.getWea().equals("겨울")){
					vo6.setWinter(temp.getCnt());
				}
			}else if(temp.getTitle().equals("아로마마사지")){
				if(temp.getWea().equals("봄")){
					vo7.setSpring(temp.getCnt());
				}else if(temp.getWea().equals("여름")){
					vo7.setSummer(temp.getCnt());
				}else if(temp.getWea().equals("가을")){
					vo7.setFall(temp.getCnt());
				}else if(temp.getWea().equals("겨울")){
					vo7.setWinter(temp.getCnt());
				}
			}else if(temp.getTitle().equals("슬리밍케어")){
				if(temp.getWea().equals("봄")){
					vo8.setSpring(temp.getCnt());
				}else if(temp.getWea().equals("여름")){
					vo8.setSummer(temp.getCnt());
				}else if(temp.getWea().equals("가을")){
					vo8.setFall(temp.getCnt());
				}else if(temp.getWea().equals("겨울")){
					vo8.setWinter(temp.getCnt());
				}
			}else if(temp.getTitle().equals("웨딩관리")){
				if(temp.getWea().equals("봄")){
					vo9.setSpring(temp.getCnt());
				}else if(temp.getWea().equals("여름")){
					vo9.setSummer(temp.getCnt());
				}else if(temp.getWea().equals("가을")){
					vo9.setFall(temp.getCnt());
				}else if(temp.getWea().equals("겨울")){
					vo9.setWinter(temp.getCnt());
				}
			}
			
			
			
		}//for문 종료
		
		list1.add(vo1);
		list2.add(vo2);
		list3.add(vo3);
		list4.add(vo4);
		list5.add(vo5);
		list6.add(vo6);
		list7.add(vo7);
		list8.add(vo8);
		list9.add(vo9);
		
		request.put("list1", list1);
		request.put("list2", list2);
		request.put("list3", list3);
		request.put("list4", list4);
		request.put("list5", list5);
		request.put("list6", list6);
		request.put("list7", list7);
		request.put("list8", list8);
		request.put("list9", list9);
		

		
		return SUCCESS;
	}
	
	
}
