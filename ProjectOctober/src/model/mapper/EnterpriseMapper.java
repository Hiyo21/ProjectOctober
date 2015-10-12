package model.mapper;

import java.util.List;
import model.vo.Enterprise;
import model.vo.EnterpriseExample;
import model.vo.EnterpriseKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EnterpriseMapper {
    int countByExample(EnterpriseExample example);

    int deleteByExample(EnterpriseExample example);

    int deleteByPrimaryKey(EnterpriseKey key);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    List<Enterprise> selectByExampleWithRowbounds(EnterpriseExample example, RowBounds rowBounds);

    List<Enterprise> selectByExample(EnterpriseExample example);

    Enterprise selectByPrimaryKey(EnterpriseKey key);

    int updateByExampleSelective(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByExample(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}