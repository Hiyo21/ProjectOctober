package model.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Notification implements Serializable {
    private Integer ntfNum;

    private Integer rsvNum;

    private String cstEmail;

    private String etpNum;

    private String etpEmail;

    private String ntfMessage;

    private LocalDateTime ntfTime;

    private Integer ntfRead;

    private static final long serialVersionUID = 1L;

    public Integer getNtfNum() {
        return ntfNum;
    }

    public void setNtfNum(Integer ntfNum) {
        this.ntfNum = ntfNum;
    }

    public Integer getRsvNum() {
        return rsvNum;
    }

    public void setRsvNum(Integer rsvNum) {
        this.rsvNum = rsvNum;
    }

    public String getCstEmail() {
        return cstEmail;
    }

    public void setCstEmail(String cstEmail) {
        this.cstEmail = cstEmail;
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

    public String getNtfMessage() {
        return ntfMessage;
    }

    public void setNtfMessage(String ntfMessage) {
        this.ntfMessage = ntfMessage;
    }

    public LocalDateTime getNtfTime() {
        return ntfTime;
    }

    public void setNtfTime(LocalDateTime ntfTime) {
        this.ntfTime = ntfTime;
    }

    public Integer getNtfRead() {
        return ntfRead;
    }

    public void setNtfRead(Integer ntfRead) {
        this.ntfRead = ntfRead;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ntfNum=").append(ntfNum);
        sb.append(", rsvNum=").append(rsvNum);
        sb.append(", cstEmail=").append(cstEmail);
        sb.append(", etpNum=").append(etpNum);
        sb.append(", etpEmail=").append(etpEmail);
        sb.append(", ntfMessage=").append(ntfMessage);
        sb.append(", ntfTime=").append(ntfTime);
        sb.append(", ntfRead=").append(ntfRead);
        sb.append("]");
        return sb.toString();
    }
}