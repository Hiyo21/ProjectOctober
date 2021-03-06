package controller.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.EnterpriseDAO;
import model.dao.SearchDAO;
import model.vo.Enterprise;

public class SearchAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Map<String, String> map = new HashMap<String, String>();
	private List<Enterprise> enterpriseList;
	private Enterprise vo;
	private String part;
	private String searchKeyword;
	private SearchDAO searchDAO;
	
	public SearchAction() {
		searchDAO = DAOFactory.createSearchDAO();
	}
	
	//고객 자유 검색
	public String takeEnterpriseList() throws Exception{
		//searchDAO에 searchKeyword를 패러미터로 줘서 받아오게 함.		
		enterpriseList=searchDAO.CustomerFreeSearchingList(searchKeyword);
		EnterpriseDAO etpDAO = new EnterpriseDAO();
		
		for(Enterprise etp : enterpriseList){
			etp.setInfoPht(etpDAO.selectInfoPht(etp.getEtpNum()));
		}

		return SUCCESS;
	}	
	
	//카테고리 검색
	public String categorySearch() throws Exception{	
		map.put("part", part);
		map.put("searchKeyword", searchKeyword);
		
		enterpriseList=searchDAO.categorySearch(map);
		
		EnterpriseDAO etpDAO = new EnterpriseDAO();
		for(Enterprise e : enterpriseList){
			if(etpDAO.selectInfoPht(e.getEtpNum())!= null){
				e.setInfoPht(etpDAO.selectInfoPht(e.getEtpNum()));
			}
		}
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

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}
}
