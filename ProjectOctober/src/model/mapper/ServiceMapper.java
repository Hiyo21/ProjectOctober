package model.mapper;

import java.util.List;
import model.vo.Service;
import model.vo.ServiceExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ServiceMapper {
    int countByExample(ServiceExample example);

    int deleteByExample(ServiceExample example);

    int deleteByPrimaryKey(int svcNum);

    int insert(Service record);

    int insertSelective(Service record);

    List<Service> selectByExampleWithRowbounds(ServiceExample example, RowBounds rowBounds);

    List<Service> selectByExample(ServiceExample example);

    Service selectByPrimaryKey(Short svcNum);

    int updateByExampleSelective(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByExample(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
    
    List<Service> retrieveServices(String etpNum);

	int deleteByPrimaryKey(String svcNum);
}