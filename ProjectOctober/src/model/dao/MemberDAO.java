package model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.common.MyBatisSqlSessionFactory;
import model.mapper.MemberMapper;
import model.vo.Enterprise;
import model.vo.Member;
import model.vo.Zipcode;

public class MemberDAO extends DAOTemplate {
	//이용자 회원가입 
	public int insertMemberInfo2(Member member) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try {
			System.err.println(member);
			int result = session.getMapper(MemberMapper.class).insertMemberInfo(member);
			System.out.println("DAO : "+ result);
			if(result == 1) session.commit();
			else session.rollback();
			return result;
		} finally {
			session.close();
		}
	}	
	
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
	
	public Member retrieveCustomerInfoPerReservation(Map<String, Object> info) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return session.getMapper(MemberMapper.class).retrieveCustomerInfoPerReservation(info);
		}finally{
			session.close();
		}
	}
	
	public Member retrieveCustomerInfo(String cstEmail){
		return dataRetrievalTemplate(s -> {return fromMapper(s).retrieveCustomerInfo(cstEmail);});
	}

	public MemberMapper fromMapper(SqlSession s){
		return s.getMapper(MemberMapper.class);
	}

	public Integer insertMemberInfo(Member member) {
		return dataModificationTemplate(s -> {return fromMapper(s).insertMemberInfo(member);});
	}

	public Integer insertEnterpriseInfoFirstStep(Enterprise enterprise) {
		return dataModificationTemplate(s -> {return fromMapper(s).insertEnterpriseInfoFirstStep(enterprise);});
	}
	
	public Integer deleteMemberInfo(String email){
		return dataModificationTemplate(s -> {return fromMapper(s).deleteMemberInfo(email);});
	}

	public Integer deleteEnterpriseInfoFirstStep(String email) {
		return dataModificationTemplate(s -> {return fromMapper(s).deleteEnterpriseInfoFirstStep(email);});
	}

	public Member retrieveMemberInfo(String etpNum) {
		SqlSession session = MyBatisSqlSessionFactory.getSessionFactory().openSession();
		try{
			return  session.selectOne("model.mapper.MemberMapper.selectByPrimaryNumber",etpNum);
		}finally{
			session.close();
		}
	}
	
	public Integer updateWorkingDays(Member tempMember){
		return dataModificationTemplate(s -> {return fromMapper(s).updateWorkingDays(tempMember);});
	}

	public Integer updateEtpDetailsFirst(Member tempMember) {
		return dataModificationTemplate(s -> {return fromMapper(s).updateEtpDetailsFirst(tempMember);});
	}

	public int updateWorkingHours(Member tempMember) {
		return dataModificationTemplate(s -> {return fromMapper(s).updateWorkingHours(tempMember);});
	}

	public int insertWorkingDays(Member tempMember) {
		return dataModificationTemplate(s -> {return fromMapper(s).insertWorkingDays(tempMember);});
	}

	public int finalizeRegistration(Member tempMember) {
		return dataModificationTemplate(s -> {return fromMapper(s).finalizeRegistration(tempMember);});
	}
}
