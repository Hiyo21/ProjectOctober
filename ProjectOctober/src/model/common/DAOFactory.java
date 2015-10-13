package model.common;

import model.dao.AdminDAO;
import model.dao.CustomerDAO;
import model.dao.EnterpriseDAO;
import model.dao.MemberDAO;
import model.dao.SearchDAO;

public class DAOFactory {
	public static AdminDAO createAdminDAO(){
		return new AdminDAO();
	}
	
	public static MemberDAO createMemberDAO(){
		return new MemberDAO();
	}
	
	public static CustomerDAO createCustomerDAO(){
		return new CustomerDAO();
	}
	
	public static EnterpriseDAO createEnterpriseDAO(){
		return new EnterpriseDAO();
	}
	
	public static SearchDAO createSearchDAO(){
		return new SearchDAO();
	}
}
