package model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.EnterpriseMapper;
import model.mapper.ReservationMapper;
import model.vo.Enterprise;
import model.vo.Reservation;

public class EnterpriseDAO {
	private Logger logger = Logger.getLogger(this.getClass());
	
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
	
	
}
