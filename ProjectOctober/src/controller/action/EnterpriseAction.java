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
import model.vo.SaleRecord;
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
	private SaleRecord saleRecord;
	private List<SaleRecord> saleRecords;
	private String etpNum;
	private String etpNum1;
	private String etpEmail;

	//////// Component Member ////////  
	private Component component;
	private List<Component> componentList;
	private Service service;	
	
	private Coupon coupon;
	private String address;
	private Integer rsvNum;
	private String regCardLocation;
	private boolean canUseCoupon = false;
	private Integer cpnNum;
	private String category;
	private int svcNum;
	private int etpTemplateType;
	
	private int upCategory;//이미지 업로드시 용도 구별 위한 변수
	
	private String infoPht;
	private String logoPht;
	


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
		System.err.println(enterprise.getWorkingDays());
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
		System.err.println("retrieveReservationFromOtherInfo에서:" + reservation);
		if(reservation != null){
			reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart().substring(0,19)));
			reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd().substring(0,19)));
		
			reservation = etpDAO.retrieveReservationFromOtherInfo(reservation);
		}
		
		if(reservation != null){
			System.out.println("rsvnum찍기 : " + reservation.getRsvNum());
			return SUCCESS;
		}else{
			return ERROR;
		}
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
	
	public String insertSaleRecord() throws Exception{
		System.err.println(saleRecord);
		int result = etpDAO.insertSaleRecord(saleRecord);
		if(result == 1)return SUCCESS;
		else return ERROR;
	}
	
	//--------------------------------------------------사업자 페이지---------------------------
	//---------------------------------------Service Component-----------------------------
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
		System.err.println("category Check :: "+category);
		serviceList = etpDAO.selectSvcCategory(etpNum, category);
		
		if(serviceList != null) return SUCCESS;
		else return ERROR;
	}
	
	public String selectServiceList() throws Exception{
		System.err.println("===========check Action :: selectServiceList :: " + etpNum);
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
	
	public String insertService(){
		System.err.println("===========check Action :: insertService :: ");
		service.setEtpEmail(etpDAO.selectByEtpNum(service.getEtpNum()).getEtpEmail());
		System.out.println(service);
		int result = etpDAO.insertService(service);
		
		if(result==1)return SUCCESS;
		else return ERROR;
	}
	
	public String deleteService(){
		System.err.println("===========check Action :: deleteService :: " + svcNum);
		int result = etpDAO.deleteService(svcNum);
		if(result==1)return SUCCESS;
		else return ERROR;
	}
	
	//---------------------------------------Service Component End-----------------------------
	
	
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
		enterprise.setInfoPht(etpDAO.selectInfoPht(etpNum));
		enterprise.setLogoPht(etpDAO.selectLogoPht(etpNum));
		System.out.println("INFO:::"+enterprise.getInfoPht());
		System.out.println("LOGO:::"+enterprise.getLogoPht());
		infoPht = enterprise.getInfoPht();
		logoPht = enterprise.getLogoPht();
		
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
		System.err.println(coupon);
		coupon = etpDAO.checkCoupon(coupon);
		if(coupon != null)coupon.setCanUseCoupon(true);
		return SUCCESS;
	}
	
	
	//이미지 업로드 페이지로 가기
		public String checkUploadCategory() {
			System.out.println(upCategory);
			if (upCategory == 1) {
				System.out.println("여기"+1);
				return "gallery";
			} else if (upCategory == 2) {
				System.out.println("여기"+2);
				return "logo";
			} else if (upCategory == 3) {
				System.out.println("여기"+3);
				return "info";
			} else {
				System.out.println("여기"+4);
				return ERROR;
			}
		}
	

	
	
//--------------------------------------- Component ----------------------------------------//

	
	//////////////// Component Method ////////////////
	
	public String insertComponent(){
		System.out.println("============check Action :: insertComponet()");		
		enterprise = etpDAO.selectByEtpNum(etpNum);
		System.err.println("============check Action :: etpNum :: " +etpNum);
		////// 연결 후 페이지 정보 혹은 세션에서 etpnum, etpemail, etpTheme 불러오기
		component.setEtpEmail(enterprise.getEtpEmail());

		////신규 등록의 경우 insert로 이미 컴포넌트 값이 등록되어 있는 사업자의 경우 update로 적용하여 component의 중복을 제거		
		if(etpDAO.receiveComponentList(etpNum)!=null){	//컴포넌트 신규등록
			int result = etpDAO.insertComponent(component);
			if(result == 1) {
				return SUCCESS;
			}else{
				System.err.println("============check Action :: result :: " + result);
				return ERROR;
			}
		}else{	//컴포넌트 기존에 등록되어 있던 사람
			//업데이트
			System.out.println("============기존 컴포넌트 등록 사업자============");
			int result = etpDAO.updateComponent(component);
			if(result == 1) {
				return SUCCESS;
			}else{
				System.err.println("============check Action :: result :: " + result);
				return ERROR;
			}
		}
		
	}
	
		
	public String receiveComponentList(){
		System.out.println("============check Action :: getComponentList()");
		System.err.println(etpNum);
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
		System.out.println(etpNum+etpTemplateType);
		int result = etpDAO.choiceTemplateType(etpNum, etpTemplateType);
		
		//엔터프라이즈 전체
		enterprise = etpDAO.selectByEtpNum(etpNum);
		System.out.println(enterprise);
		
		//서비스 리스트 set
		List<Service> svcList = new ArrayList<Service>();
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
	
	//사업자의 이용자 예약 내역
	public String reservationHistory() {
		String loginEmail = (String)session.get("loginId");
		System.out.println("action"+loginEmail);
		saleRecords = etpDAO.reservationHistory(loginEmail);
		if (saleRecords != null) {
			return SUCCESS;
		} else {
			return ERROR;
		}
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
		regCardLocation = etpDAO.retrieveRegCard(etpNum);
		System.err.println("regCardLocation : "+regCardLocation);
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
	
	
}
