package model.mapper;

import java.util.List;
import model.vo.PhotoLocation;
import model.vo.PhotoLocationExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PhotoLocationMapper {
    int countByExample(PhotoLocationExample example);

    int deleteByExample(PhotoLocationExample example);

    int deleteByPrimaryKey(Integer photoNum);

    int insert(PhotoLocation record);

    int insertSelective(PhotoLocation record);

    List<PhotoLocation> selectByExampleWithRowbounds(PhotoLocationExample example, RowBounds rowBounds);

    List<PhotoLocation> selectByExample(PhotoLocationExample example);

    PhotoLocation selectByPrimaryKey(Integer photoNum);

    int updateByExampleSelective(@Param("record") PhotoLocation record, @Param("example") PhotoLocationExample example);

    int updateByExample(@Param("record") PhotoLocation record, @Param("example") PhotoLocationExample example);

    int updateByPrimaryKeySelective(PhotoLocation record);

    int updateByPrimaryKey(PhotoLocation record);
}