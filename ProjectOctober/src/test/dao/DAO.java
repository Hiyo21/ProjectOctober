package test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import test.vo.Highchart1;
import test.vo.Highchart2;
import test.vo.Highchart3;

public class DAO {

	//고객 성별에 따른 staff성별 선호도
	public List<Highchart1> highchart1DAO() {
		List<Highchart1> list = null;
		 SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
			try{
				list = sqlsession.selectList("highchart1");				
			}finally{
				sqlsession.close();
			}		
		 
		return list;
	}

	
	//연령대별 고객 평가 척도 - highchart2
	public List<Highchart2> highchart2Dao() {
		 List<Highchart2> list = null;
		 SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
			try{
				list = sqlsession.selectList("highchart2");				
			}finally{
				sqlsession.close();
			}		
		 		 
		return list;
	}

	//계졀별 선호 서비스 
	public List<Highchart3> highchart3DAO() {
		List<Highchart3> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart3");				
		}finally{
			sqlsession.close();
		}		
	 		 
		
		return list;
	}

	
	
	
	
	
	
}
