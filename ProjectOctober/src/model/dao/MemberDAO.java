package model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.MemberMapper;
import model.vo.Member;
import model.vo.Zipcode;

public class MemberDAO extends DAOTemplate {
	
	public Member loginResult(Map<String, String> loginInfo){
		return dataRetrievalTemplate(s-> {return fromMapper(s).loginResult(loginInfo);});
	}

	public boolean retrieveEmail(String emailInput) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			String email = session.getMapper(MemberMapper.class).retrieveEmail(emailInput);
			if(email == null || email.trim().length() == 0){
				return true;
			}else{
				return false;
			}
		}finally{
			session.close();
		}
	}
	


	public boolean retrieveEtpNum(String etpNumInput) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			String etpNum = session.getMapper(MemberMapper.class).retrieveEtpNum(etpNumInput);
			if(etpNum == null || etpNum.trim().length() == 0){
				return true;
			}else{
				return false;
			}
		}finally{
			session.close();
		}
	}
	
	
	public List<Zipcode> searchZipcode(String searchText) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			System.out.println(searchText);
			List<Zipcode> list = session.getMapper(MemberMapper.class).searchZipcode(searchText);
			System.out.println("DAO"+ list);
			return list;
		} finally {
			session.close();
		}
	}
	
	public MemberMapper fromMapper(SqlSession s){
		return s.getMapper(MemberMapper.class);
	}
}
