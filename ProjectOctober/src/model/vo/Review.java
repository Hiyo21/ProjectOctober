package model.vo;

import java.time.LocalDateTime;

public class Review {
    private Integer rvwNum;

    private String cstEmail;

    private String etpNum;

    private String etpEmail;

    private LocalDateTime inputDate;

    private String cstIpAddress;

    private String content;

    private String cstJob;

    private Integer hygiene;

    private Integer comfort;

    private Integer technique;

    private Integer price;

    private Integer service;

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

    public LocalDateTime getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDateTime inputDate) {
        this.inputDate = inputDate;
    }

    public String getCstIpAddress() {
        return cstIpAddress;
    }

    public void setCstIpAddress(String cstIpAddress) {
        this.cstIpAddress = cstIpAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCstJob() {
        return cstJob;
    }

    public void setCstJob(String cstJob) {
        this.cstJob = cstJob;
    }

    public Integer getHygiene() {
        return hygiene;
    }

    public void setHygiene(Integer hygiene) {
        this.hygiene = hygiene;
    }

    public Integer getComfort() {
        return comfort;
    }

    public void setComfort(Integer comfort) {
        this.comfort = comfort;
    }

    public Integer getTechnique() {
        return technique;
    }

    public void setTechnique(Integer technique) {
        this.technique = technique;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rvwNum=").append(rvwNum);
        sb.append(", cstEmail=").append(cstEmail);
        sb.append(", etpNum=").append(etpNum);
        sb.append(", etpEmail=").append(etpEmail);
        sb.append(", inputDate=").append(inputDate);
        sb.append(", cstIpAddress=").append(cstIpAddress);
        sb.append(", content=").append(content);
        sb.append(", cstJob=").append(cstJob);
        sb.append(", hygiene=").append(hygiene);
        sb.append(", comfort=").append(comfort);
        sb.append(", technique=").append(technique);
        sb.append(", price=").append(price);
        sb.append(", service=").append(service);
        sb.append("]");
        return sb.toString();
    }
}