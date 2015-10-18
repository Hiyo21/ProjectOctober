package controller.action;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.common.VOFactory;
import model.dao.MemberDAO;
import model.vo.Member;
import model.vo.WorkingDays;

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
	
	public String toFirstRegistrationPage() throws Exception{
		return SUCCESS;
	}
	
	public String toSecondRegistrationPage() throws Exception{
		System.err.println(member);
		System.err.println(member.getEnterprise());
		member.setMemCode(ENTERPRISE_CODE);
		member.getEnterprise().setEtpEmail(member.getMemEmail());
		member.getEnterprise().setEtpOwner(member.getMemName());
		member.getEnterprise().setEtpStatus(0);
		session.put("tempMember", member);

		if(member != null) return SUCCESS;
		else return ERROR;
	}
	
	public String toThirdRegistrationPage() throws Exception{
		Member tempMember = (Member) session.get("tempMember");
		System.err.println(member.getEnterprise());
		System.err.println(member.getEnterprise().getWorkingDays().getTemp());
		tempMember.getEnterprise().setWorkingDays(VOFactory.createWorkingDays());
		tempMember.getEnterprise().getWorkingDays().setEtpNum(tempMember.getEnterprise().getEtpNum());
		tempMember.getEnterprise().getWorkingDays().setEtpEmail(tempMember.getEnterprise().getEtpEmail());
		tempMember.getEnterprise().getWorkingDays().setTemp(member.getEnterprise().getWorkingDays().getTemp());
		System.err.println(tempMember.getEnterprise().getWorkingDays());
		tempMember.getEnterprise().setEtpSuperclass(member.getEnterprise().getEtpSuperclass());
		tempMember.getEnterprise().setEtpMaleStaff(member.getEnterprise().getEtpMaleStaff());
		tempMember.getEnterprise().setEtpFemaleStaff(member.getEnterprise().getEtpFemaleStaff());
		tempMember.getEnterprise().setEtpCapacity(member.getEnterprise().getEtpCapacity());
		tempMember.getEnterprise().setEtpSubclass(member.getEnterprise().getEtpSubclass());
		tempMember.getEnterprise().setEtpSpecialize(member.getEnterprise().getEtpSpecialize());
		tempMember.getEnterprise().setEtpStartHour(LocalTime.parse(member.getEnterprise().getStart(),DateTimeFormatter.ISO_LOCAL_TIME));
		tempMember.getEnterprise().setEtpEndHour(LocalTime.parse(member.getEnterprise().getEnd(),DateTimeFormatter.ISO_LOCAL_TIME));
		
		member = SerializationUtils.clone(tempMember);
		System.err.println(member);
		System.err.println(member.getEnterprise());
		System.err.println(member.getEnterprise().getWorkingDays());
		if(member != null){
			return SUCCESS;
		}
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
