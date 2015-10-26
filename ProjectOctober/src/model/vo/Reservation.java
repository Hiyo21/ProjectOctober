 package model.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Reservation implements Serializable {
    private Customer customer;
    private Enterprise enterprise;
    private Service service;
    private Coupon coupon;
	
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
    private String rsvDesc;
    private Integer rsvCost;
    private String start;
    private String end;
    private String duration;
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

	public Customer getCustomer() {
		return customer;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public Service getService() {
		return service;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getRsvDesc() {
		return rsvDesc;
	}

	public void setRsvDesc(String rsvDesc) {
		this.rsvDesc = rsvDesc;
	}

	public Integer getRsvCost() {
		return rsvCost;
	}

	public void setRsvCost(Integer rsvCost) {
		this.rsvCost = rsvCost;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reservation [customer=").append(customer).append(", enterprise=").append(enterprise)
				.append(", service=").append(service).append(", coupon=").append(coupon).append(", rsvNum=")
				.append(rsvNum).append(", svcNum=").append(svcNum).append(", cpnNum=").append(cpnNum)
				.append(", etpNum=").append(etpNum).append(", etpEmail=").append(etpEmail).append(", cstEmail=")
				.append(cstEmail).append(", rsvStartDate=").append(rsvStartDate).append(", rsvEndDate=")
				.append(rsvEndDate).append(", rsvStatus=").append(rsvStatus).append(", employeeGender=")
				.append(employeeGender).append(", rsvTitle=").append(rsvTitle).append(", rsvDesc=").append(rsvDesc)
				.append(", rsvCost=").append(rsvCost).append(", start=").append(start).append(", end=").append(end)
				.append(", duration=").append(duration).append(", bordercolor=").append(bordercolor).append("]");
		return builder.toString();
	}
	
	
}