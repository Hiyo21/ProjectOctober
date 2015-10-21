package test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import test.vo.Highchart1;
import test.vo.Highchart10;
import test.vo.Highchart11;
import test.vo.Highchart2;
import test.vo.Highchart3;
import test.vo.Highchart4;
import test.vo.Highchart5;
import test.vo.Highchart6;
import test.vo.Highchart7;
import test.vo.Highchart8;
import test.vo.Highchart9;

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

	//시간대별 매출액 변화
	public List<Highchart6> highchart6DAO() {
		List<Highchart6> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart6");				
		}finally{
			sqlsession.close();
		}
		return list;
	}

	//고객 평가 척도(분기별)
	public List<Highchart7> highchart7DAO() {
		List<Highchart7> list = null;
		
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart7");				
		}finally{
			sqlsession.close();
		}
		return list;
	}

	//할인쿠폰 사용여부에 따른 매출액 변화- start
	public List<Highchart8> highchart8DAO() {
		List<Highchart8> list = null;

		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart8");				
		}finally{
			sqlsession.close();
		}	
		
		return list;
	}


	public List<Highchart8> highchart8DAO1() {
		List<Highchart8> list1 = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list1 = sqlsession.selectList("highchart81");				
		}finally{
			sqlsession.close();
		}	
		
		return list1;
	}
	//할인쿠폰 사용여부에 따른 매출액 변화-end

	
	
	//시간대별 고객 수 변화- 시작
	public List<Highchart9> highchart9DAO() {
		List<Highchart9> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart9");				
		}finally{
			sqlsession.close();
		}			
		return list;
	}

	//월별 매출액 변화
	public List<Highchart10> highchart10DAO() {
		List<Highchart10> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart10");				
		}finally{
			sqlsession.close();
		}		
		
		return list;
	}

	//직업별 방문 고객 수
	public List<Highchart11> highchart11DAO() {
		List<Highchart11> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart11");				
		}finally{
			sqlsession.close();
		}				
		return list;
	}


	
	
	
	
}
