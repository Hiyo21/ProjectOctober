package controller.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.DAOFactory;
import model.dao.SearchDAO;
import model.vo.Enterprise;

public class SearchAction extends ActionSupport {
	private List<Enterprise> enterpriseList;
	private String searchKeyword;
	private SearchDAO searchDAO;
	
	public SearchAction() {
		searchDAO = DAOFactory.createSearchDAO();
	}
	
	public String takeEnterpriseList() throws Exception{
		//searchDAO에 searchKeyword를 패러미터로 줘서 받아오게 함.
	}

	
	public List<Enterprise> getEnterpriseList() {
		return enterpriseList;
	}

	public void setEnterpriseList(List<Enterprise> enterpriseList) {
		this.enterpriseList = enterpriseList;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	
	
}
