package model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.MemberMapper;
import model.vo.Customer;

import model.mapper.CustomerMapper;

import model.vo.Member;
import model.vo.PaymentRecord;

public class CustomerDAO extends DAOTemplate{
	
	public Member retrieveCustomer(String cstEmail){
		return dataRetrievalTemplate(s -> {return s.getMapper(MemberMapper.class).retrieveCustomerInfo(cstEmail);});
	}
	
	public int insertPaymentRecord(PaymentRecord paymentRecord){
		return dataModificationTemplate(s -> {return s.getMapper(CustomerMapper.class).insertPaymentRecord(paymentRecord);});
	}
	
	public PaymentRecord retrievePaymentRecord(Integer rsvNum){
		return dataRetrievalTemplate(s -> {return s.getMapper(CustomerMapper.class).retrievePaymentRecord(rsvNum);});
	}
	
	public int updatePaymentRecord(PaymentRecord paymentRecord){
		return dataModificationTemplate(s -> {return s.getMapper(CustomerMapper.class).updatePaymentRecord(paymentRecord);});
	}
	
	public int deletePaymentRecord(Integer pmtNum){
		return dataModificationTemplate(s -> {return s.getMapper(CustomerMapper.class).deletePaymentRecord(pmtNum);});
	}
	
	public List<PaymentRecord> retrievePaymentRecords(){
		return dataRetrievalTemplate(s -> {return s.getMapper(CustomerMapper.class).retrievePaymentRecords();});
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
