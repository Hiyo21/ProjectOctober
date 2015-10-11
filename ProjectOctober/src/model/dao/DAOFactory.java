package model.dao;

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
	
	public static AdminDAO createAdminDAO(){
		return new AdminDAO();
	}
}
