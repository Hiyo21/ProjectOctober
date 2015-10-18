package model.mapper;

import java.util.List;
import java.util.Map;

import model.vo.Member;
import model.vo.MemberExample;
import model.vo.Zipcode;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberMapper {
    int countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(String memEmail);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExampleWithRowbounds(MemberExample example, RowBounds rowBounds);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(String memEmail);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
    
    Member loginResult(Map<String, String> loginInfo);

	String retrieveEmail(String email);

	String retrieveEtpNum(String etpNumInput);
	
	List<Zipcode> searchZipcode(String searchText);
}