package model.mapper;

import java.util.List;
import model.vo.PaymentRecord;
import model.vo.PaymentRecordExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PaymentRecordMapper {
    int countByExample(PaymentRecordExample example);

    int deleteByExample(PaymentRecordExample example);

    int deleteByPrimaryKey(Integer pmtNum);

    int insert(PaymentRecord record);

    int insertSelective(PaymentRecord record);

    List<PaymentRecord> selectByExampleWithRowbounds(PaymentRecordExample example, RowBounds rowBounds);

    List<PaymentRecord> selectByExample(PaymentRecordExample example);

    PaymentRecord selectByPrimaryKey(Integer pmtNum);

    int updateByExampleSelective(@Param("record") PaymentRecord record, @Param("example") PaymentRecordExample example);

    int updateByExample(@Param("record") PaymentRecord record, @Param("example") PaymentRecordExample example);

    int updateByPrimaryKeySelective(PaymentRecord record);

    int updateByPrimaryKey(PaymentRecord record);
}