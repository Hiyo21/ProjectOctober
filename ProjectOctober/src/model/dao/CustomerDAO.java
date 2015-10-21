package model.dao;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.MemberMapper;
import model.vo.Customer;

import model.mapper.CustomerMapper;

import model.vo.Member;

public class CustomerDAO extends DAOTemplate{
	
	public Member retrieveCustomer(String cstEmail){
		return dataRetrievalTemplate(s -> {return s.getMapper(MemberMapper.class).retrieveCustomerInfo(cstEmail);});
	}
		
	
	public CustomerMapper fromMapper(SqlSession s){
		return s.getMapper(CustomerMapper.class);
	}
	
	//이용자 회원가입 
	public int insertCustomerInfo(Customer customer) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			System.err.println(customer);
			int result = session.getMapper(MemberMapper.class).insertCustomerInfo(customer);
			System.out.println("DAO : "+ result);
			if(result == 1) session.commit();
			else session.rollback();
			return result;
		} finally {
			session.close();
		}
	}
}
