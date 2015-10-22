package model.dao;

import java.util.List;

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
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			int result = session.getMapper(ReservationMapper.class).insertReservation(reservation);
			if(result == 1) session.commit();
			else session.rollback();
			return result;
		}finally{
			session.close();
		}
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
			System.out.println("============check DAO :: receiveServiceList :: "+svcList.size());
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
			session.getMapper(ServiceMapper.class).updateByPrimaryKey(service);
			return 0;
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
			System.out.println(phtList);
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
		return dataModificationTemplate(s -> {return fromMapper(s).insertImage(loc);});
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
			List<Component> componentList = session.getMapper(EnterpriseMapper.class).receiveComponentList(etpNum);
		
			System.out.println("============check DAO :: componentList.size() ::" + componentList.size());
			
			return componentList;
		}finally{
			session.close();
		}
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

	public Coupon checkCoupon(Integer cpnNum) {
		return dataRetrievalTemplate(s->{return fromMapper(s).checkCoupon(cpnNum);});
	}
}
