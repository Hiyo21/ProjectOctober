package controller.action;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.CustomerDAO;
import model.vo.Customer;
import model.vo.Member;
import model.vo.PaymentRecord;

public class CustomerAction extends ActionSupport implements SessionAware{
	private Customer customer;
	private List<Customer> customerList;
	private String cstEmail;
	private CustomerDAO cstDAO;
	private Map<String, Object> session;
	private Member member;
	private PaymentRecord paymentRecord;
	private List<PaymentRecord> paymentRecords;
	private Integer pmtNum;
	private String etpNum;
	
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
		// TODO Auto-generated method stub
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
}
