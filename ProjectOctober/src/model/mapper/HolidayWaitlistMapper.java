package model.mapper;

import java.util.List;
import model.vo.HolidayWaitlist;
import model.vo.HolidayWaitlistExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HolidayWaitlistMapper {
    int countByExample(HolidayWaitlistExample example);

    int deleteByExample(HolidayWaitlistExample example);

    int deleteByPrimaryKey(Short holWtlNum);

    int insert(HolidayWaitlist record);

    int insertSelective(HolidayWaitlist record);

    List<HolidayWaitlist> selectByExampleWithRowbounds(HolidayWaitlistExample example, RowBounds rowBounds);

    List<HolidayWaitlist> selectByExample(HolidayWaitlistExample example);

    HolidayWaitlist selectByPrimaryKey(Short holWtlNum);

    int updateByExampleSelective(@Param("record") HolidayWaitlist record, @Param("example") HolidayWaitlistExample example);

    int updateByExample(@Param("record") HolidayWaitlist record, @Param("example") HolidayWaitlistExample example);

    int updateByPrimaryKeySelective(HolidayWaitlist record);

    int updateByPrimaryKey(HolidayWaitlist record);
}