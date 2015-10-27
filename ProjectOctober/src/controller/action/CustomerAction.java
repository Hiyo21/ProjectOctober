package controller.action;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.CustomerDAO;
import model.dao.SearchDAO;
import model.vo.Customer;
import model.vo.Enterprise;
import model.vo.Member;
import model.vo.PaymentRecord;
import model.vo.Reservation;
import model.vo.Review;

public class CustomerAction extends ActionSupport implements SessionAware{
	private Customer customer;
	private List<Customer> customerList;
	private String etpEmail;
	private String cstEmail;
	private CustomerDAO cstDAO;
	private SearchDAO searchDAO;
	private Map<String, Object> session;
	private Member member;
	private PaymentRecord paymentRecord;
	private List<PaymentRecord> paymentRecords;
	private Integer pmtNum;
	private String etpNum;
	private Review review;
	private Enterprise enterprise;
	private Reservation reservation;
	
	
	
	private String id;
	
	public CustomerAction() {
		cstDAO = DAOFactory.createCustomerDAO();
	}
	
	public String insertPaymentRecord() throws Exception{
		System.out.println(paymentRecord);
		System.err.println("나오냐?" + paymentRecord);
		paymentRecord.setPmtTime(LocalDateTime.now());
		int result = cstDAO.insertPaymentRecord(paymentRecord);
		if(result != 0){
			paymentRecord = cstDAO.retrievePaymentRecord(paymentRecord.getRsvNum());
		}else{
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String updatePaymentRecord() throws Exception{
		int result = cstDAO.updatePaymentRecord(paymentRecord);
		if(result != 0){
			paymentRecord = cstDAO.retrievePaymentRecord(paymentRecord.getPmtNum());
		}else{
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String deletePaymentRecord() throws Exception{
		int result = cstDAO.deletePaymentRecord(pmtNum);
		if(result != 0){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String retrievePaymentRecords() throws Exception{
		paymentRecords = cstDAO.retrievePaymentRecords();
		return SUCCESS;
	}	
	
	//이용자 평가
	public String customerEvaluation() throws Exception{
		System.err.println(review);
		
		System.err.println(review.getEtpNum());
		id = String.valueOf(ActionContext.getContext().getSession().get("loginId"));
		review.setCstEmail(id);		
		cstDAO.insertCustomerEvaluation(review);
		etpNum = review.getEtpNum();
		return SUCCESS;
	}	
	
	//이용자의 업체 예약 내역
	public String reservationHistory() throws Exception {
		String loginId = (String)session.get("loginId");
		paymentRecords = cstDAO.reservationHistory(loginId);
		System.out.println("size!!"+paymentRecords.size());
		if (paymentRecords != null) {
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}
	
	public String insertReservationCustomer() throws Exception{
		System.err.println(etpNum);
		System.err.println("널값 확인용 :" + reservation);
		if(reservation != null){
			System.err.println("reservation 시작 스트링: " + reservation.getStart());
			System.err.println("reservation 끝 스트링: " + reservation.getEnd());
			
			reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart().substring(0,19)));
			reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd().substring(0,19)));
			Enterprise tempEtp = cstDAO.retrieveEnterprise(etpNum);
			reservation.setEtpNum(tempEtp.getEtpNum());
			reservation.setEtpEmail(tempEtp.getEtpEmail());
		}
		int result = cstDAO.insertReservation(reservation);
		if(result != 0) return SUCCESS;
		else return ERROR;
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
	
	
}
