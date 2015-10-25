package model.vo;

import java.io.Serializable;

public class Service implements Serializable {
    private Integer svcNum;

    private String etpNum;

    private String etpEmail;

    private String svcTitle;

    private String svcCode;

    private Integer svcCost;

    private String svcTime;

    private String svcDescription;

    private String svcCategory;

    private String svcSpecialize;

    private static final long serialVersionUID = 1L;

    public Integer getSvcNum() {
        return svcNum;
    }

    public void setSvcNum(Integer svcNum) {
        this.svcNum = svcNum;
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

    public String getSvcTitle() {
        return svcTitle;
    }

    public void setSvcTitle(String svcTitle) {
        this.svcTitle = svcTitle;
    }

    public String getSvcCode() {
        return svcCode;
    }

    public void setSvcCode(String svcCode) {
        this.svcCode = svcCode;
    }

    public Integer getSvcCost() {
        return svcCost;
    }

    public void setSvcCost(Integer svcCost) {
        this.svcCost = svcCost;
    }

    public String getSvcTime() {
        return svcTime;
    }

    public void setSvcTime(String svcTime) {
        this.svcTime = svcTime;
    }

    public String getSvcDescription() {
        return svcDescription;
    }

    public void setSvcDescription(String svcDescription) {
        this.svcDescription = svcDescription;
    }

    public String getSvcCategory() {
        return svcCategory;
    }

    public void setSvcCategory(String svcCategory) {
        this.svcCategory = svcCategory;
    }

    public String getSvcSpecialize() {
        return svcSpecialize;
    }

    public void setSvcSpecialize(String svcSpecialize) {
        this.svcSpecialize = svcSpecialize;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", svcNum=").append(svcNum);
        sb.append(", etpNum=").append(etpNum);
        sb.append(", etpEmail=").append(etpEmail);
        sb.append(", svcTitle=").append(svcTitle);
        sb.append(", svcCode=").append(svcCode);
        sb.append(", svcCost=").append(svcCost);
        sb.append(", svcTime=").append(svcTime);
        sb.append(", svcDescription=").append(svcDescription);
        sb.append(", svcCategory=").append(svcCategory);
        sb.append(", svcSpecialize=").append(svcSpecialize);
        sb.append("]");
        return sb.toString();
    }
}