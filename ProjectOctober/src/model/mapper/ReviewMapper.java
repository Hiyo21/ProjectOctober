package model.mapper;

import java.util.List;
import model.vo.Review;
import model.vo.ReviewExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ReviewMapper {
    int countByExample(ReviewExample example);

    int deleteByExample(ReviewExample example);

    int deleteByPrimaryKey(Short rvwNum);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExampleWithRowbounds(ReviewExample example, RowBounds rowBounds);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(Short rvwNum);

    int updateByExampleSelective(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByExample(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
}