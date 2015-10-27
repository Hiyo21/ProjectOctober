package model.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Review implements Serializable {
    private Integer rvwNum;

    private String cstEmail;

    private String etpNum;

    private String etpEmail;

    private LocalDateTime rvwInputDate;

    private String cstIpAddress;

    private String rvwContent;

    private String cstJob;

    private Integer rvwHygiene;

    private Integer rvwComfort;

    private Integer rvwTechnique;

    private Integer rvwPrice;

    private Integer rvwService;
    
    private Integer rvwAve;

    private static final long serialVersionUID = 1L;

    public Integer getRvwNum() {
        return rvwNum;
    }

    public void setRvwNum(Integer rvwNum) {
        this.rvwNum = rvwNum;
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

    public LocalDateTime getRvwInputDate() {
        return rvwInputDate;
    }

    public void setRvwInputDate(LocalDateTime rvwInputDate) {
        this.rvwInputDate = rvwInputDate;
    }

    public String getCstIpAddress() {
        return cstIpAddress;
    }

    public void setCstIpAddress(String cstIpAddress) {
        this.cstIpAddress = cstIpAddress;
    }

    public String getRvwContent() {
        return rvwContent;
    }

    public void setRvwContent(String rvwContent) {
        this.rvwContent = rvwContent;
    }

    public String getCstJob() {
        return cstJob;
    }

    public void setCstJob(String cstJob) {
        this.cstJob = cstJob;
    }

    public Integer getRvwHygiene() {
        return rvwHygiene;
    }

    public void setRvwHygiene(Integer rvwHygiene) {
        this.rvwHygiene = rvwHygiene;
    }

    public Integer getRvwComfort() {
        return rvwComfort;
    }

    public void setRvwComfort(Integer rvwComfort) {
        this.rvwComfort = rvwComfort;
    }

    public Integer getRvwTechnique() {
        return rvwTechnique;
    }

    public void setRvwTechnique(Integer rvwTechnique) {
        this.rvwTechnique = rvwTechnique;
    }

    public Integer getRvwPrice() {
        return rvwPrice;
    }

    public void setRvwPrice(Integer rvwPrice) {
        this.rvwPrice = rvwPrice;
    }

    public Integer getRvwService() {
        return rvwService;
    }

    public void setRvwService(Integer rvwService) {
        this.rvwService = rvwService;
    }
    
    

    public Integer getRvwAve() {
		return rvwAve;
	}

	public void setRvwAve(Integer rvwAve) {
		this.rvwAve = rvwAve;
	}

	@Override
	public String toString() {
		return "Review [rvwNum=" + rvwNum + ", cstEmail=" + cstEmail + ", etpNum=" + etpNum + ", etpEmail=" + etpEmail
				+ ", rvwInputDate=" + rvwInputDate + ", cstIpAddress=" + cstIpAddress + ", rvwContent=" + rvwContent
				+ ", cstJob=" + cstJob + ", rvwHygiene=" + rvwHygiene + ", rvwComfort=" + rvwComfort + ", rvwTechnique="
				+ rvwTechnique + ", rvwPrice=" + rvwPrice + ", rvwService=" + rvwService + ", rvwAve=" + rvwAve + "]";
	}

	
}