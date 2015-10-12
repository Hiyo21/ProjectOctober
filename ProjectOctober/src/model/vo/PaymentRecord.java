package model.vo;

import java.time.LocalDateTime;

public class PaymentRecord {
    private Integer pmtNum;

    private Integer rsvNum;

    private LocalDateTime time;

    private Integer amount;

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
        sb.append(", pmtNum=").append(pmtNum);
        sb.append(", rsvNum=").append(rsvNum);
        sb.append(", time=").append(time);
        sb.append(", amount=").append(amount);
        sb.append("]");
        return sb.toString();
    }
}