package model.mapper;

import java.util.List;
import model.vo.EnterpriseWaitlist;
import model.vo.EnterpriseWaitlistExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EnterpriseWaitlistMapper {
    int countByExample(EnterpriseWaitlistExample example);

    int deleteByExample(EnterpriseWaitlistExample example);

    int deleteByPrimaryKey(EnterpriseWaitlist key);

    int insert(EnterpriseWaitlist record);

    int insertSelective(EnterpriseWaitlist record);

    List<EnterpriseWaitlist> selectByExampleWithRowbounds(EnterpriseWaitlistExample example, RowBounds rowBounds);

    List<EnterpriseWaitlist> selectByExample(EnterpriseWaitlistExample example);

    EnterpriseWaitlist selectByPrimaryKey(EnterpriseWaitlist key);

    int updateByExampleSelective(@Param("record") EnterpriseWaitlist record, @Param("example") EnterpriseWaitlistExample example);

    int updateByExample(@Param("record") EnterpriseWaitlist record, @Param("example") EnterpriseWaitlistExample example);

    int updateByPrimaryKeySelective(EnterpriseWaitlist record);

    int updateByPrimaryKey(EnterpriseWaitlist record);
}