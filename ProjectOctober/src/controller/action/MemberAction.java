package controller.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.MemberDAO;
import model.vo.Member;

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
		if(member == null) return LOGIN;
		else {
			if(member.getMemCode() == ENTERPRISE_CODE){
				return "enterprise";
			}else if(member.getMemCode() == CUSTOMER_CODE){
				
				return "customer";
			}else if(member.getMemCode() == ADMIN_CODE){
				
				return "admin";
			}else{
				return LOGIN;
			}
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
}
