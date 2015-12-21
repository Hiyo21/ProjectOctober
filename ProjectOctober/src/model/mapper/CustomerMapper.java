package model.mapper;

import java.util.List;
import model.vo.Customer;
import model.vo.CustomerExample;
import model.vo.Enterprise;
import model.vo.Notification;
import model.vo.PaymentRecord;
import model.vo.Reservation;
import model.vo.Review;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(String cstEmail);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExampleWithRowbounds(CustomerExample example, RowBounds rowBounds);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(String cstEmail);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

	Integer insertPaymentRecord(PaymentRecord paymentRecord);

	Integer updatePaymentRecord(PaymentRecord paymentRecord);

	Integer deletePaymentRecord(Integer pmtNum);

	List<PaymentRecord> retrievePaymentRecords();
	
	int insertCustomerEvaluation(Review record);

	PaymentRecord retrievePaymentRecord(Integer rsvNum);
	
	List<PaymentRecord> reservationHistory(String cstEmail);

	Enterprise retrieveEnterprise(String etpNum);

	Integer insertReservation(Reservation reservation);

	Integer insertCustomerNotification(Notification notification);

	Integer updatePeriodCustomerNotification(Notification notification);

	Integer deleteCustomerNotification(Notification notification);

	List<Notification> retrieveCustomerNotificationList(String cstEmail);
	
	List<Notification> retrieveCustomerNotificationListAll(String cstEmail);

	Integer readCustomerNotification(Integer ntfNum);

}