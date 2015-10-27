package test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.vo.Enterprise;
import test.vo.Highchart1;
import test.vo.Highchart10;
import test.vo.Highchart11;
import test.vo.Highchart12;
import test.vo.Highchart13;
import test.vo.Highchart14;
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
	public List<Highchart6> highchart6DAO(Enterprise e) {
		List<Highchart6> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
			System.err.println(e+"1");
		try{
			list = sqlsession.selectList("highchart6", e);
			System.err.println(e+"2");
		}finally{
			sqlsession.close();
		}
		return list;
	}

	//고객 평가 척도(분기별)
	public List<Highchart7> highchart7DAO(Enterprise e) {
		List<Highchart7> list = null;
		
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart7", e);				
		}finally{
			sqlsession.close();
		}
		return list;
	}

	//할인쿠폰 사용여부에 따른 매출액 변화- start
	public List<Highchart8> highchart8DAO(String etpNum) {
		List<Highchart8> list = null;
		
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart8", etpNum);				
		}finally{
			sqlsession.close();
		}	
		
		return list;
	}


	public List<Highchart8> highchart8DAO1(String etpNum) {
		List<Highchart8> list1 = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list1 = sqlsession.selectList("highchart81", etpNum);				
		}finally{
			sqlsession.close();
		}	
		
		return list1;
	}
	//할인쿠폰 사용여부에 따른 매출액 변화-end

	
	
	//시간대별 고객 수 변화- 시작
	public List<Highchart9> highchart9DAO(Enterprise e) {
		List<Highchart9> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart9", e);				
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
	public List<Highchart11> highchart11DAO(Enterprise e) {
		List<Highchart11> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart11", e);				
		}finally{
			sqlsession.close();
		}				
		return list;
	}

	//직업별 인기 있는 서비스
	public List<Highchart12> highchart12DAO(Enterprise e) {
		List<Highchart12> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart12", e);				
		}finally{
			sqlsession.close();
		}		
		return list;
	}

	//연령대별 선호 서비스- 시작
	//10대
	public List<Highchart13> highchart13DAO() {
		 List<Highchart13> list = null;
		 SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
			try{
				list = sqlsession.selectList("highchart13");				
			}finally{
				sqlsession.close();
			}		
		return list;
	}

	//20대
	public List<Highchart13> highchart13DAO1() {
		List<Highchart13> list1 = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list1 = sqlsession.selectList("highchart131");				
		}finally{
			sqlsession.close();
		}		
		return list1;
	}

	//30대
	public List<Highchart13> highchart13DAO2() {
		List<Highchart13> list2 = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list2 = sqlsession.selectList("highchart132");				
		}finally{
			sqlsession.close();
		}	
		
		return list2;
	}

	//40대
	public List<Highchart13> highchart13DAO3() {
		List<Highchart13> list3 = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list3 = sqlsession.selectList("highchart133");				
		}finally{
			sqlsession.close();
		}	
		return list3;
	}

	//50대이상
	public List<Highchart13> highchart13DAO4() {
		List<Highchart13> list4 = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list4 = sqlsession.selectList("highchart134");				
		}finally{
			sqlsession.close();
		}	
		return list4;
	}
	//연령대별 선호 서비스- 끝
	
	
	//이용자 평가 하이차트
	public List<Highchart14> highchart14DAO(String etpNum){
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return sqlsession.selectList("highchart14", etpNum);	
		}finally{
			sqlsession.close();
		}		
	}
}