package model.mapper;

import java.util.List;
import model.vo.Unregistered;
import model.vo.UnregisteredExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UnregisteredMapper {
    int countByExample(UnregisteredExample example);

    int deleteByExample(UnregisteredExample example);

    int deleteByPrimaryKey(Short urgNum);

    int insert(Unregistered record);

    int insertSelective(Unregistered record);

    List<Unregistered> selectByExampleWithRowbounds(UnregisteredExample example, RowBounds rowBounds);

    List<Unregistered> selectByExample(UnregisteredExample example);

    Unregistered selectByPrimaryKey(Short urgNum);

    int updateByExampleSelective(@Param("record") Unregistered record, @Param("example") UnregisteredExample example);

    int updateByExample(@Param("record") Unregistered record, @Param("example") UnregisteredExample example);

    int updateByPrimaryKeySelective(Unregistered record);

    int updateByPrimaryKey(Unregistered record);
}