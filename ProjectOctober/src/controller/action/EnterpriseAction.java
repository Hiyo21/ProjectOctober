package controller.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.EnterpriseDAO;
import model.vo.Enterprise;
import model.vo.Reservation;

public class EnterpriseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private EnterpriseDAO etpDAO;
	private Enterprise enterprise;
	private List<Enterprise> enterpriseList;
	
	public EnterpriseAction() {
		etpDAO = DAOFactory.createEnterpriseDAO();
	}
	
	public String insertEvents() throws Exception{
		int result = etpDAO.insertEvent(enterprise);
		if(result != 0) return SUCCESS;
		else return ERROR;
	}
	
	public String retrieveEvents() throws Exception{
		System.out.println(1);
		enterprise = etpDAO.retrieveEnterpriseEvents();
		System.out.println(enterprise == null);
		if (enterprise != null) {
			List<Reservation> resList = enterprise.getReservations();
			System.out.println(resList.size());
			for(int i = 0 ; i < resList.size() ; i++ ){
				resList.get(i).setStart(resList.get(i).getRsvStartDate().toString());
				resList.get(i).setEnd(resList.get(i).getRsvEndDate().toString());
				//Reservation 상태에 따라 변화
				if(resList.get(i).getRsvStatus() == 0){
					resList.get(i).setBordercolor("#DDDDDD");
				}
			}
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public List<Enterprise> getEnterpriseList() {
		return enterpriseList;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public void setEnterpriseList(List<Enterprise> enterpriseList) {
		this.enterpriseList = enterpriseList;
	}
	
}
