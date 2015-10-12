package model.mapper;

import java.util.List;
import model.vo.Coupon;
import model.vo.CouponExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CouponMapper {
    int countByExample(CouponExample example);

    int deleteByExample(CouponExample example);

    int deleteByPrimaryKey(Short cpnNum);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    List<Coupon> selectByExampleWithRowbounds(CouponExample example, RowBounds rowBounds);

    List<Coupon> selectByExample(CouponExample example);

    Coupon selectByPrimaryKey(Short cpnNum);

    int updateByExampleSelective(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
}