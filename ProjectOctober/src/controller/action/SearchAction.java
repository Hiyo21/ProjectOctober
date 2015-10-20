package controller.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.CustomerDAO;
import model.dao.EnterpriseDAO;
import model.dao.SearchDAO;
import model.vo.Enterprise;

public class SearchAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> map = new HashMap<String, Object>();
	private List<Enterprise> enterpriseList;
	private Enterprise vo;
	private String button;
	private String searchKeyword;
	private SearchDAO searchDAO;
	
	public SearchAction() {
		searchDAO = DAOFactory.createSearchDAO();
	}
	
	//고객 자유 검색
	public String takeEnterpriseList() throws Exception{
		//searchDAO에 searchKeyword를 패러미터로 줘서 받아오게 함.		
		
		 
		enterpriseList=searchDAO.CustomerFreeSearchingList(searchKeyword);
		
		System.err.println("action : "+enterpriseList);
		
		return SUCCESS;
	}	
	
	//카테고리 검색
	public String categorySearch() throws Exception{	
		 
		System.err.println(button);
		enterpriseList=searchDAO.categorySearch(button);
		
		System.err.println("action : "+enterpriseList);
		
		return SUCCESS;
	}	
	
	
	public Enterprise getVo() {
		return vo;
	}

	public void setVo(Enterprise vo) {
		this.vo = vo;
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

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}
	
	
}
