package model.vo;

import java.time.LocalDateTime;

public class Reservation {
    private Short rsvNum;

    private Short svcNum;

    private Short cpnNum;

    private String etpNum;

    private String etpEmail;

    private String cstEmail;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Short status;

    private char employeeGender;

    public Short getRsvNum() {
        return rsvNum;
    }

    public void setRsvNum(Short rsvNum) {
        this.rsvNum = rsvNum;
    }

    public Short getSvcNum() {
        return svcNum;
    }

    public void setSvcNum(Short svcNum) {
        this.svcNum = svcNum;
    }

    public Short getCpnNum() {
        return cpnNum;
    }

    public void setCpnNum(Short cpnNum) {
        this.cpnNum = cpnNum;
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

    public String getCstEmail() {
        return cstEmail;
    }

    public void setCstEmail(String cstEmail) {
        this.cstEmail = cstEmail;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public char getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(char employeeGender) {
        this.employeeGender = employeeGender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rsvNum=").append(rsvNum);
        sb.append(", svcNum=").append(svcNum);
        sb.append(", cpnNum=").append(cpnNum);
        sb.append(", etpNum=").append(etpNum);
        sb.append(", etpEmail=").append(etpEmail);
        sb.append(", cstEmail=").append(cstEmail);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", status=").append(status);
        sb.append(", employeeGender=").append(employeeGender);
        sb.append("]");
        return sb.toString();
    }
}