package controller.action;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.common.VOFactory;
import model.dao.CustomerDAO;
import model.dao.EnterpriseDAO;
import model.vo.Customer;
import model.vo.Enterprise;
import model.vo.Member;
import model.vo.Notification;
import model.vo.PaymentRecord;
import model.vo.Reservation;
import model.vo.Review;

public class CustomerAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 1L;
	private CustomerDAO cstDAO;
	private Customer customer;
	private Member member;
	private PaymentRecord paymentRecord;
	private Review review;
	private Enterprise enterprise;
	private Reservation reservation;
	private Notification notification;
	
	private List<PaymentRecord> paymentRecords;
	private List<Notification> notificationList;
	private List<Customer> customerList;
	private List<Reservation> reservationList;
	private Map<String, Object> session;
	
	private String etpEmail;
	private String cstEmail;
	private String etpNum;
	private String id;
	private Integer pmtNum;
	private Integer ntfNum;
	private Integer ntfCount;
	
	private Integer pmtAmount;
	private Integer rsvNum;

	public CustomerAction() {
		cstDAO = DAOFactory.createCustomerDAO();
	}
	
	public String insertPaymentRecord() throws Exception{
		paymentRecord.setPmtTime(LocalDateTime.now());
		int result = cstDAO.insertPaymentRecord(paymentRecord);
		if(result != 0) paymentRecord = cstDAO.retrievePaymentRecord(paymentRecord.getRsvNum());
		else return ERROR;
		return SUCCESS;
	}
	
	public String insertPaymentRecordMobile() throws Exception{
		paymentRecord = new PaymentRecord();
		paymentRecord.setPmtTime(LocalDateTime.now());
		paymentRecord.setPmtAmount(pmtAmount);
		paymentRecord.setRsvNum(rsvNum);
		int result = cstDAO.insertPaymentRecord(paymentRecord);
		if(result != 0){
			paymentRecord = cstDAO.retrievePaymentRecord(paymentRecord.getRsvNum());
			pmtNum = paymentRecord.getPmtNum();
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String updatePaymentRecord() throws Exception{
		int result = cstDAO.updatePaymentRecord(paymentRecord);
		if(result != 0) paymentRecord = cstDAO.retrievePaymentRecord(paymentRecord.getPmtNum());
		else return ERROR;	
		return SUCCESS;
	}
	
	public String deletePaymentRecord() throws Exception{
		int result = cstDAO.deletePaymentRecord(pmtNum);
		if(result != 0) return SUCCESS;
		else return ERROR;
	}
	
	public String retrievePaymentRecords() throws Exception{
		paymentRecords = cstDAO.retrievePaymentRecords();
		return SUCCESS;
	}
	
	//이용자 평가
	public String customerEvaluation() throws Exception{
		String tempId = String.valueOf(ActionContext.getContext().getSession().get("loginId"));
		review.setCstEmail(tempId);		
		cstDAO.insertCustomerEvaluation(review);
		etpNum = review.getEtpNum();
		return SUCCESS;
	}	
	
	//이용자의 업체 예약 내역
	public String reservationHistory() throws Exception {
		String loginId = (String)session.get("loginId");
		paymentRecords = cstDAO.reservationHistory(loginId);
		System.out.println(paymentRecords);
		if (paymentRecords != null) return SUCCESS;
		else return ERROR;
	}
	
	public String reservationHistory1() throws Exception {
	      System.out.println(cstEmail+"잘찍히는지 확인해보기");//잘직혀
	      paymentRecords = cstDAO.reservationHistory1(cstEmail);
	      System.out.println("size!!"+paymentRecords.size());
	      if (paymentRecords != null) {
	         return SUCCESS;
	      }
	      else {
	         return ERROR;
	      }
	   }
	
	public String insertReservationCustomer() throws Exception{
		if(reservation != null){
			reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart().substring(0,19)));
			reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd().substring(0,19)));
			Enterprise tempEtp = DAOFactory.createEnterpriseDAO().selectByEtpNum(etpNum);
			reservation.setEtpNum(etpNum);
			reservation.setEtpEmail(tempEtp.getEtpEmail());
		}
		int result = cstDAO.insertReservation(reservation);
		if(result != 0) return SUCCESS;
		else return ERROR;
	}
	
	public String retrieveReservations() throws Exception{
		reservationList = cstDAO.retrieveReservations(etpNum);
		if (reservationList != null) {
			for(int i = 0 ; i < reservationList.size() ; i++){
				reservationList.get(i).setStart(reservationList.get(i).getRsvStartDate().toString());
				reservationList.get(i).setEnd(reservationList.get(i).getRsvEndDate().toString());
			}
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	
	public String insertCustomerNotification() throws Exception{
		if(reservation != null){
			EnterpriseDAO etpDAO = DAOFactory.createEnterpriseDAO();
			notification = VOFactory.createNotification();
			enterprise = etpDAO.selectByEtpNum(reservation.getEtpNum());
			reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart().substring(0,19)));
			reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd().substring(0,19)));
			reservation = etpDAO.retrieveReservationFromOtherInfo(reservation);
			String ntfMessageForInsert = reservation.getCstEmail() + " 님이 " + enterprise.getEtpTitle() + "의 예약 : " + reservation.getRsvTitle() + " (일시) " + reservation.getRsvStartDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm ")) + "을 등록하였습니다."; 
			notification.setRsvNum(reservation.getRsvNum()).setEtpNum(reservation.getEtpNum()).setEtpEmail(reservation.getEtpEmail()).setCstEmail(reservation.getCstEmail()).setNtfRead(0).setNtfMessage(ntfMessageForInsert).setNtfTime(LocalDateTime.now());			
			int result = cstDAO.insertCustomerNotification(notification);
			if(result != 0) return SUCCESS;
			else return ERROR;
		}else{
			return ERROR;
		}
	}
	
	public String updatePeriodCustomerNotification() throws Exception{
		EnterpriseDAO etpDAO = DAOFactory.createEnterpriseDAO();
		enterprise = etpDAO.selectByEtpNum(notification.getEtpNum());
		reservation = etpDAO.retrieveReservation(notification.getRsvNum());
		member = cstDAO.retrieveCustomer(notification.getCstEmail());
		if(notification != null){
			String ntfMessageForInsert = member.getMemEmail() + " 님이 " + enterprise.getEtpTitle() + "의 예약 : " + reservation.getRsvTitle() + "의 시간을 " + reservation.getRsvStartDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm ")) + "로/으로 변경하였습니다.";
			notification.setNtfMessage(ntfMessageForInsert).setNtfTime(LocalDateTime.now());
			int result = cstDAO.updatePeriodCustomerNotification(notification);
			if(result != 0) return SUCCESS;
			else return ERROR;
		}else{
			return ERROR;
		}
	}
	
	public String deleteCustomerNotification() throws Exception{
		enterprise = DAOFactory.createEnterpriseDAO().selectByEtpNum(notification.getEtpNum());
		if(notification != null){
			String ntfMessageForInsert = notification.getCstEmail() + " 님이 " + enterprise.getEtpTitle() + " 업체의 예약을 삭제하셨습니다.";
			notification.setNtfMessage(ntfMessageForInsert).setNtfTime(LocalDateTime.now());
			int result = cstDAO.deleteCustomerNotification(notification);
			if(result != 0) return SUCCESS;
			else return ERROR;
		}else{
			return ERROR;
		}
	}
	
	public String retrieveCustomerNotificationList() throws Exception{
		notificationList = cstDAO.retrieveCustomerNotificationList((String)session.get("loginId"));
		ntfCount = notificationList.size();
		if(ntfCount != null) return SUCCESS;
		else return ERROR;
	}
	
	public String retrieveCustomerNotificationListAll() throws Exception{
		notificationList = cstDAO.retrieveCustomerNotificationListAll((String)session.get("loginId"));
		if(notificationList != null) return SUCCESS;
		else return ERROR;
	}
	
	public String readCustomerNotification() throws Exception{
		if(ntfNum != 0){
			int result = cstDAO.readCustomerNotification(ntfNum);
			if(result != 0) return SUCCESS;
			else return ERROR;
		}else{
			return ERROR;
		}
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public String getCstEmail() {
		return cstEmail;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	public void setCstEmail(String cstEmail) {
		this.cstEmail = cstEmail;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}


	public PaymentRecord getPaymentRecord() {
		return paymentRecord;
	}


	public List<PaymentRecord> getPaymentRecords() {
		return paymentRecords;
	}


	public void setPaymentRecord(PaymentRecord paymentRecord) {
		this.paymentRecord = paymentRecord;
	}


	public void setPaymentRecords(List<PaymentRecord> paymentRecords) {
		this.paymentRecords = paymentRecords;
	}


	public String getEtpNum() {
		return etpNum;
	}


	public void setEtpNum(String etpNum) {
		this.etpNum = etpNum;
	}

	public Integer getPmtNum() {
		return pmtNum;
	}

	public void setPmtNum(Integer pmtNum) {
		this.pmtNum = pmtNum;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEtpEmail() {
		return etpEmail;
	}

	public void setEtpEmail(String etpEmail) {
		this.etpEmail = etpEmail;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public List<Reservation> getReservationList() {
		return reservationList;
	}

	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}

	public Notification getNotification() {
		return notification;
	}

	public List<Notification> getNotificationList() {
		return notificationList;
	}

	public Integer getNtfNum() {
		return ntfNum;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	public void setNotificationList(List<Notification> notificationList) {
		this.notificationList = notificationList;
	}

	public void setNtfNum(Integer ntfNum) {
		this.ntfNum = ntfNum;
	}

	public Integer getNtfCount() {
		return ntfCount;
	}

	public void setNtfCount(Integer ntfCount) {
		this.ntfCount = ntfCount;
	}

	public Integer getPmtAmount() {
		return pmtAmount;
	}

	public Integer getRsvNum() {
		return rsvNum;
	}

	public void setPmtAmount(Integer pmtAmount) {
		this.pmtAmount = pmtAmount;
	}

	public void setRsvNum(Integer rsvNum) {
		this.rsvNum = rsvNum;
	}	
}