package model.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SaleRecord implements Serializable {
    private Integer saleNum;

    private Integer pmtNum;

    private String etpNum;

    private String etpEmail;

    private LocalDateTime saleTime;

    private Integer saleAmount;
    
    private PaymentRecord paymentRecord;
    
    private Service service;
 
    private Reservation reservation;

    private static final long serialVersionUID = 1L;

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getPmtNum() {
        return pmtNum;
    }

    public void setPmtNum(Integer pmtNum) {
        this.pmtNum = pmtNum;
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

    public LocalDateTime getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(LocalDateTime saleTime) {
        this.saleTime = saleTime;
    }

    public Integer getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(Integer saleAmount) {
        this.saleAmount = saleAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", saleNum=").append(saleNum);
        sb.append(", pmtNum=").append(pmtNum);
        sb.append(", etpNum=").append(etpNum);
        sb.append(", etpEmail=").append(etpEmail);
        sb.append(", saleTime=").append(saleTime);
        sb.append(", saleAmount=").append(saleAmount);
        sb.append("]");
        return sb.toString();
    }

	public Service getService() {
		return service;
	}

	public PaymentRecord getPaymentRecord() {
		return paymentRecord;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public void setPaymentRecord(PaymentRecord paymentRecord) {
		this.paymentRecord = paymentRecord;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
}