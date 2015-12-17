package model.common;

import model.dao.CustomerDAO;
import model.dao.EnterpriseDAO;
import model.dao.MemberDAO;
import model.dao.SearchDAO;
import test.dao.DAO;

public class DAOFactory {
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
	
	public static DAO createDAO(){
		return new DAO();
	}
}
