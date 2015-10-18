package model.mapper;

import java.util.List;

import model.vo.Component;
import model.vo.Enterprise;
import model.vo.EnterpriseExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EnterpriseMapper {
    int countByExample(EnterpriseExample example);

    int deleteByExample(EnterpriseExample example);

    int deleteByPrimaryKey(String key);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    List<Enterprise> selectByExampleWithRowbounds(EnterpriseExample example, RowBounds rowBounds);

    List<Enterprise> selectByExample(EnterpriseExample example);

    Enterprise selectByPrimaryKey(String key);

    int updateByExampleSelective(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByExample(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
    
    ///////////////// 컴포넌트
    
    int insertComponent(Component component);
    
    List<Component> receiveComponentList(String etpNum);
    
    //////////////// 사업자 승인 게시판
    
    int updateEtpStatus(Enterprise record);
    
    Enterprise noRegisterEtp(String key);
    
    List<Enterprise> allNoRegisterEtpList();
}