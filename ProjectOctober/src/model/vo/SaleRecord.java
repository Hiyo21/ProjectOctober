package model.vo;

import java.time.LocalDateTime;

public class SaleRecord {
    private Integer saleNum;

    private Integer pmtNum;

    private String etpNum;

    private String etpEmail;

    private LocalDateTime time;

    private Integer amount;

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getPmtNum() {
        return pmtNum;
    }

    public void setPmtNum(Integer pmtNum) {
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
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