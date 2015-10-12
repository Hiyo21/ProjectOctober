package model.vo;

import java.time.LocalDateTime;

public class SaleRecord {
    private Short saleNum;

    private Short pmtNum;

    private String etpNum;

    private String etpEmail;

    private LocalDateTime time;

    private Short amount;

    public Short getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Short saleNum) {
        this.saleNum = saleNum;
    }

    public Short getPmtNum() {
        return pmtNum;
    }

    public void setPmtNum(Short pmtNum) {
        this.pmtNum = pmtNum;
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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Short getAmount() {
        return amount;
    }

    public void setAmount(Short amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saleNum=").append(saleNum);
        sb.append(", pmtNum=").append(pmtNum);
        sb.append(", etpNum=").append(etpNum);
        sb.append(", etpEmail=").append(etpEmail);
        sb.append(", time=").append(time);
        sb.append(", amount=").append(amount);
        sb.append("]");
        return sb.toString();
    }
}