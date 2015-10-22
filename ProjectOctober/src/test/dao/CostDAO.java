package test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.vo.Enterprise;
import test.vo.AutoHighchartCost1;
import test.vo.AutoHighchartCost2;
import test.vo.AutoHighchartCost3;
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

	public List<Highchart10Cost> highchart10DAO(String enterAddress) {
		List<Highchart10Cost> list1 = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list1 = sqlsession.selectList("highchart10Cost", enterAddress);				
		}finally{
			sqlsession.close();
		}		
		return list1;
	}

	public List<Highchart11Cost> highchart11DAO(Enterprise e) {
		List<Highchart11Cost> list2 = null;
		
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list2 = sqlsession.selectList("highchart11Cost", e);				
		}finally{
			sqlsession.close();
		}		
		
		return list2;
	}

	//유료통계1- 자동문구 생성
	public List<AutoHighchartCost1> autoHighchartCost1(Enterprise e1) {
		List<AutoHighchartCost1> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("AutoCost1", e1);				
		}finally{
			sqlsession.close();
		}		
		
		
		return list;
	}
	
	//유료통계2- 자동문구 생성시작
	public List<AutoHighchartCost2> autoHighchartCost2(Enterprise e2) {
		List<AutoHighchartCost2> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("AutoCost2", e2);	
			System.out.println(list+"dao");
		}finally{
			sqlsession.close();
		}		
		
		return list;
	}

	public List<AutoHighchartCost2> autoHighchartCost21(Enterprise e2) {
		List<AutoHighchartCost2> list = null;
		SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
		try{
			list = sqlsession.selectList("AutoCost21", e2);				
		}finally{
			sqlsession.close();
		}		
		
		return list;
	}		
	//유료통계2- 자동문구 생성끝

	
	//유료통계3 - 자동문구 생성
		public List<AutoHighchartCost3> autoHighchartCost3(Enterprise e3) {
			List<AutoHighchartCost3> list = null;
			SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
			try{
				list = sqlsession.selectList("AutoCost3", e3);				
			}finally{
				sqlsession.close();
			}		
			return list;
		}

		public List<AutoHighchartCost3> autoHighchartCost31(Enterprise e3) {
			List<AutoHighchartCost3> list = null;
			SqlSession sqlsession = MyBatisSqlSessionFactory.getSessionFactory().openSession(true);
			try{
				list = sqlsession.selectList("AutoCost31", e3);				
			}finally{
				sqlsession.close();
			}		
			return list;
		}		
	//유료통계3 - 자동문구 끝
		
}
