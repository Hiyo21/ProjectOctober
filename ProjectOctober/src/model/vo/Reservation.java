package model.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Reservation implements Serializable {
    private Integer rsvNum;
    private Integer svcNum;
    private Integer cpnNum;
    private String etpNum;
    private String etpEmail;
    private String cstEmail;
    private LocalDateTime rsvStartDate;
    private LocalDateTime rsvEndDate;
    private Integer rsvStatus;
    private char employeeGender;
    private String rsvTitle;
    private String start;
    private String end;
    private String bordercolor;

    private static final long serialVersionUID = 1L;

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

    public LocalDateTime getRsvStartDate() {
        return rsvStartDate;
    }

    public void setRsvStartDate(LocalDateTime rsvStartDate) {
        this.rsvStartDate = rsvStartDate;
    }

    public LocalDateTime getRsvEndDate() {
        return rsvEndDate;
    }

    public void setRsvEndDate(LocalDateTime rsvEndDate) {
        this.rsvEndDate = rsvEndDate;
    }

    public Integer getRsvStatus() {
        return rsvStatus;
    }

    public void setRsvStatus(Integer rsvStatus) {
        this.rsvStatus = rsvStatus;
    }

    public char getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(char employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getRsvTitle() {
        return rsvTitle;
    }

    public void setRsvTitle(String rsvTitle) {
        this.rsvTitle = rsvTitle;
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
        sb.append(", rsvStartDate=").append(rsvStartDate);
        sb.append(", rsvEndDate=").append(rsvEndDate);
        sb.append(", rsvStatus=").append(rsvStatus);
        sb.append(", employeeGender=").append(employeeGender);
        sb.append(", rsvTitle=").append(rsvTitle);
        sb.append("]");
        return sb.toString();
    }

	public String getStart() {
		return start;
	}

	public String getEnd() {
		return end;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getBordercolor() {
		return bordercolor;
	}

	public void setBordercolor(String bordercolor) {
		this.bordercolor = bordercolor;
	}
}