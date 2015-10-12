package model.mapper;

import java.util.List;
import model.vo.Reservation;
import model.vo.ReservationExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ReservationMapper {
    int countByExample(ReservationExample example);

    int deleteByExample(ReservationExample example);

    int deleteByPrimaryKey(Integer rsvNum);

    int insert(Reservation record);

    int insertSelective(Reservation record);

    List<Reservation> selectByExampleWithRowbounds(ReservationExample example, RowBounds rowBounds);

    List<Reservation> selectByExample(ReservationExample example);

    Reservation selectByPrimaryKey(Integer rsvNum);

    int updateByExampleSelective(@Param("record") Reservation record, @Param("example") ReservationExample example);

    int updateByExample(@Param("record") Reservation record, @Param("example") ReservationExample example);

    int updateByPrimaryKeySelective(Reservation record);

    int updateByPrimaryKey(Reservation record);
}