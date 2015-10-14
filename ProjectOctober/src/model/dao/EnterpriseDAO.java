package model.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.EnterpriseMapper;
import model.vo.Enterprise;

public class EnterpriseDAO {
	private Logger logger = Logger.getLogger(this.getClass());
	
	public Enterprise retrieveEnterpriseReservations(){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return session.getMapper(EnterpriseMapper.class).retrieveEnterpriseReservations();
		}finally{
			session.close();
		}
	}
	
	public Integer insertEvent(Enterprise enterprise){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return session.insert("model.mapper.EnterpriseMapper.insertEvent", enterprise);
		}finally{
			session.close();
		}
	}
}
