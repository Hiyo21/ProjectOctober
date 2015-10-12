package model.mapper;

import java.util.List;
import model.vo.MemberCode;
import model.vo.MemberCodeExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberCodeMapper {
    int countByExample(MemberCodeExample example);

    int deleteByExample(MemberCodeExample example);

    int deleteByPrimaryKey(Integer memberCode);

    int insert(MemberCode record);

    int insertSelective(MemberCode record);

    List<MemberCode> selectByExampleWithRowbounds(MemberCodeExample example, RowBounds rowBounds);

    List<MemberCode> selectByExample(MemberCodeExample example);

    MemberCode selectByPrimaryKey(Integer memberCode);

    int updateByExampleSelective(@Param("record") MemberCode record, @Param("example") MemberCodeExample example);

    int updateByExample(@Param("record") MemberCode record, @Param("example") MemberCodeExample example);

    int updateByPrimaryKeySelective(MemberCode record);

    int updateByPrimaryKey(MemberCode record);
}