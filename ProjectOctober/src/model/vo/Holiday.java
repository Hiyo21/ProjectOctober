package model.vo;

import java.time.LocalDateTime;

public class Holiday {
    private Integer holNum;

    private String etpNum;

    private String etpEmail;

    private LocalDateTime holDate;

    public Integer getHolNum() {
        return holNum;
    }

    public void setHolNum(Integer holNum) {
        this.holNum = holNum;
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

    public LocalDateTime getHolDate() {
        return holDate;
    }

    public void setHolDate(LocalDateTime holDate) {
        this.holDate = holDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", holNum=").append(holNum);
        sb.append(", etpNum=").append(etpNum);
        sb.append(", etpEmail=").append(etpEmail);
        sb.append(", holDate=").append(holDate);
        sb.append("]");
        return sb.toString();
    }
}