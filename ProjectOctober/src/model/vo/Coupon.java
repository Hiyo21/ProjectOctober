package model.vo;

import java.time.LocalDateTime;

public class Coupon {
    private Integer cpnNum;

    private String etpNum;

    private String etpEmail;

    private String title;

    private String code;

    private Integer rate;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
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
        sb.append(", title=").append(title);
        sb.append(", code=").append(code);
        sb.append(", rate=").append(rate);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append("]");
        return sb.toString();
    }
}