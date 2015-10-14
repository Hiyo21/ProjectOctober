package model.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PhotoLocation implements Serializable {
    private Integer photoNum;

    private String etpNum;

    private String etpEmail;

    private String phtUsage;

    private String phtDescription;

    private String phtAddress;

    private LocalDateTime phtUploadDate;

    private static final long serialVersionUID = 1L;

    public Integer getPhotoNum() {
        return photoNum;
    }

    public void setPhotoNum(Integer photoNum) {
        this.photoNum = photoNum;
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

    public String getPhtUsage() {
        return phtUsage;
    }

    public void setPhtUsage(String phtUsage) {
        this.phtUsage = phtUsage;
    }

    public String getPhtDescription() {
        return phtDescription;
    }

    public void setPhtDescription(String phtDescription) {
        this.phtDescription = phtDescription;
    }

    public String getPhtAddress() {
        return phtAddress;
    }

    public void setPhtAddress(String phtAddress) {
        this.phtAddress = phtAddress;
    }

    public LocalDateTime getPhtUploadDate() {
        return phtUploadDate;
    }

    public void setPhtUploadDate(LocalDateTime phtUploadDate) {
        this.phtUploadDate = phtUploadDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", photoNum=").append(photoNum);
        sb.append(", etpNum=").append(etpNum);
        sb.append(", etpEmail=").append(etpEmail);
        sb.append(", phtUsage=").append(phtUsage);
        sb.append(", phtDescription=").append(phtDescription);
        sb.append(", phtAddress=").append(phtAddress);
        sb.append(", phtUploadDate=").append(phtUploadDate);
        sb.append("]");
        return sb.toString();
    }
}