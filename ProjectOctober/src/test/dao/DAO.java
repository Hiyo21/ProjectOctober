package test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import test.vo.Highchart1;
import test.vo.Highchart2;
import test.vo.Highchart3;
import test.vo.Highchart4;
import test.vo.Highchart5;

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

	//직업별 평균 소비 지출액
	public List<Highchart4> highchart4DAO() {
		List<Highchart4> list = null;
		
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart4");				
		}finally{
			sqlsession.close();
		}		 		
		
		return list;
	}

	//요일별 예약수(주말 / 평일)
	public List<Highchart5> highchart5DAO() {
		List<Highchart5> list = null;

		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart5");				
		}finally{
			sqlsession.close();
		}
		
		return list;
	}

	
	
	
	
	
	
}
