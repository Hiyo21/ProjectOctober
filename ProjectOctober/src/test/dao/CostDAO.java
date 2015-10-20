package test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import test.vo.Highchart10;
import test.vo.Highchart11;
import test.vo.Highchart9;

public class CostDAO {

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

	public List<Highchart10> highchart10DAO() {
		List<Highchart10> list1 = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list1 = sqlsession.selectList("highchart10");				
		}finally{
			sqlsession.close();
		}		
		return list1;
	}

	public List<Highchart11> highchart11DAO() {
		List<Highchart11> list2 = null;
		
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list2 = sqlsession.selectList("highchart11");				
		}finally{
			sqlsession.close();
		}		
		
		return list2;
	}

}
