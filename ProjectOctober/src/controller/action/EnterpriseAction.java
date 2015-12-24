package controller.action;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.common.VOFactory;
import model.dao.EnterpriseDAO;
import model.vo.Component;
import model.vo.Coupon;
import model.vo.Customer;
import model.vo.Enterprise;
import model.vo.Member;
import model.vo.MiscReservationDetail;
import model.vo.Notification;
import model.vo.PhotoLocation;
import model.vo.Reservation;
import model.vo.Review;
import model.vo.SaleRecord;
import model.vo.Service;
import model.vo.WorkingDays;
import test.vo.Highchart14;

public class EnterpriseAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	private EnterpriseDAO etpDAO;
	
	private Enterprise enterprise;
	private Reservation reservation;
	private Member member;
	private PhotoLocation photoLocation;
	private SaleRecord saleRecord;
	private Notification notification;
	private Component component;
	private Service service;	
	private Coupon coupon;
	private MiscReservationDetail miscReservationDetail;
	
	private List<Reservation> reservationList;
	private List<Enterprise> enterpriseList;
	private List<Service> serviceList;
	private List<String> categoryList;
	private List<Coupon> couponList;
	private List<SaleRecord> saleRecords;
	private List<Review> reviewList;
	private List<Highchart14> gunList;
	private List<Notification> notificationList;
	private List<Component> componentList;
	
	private Map<String, Object> session;
	private Map<String, Object> cpCollector;
	
	private String etpNum;
	private String etpNum1;
	private String etpEmail;
	private String address;
	private String category;
	private String regCardLocation;
	private String infoPht;
	private String logoPht;
	private String cstEmail;
	private Integer cpnNum;
	private Integer rsvNum;
	private Integer pmtNum;
	private Integer saleAmount;
	private Integer saleNum;

	private int svcNum;
	private int etpTemplateType;
	private int ntfNum;
	private int ntfCount;
	private int upCategory;
	private boolean canUseCoupon = false;
	private String mobileTimeString;
	private Date mobileTime;
	private boolean reservationExists = false;
	private LocalTime serviceTime;
	private String serviceTimeString;
	private Integer year, month, dayOfMonth, hour, minute;
	private boolean mobileDone = false;
	private String mobileDoneString;
	
	
	//------------쿠폰관련------------------//
	private String title;
	private String code;
	private int rate;
	private String startYear;
	private String startMonth;
	private String startDay;
	private String endYear;
	private String endMonth;
	private String endDay;
	private List<Reservation> couponSendList;
	//-----------------------------------//

	
	public EnterpriseAction() {
		etpDAO = DAOFactory.createEnterpriseDAO();
	}
	
	public String toCalendarPage() throws Exception{
		Integer memCode = (Integer)session.get("memCode");
		if(memCode == 1) return "enterprise";
		else return "customer";
	}
	
	public String retrieveEnterpriseInfoForCalendar() throws Exception{
		enterprise = etpDAO.selectByEtpNumIncludeOthers(etpNum);
		enterprise.setStart(enterprise.getEtpStartHour().format(DateTimeFormatter.ISO_LOCAL_TIME));
		enterprise.setEnd(enterprise.getEtpEndHour().format(DateTimeFormatter.ISO_LOCAL_TIME));
		WorkingDays wd = enterprise.getWorkingDays();
		Integer [] dowArr = makeDow(wd);
		enterprise.getWorkingDays().setDow(dowArr);
		return SUCCESS;
	}

	public String insertReservation() throws Exception{
		if(reservation != null){
			reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart().substring(0,19)));
			reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd().substring(0,19)));
			reservation.setEtpNum(String.valueOf(session.get("loginEtpNum")));
			reservation.setEtpEmail(String.valueOf(session.get("loginId")));
		}
		int result = etpDAO.insertReservation(reservation);
		if(result != 0) return SUCCESS;
		else return ERROR;
	}
	
	public String retrieveReservationFromOtherInfo() throws Exception{
		if(reservation != null){
			reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart().substring(0,19)));
			reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd().substring(0,19)));
			reservation = etpDAO.retrieveReservationFromOtherInfo(reservation);
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String retrieveReservations() throws Exception{
		reservationList = etpDAO.retrieveReservations(etpNum);
		if (reservationList != null) {
			for(int i = 0 ; i < reservationList.size() ; i++ ){
				reservationList.get(i).setStart(reservationList.get(i).getRsvStartDate().toString());
				reservationList.get(i).setEnd(reservationList.get(i).getRsvEndDate().toString());
				if(reservationList.get(i).getRsvStatus() == 0) reservationList.get(i).setBordercolor("#DDDDDD");
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
	
	public String insertSaleRecord() throws Exception{
		System.err.println(saleRecord);
		int result = etpDAO.insertSaleRecord(saleRecord);
		if(result == 1)return SUCCESS;
		else return ERROR;
	}
	
	public String insertSaleRecordMobile() throws Exception{
		saleRecord = new SaleRecord();
		System.out.printf("pmtNum: %d etpEmail: %s etpNum: %s saleAmount: %d", pmtNum, etpEmail, etpNum, saleAmount);
		saleRecord.setPmtNum(pmtNum);
		saleRecord.setEtpEmail(etpEmail);
		saleRecord.setEtpNum(etpNum);
		saleRecord.setSaleAmount(saleAmount);
		saleRecord.setSaleTime(LocalDateTime.now());
		
		int result = etpDAO.insertSaleRecord(saleRecord);
		System.out.println("result for insertSaleRecordMobile:" + result);
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String updateSvcCategory() throws Exception{
		int result = 0; 
		for(Service s : serviceList){
			result = etpDAO.updateSvcCategory(s);
		}
		etpNum = serviceList.get(0).getEtpNum();
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String inMyPage() throws Exception{
		String loginEmail = (String)session.get("loginId");
		saleRecords = etpDAO.reservationHistory(loginEmail);
		if (saleRecords == null) return ERROR;
		etpNum = (String)session.get("loginEtpNum");
		etpEmail = (String)session.get("loginId");
		couponList = etpDAO.retrieveCouponList(etpNum);
		couponSendList = etpDAO.couponSendList(etpEmail);
		return SUCCESS;
	}
	
	//쿠폰불러오기
	public String retrieveCouponList() throws Exception{
		if((String)session.get("loginEtpNum") != null) etpNum = (String)session.get("loginEtpNum");
		if ((String)session.get("loginId") != null) etpEmail = (String)session.get("loginId");
		couponList = etpDAO.retrieveCouponList(etpNum);
		couponSendList = etpDAO.couponSendList(etpEmail);
		return SUCCESS; 	
	}
	
	//쿠폰생성하기
	public String insertCoupon() throws Exception {
		Coupon coupon = new Coupon();
		etpNum = (String)session.get("loginEtpNum");
		etpEmail = (String)session.get("loginId");
		String startDate = startYear + "-" + startMonth + "-" + startDay + "T00:00:00";
		String endDate = endYear + "-" + endMonth + "-" + endDay + "T00:00:00";
		LocalDateTime cpnStartDate = LocalDateTime.parse(startDate, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		LocalDateTime cpnEndDate = LocalDateTime.parse(endDate, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		coupon.setEtpNum(etpNum);
		coupon.setEtpEmail(etpEmail);
		coupon.setCpnStartDate(cpnStartDate);
		coupon.setCpnEndDate(cpnEndDate);
		coupon.setCpnTitle(title);
		coupon.setCpnRate(rate);
		int result = etpDAO.insertCoupon(coupon);
		if (result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String updateCoupon() throws Exception {
		Coupon coupon = new Coupon();
		etpNum = (String)session.get("loginEtpNum");
		etpEmail = (String)session.get("loginId");
		String startDate = startYear + "-" + startMonth + "-" + startDay + "T00:00:00";
		String endDate = endYear + "-" + endMonth + "-" + endDay + "T00:00:00";
		LocalDateTime cpnStartDate = LocalDateTime.parse(startDate, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		LocalDateTime cpnEndDate = LocalDateTime.parse(endDate, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		coupon.setEtpNum(etpNum);
		coupon.setEtpEmail(etpEmail);
		coupon.setCpnStartDate(cpnStartDate);
		coupon.setCpnEndDate(cpnEndDate);
		coupon.setCpnTitle(title);
		coupon.setCpnRate(rate);
		coupon.setCpnNum(cpnNum);
		int result = etpDAO.updateCoupon(coupon);
		if (result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String deleteCoupon() throws Exception {
		etpDAO.deleteCoupon(cpnNum);
		return SUCCESS;
	}
	
	public String selectSvcCategory() throws Exception{
		serviceList = etpDAO.selectSvcCategory(etpNum, category);
		enterprise = etpDAO.selectByEtpNum(etpNum);
		if(serviceList != null) return SUCCESS;
		else return ERROR;
	}
	
	public String selectServiceList() throws Exception{
		serviceList = etpDAO.selectServiceList(etpNum);
		categoryList = etpDAO.makeCategoryList(etpNum);
		enterprise = etpDAO.selectByEtpNum(etpNum);
		if(serviceList != null) return SUCCESS;
		else return ERROR;
	}
	
	public String insertService(){
		service.setEtpEmail(etpDAO.selectByEtpNum(service.getEtpNum()).getEtpEmail());
		int result = etpDAO.insertService(service);
		if(result==1)return SUCCESS;
		else return ERROR;
	}
	
	public String deleteService(){
		int result = etpDAO.deleteService(svcNum);
		if(result==1) return SUCCESS;
		else return ERROR;
	}
	
	public String receiveServiceList() throws Exception{
		serviceList = etpDAO.receiveServiceList(etpNum);
		if(serviceList != null) return SUCCESS;
		else return ERROR;
	}
	
	public String insertDayOff() throws Exception{
		reservation.setEtpNum(String.valueOf(session.get("loginEtpNum")));
		reservation.setEtpEmail(String.valueOf(session.get("loginId")));
		reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart(), DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd(),DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		if(reservation.getRsvDesc().length()==0) reservation.setRsvDesc("");
		int result = etpDAO.insertDayOff(reservation);
		if(result != 0) return SUCCESS;
		else return ERROR;
	}

	public String saveInfoDesc() throws Exception{
		enterprise.setEtpNum(session.get("loginEtpNum").toString());
		int result = etpDAO.updateEtp(enterprise);
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String saveLocaDesc() throws Exception{
		enterprise.setEtpNum(session.get("loginEtpNum").toString());
		int result = etpDAO.updateEtp(enterprise);
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String selectEtpList() throws Exception{
		enterpriseList = etpDAO.selectEtpList();
		return SUCCESS;
	}
	
	public String selectGalleryList() throws Exception{
		if(enterprise == null) enterprise = new Enterprise();
		enterprise.setPhotos(etpDAO.selectPhotoList(etpNum));		
		if(enterprise.getPhotos() != null) return SUCCESS;
		else return ERROR;
	}
	
	public String deleteImage() throws Exception{
		int result = etpDAO.deletePht(photoLocation.getPhotoNum());
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String takeEtp() throws Exception{		
		if(etpNum == null){
			etpNum = session.get("loginEtpNum").toString();
			enterprise = etpDAO.selectByEtpNum(etpNum);			
		}else{
			enterprise = etpDAO.selectByEtpNum(etpNum);
		}
		
		//서비스 리스트 set
		if(etpDAO.selectServiceList(etpNum).size()>0){
			enterprise.setServices(etpDAO.selectServiceList(etpNum));
			//카테고리 리스트 뽑기
			categoryList = etpDAO.makeCategoryList(etpNum);		
		}
		
		//고객평가, 갤러리 리스트 set
		if(etpDAO.selectReviewList(etpNum).size()>0){
			enterprise.setReviews(etpDAO.selectReviewList(etpNum));
		}
		
		if(etpDAO.selectPhotoList(etpNum).size()>0){
			enterprise.setPhotos(etpDAO.selectPhotoList(etpNum));
		}
		
		if(etpDAO.selectInfoPht(etpNum)!= null){
			enterprise.setInfoPht(etpDAO.selectInfoPht(etpNum));
		}
			
		if(etpDAO.selectLogoPht(etpNum)!=null){
			enterprise.setLogoPht(etpDAO.selectLogoPht(etpNum));
		}

		/*infoPht = enterprise.getInfoPht();
		logoPht = enterprise.getLogoPht();*/
		
		if(enterprise != null) {
			int type = enterprise.getEtpTemplateType();
			reviewList = etpDAO.selectReviewList(etpNum);
			gunList = DAOFactory.createDAO().highchart14DAO(etpNum);
			
			session.put("pageId", enterprise.getEtpEmail());
			if(session.get("enterprise") == null){
				session.put("gunList", gunList);
				session.put("enterprise", enterprise);
				session.put("categoryList", categoryList);
			}else{
				session.replace("enterprise", enterprise);
				session.put("categoryList", categoryList);
				session.put("gunList", gunList);
			}
			switch (type) {
			case 1:
				//dynamic
				//System.err.println("dynamic :: "+enterprise);
				
				if(etpDAO.receiveComponentList(enterprise.getEtpNum()).size()==0){
					firstInsertComponent();
				}
				//동적 페이지
				enterprise.setComponents(etpDAO.receiveComponentList(etpNum));
				return "template1";
			case 3:
				//정적 페이지 - 싱글 페이지
				return "template3";
			default:
				//정적 페이지 - 탭 페이지
				return "template2";
			}
		}else{
			return ERROR;
		}
	}
	
	public String takeEtpForDynamic() throws Exception{
		enterprise = etpDAO.selectByEtpNum(etpNum);
		
		//서비스 리스트 set
		List<Service> svcList =etpDAO.selectServiceList(etpNum); 
		enterprise.setServices(svcList);

		//카테고리 리스트 뽑기
		categoryList = etpDAO.makeCategoryList(etpNum);		
		
		//고객평가, 갤러리 리스트 set
		enterprise.setReviews(etpDAO.selectReviewList(etpNum));
		enterprise.setPhotos(etpDAO.selectPhotoList(etpNum));
		enterprise.setInfoPht(etpDAO.selectInfoPht(etpNum));
		enterprise.setLogoPht(etpDAO.selectLogoPht(etpNum));
		infoPht = enterprise.getInfoPht();
		logoPht = enterprise.getLogoPht();
		
		//컴포넌트 리스트 set
		componentList = etpDAO.receiveComponentList(etpNum);
		return SUCCESS;
	}
	
	public String updateReservationDetailsByEnterprise() throws Exception{
		if(reservation.getRsvTitle() == null || reservation.getRsvTitle().trim().length() == 0) reservation.setRsvTitle("제목 없음");
		etpDAO.updateReservationDetailsByEnterprise(reservation);
		return SUCCESS;
	}
	
	public String checkCoupon() throws Exception{
		coupon = etpDAO.checkCoupon(coupon);
		if(coupon != null) coupon.setCanUseCoupon(true);
		return SUCCESS;
	}
	
	//이미지 업로드 페이지로 가기
	public String checkUploadCategory() throws Exception {
		System.out.println(upCategory);
		if (upCategory == 1) return "gallery";
		else if (upCategory == 2) return "logo";
		else if (upCategory == 3) return "info";
		else return ERROR;
	}
	
//--------------------------------------- Component ----------------------------------------///	
	public String firstInsertComponent(){
		componentList = etpDAO.receiveComponentList("1265479385");

		for(Component c : componentList){
			//신규가입자의 사업자 번호와 이메일 주소를 받아서 기존의 사업자 정보를 대체한다.
			c.setEtpNum(session.get("loginEtpNum").toString());
			c.setEtpEmail(session.get("loginId").toString());
			//수정된 컴포넌트 객체를 인서트 한다
			etpDAO.insertComponent(c);
		}
		return SUCCESS;
	}
	
	public String resetComponent(){
		componentList = etpDAO.receiveComponentList("1265479385");
		int result = 0;
		
		for(Component c : componentList){
			c.setEtpNum(etpNum);
			result = etpDAO.updateComponent(c);
		}
		
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String cleanComponent(){
		if(etpDAO.receiveComponentList(etpNum).size()==0) firstInsertComponent();
	
		//사업자의 모든 컴포넌트(총 8개) 정보에 0 값 입력
		int result = etpDAO.cleanComponent(etpNum);
		
		if(result == 8) return SUCCESS;
		else return ERROR;
	}
		
	public String insertComponent(){
		
		//사업자번호와 컴포넌트ID를 만족하는 컴포넌트가 존재하는지 확인
		Map<String, String> check = new HashMap<>();
		check.put("etpNum", etpNum);
		check.put("componentId", component.getComponentID());
		
		////신규 등록의 경우 insert로 이미 컴포넌트 값이 등록되어 있는 사업자의 경우 update로 적용하여 component의 중복을 제거		
		if(etpDAO.selectComponent(check)==null){	//컴포넌트 신규등록
			System.out.println("동적템플릿 신규 컴포넌트입니다.");
			component.setEtpEmail(etpDAO.selectByEtpNum(etpNum).getEtpEmail());
			int result = etpDAO.insertComponent(component);
			if(result == 1) return SUCCESS;
			else return ERROR;
		}else{	//컴포넌트 기존에 등록되어 있던 사람
			System.out.println("============기존 컴포넌트 등록 사업자============");
			System.out.println("동적템플릿 기존 컴포넌트입니다.");
			int result = etpDAO.updateComponent(component); //업데이트
			if(result == 1) return SUCCESS;
			else return ERROR;
		}
	}
	
	public String updateComponent(){	 		//ajax로 받은 컴포넌트 정보를 update하여 DB로 저장
		int result = etpDAO.updateComponent(component);
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
		
	public String receiveComponentList(){
		component = new Component();
		component.setEtpNum(etpNum);
		componentList = etpDAO.receiveComponentList(component.getEtpNum()); ///// 사업자 번호와 일치하는 컴포넌트만 갖고 오기
		if(componentList == null) return ERROR;
		return SUCCESS;
	}
	
	public String choiceTemplateType() {
		etpNum = (String) session.get("loginEtpNum");
		int result = etpDAO.choiceTemplateType(etpNum, etpTemplateType);
		enterprise = etpDAO.selectByEtpNum(etpNum); //엔터프라이즈 전체
		
		List<Service> svcList = new ArrayList<Service>(); //서비스 리스트 set
		etpDAO.selectServiceList(etpNum); 
		if (svcList != null) {
			enterprise.setServices(svcList);
					
			//카테고리 리스트 뽑기
			categoryList = new ArrayList<>();
			for(int j=0; j<svcList.size(); j++){	
				String category = svcList.get(j).getSvcCategory();
				if(j==0){
					categoryList.add(category);
				} else{
					if(svcList.get(j).getSvcCategory().equals(svcList.get(j-1).getSvcCategory())){
						
					}else{
						categoryList.add(category);
					}
				}
			}
			//고객평가, 갤러리 리스트 set 
			enterprise.setReviews(etpDAO.selectReviewList(etpNum));
			enterprise.setPhotos(etpDAO.selectPhotoList(etpNum));
		}
		
		if (result == 1) {
			switch (etpTemplateType) {
				case 1: return "dynamic";
				case 2: return "static1";
				case 3: return "static2";
			}
		} 
		return ERROR;
	}
	
	public String updateTemplate() throws Exception{
		if(enterprise != null){
			int result = etpDAO.updateTemplate(enterprise);
			if(result != 0) return SUCCESS;
			else return ERROR;
		}else{
			throw new Exception("엔터프라이즈를 읽어 올 수 없습니다.");
		}
	}
	
	//사업자의 이용자 예약 내역
	public String reservationHistory() {
		String loginEmail = (String)session.get("loginId");
		saleRecords = etpDAO.reservationHistory(loginEmail);
		if (saleRecords != null) return SUCCESS;
		else return ERROR;
	}
	
	public String selectReviewListJSON() throws Exception{
		reviewList = etpDAO.selectReviewList(etpNum);
		if(reviewList != null) return SUCCESS;
		else return ERROR;
	}
	
	/////////////////////// 미승인 사업자 게시판 ////////////////////
	
	public String allNoRegisterEtpList() throws Exception{
		enterpriseList = etpDAO.allNoRegisterEtpList();
		return SUCCESS;
	}
	
	public String noRegisterEtp() throws Exception{
		enterprise = etpDAO.noRegisterEtp(etpNum);
		regCardLocation = etpDAO.retrieveRegCard(etpNum);
		return SUCCESS;
	}
	
	public String confirm() throws Exception{
		int result=etpDAO.updateEtpStatus(etpNum);
		if(result !=1) return ERROR;			
		return SUCCESS;			
	}
	
	public String reject() throws Exception{
		int result=etpDAO.rejectEtpStatus(etpNum);
		enterpriseList = etpDAO.allNoRegisterEtpList();
		if(result !=1) return ERROR;			
		return SUCCESS;			
	}
		
	//------------------Notification-------------------//
	
	public String insertEnterpriseNotification() throws Exception{
		if(reservation != null){
			notification = VOFactory.createNotification();
			enterprise = etpDAO.selectByEtpNum(reservation.getEtpNum());
			reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart().substring(0,19)));
			reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd().substring(0,19)));
			reservation = etpDAO.retrieveReservationFromOtherInfo(reservation);
			String ntfMessageForInsert = enterprise.getEtpTitle() +" 님이  " + reservation.getCstEmail() + " 님의 예약 : " + reservation.getRsvTitle() + " (일시) " + reservation.getRsvStartDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm ")) + "을 등록하였습니다."; 
			notification.setRsvNum(reservation.getRsvNum()).setEtpNum(reservation.getEtpNum()).setEtpEmail(reservation.getEtpEmail()).setCstEmail(reservation.getCstEmail()).setNtfRead(0).setNtfMessage(ntfMessageForInsert).setNtfTime(LocalDateTime.now());			
			int result = etpDAO.insertEnterpriseNotification(notification);
			if(result != 0) return SUCCESS;
			else return ERROR;
		}else{
			return ERROR;
		}
	}
	
	public String insertEnterpriseNotificationMobile() throws Exception{
			notification = VOFactory.createNotification();
			enterprise = etpDAO.selectByEtpNum(etpNum);
			System.out.println(rsvNum);
			reservation = etpDAO.retrieveReservation(rsvNum);
			System.out.println(reservation);
			String ntfMessageForInsert = reservation.getCstEmail() + " 님이 예약 : " + reservation.getRsvTitle() + " (일시) " + reservation.getRsvStartDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm ")) + "을 등록하였습니다."; 
			notification.setRsvNum(reservation.getRsvNum()).setEtpNum(reservation.getEtpNum()).setEtpEmail(reservation.getEtpEmail()).setCstEmail(reservation.getCstEmail()).setNtfRead(0).setNtfMessage(ntfMessageForInsert).setNtfTime(LocalDateTime.now());			
			int result = etpDAO.insertEnterpriseNotification(notification);
			if(result != 0) {
				mobileDone = true;
				mobileDoneString = "done";
				return SUCCESS;
			}
			else return ERROR;
	}
	
	public String updateDurationEnterpriseNotification() throws Exception{
		enterprise = etpDAO.selectByEtpNum(notification.getEtpNum());
		reservation = etpDAO.retrieveReservation(notification.getRsvNum());
		
		if(notification != null){
			String ntfMessageForInsert = enterprise.getEtpTitle() + " 님이 " + notification.getCstEmail() + "님의 예약 : " + reservation.getRsvTitle() + " 의 일시를 " + reservation.getRsvStartDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm ")) + "로 변경하셨습니다.";
			notification.setNtfMessage(ntfMessageForInsert).setNtfTime(LocalDateTime.now());
			int result = etpDAO.updateDurationEnterpriseNotification(notification);
			if(result != 0) return SUCCESS;
			else return ERROR;
		}else{
			return ERROR;
		}
	}
	
	public String updatePeriodEnterpriseNotification() throws Exception{
		enterprise = etpDAO.selectByEtpNum(notification.getEtpNum());
		reservation = etpDAO.retrieveReservation(notification.getRsvNum());
		
		if(notification != null){
			String ntfMessageForInsert = enterprise.getEtpTitle() + " 님이 " + notification.getCstEmail() + " 님의 예약 : " + reservation.getRsvTitle() + " 의 서비스 기간을 " + reservation.getRsvStartDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm ")) + " ~ " + reservation.getRsvEndDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm ")) + "로 변경하셨습니다.";
			notification.setNtfMessage(ntfMessageForInsert).setNtfTime(LocalDateTime.now());
			int result = etpDAO.updatePeriodEnterpriseNotification(notification);
			if(result != 0) return SUCCESS;
			else return ERROR;
		}else{
			return ERROR;
		}
	}
	
	public String deleteEnterpriseNotification() throws Exception{
		enterprise = etpDAO.selectByEtpNum(notification.getEtpNum());
		
		if(notification != null){
			String ntfMessageForInsert = notification.getCstEmail() + " 님이 " + enterprise.getEtpTitle() + " 업체의 예약을 삭제하셨습니다.";
			notification.setNtfMessage(ntfMessageForInsert).setNtfTime(LocalDateTime.now());
			int result = etpDAO.deleteEnterpriseNotification(notification);
			if(result != 0) return SUCCESS;
			else return ERROR;
		}else{
			return ERROR;
		}
	}
	
	public String retrieveEnterpriseNotificationList() throws Exception{
		notificationList = etpDAO.retrieveEnterpriseNotificationList((String)session.get("loginEtpNum"));
		ntfCount = notificationList.size();
		if(notificationList != null) return SUCCESS;
		else return ERROR;
	}
	
	public String retrieveEnterpriseNotificationListAll() throws Exception{
		notificationList = etpDAO.retrieveEnterpriseNotificationListAll((String)session.get("loginEtpNum"));
		if(notificationList != null) return SUCCESS;
		else return ERROR;
	}
	
	public String readEnterpriseNotification() throws Exception{
		if(ntfNum != 0){
			int result = etpDAO.readEnterpriseNotification(ntfNum);
			if(result != 0) return SUCCESS;
			else return ERROR;
		}else{
			return ERROR;
		}
	}
	
	public String retrieveOffDays() throws Exception{
		if(reservationList != null){
			reservationList = etpDAO.retrieveOffDays(etpNum);
			return SUCCESS;
		}else{
			return ERROR;
		}	
	}
	
	public String retrieveReservationTime() throws Exception{
		//MobileTimeString, ServiceTimeString, EnterpriseNumber 제대로 받아옴: Check.
		String[] datetimeInfo = mobileTimeString.split("/");
		
		year = Integer.valueOf(datetimeInfo[0]);
		month = Integer.valueOf(datetimeInfo[1]);
		dayOfMonth = Integer.valueOf(datetimeInfo[2]);
		hour = Integer.valueOf(datetimeInfo[3]);
		minute = Integer.valueOf(datetimeInfo[4]);
		
		System.out.printf("year: %d month: %d dayOfMonth: %d hour: %d minute: %d", year, month, dayOfMonth, hour, minute);
		System.out.println();
		
		Long serviceHour = Long.valueOf(serviceTimeString.split(":")[0]);
		Long serviceMinuteTemp = Long.valueOf(serviceTimeString.split(":")[1]);
		
		LocalDateTime inputDateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
		
		System.out.println(inputDateTime.toString());
		
		LocalDateTime inputDateTimePlusService = LocalDateTime.from(inputDateTime);
		inputDateTimePlusService.plusMinutes(serviceMinuteTemp);
		inputDateTimePlusService.plusHours(serviceHour);
		
		if(etpNum != null && etpNum.length() == 10) reservationList = etpDAO.retrieveReservationTime(etpNum);
		else reservationList = etpDAO.retrieveReservationTime("9999999999");
		
		for(int i = 0 ; i < reservationList.size() ; i++){
			LocalDateTime rsvStartDateToCompare = reservationList.get(i).getRsvStartDate();
			LocalDateTime rsvEndDateToCompare = reservationList.get(i).getRsvEndDate();
			
			
			//TODO: 여기 로직 수정!
			if(inputDateTime.isBefore(rsvEndDateToCompare) && inputDateTime.isAfter(rsvStartDateToCompare)){
				reservationExists = true;
				break;
			}else if(inputDateTime.isEqual(rsvStartDateToCompare)){
				reservationExists = true;
				break;
			}else{
				reservationExists = false;
			}
		}
		
		if(reservationList.get(0) != null){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String insertReservationMobile() throws Exception{
		Reservation mobileReservation = new Reservation();
		mobileReservation.setCstEmail("t2@t2.com");
		mobileReservation.setEtpNum(service.getEtpNum());
		mobileReservation.setEtpEmail(service.getEtpEmail());
		mobileReservation.setSvcNum(service.getSvcNum());
		mobileReservation.setRsvCost(service.getSvcCost());
		mobileReservation.setRsvStartDate(LocalDateTime.parse(miscReservationDetail.getRsvStartDate()));
		mobileReservation.setRsvEndDate(LocalDateTime.parse(miscReservationDetail.getRsvEndDate()));
		mobileReservation.setRsvStatus(miscReservationDetail.getRsvStatus());
		mobileReservation.setRsvTitle(miscReservationDetail.getRsvTitle());
		mobileReservation.setRsvDesc(miscReservationDetail.getRsvDesc());
		mobileReservation.setEmployeeGender(miscReservationDetail.getEmployeeGender().toCharArray()[0]);
		
		int result = etpDAO.insertReservation(mobileReservation);
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String retrieveReservationNumber() throws Exception{
		Reservation mobileReservation = new Reservation();
		
		mobileReservation.setCstEmail(cstEmail);
		mobileReservation.setRsvStartDate(LocalDateTime.parse(miscReservationDetail.getRsvStartDate()));
		mobileReservation.setSvcNum(service.getSvcNum());
		mobileReservation.setRsvTitle(miscReservationDetail.getRsvTitle());
		Reservation temp = etpDAO.retrieveReservationNumber(mobileReservation);
		rsvNum = temp.getRsvNum();
		System.out.println(rsvNum);
		
		return SUCCESS;
	}
	
	//---------------Local Methods------------------//
	
	public Integer [] makeDow(WorkingDays wd){
		int [] temp = {wd.getSun(), wd.getMon(), wd.getTue(), wd.getWed(), wd.getThu(),wd.getFri(), wd.getSat()};
		List<Integer> it = new ArrayList<Integer>();
		boolean hasVacDay = false;
		int x = 0;
		for(int i = 0 ; i < temp.length ; i++){
			if(temp[i] == 1) hasVacDay = true;
			else it.add(x);
			x++;
		}
		Object[] temptt = it.toArray();
		Integer [] tt = Arrays.copyOf(temptt, temptt.length, Integer[].class);
		return tt;
	}
	
	//------------------Dummy Methods-----------------//
	public String showMap() throws Exception {
		etpEmail = "111";
		address = etpDAO.showMap(etpEmail);
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("check Action Execute");
		return SUCCESS;
	}
	
	public String emptyAction(){
		return SUCCESS;
	}
	
    //------------------Properties------------------//

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

	public SaleRecord getSaleRecord() {
		return saleRecord;
	}

	public List<SaleRecord> getSaleRecords() {
		return saleRecords;
	}

	public void setSaleRecord(SaleRecord saleRecord) {
		this.saleRecord = saleRecord;
	}

	public void setSaleRecords(List<SaleRecord> saleRecords) {
		this.saleRecords = saleRecords;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public int getSvcNum() {
		return svcNum;
	}

	public void setSvcNum(int svcNum) {
		this.svcNum = svcNum;
	}

	public int getUpCategory() {
		return upCategory;
	}

	public void setUpCategory(int upCategory) {
		this.upCategory = upCategory;
	}

	public String getInfoPht() {
		return infoPht;
	}

	public void setInfoPht(String infoPht) {
		this.infoPht = infoPht;
	}

	public String getLogoPht() {
		return logoPht;
	}

	public void setLogoPht(String logoPht) {
		this.logoPht = logoPht;
	}

	public List<Review> getReviewList() {
		return reviewList;
	}

	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}

	public List<Highchart14> getGunList() {
		return gunList;
	}

	public void setGunList(List<Highchart14> gunList) {
		this.gunList = gunList;
	}

	public Map<String, Object> getCpCollector() {
		return cpCollector;
	}

	public void setCpCollector(Map<String, Object> cpCollector) {
		this.cpCollector = cpCollector;
	}

	public Notification getNotification() {
		return notification;
	}

	public List<Notification> getNotificationList() {
		return notificationList;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	public void setNotificationList(List<Notification> notificationList) {
		this.notificationList = notificationList;
	}

	public int getNtfNum() {
		return ntfNum;
	}

	public void setNtfNum(int ntfNum) {
		this.ntfNum = ntfNum;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	public String getStartDay() {
		return startDay;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}

	public String getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}

	public String getEndDay() {
		return endDay;
	}

	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	public List<Reservation> getCouponSendList() {
		return couponSendList;
	}

	public void setCouponSendList(List<Reservation> couponSendList) {
		this.couponSendList = couponSendList;
	}

	public int getNtfCount() {
		return ntfCount;
	}

	public void setNtfCount(int ntfCount) {
		this.ntfCount = ntfCount;
	}

	public String getMobileTimeString() {
		return mobileTimeString;
	}

	public Date getMobileTime() {
		return mobileTime;
	}

	public void setMobileTimeString(String mobileTimeString) {
		this.mobileTimeString = mobileTimeString;
	}

	public void setMobileTime(Date mobileTime) {
		this.mobileTime = mobileTime;
	}

	public boolean isReservationExists() {
		return reservationExists;
	}

	public void setReservationExists(boolean reservationExists) {
		this.reservationExists = reservationExists;
	}

	public LocalTime getServiceTime() {
		return serviceTime;
	}

	public String getServiceTimeString() {
		return serviceTimeString;
	}

	public void setServiceTime(LocalTime serviceTime) {
		this.serviceTime = serviceTime;
	}

	public void setServiceTimeString(String serviceTimeString) {
		this.serviceTimeString = serviceTimeString;
	}

	public MiscReservationDetail getMiscReservationDetail() {
		return miscReservationDetail;
	}

	public void setMiscReservationDetail(MiscReservationDetail miscReservationDetail) {
		this.miscReservationDetail = miscReservationDetail;
	}

	public String getCstEmail() {
		return cstEmail;
	}

	public void setCstEmail(String cstEmail) {
		this.cstEmail = cstEmail;
	}

	public Integer getPmtNum() {
		return pmtNum;
	}

	public void setPmtNum(Integer pmtNum) {
		this.pmtNum = pmtNum;
	}

	public Integer getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(Integer saleAmount) {
		this.saleAmount = saleAmount;
	}

	public Integer getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(Integer saleNum) {
		this.saleNum = saleNum;
	}

	public boolean isMobileDone() {
		return mobileDone;
	}

	public void setMobileDone(boolean mobileDone) {
		this.mobileDone = mobileDone;
	}

	public String getMobileDoneString() {
		return mobileDoneString;
	}

	public void setMobileDoneString(String mobileDoneString) {
		this.mobileDoneString = mobileDoneString;
	}
}