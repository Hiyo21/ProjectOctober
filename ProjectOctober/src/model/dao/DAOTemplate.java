package model.dao;

import org.apache.ibatis.session.SqlSession;

import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.log4j2.Log4j2LoggerFactory;

import model.common.MyBatisSqlSessionFactory;

public abstract class DAOTemplate {
	Logger logger = Log4j2LoggerFactory.getLogger(getClass());
	
	public Integer dataModificationTemplate(MappingCallback<Integer> callback){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			Integer result = callback.makeStatement(session);
			if(result != 0)	session.commit();
			else session.rollback();
			return result;
		}finally{
			session.close();
		}
	}
	
	public <T> T dataRetrievalTemplate(MappingCallback<T> callback){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return callback.makeStatement(session);
		}finally{
			session.close();
		}
	}
}
