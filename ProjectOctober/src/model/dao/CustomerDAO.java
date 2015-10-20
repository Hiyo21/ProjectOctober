package model.dao;

import org.apache.ibatis.session.SqlSession;

import model.mapper.CustomerMapper;
import model.mapper.MemberMapper;
import model.vo.Customer;
import model.vo.Member;

public class CustomerDAO extends DAOTemplate{
	
	public Member retrieveCustomer(String cstEmail){
		return dataRetrievalTemplate(s -> {return s.getMapper(MemberMapper.class).retrieveCustomerInfo(cstEmail);});
	}
		
	
	public CustomerMapper fromMapper(SqlSession s){
		return s.getMapper(CustomerMapper.class);
	}
}
