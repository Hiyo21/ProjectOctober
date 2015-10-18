package controller.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.MemberDAO;
import model.vo.Member;
import model.vo.Zipcode;

public class MemberAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 5672648613791884055L;
	private static final Integer ENTERPRISE_CODE = 1;
	private static final Integer CUSTOMER_CODE = 2;
	private static final Integer ADMIN_CODE = 3;
	
	private Map<String, Object> session;
	private Member member;
	
	private String email;
	private String emailInput;
	private String etpNumInput;
	private String password;
	private MemberDAO memDAO;
	private boolean emailExists;
	private boolean etpNumExists;
	
	private String searchText;
	private List<Zipcode> zipcodeList;
	private String zipcode;
	private String address1;
	private String address2;
	private String phone;
	private String phone1;
	private String phone2;
	private String etpPhone;
	private String etpPhone1;
	private String etpPhone2;
	
	
	public MemberAction() {
		memDAO = DAOFactory.createMemberDAO();
	}
	
	public String toSecondRegistrationPage() throws Exception{
		System.err.println(member);
		if(member != null) return SUCCESS;
		else return ERROR;
	}
	
	public String toThirdRegistrationPage() throws Exception{
		System.err.println(member);
		if(member != null) return SUCCESS;
		else return ERROR;
	}
	
	public String checkEnterpriseDuplicateEmail() throws Exception{
		emailExists = memDAO.retrieveEmail(emailInput);
		return SUCCESS;
	}
	
	public String checkEnterpriseDuplicateEtpNum() throws Exception{
		etpNumExists = memDAO.retrieveEtpNum(etpNumInput);
		return SUCCESS;
	}
	
	public String loginProcess() throws Exception{
		Map<String, String> loginInfo = new HashMap<>();
		loginInfo.put("loginEmail", email);
		loginInfo.put("loginPassword", password);
		member = memDAO.loginResult(loginInfo);
		System.out.println(member);
		if(member == null) {
			return LOGIN;
		} else {
			if(member.getMemCode() == ENTERPRISE_CODE){
				session.put("loginId", member.getMemEmail());
				session.put("loginName", member.getMemName());
				session.put("memCode", member.getMemCode());
				return "enterprise";
			}else if(member.getMemCode() == CUSTOMER_CODE){
				session.put("loginId", member.getMemEmail());
				session.put("loginName", member.getMemName());
				session.put("memCode", member.getMemCode());
				return "customer";
			}else if(member.getMemCode() == ADMIN_CODE){
				session.put("loginId", member.getMemEmail());
				session.put("loginName", member.getMemName());
				session.put("memCode", member.getMemCode());
				return "admin";
			}else{
				return LOGIN;
			}
		}
	}
	
	public String logoutProcess() throws Exception{
		session.clear();
		return SUCCESS;
	}
	
	public String searchZipcode() throws Exception{
		System.out.println("action in");
		zipcodeList = memDAO.searchZipcode(searchText);
		if (zipcodeList != null) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Member getMember() {
		return member;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public boolean isEmailExists() {
		return emailExists;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmailExists(boolean emailExists) {
		this.emailExists = emailExists;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public String getEmailInput() {
		return emailInput;
	}

	public void setEmailInput(String emailInput) {
		this.emailInput = emailInput;
	}

	public boolean isEtpNumExists() {
		return etpNumExists;
	}

	public void setEtpNumExists(boolean etpNumExists) {
		this.etpNumExists = etpNumExists;
	}

	public String getEtpNumInput() {
		return etpNumInput;
	}

	public void setEtpNumInput(String etpNumInput) {
		this.etpNumInput = etpNumInput;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	public List<Zipcode> getZipcodeList() {
		return zipcodeList;
	}

	public void setZipcodeList(List<Zipcode> zipcodeList) {
		this.zipcodeList = zipcodeList;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getEtpPhone() {
		return etpPhone;
	}

	public void setEtpPhone(String etpPhone) {
		this.etpPhone = etpPhone;
	}

	public String getEtpPhone1() {
		return etpPhone1;
	}

	public void setEtpPhone1(String etpPhone1) {
		this.etpPhone1 = etpPhone1;
	}

	public String getEtpPhone2() {
		return etpPhone2;
	}

	public void setEtpPhone2(String etpPhone2) {
		this.etpPhone2 = etpPhone2;
	}
	
	
}
