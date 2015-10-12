package model.mapper;

import java.util.List;
import model.vo.Component;
import model.vo.ComponentExample;
import model.vo.ComponentKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ComponentMapper {
    int countByExample(ComponentExample example);

    int deleteByExample(ComponentExample example);

    int deleteByPrimaryKey(ComponentKey key);

    int insert(Component record);

    int insertSelective(Component record);

    List<Component> selectByExampleWithRowbounds(ComponentExample example, RowBounds rowBounds);

    List<Component> selectByExample(ComponentExample example);

    Component selectByPrimaryKey(ComponentKey key);

    int updateByExampleSelective(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByExample(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByPrimaryKeySelective(Component record);

    int updateByPrimaryKey(Component record);
}