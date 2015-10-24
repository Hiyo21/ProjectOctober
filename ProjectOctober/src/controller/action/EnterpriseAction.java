package controller.action;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.EnterpriseDAO;
import model.vo.Component;
import model.vo.Coupon;
import model.vo.Enterprise;
import model.vo.Member;
import model.vo.PhotoLocation;
import model.vo.Reservation;
import model.vo.Service;
import model.vo.WorkingDays;

public class EnterpriseAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	private EnterpriseDAO etpDAO;
	private Enterprise enterprise;
	private Reservation reservation;
	private List<Reservation> reservationList;
	private List<Enterprise> enterpriseList;
	private List<Service> serviceList;
	private List<String> categoryList;
	private Map<String, Object> session;
	private List<Coupon> couponList;
	private Member member;
	private PhotoLocation photoLocation;

	//////// Component Member ////////  
	private Component component;
	private List<Component> componentList;
	private Coupon coupon;
	private String etpNum;
	private String etpNum1;
	private String etpEmail;
	private String address;
	private Integer rsvNum;
	private String regCardLocation;
	private boolean canUseCoupon = false;
	private Integer cpnNum;
	private String category;
	private int etpTemplateType;

	


	public EnterpriseAction() {
		etpDAO = DAOFactory.createEnterpriseDAO();
	}
	
	
//---------------------------------------- Calendar 관련 ----------------------------------//
	public String toCalendarPage() throws Exception{
		System.out.println(etpNum);
		return SUCCESS;
	}
	
	public String retrieveEnterpriseInfoForCalendar() throws Exception{
		System.err.println(etpNum + "얘는?");
		enterprise = etpDAO.selectByEtpNumIncludeOthers(etpNum);
		System.err.println(enterprise + "어디?");
		System.err.println(enterprise.getEtpStartHour() +"이건?");
		//System.err.println(enterprise.getWorkingDays());
		enterprise.setStart(enterprise.getEtpStartHour().format(DateTimeFormatter.ISO_LOCAL_TIME));
		enterprise.setEnd(enterprise.getEtpEndHour().format(DateTimeFormatter.ISO_LOCAL_TIME));
		WorkingDays wd = enterprise.getWorkingDays();
		Integer [] ttt = makeDow(wd);
		enterprise.getWorkingDays().setDow(ttt);
		return SUCCESS;
	}

	public String insertReservation() throws Exception{
		System.err.println("널값 확인용 :" + reservation);
		if(reservation != null){
			System.err.println("reservation 시작 스트링: " + reservation.getStart());
			System.err.println("reservation 끝 스트링: " + reservation.getEnd());
			reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart(),DateTimeFormatter.ISO_LOCAL_DATE_TIME));
			reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd(),DateTimeFormatter.ISO_LOCAL_DATE_TIME));
			reservation.setEtpNum(String.valueOf(session.get("loginEtpNum")));
			reservation.setEtpEmail(String.valueOf(session.get("loginId")));
		}
		int result = etpDAO.insertReservation(reservation);
		if(result != 0) return SUCCESS;
		else return ERROR;
	}
	
	public String retrieveReservations() throws Exception{
		System.err.println("현재 테스트 중입니다..etp정보를 받아오는가?");
		System.err.println(etpNum);
		reservationList = etpDAO.retrieveReservations(etpNum);
		if (reservationList != null) {
			for(int i = 0 ; i < reservationList.size() ; i++ ){
				reservationList.get(i).setStart(reservationList.get(i).getRsvStartDate().toString());
				reservationList.get(i).setEnd(reservationList.get(i).getRsvEndDate().toString());
				//TODO: Reservation 상태에 따라 변화
				if(reservationList.get(i).getRsvStatus() == 0){
					reservationList.get(i).setBordercolor("#DDDDDD");
				}
			}
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String changeReservationTime() throws Exception{
		reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart().substring(0, 19)));
		reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd().substring(0, 19)));
		int result = etpDAO.changeReservationTime(reservation);
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String deleteReservation() throws Exception{
		int result = etpDAO.deleteReservation(reservation);
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
		//--------------------------------------------------사업자 페이지---------------------------
	public String updateSvcCategory() throws Exception{
		System.err.println("===========check Action :: updateSvcCategory :: ");
		int result = 0; 
		for(Service s : serviceList){
			result = etpDAO.updateSvcCategory(s);
		}
		etpNum = serviceList.get(0).getEtpNum();
		if(result == 1) return SUCCESS;
		else return ERROR;
	}

	public String receiveServiceList() throws Exception{
		System.out.println("===========check Action :: receiveServiceList :: ");
		serviceList = etpDAO.retrieveServices(etpNum);
		
		if(serviceList != null) return SUCCESS;
		else return ERROR;
	}
	
	public String retrieveCouponList() throws Exception{
		couponList = etpDAO.retrieveCouponList(etpNum);
		return SUCCESS; 
		
	}
	
	public String selectSvcCategory() throws Exception{
		System.out.println("category Check :: "+category);
		serviceList = etpDAO.selectSvcCategory(etpNum, category);
		
		if(serviceList != null) return SUCCESS;
		else return ERROR;
	}
	
	public String selectServiceList() throws Exception{
		System.out.println("===========check Action :: etpNum :: " + etpNum);
		serviceList = etpDAO.selectServiceList(etpNum);
		
		categoryList = new ArrayList<>();
		for(int j=0; j<serviceList.size(); j++){	
			String category = serviceList.get(j).getSvcCategory();
			
			if(j==0){
				categoryList.add(category);
			}else{
				if(serviceList.get(j).getSvcCategory().equals(serviceList.get(j-1).getSvcCategory())){
					
				}else{
					categoryList.add(category);
				}
			}
		}

		if(serviceList != null) return SUCCESS;
		else return ERROR;
	}
	
	public String selectEtpList() throws Exception{
		enterpriseList = etpDAO.selectEtpList();			
		System.out.println("===========check Action :: enterpriseList :: ");
		return SUCCESS;
	}
	
	public String selectGalleryList() throws Exception{
		System.out.println("===========check Action :: receiveGalleryList :: ");
		enterprise.setPhotos(etpDAO.selectPhotoList(etpNum));

		if(enterprise.getPhotos() != null) return SUCCESS;
		else return ERROR;
	}
	
	public String takeEtp() throws Exception{
		System.out.println("===========check Action :: takeEtp :: etpNum :: " + etpNum);
		
		if(etpNum == null){
			enterprise = etpDAO.selectByEtpEmail(member.getMemEmail());
			etpNum = enterprise.getEtpNum();
		}else{
			enterprise = etpDAO.selectByEtpNum(etpNum);
		}
		
		//서비스 리스트 set
		List<Service> svcList =etpDAO.selectServiceList(etpNum); 
		enterprise.setServices(svcList);
		
		//카테고리 리스트 뽑기
		categoryList = new ArrayList<>();
		for(int j=0; j<svcList.size(); j++){	
			String category = svcList.get(j).getSvcCategory();
			
			if(j==0){
				categoryList.add(category);
			}else{
				if(svcList.get(j).getSvcCategory().equals(svcList.get(j-1).getSvcCategory())){
					
				}else{
					categoryList.add(category);
				}
			}
		}
		
		//고객평가, 갤러리 리스트 set
		enterprise.setReviews(etpDAO.selectReviewList(etpNum));
		enterprise.setPhotos(etpDAO.selectPhotoList(etpNum));
		
		if(enterprise != null) {
			int type = enterprise.getEtpTemplateType();

			session.put("pageId", enterprise.getEtpEmail());

			switch (type) {
			case 1:
				//dynamic
				System.err.println("dynamic :: "+enterprise);
				//동적 페이지 일때만 컴포넌트 리스트 set
				enterprise.setComponents(etpDAO.receiveComponentList(etpNum));
				return "template1";
			case 3:
				//static_allInOne
				return "template3";
			default:
				//static_tabs
				return "template2";
			}
		}else{
			return ERROR;
		}
	}
	
	public String updateReservationDetailsByEnterprise() throws Exception{
		System.err.println("제목:" + reservation.getRsvTitle());
		System.err.println("서비스 넘버: " + reservation.getSvcNum());
		if(reservation.getRsvTitle() == null || reservation.getRsvTitle().trim().length() == 0) reservation.setRsvTitle("제목 없음");
		int result = etpDAO.updateReservationDetailsByEnterprise(reservation);
		System.err.println(result);
		return SUCCESS;
	}
	
	public String checkCoupon() throws Exception{
		System.err.println(cpnNum);
		coupon = etpDAO.checkCoupon(cpnNum);
		if(coupon != null)coupon.setCanUseCoupon(true);
		return SUCCESS;
	}
	

	
	
//--------------------------------------- Component ----------------------------------------//

	
	//////////////// Component Method ////////////////
	
	public String insertComponent(){
		System.out.println("============check Action :: insertComponet()");		
		enterprise = etpDAO.selectByEtpNum(etpNum);
		System.err.println("============check Action :: etpNum :: " +etpNum);
		System.err.println("============check Action :: enterprise :: " +enterprise);
		////// 연결 후 페이지 정보 혹은 세션에서 etpnum, etpemail, etpTheme 불러오기
		component.setEtpEmail(enterprise.getEtpEmail());
		component.setComponentTheme(1);
		component.setBackgroundTheme(1);
		
		System.out.println("============check Action :: component :: " +component);
		if(etpDAO.selectByEtpNum(etpNum)!=null){		
			int result = etpDAO.insertComponent(component);
			if(result == 1) {
				return SUCCESS;
			}else{
				System.err.println("============check Action :: result :: " + result);
				System.out.println("이미 등록된 페이지가 있는 사업자입니다!!!!!!");
				return ERROR;
			}
					
		}else{
			//업데이트
			int result = etpDAO.updateComponent(component);
			if(result == 1) {
				return SUCCESS;
			}else{
				System.err.println("============check Action :: result :: " + result);
				return ERROR;
			}
		}
		
	}
	
	/*
	 * System.out.println("============check Action :: component :: " +component);
		
		///// insert 전에 사업자 번호를 확인 후 입력 for 중복 제거
		if(etpDAO.receiveComponentList(component.getEtpNum())==null){
				
			int result = etpDAO.insertComponent(component);
				if(result != 1) {
					return ERROR;
				}
			System.out.println("============check Action :: result :: " + result);
		}else{
			System.out.println("이미 등록된 페이지가 있는 사업자입니다!!!!!!");
			return ERROR;
		}
		
		return SUCCESS;
	}
	 */
	
	public String receiveComponentList(){
		System.out.println("============check Action :: getComponentList()");
		component = new Component();
		component.setEtpNum(etpNum);
		///// 사업자 번호와 일치하는 컴포넌트만 갖고 오기
		componentList = etpDAO.receiveComponentList(component.getEtpNum());
		
		if(componentList == null) {
			return ERROR;
		}
		System.out.println("============check Action :: componentList.size() ::" + componentList.size());
		
		return SUCCESS;
	}
	
	
	public String choiceTemplateType() {
		etpNum = (String) session.get("loginEtpNum");
		//etpNum="99";
		etpDAO = new EnterpriseDAO();
		int result = etpDAO.choiceTemplateType(etpNum, etpTemplateType);
		if (result == 1) {
			switch (etpTemplateType) {
			case 1: return "dynamic";
			case 2: return "static1";
			case 3: return "static2";
			}
		}
		
		return ERROR;
	}
	
	/////////////////////// 미승인 사업자 게시판 ////////////////////
	
	public String allNoRegisterEtpList() throws Exception{
		enterpriseList = etpDAO.allNoRegisterEtpList();
		System.out.println(enterpriseList);
		
		return SUCCESS;
	}
	
	public String noRegisterEtp() throws Exception{
		System.err.println(etpNum);
		enterprise = etpDAO.noRegisterEtp(etpNum);
		System.out.println(enterprise);
		regCardLocation = etpDAO.retrieveRegCard(etpNum);
		return SUCCESS;
	}
	
	public String confirm() throws Exception{
		System.err.println("confirm : "+etpNum);
		int result=etpDAO.updateEtpStatus(etpNum);
				
		if(result !=1){	
			return ERROR;			
		}
		return SUCCESS;			
	}
	
	public String reject() throws Exception{
		System.err.println("reject : "+etpNum);
		int result=etpDAO.rejectEtpStatus(etpNum);
		
		enterpriseList = etpDAO.allNoRegisterEtpList();
		
		if(result !=1){	
			return ERROR;			
		}
		return SUCCESS;			
	}
	
	
	
	
	
	////////////////////MAP////////////////////
	public String showMap() {
		etpEmail = "111";
		address = etpDAO.showMap(etpEmail);
		System.out.println(address);
		return SUCCESS;
	}
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("check Action Execute");
		return SUCCESS;
	}
	

	
    ///////////////////////// GET&SET ///////////////////////// 

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public List<Reservation> getReservationList() {
		return reservationList;
	}

	public List<Enterprise> getEnterpriseList() {
		return enterpriseList;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}

	public void setEnterpriseList(List<Enterprise> enterpriseList) {
		this.enterpriseList = enterpriseList;
	}


	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public List<Component> getComponentList() {
		return componentList;
	}

	public void setComponentList(List<Component> componentList) {
		this.componentList = componentList;
	}
	
	public String getEtpNum() {
		return etpNum;
	}

	public String getEtpEmail() {
		return etpEmail;
	}

	public void setEtpNum(String etpNum) {
		this.etpNum = etpNum;
	}

	public void setEtpEmail(String etpEmail) {
		this.etpEmail = etpEmail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	
	//---------------------------------//
	public Integer [] makeDow(WorkingDays wd){
			int [] temp = {wd.getSun(), wd.getMon(), wd.getTue(), wd.getWed(), wd.getThu(),wd.getFri(), wd.getSat()};
			List<Integer> it = new ArrayList<Integer>();
			boolean hasVacDay = false;
			int x = 0;
			for(int i = 0 ; i < temp.length ; i++){
				if(temp[i] == 1){
					hasVacDay = true;
				}else{
					it.add(x);
				}
				x++;
			}
		Object[] temptt = it.toArray();
		Integer [] tt = Arrays.copyOf(temptt, temptt.length, Integer[].class);
			System.err.println(Arrays.toString(tt)+2);
			return tt;
	}
	
	public String emptyAction(){
		return SUCCESS;
	}


	public List<Service> getServiceList() {
		return serviceList;
	}


	public void setServiceList(List<Service> serviceList) {
		this.serviceList = serviceList;
	}


	public Integer getRsvNum() {
		return rsvNum;
	}


	public void setRsvNum(Integer rsvNum) {
		this.rsvNum = rsvNum;
	}


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}


	public List<String> getCategoryList() {
		return categoryList;
	}


	public void setCategoryList(List<String> categoryList) {
		this.categoryList = categoryList;
	}


	public String getEtpNum1() {
		return etpNum1;
	}


	public void setEtpNum1(String etpNum1) {
		this.etpNum1 = etpNum1;
	}


	public List<Coupon> getCouponList() {
		return couponList;
	}


	public void setCouponList(List<Coupon> couponList) {
		this.couponList = couponList;
	}


	public boolean isCanUseCoupon() {
		return canUseCoupon;
	}


	public void setCanUseCoupon(boolean canUseCoupon) {
		this.canUseCoupon = canUseCoupon;
	}


	public Coupon getCoupon() {
		return coupon;
	}


	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	
	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getCpnNum() {
		return cpnNum;
	}

	public void setCpnNum(Integer cpnNum) {
		this.cpnNum = cpnNum;
	}

	
	public int getEtpTemplateType() {
		return etpTemplateType;
	}


	public void setEtpTemplateType(int etpTemplateType) {
		this.etpTemplateType = etpTemplateType;
	}


	public PhotoLocation getPhotoLocation() {
		return photoLocation;
	}


	public void setPhotoLocation(PhotoLocation photoLocation) {
		this.photoLocation = photoLocation;
	}


	public String getRegCardLocation() {
		return regCardLocation;
	}


	public void setRegCardLocation(String regCardLocation) {
		this.regCardLocation = regCardLocation;

	}
}
