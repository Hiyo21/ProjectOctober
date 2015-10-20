package model.dao;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.MemberMapper;
import model.vo.Customer;

public class CustomerDAO {
	
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
