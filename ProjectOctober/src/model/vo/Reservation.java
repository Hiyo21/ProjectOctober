package model.vo;

import java.time.LocalDateTime;

public class Reservation {
	private Integer id;
	private String title;
	private boolean allDay;
	private LocalDateTime start;
	private LocalDateTime end;
	private String url;
	private String color;
	private String bordercolor;
	private String textcolor;
	
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

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public boolean isAllDay() {
		return allDay;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public String getUrl() {
		return url;
	}

	public String getColor() {
		return color;
	}

	public String getBordercolor() {
		return bordercolor;
	}

	public String getTextcolor() {
		return textcolor;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBordercolor(String bordercolor) {
		this.bordercolor = bordercolor;
	}

	public void setTextcolor(String textcolor) {
		this.textcolor = textcolor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reservation [id=").append(id).append(", title=").append(title).append(", allDay=")
				.append(allDay).append(", start=").append(start).append(", end=").append(end).append(", url=")
				.append(url).append(", color=").append(color).append(", bordercolor=").append(bordercolor)
				.append(", textcolor=").append(textcolor).append(", rsvNum=").append(rsvNum).append(", svcNum=")
				.append(svcNum).append(", cpnNum=").append(cpnNum).append(", etpNum=").append(etpNum)
				.append(", etpEmail=").append(etpEmail).append(", cstEmail=").append(cstEmail).append(", startDate=")
				.append(startDate).append(", endDate=").append(endDate).append(", status=").append(status)
				.append(", employeeGender=").append(employeeGender).append("]");
		return builder.toString();
	}
}