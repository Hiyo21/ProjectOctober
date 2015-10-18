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

    public PhotoLocation setPhotoNum(Integer photoNum) {
        this.photoNum = photoNum;
        return this;
    }

    public String getEtpNum() {
        return etpNum;
    }

    public PhotoLocation setEtpNum(String etpNum) {
        this.etpNum = etpNum;
        return this;
    }

    public String getEtpEmail() {
        return etpEmail;
    }

    public PhotoLocation setEtpEmail(String etpEmail) {
        this.etpEmail = etpEmail;
        return this;
    }

    public String getPhtUsage() {
        return phtUsage;
    }

    public PhotoLocation setPhtUsage(String phtUsage) {
        this.phtUsage = phtUsage;
        return this;
    }

    public String getPhtDescription() {
        return phtDescription;
    }

    public PhotoLocation setPhtDescription(String phtDescription) {
        this.phtDescription = phtDescription;
        return this;
    }

    public String getPhtAddress() {
        return phtAddress;
    }

    public PhotoLocation setPhtAddress(String phtAddress) {
        this.phtAddress = phtAddress;
        return this;
    }

    public LocalDateTime getPhtUploadDate() {
        return phtUploadDate;
    }

    public PhotoLocation setPhtUploadDate(LocalDateTime phtUploadDate) {
        this.phtUploadDate = phtUploadDate;
        return this;
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