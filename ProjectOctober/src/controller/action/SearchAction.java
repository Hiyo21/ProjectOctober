package controller.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.DAOFactory;
import model.dao.SearchDAO;
import model.vo.Enterprise;

public class SearchAction extends ActionSupport {
	private List<Enterprise> enterpriseList;
	private SearchDAO searchDAO;
	
	public SearchAction() {
		searchDAO = DAOFactory.createSearchDAO();
	}
	
	public String takeEnterpriseList() throws Exception{
		
	}

	
	public List<Enterprise> getEnterpriseList() {
		return enterpriseList;
	}

	public void setEnterpriseList(List<Enterprise> enterpriseList) {
		this.enterpriseList = enterpriseList;
	}
	
	
}
