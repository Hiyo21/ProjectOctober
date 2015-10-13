package model.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Waitlist implements Serializable {
    private Integer wtlNum;

    private String wtlEtpNum;

    private Integer wtlWaiting;

    private LocalDateTime wtlApplyTime;

    private String wtlRegCard;

    private static final long serialVersionUID = 1L;

    public Integer getWtlNum() {
        return wtlNum;
    }

    public void setWtlNum(Integer wtlNum) {
        this.wtlNum = wtlNum;
    }

    public String getWtlEtpNum() {
        return wtlEtpNum;
    }

    public void setWtlEtpNum(String wtlEtpNum) {
        this.wtlEtpNum = wtlEtpNum;
    }

    public Integer getWtlWaiting() {
        return wtlWaiting;
    }

    public void setWtlWaiting(Integer wtlWaiting) {
        this.wtlWaiting = wtlWaiting;
    }

    public LocalDateTime getWtlApplyTime() {
        return wtlApplyTime;
    }

    public void setWtlApplyTime(LocalDateTime wtlApplyTime) {
        this.wtlApplyTime = wtlApplyTime;
    }

    public String getWtlRegCard() {
        return wtlRegCard;
    }

    public void setWtlRegCard(String wtlRegCard) {
        this.wtlRegCard = wtlRegCard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wtlNum=").append(wtlNum);
        sb.append(", wtlEtpNum=").append(wtlEtpNum);
        sb.append(", wtlWaiting=").append(wtlWaiting);
        sb.append(", wtlApplyTime=").append(wtlApplyTime);
        sb.append(", wtlRegCard=").append(wtlRegCard);
        sb.append("]");
        return sb.toString();
    }
}