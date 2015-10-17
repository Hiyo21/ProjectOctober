package model.mapper;

import java.util.List;
import model.vo.Waitlist;
import model.vo.WaitlistExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WaitlistMapper {
    int countByExample(WaitlistExample example);

    int deleteByExample(WaitlistExample example);

    int deleteByPrimaryKey(Short wtlNum);

    int insert(Waitlist record);

    int insertSelective(Waitlist record);

    List<Waitlist> selectByExampleWithRowbounds(WaitlistExample example, RowBounds rowBounds);

    List<Waitlist> selectByExample(WaitlistExample example);

    Waitlist selectByPrimaryKey(Short wtlNum);

    int updateByExampleSelective(@Param("record") Waitlist record, @Param("example") WaitlistExample example);

    int updateByExample(@Param("record") Waitlist record, @Param("example") WaitlistExample example);

    int updateByPrimaryKeySelective(Waitlist record);

    int updateByPrimaryKey(Waitlist record);
}