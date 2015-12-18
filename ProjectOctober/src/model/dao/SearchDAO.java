package model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.EnterpriseMapper;
import model.vo.Enterprise;

public class SearchDAO {
	public List<Enterprise> CustomerFreeSearchingList(String keyword){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			List<Enterprise> etpList = session.getMapper(EnterpriseMapper.class).CustomerFreeSearchingList(keyword);
			return etpList;
		}finally{
			session.close();
		}
	}
	
	public List<Enterprise> categorySearch(Map<String, String> map){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			List<Enterprise> etpList = session.getMapper(EnterpriseMapper.class).categorySearch(map);
			return etpList;
		}finally{
			session.close();
		}
	}
}
	