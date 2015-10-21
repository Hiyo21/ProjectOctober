package test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import test.vo.Highchart10Cost;
import test.vo.Highchart11Cost;
import test.vo.Highchart9Cost;

public class CostDAO {

	public List<Highchart9Cost> highchart9DAO() {
		List<Highchart9Cost> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("highchart9Cost");				
		}finally{
			sqlsession.close();
		}		
		return list;
	}

	public List<Highchart10Cost> highchart10DAO() {
		List<Highchart10Cost> list1 = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list1 = sqlsession.selectList("highchart10Cost");				
		}finally{
			sqlsession.close();
		}		
		return list1;
	}

	public List<Highchart11Cost> highchart11DAO() {
		List<Highchart11Cost> list2 = null;
		
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list2 = sqlsession.selectList("highchart11Cost");				
		}finally{
			sqlsession.close();
		}		
		
		return list2;
	}

}
