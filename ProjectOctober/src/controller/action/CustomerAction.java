package controller.action;



import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.CustomerDAO;
import model.vo.Customer;
import model.vo.Member;


public class CustomerAction extends ActionSupport implements SessionAware{
	private Customer customer;
	private List<Customer> customerList;
	private String cstEmail;
	private CustomerDAO cstDAO;
	private Map<String, Object> session;
	private Member member;
	
	public CustomerAction() {
		cstDAO = DAOFactory.createCustomerDAO();
	}
	
	//----------------------------------------//
	
	
	
	
	//----------------------------------------//

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
	
	
}
