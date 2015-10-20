package model.mapper;

import java.util.List;

import model.vo.Component;
import model.vo.Enterprise;
import model.vo.EnterpriseExample;
import model.vo.PhotoLocation;
import model.vo.Review;
import model.vo.Service;

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
    
    List<Enterprise> selectEtpList();

    Enterprise selectByEtpNum(String key);

    int updateByExampleSelective(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByExample(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
    
    
    List<Review> selectReviewList(String etpNum);
    List<PhotoLocation> selectPhotoList(String etpNum);
    
    ///////////////// 컴포넌트
    
    int insertComponent(Component component);
    
    List<Component> receiveComponentList(String etpNum);
    
    int updateEtpStatus(Enterprise record);
    
    String showMap(String etpEmail);

    //////////////// 사업자 승인 게시판

    Enterprise noRegisterEtp(String key);
    
    List<Enterprise> allNoRegisterEtpList();

	Integer insertRegCard(PhotoLocation loc);

    //////////////// 고객 자유 검색 리스트
    List<Enterprise> CustomerFreeSearchingList(String keyword);


}