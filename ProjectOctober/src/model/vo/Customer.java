package model.vo;

import java.util.Date;

public class Customer {
    private String cstEmail;

    private String address;

    private String zipcode;

    private Date birthday;

    private String gender;

    private Integer oneclickStatus;

    public String getCstEmail() {
        return cstEmail;
    }

    public void setCstEmail(String cstEmail) {
        this.cstEmail = cstEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getOneclickStatus() {
        return oneclickStatus;
    }

    public void setOneclickStatus(Integer oneclickStatus) {
        this.oneclickStatus = oneclickStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cstEmail=").append(cstEmail);
        sb.append(", address=").append(address);
        sb.append(", zipcode=").append(zipcode);
        sb.append(", birthday=").append(birthday);
        sb.append(", gender=").append(gender);
        sb.append(", oneclickStatus=").append(oneclickStatus);
        sb.append("]");
        return sb.toString();
    }
}