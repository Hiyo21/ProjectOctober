package model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.EnterpriseMapper;
import model.vo.Enterprise;

public class SearchDAO {
///////////////////고객 자유 검색 리스트 결과//////////////////////
	public List<Enterprise> CustomerFreeSearchingList(String keyword){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		
		try{
			List<Enterprise> etpList = session.getMapper(EnterpriseMapper.class).CustomerFreeSearchingList(keyword);
					
			return etpList;
		}finally{
			session.close();
		}
	}
	
///////////////////카테고리 검색 결과//////////////////////
	
	public List<Enterprise> categorySearch(Map<String, String> map){
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		
		try{
			System.err.println("DAO : "+map);
			List<Enterprise> etpList = session.getMapper(EnterpriseMapper.class).categorySearch(map);
			System.err.println("DAO : "+etpList);		
			return etpList;
		}finally{
			session.close();
		}
	}
	
}
	