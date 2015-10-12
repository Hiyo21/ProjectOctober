package model.vo;

import java.time.LocalDateTime;

public class Reservation {
    private Integer rsvNum;

    private Integer svcNum;

    private Integer cpnNum;

    private String etpNum;

    private String etpEmail;

    private String cstEmail;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Integer status;

    private char employeeGender;

    public Integer getRsvNum() {
        return rsvNum;
    }

    public void setRsvNum(Integer rsvNum) {
        this.rsvNum = rsvNum;
    }

    public Integer getSvcNum() {
        return svcNum;
    }

    public void setSvcNum(Integer svcNum) {
        this.svcNum = svcNum;
    }

    public Integer getCpnNum() {
        return cpnNum;
    }

    public void setCpnNum(Integer cpnNum) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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