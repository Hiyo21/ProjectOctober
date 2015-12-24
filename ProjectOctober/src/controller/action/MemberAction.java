package controller.action;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.CustomerDAO;
import model.dao.EnterpriseDAO;
import model.dao.MemberDAO;
import model.vo.Customer;
import model.vo.Enterprise;
import model.vo.Member;
import model.vo.Zipcode;

public class MemberAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 1L;
	private static final int ENTERPRISE_CODE = 1;
	private static final int ADMIN_CODE = 3;
	private static final int CUSTOMER_CODE = 2;
	
	private Map<String, Object> session;
	private Customer customer;
	private Member member;
	private String email;
	private String emailInput;
	private String etpNum;
	private String etpNumInput;
	private String password;
	private MemberDAO memDAO;
	private CustomerDAO cstDAO;
	private EnterpriseDAO etpDAO;
	private boolean emailExists;
	private boolean etpNumExists;
	private String cstEmail;
	private Integer rsvNum;
	
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
	
	ArrayList<String> loginArray;
	
	public MemberAction() {
		memDAO = DAOFactory.createMemberDAO();
		cstDAO = DAOFactory.createCustomerDAO();
		etpDAO = DAOFactory.createEnterpriseDAO();
	}
	
	public String customerRegistration1() throws Exception{
		member.setMemCode(2);
		String str = customer.getCstBirthdayTemp();
		String[] strs = str.split("-");
		customer.setCstBirthday(LocalDate.of(Integer.parseInt(strs[0]), Integer.parseInt(strs[1]), Integer.parseInt(strs[2])));
		int result = memDAO.insertMemberInfo2(member);
		if(result == 0) throw new Exception("일반이용자 - 멤버 등록 안 됨");
		customer.setCstEmail(member.getMemEmail());
		customer.setCstOneclick(0);
		int result2 = cstDAO.insertCustomerInfo(customer);
		if(result2 != 0) return SUCCESS;
		else throw new Exception("일반이용자 - 멤버 등록은 했는데 회원가입 안 됨");
	}
	
	public String checkEnterpriseDuplicateEmail() throws Exception{
		emailExists = memDAO.retrieveEmail(emailInput);
		return SUCCESS;
	}
	
	public String checkEnterpriseDuplicateEtpNum() throws Exception{
		etpNumExists = memDAO.retrieveEtpNum(etpNumInput);
		return SUCCESS;
	}
	
	public String backToFirstRegistrationPage() throws Exception{
		if(email == null) email = (String) ActionContext.getContext().getSession().get("email");
		int result = memDAO.deleteEnterpriseInfoFirstStep(email);
		if(result != 1) return ERROR;
		else result = memDAO.deleteMemberInfo(email);
		
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String toRegCardCheckPage() throws Exception{
		doPreliminarySteps(member);
		int result = memDAO.insertMemberInfo(member);
		ActionContext.getContext().getSession().put("email", member.getEnterprise().getEtpEmail());
		if(result != 1) return ERROR;
		else result = memDAO.insertEnterpriseInfoFirstStep(member.getEnterprise());
		if(result == 1) return SUCCESS;
		else return ERROR;
	}

	public String toSecondRegistrationPage() throws Exception{
		member = memDAO.retrieveMemberInfo(etpNum);
		return SUCCESS;
	}
	
	public String toThirdRegistrationPage() throws Exception{
		Member tempMember = memDAO.retrieveMemberInfo(etpNum);
		
		//---------------working days 셋업------------//
		initializeWorkingDays(tempMember, member.getEnterprise().getWorkingDays().getTemp());
		int result = memDAO.insertWorkingDays(tempMember);
		if(result == 0) throw new Exception("휴무일 지정 중 오류 발생.");
		
		//-------그 외: 업종, 특징, 수용 인원, 스태프 수, 등등 ------//
		tempMember.getEnterprise().setEtpSuperclass(member.getEnterprise().getEtpSuperclass());
		tempMember.getEnterprise().setEtpMaleStaff(member.getEnterprise().getEtpMaleStaff());
		tempMember.getEnterprise().setEtpFemaleStaff(member.getEnterprise().getEtpFemaleStaff());
		tempMember.getEnterprise().setEtpCapacity(member.getEnterprise().getEtpCapacity());
		tempMember.getEnterprise().setEtpSubclass(member.getEnterprise().getEtpSubclass());
		tempMember.getEnterprise().setEtpSpecialize(member.getEnterprise().getEtpSpecialize());		
		
		//-----------시작 시간, 끝 시간 설정 ---------------------//
		tempMember.getEnterprise().setEtpStartHour(LocalTime.parse(member.getEnterprise().getStart(),DateTimeFormatter.ISO_LOCAL_TIME));
		tempMember.getEnterprise().setEtpEndHour(LocalTime.parse(member.getEnterprise().getEnd(),DateTimeFormatter.ISO_LOCAL_TIME));
		result = memDAO.updateEtpDetailsFirst(tempMember);
		if(result == 0) throw new Exception("자동화 설정 정보 입력 중 오류 발생.");
	 	ActionContext.getContext().getSession().put("etpNum", tempMember.getEnterprise().getEtpNum());
		return SUCCESS;
	}
	
	public String finalizeRegistration() throws Exception{
		etpNum = (String) ActionContext.getContext().getSession().get("etpNum");
		Member tempMember = memDAO.retrieveMemberInfo(etpNum);
		tempMember.getEnterprise().setEtpRsvDeadline(member.getEnterprise().getEtpRsvDeadline());
		tempMember.getEnterprise().setEtpSelfNotification(member.getEnterprise().getEtpSelfNotification());
		tempMember.getEnterprise().setEtpCstNotification(member.getEnterprise().getEtpCstNotification());
		int result = memDAO.finalizeRegistration(tempMember);
		if(result == 0) return ERROR;
		else return SUCCESS;
	}


	public String loginProcess() throws Exception{
		if(session.get("invalid") != null) session.remove("invalid");
		Map<String, String> loginInfo = new HashMap<>();
		loginInfo.put("loginEmail", email);
		loginInfo.put("loginPassword", password);
		member = memDAO.loginResult(loginInfo);
		if(member == null) {
			session.put("invalid", "invalid");
			return LOGIN;
		} else {
			if(member.getMemCode() == ENTERPRISE_CODE){
				Enterprise enterprise = etpDAO.selectByEtpEmail(member.getMemEmail());
				if(enterprise == null) throw new Exception("엔터프라이즈가 없음!");
				if(enterprise.getEtpStatus() != 1) return LOGIN;
				session.put("enterprise", enterprise);
				session.put("loginEtpNum", enterprise.getEtpNum());
				session.put("loginId", member.getMemEmail());
				session.put("loginName", member.getMemName());
				session.put("memCode", member.getMemCode());
				if(enterprise.getEtpTemplateType() == 0) return "enterpriseNo";
				else return "enterprise";
			}else if(member.getMemCode() == CUSTOMER_CODE){
				session.put("customer", memDAO.retrieveCustomerInfo(member.getMemEmail()));
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
				session.put("invalid", "invalid");
				return LOGIN;
			}
		}
	}
	
	public String loginMobile() throws Exception{
		Map<String, String> loginInfo = new HashMap<>();
		loginInfo.put("loginEmail", email);
		loginInfo.put("loginPassword", password);
		
		System.out.println(email + password);
		member = memDAO.loginResult(loginInfo);
		System.out.println(member);
		
		if(member == null) {
			session.put("invalid", "invalid");
			return ERROR;
		}
		
		loginArray = new ArrayList<>();
		loginArray.add(member.getMemEmail());
		loginArray.add(member.getMemPassword());
		loginArray.add(member.getMemCode().toString());
		
		return SUCCESS;
	}
	
	public String logoutProcess() throws Exception{
		session.clear();
		return SUCCESS;
	}
	
	public String searchZipcode() throws Exception{
		zipcodeList = memDAO.searchZipcode(searchText);
		if (zipcodeList != null) return SUCCESS;
		else return ERROR;
		
	}
	
	public String checkMemberType() {
		if (session.get("customer") != null) return "customer";
		else if (session.get("enterprise") != null) return "enterprise";
		else if (session.get("admin") != null) return "admin";
		else return ERROR;
	}

	
	public String retrieveEnterpriseInfo() throws Exception {
		Enterprise enterprise = DAOFactory.createEnterpriseDAO().selectByEtpEmail((String)session.get("loginId"));
		if(enterprise.getEtpTemplateType() == 1) return "template1";
		else if(enterprise.getEtpTemplateType() == 2) return "template2";
		else return "template3";
	}
	
	public String retrieveCustomerInfo() throws Exception{
		member = memDAO.retrieveCustomerInfo(String.valueOf(ActionContext.getContext().getSession().get("loginId")));
		if(member != null) return SUCCESS;
		return ERROR;
	}
	
	public String retrieveCustomerInfoPerReservation() throws Exception{
		Map<String, Object> info = new HashMap<>();
		info.put("cstEmail", cstEmail);
		info.put("rsvNum", rsvNum);
		member = memDAO.retrieveCustomerInfoPerReservation(info);
		if(member != null)return SUCCESS;
		else return ERROR;
	}
	
	public String checkCustomerDuplicateEmail() throws Exception{
		emailExists = memDAO.retrieveEmail(emailInput);
		return SUCCESS;
	}

	
	//=================Private Methods=======================/
	
	private void doPreliminarySteps(Member member) {
		member.getEnterprise().setEtpOwner(member.getMemName());
		member.setMemCode(ENTERPRISE_CODE);
		member.getEnterprise().setEtpEmail(member.getMemEmail());
		member.getEnterprise().setEtpAddress(address1 + " " + address2);
		member.getEnterprise().setEtpZipcode(zipcode);
		member.setMemPhone(phone + "-" + phone1 + "-" + phone2);
		member.getEnterprise().setEtpPhone(etpPhone + "-" + etpPhone1 + "-" + etpPhone2);
		member.getEnterprise().setEtpStatus(0);
	}
	
	private void initializeWorkingDays(Member tempMember, String temp) {
		tempMember.getEnterprise().getWorkingDays().setMon(0).setTue(0).setWed(0).setThu(0).setFri(0).setSat(0).setSun(0).setTemp(temp);
		switch (temp) {
		case "mon":
			tempMember.getEnterprise().getWorkingDays().setMon(1);
			break;
		case "tue":
			tempMember.getEnterprise().getWorkingDays().setTue(1);
			break;
		case "wed":
			tempMember.getEnterprise().getWorkingDays().setWed(1);
			break;
		case "thu":
			tempMember.getEnterprise().getWorkingDays().setThu(1);
			break;
		case "fri":
			tempMember.getEnterprise().getWorkingDays().setFri(1);
			break;
		case "sat":
			tempMember.getEnterprise().getWorkingDays().setSat(1);
			break;
		case "sun":
			tempMember.getEnterprise().getWorkingDays().setSun(1);
			break;
		default:
			break;
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

	public String getEtpNum() {
		return etpNum;
	}

	public void setEtpNum(String etpNum) {
		this.etpNum = etpNum;
	}

	public String getCstEmail() {
		return cstEmail;
	}

	public void setCstEmail(String cstEmail) {
		this.cstEmail = cstEmail;
	}

	public Integer getRsvNum() {
		return rsvNum;
	}

	public void setRsvNum(Integer rsvNum) {
		this.rsvNum = rsvNum;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList<String> getLoginArray() {
		return loginArray;
	}

	public void setLoginArray(ArrayList<String> loginArray) {
		this.loginArray = loginArray;
	}
}
