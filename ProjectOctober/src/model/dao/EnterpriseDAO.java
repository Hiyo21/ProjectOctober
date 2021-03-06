package model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.EnterpriseMapper;
import model.mapper.ReservationMapper;
import model.mapper.ServiceMapper;
import model.vo.Component;
import model.vo.Coupon;
import model.vo.Enterprise;
import model.vo.Notification;
import model.vo.PhotoLocation;
import model.vo.Reservation;
import model.vo.Service;
import model.vo.Review;
import model.vo.SaleRecord;
import model.vo.ServiceExample;

public class EnterpriseDAO extends DAOTemplate{
	
	public Enterprise selectByEtpNum(String etpNum){
		return dataRetrievalTemplate(s -> {return fromMapper(s).selectByEtpNum(etpNum);});
	}
	
	public Enterprise selectByEtpNumAlternative(String etpNum){
		return dataRetrievalTemplate(s -> {return fromMapper(s).selectByEtpNumAlternative(etpNum);});
	}
	
	public Enterprise selectByEtpEmail(String etpEmail){
		return dataRetrievalTemplate(s -> {return fromMapper(s).selectByEtpEmail(etpEmail);});
	}
	
	public Enterprise selectByEtpNumIncludeOthers(String etpNum){
		return dataRetrievalTemplate(s -> {return fromMapper(s).selectByEtpNumIncludeOthers(etpNum);});
	}
	
	public Enterprise selectByEtpEmailIncludeOthers(String etpNum){
		return dataRetrievalTemplate(s -> {return fromMapper(s).selectByEtpEmailInclueOthers(etpNum);});
	}
	
	public List<Reservation> retrieveReservations(String etpNum){
		return dataRetrievalTemplate(s->{return s.getMapper(ReservationMapper.class).retrieveReservations(etpNum);});
	}
	
	public Integer insertReservation(Reservation reservation){
		return dataModificationTemplate(s -> {return s.getMapper(ReservationMapper.class).insertReservation(reservation);});
	}
	
	public Integer changeReservationTime(Reservation reservation){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			int result = session.getMapper(ReservationMapper.class).changeReservationTime(reservation);
			if(result == 1) session.commit();
			else session.rollback();
			return result;
		}finally{
			session.close();
		}
	}
	
	
	public Integer deleteReservation(Reservation reservation){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			int result = session.getMapper(ReservationMapper.class).deleteReservation(reservation);
			if(result == 1) session.commit();
			else session.rollback();
			return result;
		}finally{
			session.close();
		}
	}
	
	public List<Enterprise> selectEtpList(){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return session.getMapper(EnterpriseMapper.class).selectEtpList();
		}finally{
			session.close();
		}
	}
	
	public int updateEtp(Enterprise enterprise) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			int result = session.getMapper(EnterpriseMapper.class).updateByPrimaryKeySelective(enterprise);
			if(result == 1) session.commit();
			else session.rollback();
			return result;
		}finally{
			session.close();
		}
	}
	
	public List<Service> selectServiceList(String etpNum) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			ServiceExample example = new ServiceExample();
			example.or().andEtpNumEqualTo(etpNum);
			List<Service> svcList = session.getMapper(ServiceMapper.class).selectByExample(example);
			return svcList;	
		}finally{
			session.close();
		}
	}

	public List<Service> selectSvcCategory(String etpNum, String category) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		
		try{
			ServiceExample example = new ServiceExample();
			example.or().andEtpNumEqualTo(etpNum).andSvcCategoryEqualTo(category);
			List<Service> svcList = session.getMapper(ServiceMapper.class).selectByExample(example);
			return svcList;	
		}finally{
			session.close();
		}
	}
	
	public int updateSvcCategory(Service service) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			int result = session.getMapper(ServiceMapper.class).updateByPrimaryKeySelective(service);
			if(result == 1) session.commit();
			else session.rollback();
			return result;
		}finally{
			session.close();
		}
	}
	
	public List<Review> selectReviewList(String etpNum){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return session.getMapper(EnterpriseMapper.class).selectReviewList(etpNum);
		}finally{
			session.close();
		}
	}
	
	public List<PhotoLocation> selectPhotoList(String etpNum){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return session.getMapper(EnterpriseMapper.class).selectPhotoList(etpNum);
		}finally{
			session.close();
		}
	}
	
	public Integer deleteComponent(String etpNum){
		return dataModificationTemplate(s -> {return s.getMapper(EnterpriseMapper.class).deleteComponent(etpNum);});
	}

	public List<Service> retrieveServices(String etpNum) {
		return dataRetrievalTemplate(s -> {return s.getMapper(ServiceMapper.class).retrieveServices(etpNum);});
	}
	
	public int updateReservationDetailsByEnterprise(Reservation reservation) {
		return dataModificationTemplate(s -> {return s.getMapper(ReservationMapper.class).updateReservationDetailsInModal(reservation);});
	}
	
	public Integer uploadImage(PhotoLocation loc) {
		return dataModificationTemplate(s -> {return s.getMapper(EnterpriseMapper.class).insertImage(loc);});
	}
	
	public Integer uploadInfoImage(PhotoLocation loc) {
		return dataModificationTemplate(s -> {return s.getMapper(EnterpriseMapper.class).insertInfoImage(loc);});
	}
	
	public Integer uploadLogoImage(PhotoLocation loc) {
		return dataModificationTemplate(s -> {return s.getMapper(EnterpriseMapper.class).insertLogoImage(loc);});
	}
	
	public int insertService(Service service) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			int result = session.getMapper(ServiceMapper.class).insert(service);
			if(result == 1) session.commit();
			else session.rollback();
			return result;
		}finally{
			session.close();
		}
	}
	
	public int deleteService(int svcNum) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			int result = session.getMapper(ServiceMapper.class).deleteByPrimaryKey(svcNum);
			if(result==1) session.commit();
			else session.rollback();
			return result;
		}finally{session.close();}
	}

	public int insertComponent(Component component) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			int result = session.getMapper(EnterpriseMapper.class).insertComponent(component);
			if(result == 1) session.commit();
			else session.rollback();
			
			return result;
		}finally{
			session.close();
		}
	}

	public List<Component> receiveComponentList(String etpNum) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return session.getMapper(EnterpriseMapper.class).receiveComponentList(etpNum);
		}finally{
			session.close();
		}
	}
	
	public int updateComponent(Component component) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			int result = session.getMapper(EnterpriseMapper.class).updateComponent(component);
			if(result==1) session.commit();
			else session.rollback();
			return result;
		}finally{
			session.close();
		}
	}
	
	public int cleanComponent(String etpNum) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			int result = session.getMapper(EnterpriseMapper.class).cleanComponent(etpNum);
			if(result == 8) session.commit();
			else session.rollback();
			return result;
		}finally{
			session.close(); 
		}
	}
	
	public int choiceTemplateType(String etpNum, int etpTemplateType) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("etpNum", etpNum);
			map.put("etpTemplateType", etpTemplateType);
			int result = session.update("choiceTemplateType", map);
			if(result == 1) session.commit();
			else session.rollback();
			return result;
		} finally {
			session.close();
		}
	}

	public List<SaleRecord> reservationHistory(String loginEmail) {
		return dataRetrievalTemplate(s -> {return s.getMapper(EnterpriseMapper.class).reservationHistory(loginEmail);});
	}
	
	//////////////////////// 미승인 사업자 DAO ////////////////////////
	
	public Enterprise noRegisterEtp(String etpNum){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{			
			return session.getMapper(EnterpriseMapper.class).noRegisterEtp(etpNum);
		}finally{session.close();}
	}
	
	public List<Enterprise> allNoRegisterEtpList(){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return session.getMapper(EnterpriseMapper.class).allNoRegisterEtpList();
		}finally{session.close();}
	}
	
	public Integer updateEtpStatus(String etpNum){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			int result =session.update("model.mapper.EnterpriseMapper.updateEtpStatus",etpNum);
			if(result ==1)session.commit();
			else session.rollback();
			return result;
		}finally{session.close();}
	}
	
	public Integer rejectEtpStatus(String etpNum){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			int result =session.update("model.mapper.EnterpriseMapper.rejectEtpStatus",etpNum);
			if(result ==1)session.commit();
			else session.rollback();
			return result;
		}finally{session.close();}
	}
	
	public Integer uploadRegCard(PhotoLocation loc) {
		return dataModificationTemplate(s -> {return fromMapper(s).insertRegCard(loc);});
	}

	public String showMap(String etpEmail) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			return session.selectOne("model.mapper.EnterpriseMapper.showMap", etpEmail);
		} finally {
			session.close();
		}
	}
	
	public List<Coupon> retrieveCouponList(String etpNum) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			return session.getMapper(EnterpriseMapper.class).retrieveCouponList(etpNum);
		}finally{session.close();}
	}
	
	public int insertCoupon(Coupon coupon) {
		return dataModificationTemplate(s->{return s.getMapper(EnterpriseMapper.class).insertCoupon(coupon);});
	}
	
	public int updateCoupon(Coupon coupon) {
		return dataModificationTemplate(s->{return s.getMapper(EnterpriseMapper.class).updateCoupon(coupon);});
	}
	
	public int deleteCoupon(int cpnNum) {
		return dataModificationTemplate(s->{return s.getMapper(EnterpriseMapper.class).deleteCoupon(cpnNum);});
	}
	
	public List<Reservation> couponSendList(String etpEmail){
		return dataRetrievalTemplate(s->{return s.getMapper(ReservationMapper.class).couponSendList(etpEmail);});
	}

	public Coupon checkCoupon(Coupon coupon) {
		return dataRetrievalTemplate(s->{return fromMapper(s).checkCoupon(coupon);});
	}

	public String retrieveRegCard(String etpNum) {
		return dataRetrievalTemplate(s -> {return fromMapper(s).retrieveRegCard(etpNum);});
	}

	public String selectInfoPht(String etpNum) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			return session.getMapper(EnterpriseMapper.class).selectInfoPht(etpNum);
		}finally{session.close();}
	}

	public String selectLogoPht(String etpNum) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			return session.getMapper(EnterpriseMapper.class).selectLogoPht(etpNum);
		}finally{session.close();}
	}
	
	public int deletePht(Integer photoNum) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			int result = session.getMapper(EnterpriseMapper.class).deletePht(photoNum);
				if(result == 1) session.commit();
				else session.rollback();
			return result;
		}finally{session.close();}
	}
	
	public Reservation retrieveReservationFromOtherInfo(Reservation reservation) {
		return dataRetrievalTemplate(s -> {return fromMapper(s).retrieveReservationFromOtherInfo(reservation);});
	}

	public ArrayList<String> makeCategoryList(String etpNum) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			return session.getMapper(ServiceMapper.class).selectCategory(etpNum);

		}finally{
			session.close(); 
		}
	}

	public int insertSaleRecord(SaleRecord saleRecord) {
		return dataModificationTemplate(s -> {return fromMapper(s).insertSaleRecord(saleRecord);});
	}

	public int updateTemplate(Enterprise enterprise) {
		return dataModificationTemplate(s -> {return fromMapper(s).updateTemplate(enterprise);});
	}

	public List<Reservation> retrieveOffDays(String etpNum) {
		return dataRetrievalTemplate(s-> {return s.getMapper(ReservationMapper.class).retrieveOffDays(etpNum);});
	}

	public List<Service> receiveServiceList(String etpNum) {
		return dataRetrievalTemplate(s -> {return s.getMapper(ServiceMapper.class).retrieveServices(etpNum);});
	}

	public int insertDayOff(Reservation reservation) {
		return dataModificationTemplate(s -> {return s.getMapper(ReservationMapper.class).insertOffDays(reservation);});
	}

	public Component selectComponent(Map<String, String> check) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			return session.getMapper(EnterpriseMapper.class).selectComponent(check);
		}finally{
			session.close(); 
		}
	}

	public int insertEnterpriseNotification(Notification notification) {
		return dataModificationTemplate(s -> {return fromMapper(s).insertEnterpriseNotification(notification);});
	}
	
	public int updateDurationEnterpriseNotification(Notification notification){
		return dataModificationTemplate(s -> {return fromMapper(s).updateDurationEnterpriseNotification(notification);});
	}
	
	public int updatePeriodEnterpriseNotification(Notification notification){
		return dataModificationTemplate(s -> {return fromMapper(s).updatePeriodEnterpriseNotification(notification);});
	}
	
	public int deleteEnterpriseNotification(Notification notification){
		return dataModificationTemplate(s -> {return fromMapper(s).deleteEnterpriseNotification(notification);});
	}
	
	public List<Notification> retrieveEnterpriseNotificationList(String etpNum){
		return dataRetrievalTemplate(s -> {return fromMapper(s).retrieveEnterpriseNotificationList(etpNum);});
	}
	
	public List<Notification> retrieveEnterpriseNotificationListAll(String etpNum){
		return dataRetrievalTemplate(s -> {return fromMapper(s).retrieveEnterpriseNotificationListAll(etpNum);});
	}
	
	public int readEnterpriseNotification(Integer ntfNum){
		return dataModificationTemplate(s -> {return fromMapper(s).readEnterpriseNotification(ntfNum);});
	}
	
	public Reservation retrieveReservation(Integer rsvNum){
		return dataRetrievalTemplate(s -> {return s.getMapper(ReservationMapper.class).retrieveReservation(rsvNum);});
	}
	
	public List<Reservation> retrieveReservationTime(String etpNum){
		return dataRetrievalTemplate(s -> {return s.getMapper(ReservationMapper.class).retrieveReservationTime(etpNum);});
	}
	
	public EnterpriseMapper fromMapper(SqlSession s){
		return s.getMapper(EnterpriseMapper.class);
	}

	public Reservation retrieveReservationNumber(Reservation mobileReservation) {
		return dataRetrievalTemplate(s -> {return s.getMapper(ReservationMapper.class).retrieveReservationNumber(mobileReservation);});
	}
}
