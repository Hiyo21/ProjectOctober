package model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.EnterpriseMapper;
import model.mapper.ReservationMapper;
import model.vo.Component;
import model.vo.Enterprise;
import model.vo.Reservation;


public class EnterpriseDAO {
	
	
	public List<Reservation> retrieveReservations(){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return session.getMapper(ReservationMapper.class).retrieveReservations();
		}finally{
			session.close();
		}
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

	public Enterprise receiveServiceList() {
		// TODO Auto-generated method stub
		return null;
	}
}
