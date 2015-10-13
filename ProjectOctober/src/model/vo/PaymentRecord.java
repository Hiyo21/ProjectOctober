package model.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PaymentRecord implements Serializable {
    private Integer pmtNum;

    private Integer rsvNum;

    private LocalDateTime pmtTime;

    private Integer pmtAmount;

    private static final long serialVersionUID = 1L;

    public Integer getPmtNum() {
        return pmtNum;
    }

    public void setPmtNum(Integer pmtNum) {
        this.pmtNum = pmtNum;
    }

    public Integer getRsvNum() {
        return rsvNum;
    }

    public void setRsvNum(Integer rsvNum) {
        this.rsvNum = rsvNum;
    }

    public LocalDateTime getPmtTime() {
        return pmtTime;
    }

    public void setPmtTime(LocalDateTime pmtTime) {
        this.pmtTime = pmtTime;
    }

    public Integer getPmtAmount() {
        return pmtAmount;
    }

    public void setPmtAmount(Integer pmtAmount) {
        this.pmtAmount = pmtAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pmtNum=").append(pmtNum);
        sb.append(", rsvNum=").append(rsvNum);
        sb.append(", pmtTime=").append(pmtTime);
        sb.append(", pmtAmount=").append(pmtAmount);
        sb.append("]");
        return sb.toString();
    }
}