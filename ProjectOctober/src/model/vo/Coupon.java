package model.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Coupon implements Serializable {
    private Integer cpnNum;

    private String etpNum;

    private String etpEmail;

    private String cpnTitle;

    private String cpnCode;

    private Integer cpnRate;

    private LocalDateTime cpnStartDate;

    private LocalDateTime cpnEndDate;
    
    private boolean canUseCoupon;
    

    private static final long serialVersionUID = 1L;

    public Integer getCpnNum() {
        return cpnNum;
    }

    public void setCpnNum(Integer cpnNum) {
        this.cpnNum = cpnNum;
    }

    public String getEtpNum() {
        return etpNum;
    }

    public void setEtpNum(String etpNum) {
        this.etpNum = etpNum;
    }

    public String getEtpEmail() {
        return etpEmail;
    }

    public void setEtpEmail(String etpEmail) {
        this.etpEmail = etpEmail;
    }

    public String getCpnTitle() {
        return cpnTitle;
    }

    public void setCpnTitle(String cpnTitle) {
        this.cpnTitle = cpnTitle;
    }

    public String getCpnCode() {
        return cpnCode;
    }

    public void setCpnCode(String cpnCode) {
        this.cpnCode = cpnCode;
    }

    public Integer getCpnRate() {
        return cpnRate;
    }

    public void setCpnRate(Integer cpnRate) {
        this.cpnRate = cpnRate;
    }

    public LocalDateTime getCpnStartDate() {
        return cpnStartDate;
    }

    public void setCpnStartDate(LocalDateTime cpnStartDate) {
        this.cpnStartDate = cpnStartDate;
    }

    public LocalDateTime getCpnEndDate() {
        return cpnEndDate;
    }

    public void setCpnEndDate(LocalDateTime cpnEndDate) {
        this.cpnEndDate = cpnEndDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cpnNum=").append(cpnNum);
        sb.append(", etpNum=").append(etpNum);
        sb.append(", etpEmail=").append(etpEmail);
        sb.append(", cpnTitle=").append(cpnTitle);
        sb.append(", cpnCode=").append(cpnCode);
        sb.append(", cpnRate=").append(cpnRate);
        sb.append(", cpnStartDate=").append(cpnStartDate);
        sb.append(", cpnEndDate=").append(cpnEndDate);
        sb.append("]");
        return sb.toString();
    }

	public boolean isCanUseCoupon() {
		return canUseCoupon;
	}

	public void setCanUseCoupon(boolean canUseCoupon) {
		this.canUseCoupon = canUseCoupon;
	}
}