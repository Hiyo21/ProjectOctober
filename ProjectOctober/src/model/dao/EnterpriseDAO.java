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
			List<Enterprise> enterpriseList = session.getMapper(EnterpriseMapper.class).selectEtpList();
			return enterpriseList;
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
			System.err.println("============check DAO :: selectServiceList :: "+svcList.size());
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
			System.out.println("============check DAO :: selectSvcCategory :: "+svcList.size());
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
			List<Review> rvwList = session.getMapper(EnterpriseMapper.class).selectReviewList(etpNum);
			System.out.println("============check DAO :: selectReviewList :: "+rvwList.size());
			return rvwList;
		}finally{
			session.close();
		}
	}
	
	public List<PhotoLocation> selectPhotoList(String etpNum){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			List<PhotoLocation> phtList = session.getMapper(EnterpriseMapper.class).selectPhotoList(etpNum);
			System.out.println("============check DAO :: selectPhotoList :: "+phtList.size());
			return phtList;
		}finally{
			session.close();
		}
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
	
	
	////////////////////////Component DAO //////////////////////// 
	
	
	public int insertService(Service service) {
		System.out.println("============check DAO :: insertService()");
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

	//////////////////////// Component DAO ////////////////////////  
	
	public int insertComponent(Component component) {
		System.out.println("============check DAO :: insertComponet()");
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
		System.out.println("============check DAO :: getComponentList()");

		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			System.err.println(etpNum);
			List<Component> componentList = session.getMapper(EnterpriseMapper.class).receiveComponentList(etpNum);
		
			System.out.println("============check DAO :: componentList.size() ::" + componentList.size());
			
			return componentList;
		}finally{
			session.close();
		}
	}
	
	public int updateComponent(Component component) {
		System.out.println("============check DAO :: updateComponent()");

		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			int result = session.getMapper(EnterpriseMapper.class).updateComponent(component);
		
			System.out.println("============check DAO :: componentList.size() ::" + result);
			if(result==1) session.commit();
			else session.rollback();
			
			return result;
		}finally{
			session.close();
		}
	}

	
	public int choiceTemplateType(String etpNum, int etpTemplateType) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			Map<String, Enterprise> map = new HashMap<String, Enterprise>();
			Enterprise enterprise = new Enterprise();
			enterprise.setEtpNum(etpNum);
			enterprise.setEtpTemplateType(etpTemplateType);
			map.put("enterprise", enterprise);
			int result = session.update("choiceTemplateType", map);
			if(result == 1) session.commit();
			else session.rollback();
			return result;
		} finally {
			session.close();
		}
	}
	
	
	//사업자의 이용자 예약 내역
	public List<SaleRecord> reservationHistory(String loginEmail) {
		return dataRetrievalTemplate(s -> {return s.getMapper(EnterpriseMapper.class).reservationHistory(loginEmail);});
	}
	
	//////////////////////// 미승인 사업자 DAO ////////////////////////
	
	public Enterprise noRegisterEtp(String etpNum){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		
		try{			
			Enterprise etp = session.getMapper(EnterpriseMapper.class).noRegisterEtp(etpNum);
			System.out.println("DAO:"+etp);

			return etp;
		}finally{session.close();}
	}
	
	public List<Enterprise> allNoRegisterEtpList(){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		
		try{
			List<Enterprise> etpList = session.getMapper(EnterpriseMapper.class).allNoRegisterEtpList();
			
			return etpList;
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

	
	////////////////////MAP////////////////////
	public String showMap(String etpEmail) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			String address = session.selectOne("model.mapper.EnterpriseMapper.showMap", etpEmail);
			return address;
		} finally {
			session.close();
		}
	}

	public EnterpriseMapper fromMapper(SqlSession s){
		return s.getMapper(EnterpriseMapper.class);
	}



	public List<Coupon> retrieveCouponList(String etpNum) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			return session.getMapper(EnterpriseMapper.class).retrieveCouponList(etpNum);
		}finally{session.close();}
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
	
	public Reservation retrieveReservationFromOtherInfo(Reservation reservation) {
		return dataRetrievalTemplate(s -> {return fromMapper(s).retrieveReservationFromOtherInfo(reservation);});
	}


	public ArrayList<String> makeCategoryList(String etpNum) {
		SqlSession session  = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			return session.getMapper(ServiceMapper.class).selectCategory(etpNum);
		}finally{session.close();}

	public int insertSaleRecord(SaleRecord saleRecord) {
		return dataModificationTemplate(s -> {return fromMapper(s).insertSaleRecord(saleRecord);});

	}
}
