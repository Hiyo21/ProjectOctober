package model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.vo.Reservation;

public class EnterpriseDAO {
	
	public List<Reservation> retrieveEvents(){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			System.out.println(1);
			return session.selectList("model.mapper.ReservationMapper.retrieveEvents"); 
		}finally{
			session.close();
		}
	}
	
	public Integer insertEvent(Reservation reservation){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return session.insert("model.mapper.ReservationMapper.insertEvent", reservation);
		}finally{
			session.close();
		}
	}
}
