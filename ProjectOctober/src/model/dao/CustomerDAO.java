package model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.CustomerMapper;
import model.mapper.MemberMapper;
import model.mapper.ReservationMapper;
import model.vo.Customer;
import model.vo.Enterprise;
import model.vo.Member;
import model.vo.Notification;
import model.vo.PaymentRecord;
import model.vo.Reservation;
import model.vo.Review;

public class CustomerDAO extends DAOTemplate{
	
	public Member retrieveCustomer(String cstEmail){
		return dataRetrievalTemplate(s -> {return s.getMapper(MemberMapper.class).retrieveCustomerInfo(cstEmail);});
	}
	
	public int insertPaymentRecord(PaymentRecord paymentRecord){
		return dataModificationTemplate(s -> {return fromMapper(s).insertPaymentRecord(paymentRecord);});
	}
	
	public PaymentRecord retrievePaymentRecord(Integer rsvNum){
		return dataRetrievalTemplate(s -> {return fromMapper(s).retrievePaymentRecord(rsvNum);});
	}
	
	public int updatePaymentRecord(PaymentRecord paymentRecord){
		return dataModificationTemplate(s -> {return fromMapper(s).updatePaymentRecord(paymentRecord);});
	}
	
	public int deletePaymentRecord(Integer pmtNum){
		return dataModificationTemplate(s -> {return fromMapper(s).deletePaymentRecord(pmtNum);});
	}
	
	public List<PaymentRecord> retrievePaymentRecords(){
		return dataRetrievalTemplate(s -> {return fromMapper(s).retrievePaymentRecords();});
	}
	
	//이용자 회원가입 
	public Integer insertCustomerInfo(Customer customer){
		return dataModificationTemplate(s -> {return s.getMapper(MemberMapper.class).insertCustomerInfo(customer);});
	}
	
	public List<PaymentRecord> reservationHistory(String loginEmail) {
		SqlSession ss = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			return ss.selectList("model.mapper.CustomerMapper.reservationHistory", loginEmail);
		} finally {
			ss.close();
		}
	}
	
	public List<PaymentRecord> reservationHistoryMobile(String loginEmail) {
		SqlSession ss = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			return ss.selectList("model.mapper.CustomerMapper.reservationHistoryMobile", loginEmail);
		} finally {
			ss.close();
		}
	}

	//이용자 평가 INSERT
	public int insertCustomerEvaluation(Review review) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			int result = session.insert("model.mapper.CustomerMapper.insertCustomerEvaluation",review);
			if(result == 1) session.commit();
			else session.rollback();
			return result;
		} finally {
			session.close();
		}
	}

	public Enterprise retrieveEnterprise(String etpNum) {
		return dataRetrievalTemplate(s -> {return s.getMapper(CustomerMapper.class).retrieveEnterprise(etpNum);});
	}

	public int insertReservation(Reservation reservation) {
		return dataModificationTemplate(s -> {return s.getMapper(ReservationMapper.class).insertReservation(reservation);});
	}

	public List<Reservation> retrieveReservations(String etpNum) {
		return dataRetrievalTemplate(s -> {return s.getMapper(ReservationMapper.class).retrieveReservations(etpNum);});
	}

	public int insertCustomerNotification(Notification notification) {
		return dataModificationTemplate(s -> {return fromMapper(s).insertCustomerNotification(notification);});
	}

	public int updatePeriodCustomerNotification(Notification notification) {
		return dataModificationTemplate(s -> {return fromMapper(s).updatePeriodCustomerNotification(notification);});
	}

	public int deleteCustomerNotification(Notification notification) {
		return dataModificationTemplate(s -> {return fromMapper(s).deleteCustomerNotification(notification);});
	}

	public List<Notification> retrieveCustomerNotificationList(String cstEmail) {
		return dataRetrievalTemplate(s -> {return fromMapper(s).retrieveCustomerNotificationList(cstEmail);});
	}
	
	public List<Notification> retrieveCustomerNotificationListAll(String cstEmail) {
		return dataRetrievalTemplate(s -> {return fromMapper(s).retrieveCustomerNotificationListAll(cstEmail);});
	}

	public int readCustomerNotification(Integer ntfNum) {
		return dataModificationTemplate(s -> {return fromMapper(s).readCustomerNotification(ntfNum);});
	}
	
	public CustomerMapper fromMapper(SqlSession s){
		return s.getMapper(CustomerMapper.class);
	}
}
