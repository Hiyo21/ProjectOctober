package test.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.vo.Enterprise;
import test.dao.DAO;
import test.vo.Highchart14;

public class Action14 extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String etpNum;
	private String etpEmail;
	private Enterprise enterprise;
	private List<Highchart14> gunList;
	
	
	public String highchart14() throws Exception{
		DAO dao = new DAO();
		System.err.println(etpNum);
		System.err.println(etpEmail);
		System.err.println(enterprise);
		if(etpNum != null){
			gunList = dao.highchart14DAO(etpNum);
		}else{
			gunList = dao.highchart14DAO(enterprise.getEtpNum());
		}
		if(gunList != null) return SUCCESS;
		else return ERROR;
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

	public List<Highchart14> getGunList() {
		return gunList;
	}

	public void setGunList(List<Highchart14> gunList) {
		this.gunList = gunList;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}



}
