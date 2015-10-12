package model.mapper;

import java.util.List;
import model.vo.SaleRecord;
import model.vo.SaleRecordExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SaleRecordMapper {
    int countByExample(SaleRecordExample example);

    int deleteByExample(SaleRecordExample example);

    int deleteByPrimaryKey(Short saleNum);

    int insert(SaleRecord record);

    int insertSelective(SaleRecord record);

    List<SaleRecord> selectByExampleWithRowbounds(SaleRecordExample example, RowBounds rowBounds);

    List<SaleRecord> selectByExample(SaleRecordExample example);

    SaleRecord selectByPrimaryKey(Short saleNum);

    int updateByExampleSelective(@Param("record") SaleRecord record, @Param("example") SaleRecordExample example);

    int updateByExample(@Param("record") SaleRecord record, @Param("example") SaleRecordExample example);

    int updateByPrimaryKeySelective(SaleRecord record);

    int updateByPrimaryKey(SaleRecord record);
}