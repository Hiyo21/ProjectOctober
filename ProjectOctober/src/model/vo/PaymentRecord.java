package model.vo;

import java.time.LocalDateTime;

public class PaymentRecord {
    private Short pmtNum;

    private Short rsvNum;

    private LocalDateTime time;

    private Short amount;

    public Short getPmtNum() {
        return pmtNum;
    }

    public void setPmtNum(Short pmtNum) {
        this.pmtNum = pmtNum;
    }

    public Short getRsvNum() {
        return rsvNum;
    }

    public void setRsvNum(Short rsvNum) {
        this.rsvNum = rsvNum;
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
        sb.append(", pmtNum=").append(pmtNum);
        sb.append(", rsvNum=").append(rsvNum);
        sb.append(", time=").append(time);
        sb.append(", amount=").append(amount);
        sb.append("]");
        return sb.toString();
    }
}