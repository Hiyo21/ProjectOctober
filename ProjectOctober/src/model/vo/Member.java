package model.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Member implements Serializable {
	private List<Customer> customers;
	private List<Enterprise> enterprises;
	private Customer customer;
	private Enterprise enterprise;
    private String memEmail;
    private Integer memCode;
    private String memName;
    private String memPassword;
    private String memPhone;
    private LocalDate memJoinedDate;

    private static final long serialVersionUID = 1L;

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Enterprise> getEnterprises() {
		return enterprises;
	}

	public String getMemEmail() {
		return memEmail;
	}

	public Integer getMemCode() {
		return memCode;
	}

	public String getMemName() {
		return memName;
	}

	public String getMemPassword() {
		return memPassword;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public LocalDate getMemJoinedDate() {
		return memJoinedDate;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public void setEnterprises(List<Enterprise> enterprises) {
		this.enterprises = enterprises;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public void setMemCode(Integer memCode) {
		this.memCode = memCode;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public void setMemPassword(String memPassword) {
		this.memPassword = memPassword;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public void setMemJoinedDate(LocalDate memJoinedDate) {
		this.memJoinedDate = memJoinedDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member memEmail=").append(memEmail).append(", memCode=").append(memCode).append(", memName=")
				.append(memName).append(", memPassword=").append(memPassword).append(", memPhone=").append(memPhone)
				.append(", memJoinedDate=").append(memJoinedDate).append("]");
		return builder.toString();
	}

	public Customer getCustomer() {
		return customer;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

   
}