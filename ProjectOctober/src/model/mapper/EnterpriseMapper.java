package model.mapper;

import java.util.List;

import model.vo.Component;
import model.vo.Coupon;
import model.vo.Enterprise;
import model.vo.EnterpriseExample;
import model.vo.PhotoLocation;
import model.vo.Reservation;
import model.vo.Review;
import model.vo.SaleRecord;
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
    
    Enterprise selectByEtpEmail(String etpEmail);
    
    Enterprise selectByEtpNumIncludeOthers(String etpNum);
    
    Enterprise selectByEtpEmailInclueOthers(String etpEmail);

    int updateByExampleSelective(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByExample(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);

    List<Service> selectSvcCategory(String etpNum, String category);
    List<Review> selectReviewList(String etpNum);
    List<PhotoLocation> selectPhotoList(String etpNum);

    Integer insertImage(PhotoLocation loc);
    Integer insertInfoImage(PhotoLocation loc);
    Integer insertLogoImage(PhotoLocation loc);
    
    List<SaleRecord> reservationHistory(String loginEmail);
    
    ///////////////// 컴포넌트
    
    int insertComponent(Component component);
    
    List<Component> receiveComponentList(String etpNum);
    
    int updateEtpStatus(Enterprise record);
    
    String showMap(String etpEmail);
    
    int choiceTemplateType(String etpNum, int etpTemplateType);

    //////////////// 사업자 승인 게시판

    Enterprise noRegisterEtp(String key);
    
    List<Enterprise> allNoRegisterEtpList();

	Integer insertRegCard(PhotoLocation loc);

    //////////////// 고객 자유 검색 리스트
    List<Enterprise> CustomerFreeSearchingList(String keyword);

    
    //////////////// 카테고리 검색 리스트
    List<Enterprise> categorySearch(String keyword);

	List<Coupon> retrieveCouponList(String etpNum);

	Coupon checkCoupon(Coupon coupon);

	String retrieveRegCard(String etpNum);

	int updateComponent(Component component);

	Reservation retrieveReservationFromOtherInfo(Reservation reservation);

	String retrieveInfoCard(String etpNum);
	
	String retrieveLogoCard(String etpNum);

	String selectInfoPht(String etpNum);

	String selectLogoPht(String etpNum);

	Integer insertSaleRecord(SaleRecord saleRecord);


}