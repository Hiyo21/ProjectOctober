package controller.action;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.EnterpriseDAO;
import model.vo.Component;
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
	private Map<String, Object> session;
	private Member member;
	
	//////// Component Member ////////  
	private Component component;
	private List<Component> componentList;

	private String etpNum;
	private String etpEmail;
	private String address;
	private Integer rsvNum;

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
		if(reservation != null){
			reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart(), DateTimeFormatter.ISO_DATE_TIME));
			reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd(), DateTimeFormatter.ISO_DATE_TIME));
			//시험용!
			//svc_num 필요,
			reservation.setSvcNum(7);
			//etp_num 필요
			reservation.setEtpNum("1234567890");
			//etp_email 필요
			reservation.setEtpEmail("test1@test.com");
			//cst_email 필요
			reservation.setCstEmail("test2@test.com");
			
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

	public String receiveServiceList() throws Exception{
		serviceList = etpDAO.retrieveServices(etpNum);
		System.err.println(serviceList);
		if(serviceList != null) return SUCCESS;
		else return ERROR;
	}

	
	public String selectServiceList() throws Exception{
		System.out.println("===========check Action :: receiveServiceList :: " + etpNum);
		enterprise.setServices(etpDAO.selectServiceList(etpNum)); 

		if(enterprise.getServices() != null)
			return SUCCESS;
		else return ERROR;
	}
	
	public String selectEtpList() throws Exception{
		enterpriseList = etpDAO.selectEtpList();			
		System.out.println("===========check Action :: enterpriseList :: " + enterpriseList);
		return SUCCESS;
	}
	
	public String selectGalleryList() throws Exception{
		System.out.println("===========check Action :: receiveGalleryList :: " + etpNum);
		enterprise.setPhotos(etpDAO.selectPhotoList(etpNum));

		if(enterprise.getPhotos() != null) return SUCCESS;
		else return ERROR;
	}
	
	public String takeEtp() throws Exception{
		System.out.println("===========check Action :: receiveServiceList :: " + etpNum);
		enterprise = etpDAO.selectByEtpNum(etpNum);
		enterprise.setServices(etpDAO.selectServiceList(etpNum));
		enterprise.setReviews(etpDAO.selectReviewList(etpNum));
		enterprise.setPhotos(etpDAO.selectPhotoList(etpNum));
		
		if(enterprise != null) {
			int type = enterprise.getEtpTemplateType();
			session.put("pageId", etpNum);
			
			switch (type) {
			case 1:
				//dynamic
				enterprise.setComponents(etpDAO.receiveComponentList(etpNum));
				return "dynamic";
			case 3:
				//static_allInOne
				return "static2";
			default:
				//static_tabs
				return "static1";
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
	

	
	
//----------------------------------------------------------------------------------------------------//

	
	//////////////// Component Method ////////////////
	
	public String insertComponent(){
		System.out.println("============check Action :: insertComponet()");		
		
		////// 연결 후 페이지 정보 혹은 세션에서 etpnum, etpemail, etpTheme 불러오기
		component.setEtpNum("1111-11111");
		component.setEtpEmail("24hourplus@24hourplus.com");
		component.setComponentTheme(1);
		component.setBackgroundTheme(1);
		
		System.out.println("============check Action :: component :: " +component);
		
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
	
	public String receiveComponentList(){
		System.out.println("============check Action :: getComponentList()");
		component = new Component();
		component.setEtpNum("1111-11111");
		///// 사업자 번호와 일치하는 컴포넌트만 갖고 오기
		componentList = etpDAO.receiveComponentList(component.getEtpNum());
		
		if(componentList == null) {
			return ERROR;
		}
		System.out.println("============check Action :: componentList ::" + componentList);
		
		return SUCCESS;
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

	
}
