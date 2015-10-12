package model.vo;

import java.time.LocalDateTime;

public class HolidayWaitlist {
    private Integer holWtlNum;

    private String etpNum;

    private String etpEmail;

    private LocalDateTime holWtlDate;

    public Integer getHolWtlNum() {
        return holWtlNum;
    }

    public void setHolWtlNum(Integer holWtlNum) {
        this.holWtlNum = holWtlNum;
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

    public LocalDateTime getHolWtlDate() {
        return holWtlDate;
    }

    public void setHolWtlDate(LocalDateTime holWtlDate) {
        this.holWtlDate = holWtlDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", holWtlNum=").append(holWtlNum);
        sb.append(", etpNum=").append(etpNum);
        sb.append(", etpEmail=").append(etpEmail);
        sb.append(", holWtlDate=").append(holWtlDate);
        sb.append("]");
        return sb.toString();
    }
}