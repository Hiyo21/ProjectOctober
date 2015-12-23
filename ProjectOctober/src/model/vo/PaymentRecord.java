package model.vo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class PaymentRecord implements Serializable {
    private Integer pmtNum;

    private Integer rsvNum;
    private String svcTitle;

    private LocalDateTime pmtTime;

    private Integer pmtAmount;
    
    private Service service;
    private List<Service> serviceList;
    private Reservation reservation;
    private List<Reservation> reservationList;

    private static final long serialVersionUID = 1L;

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

    public LocalDateTime getPmtTime() {
        return pmtTime;
    }

    public void setPmtTime(LocalDateTime pmtTime) {
        this.pmtTime = pmtTime;
    }

    public Integer getPmtAmount() {
        return pmtAmount;
    }

    public void setPmtAmount(Integer pmtAmount) {
        this.pmtAmount = pmtAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pmtNum=").append(pmtNum);
        sb.append(", rsvNum=").append(rsvNum);
        sb.append(", pmtTime=").append(pmtTime);
        sb.append(", pmtAmount=").append(pmtAmount);
        sb.append("]");
        return sb.toString();
    }

	public Service getService() {
		return service;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public List<Service> getServiceList() {
		return serviceList;
	}

	public void setServiceList(List<Service> serviceList) {
		this.serviceList = serviceList;
	}

	public List<Reservation> getReservationList() {
		return reservationList;
	}

	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}

	public String getSvcTitle() {
		return svcTitle;
	}

	public void setSvcTitle(String svcTitle) {
		this.svcTitle = svcTitle;
	}
	
	
}