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

    public Notification setNtfNum(Integer ntfNum) {
        this.ntfNum = ntfNum;
        return this;
    }

    public Integer getRsvNum() {
        return rsvNum;
    }

    public Notification setRsvNum(Integer rsvNum) {
        this.rsvNum = rsvNum;
        return this;
    }

    public String getCstEmail() {
        return cstEmail;
    }

    public Notification setCstEmail(String cstEmail) {
        this.cstEmail = cstEmail;
        return this;
    }

    public String getEtpNum() {
        return etpNum;
    }

    public Notification setEtpNum(String etpNum) {
        this.etpNum = etpNum;
        return this;
    }

    public String getEtpEmail() {
        return etpEmail;
    }

    public Notification setEtpEmail(String etpEmail) {
        this.etpEmail = etpEmail;
        return this;
    }

    public String getNtfMessage() {
        return ntfMessage;
    }

    public Notification setNtfMessage(String ntfMessage) {
        this.ntfMessage = ntfMessage;
        return this;
    }

    public LocalDateTime getNtfTime() {
        return ntfTime;
    }

    public Notification setNtfTime(LocalDateTime ntfTime) {
        this.ntfTime = ntfTime;
        return this;
    }

    public Integer getNtfRead() {
        return ntfRead;
    }

    public Notification setNtfRead(Integer ntfRead) {
        this.ntfRead = ntfRead;
        return this;
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