package model.mapper;

import java.util.List;
import model.vo.Holiday;
import model.vo.HolidayExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HolidayMapper {
    int countByExample(HolidayExample example);

    int deleteByExample(HolidayExample example);

    int deleteByPrimaryKey(Integer holNum);

    int insert(Holiday record);

    int insertSelective(Holiday record);

    List<Holiday> selectByExampleWithRowbounds(HolidayExample example, RowBounds rowBounds);

    List<Holiday> selectByExample(HolidayExample example);

    Holiday selectByPrimaryKey(Integer holNum);

    int updateByExampleSelective(@Param("record") Holiday record, @Param("example") HolidayExample example);

    int updateByExample(@Param("record") Holiday record, @Param("example") HolidayExample example);

    int updateByPrimaryKeySelective(Holiday record);

    int updateByPrimaryKey(Holiday record);
}