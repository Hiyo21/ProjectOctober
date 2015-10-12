package model.vo;

import java.time.LocalTime;

public class EnterpriseWaitlist extends EnterpriseWaitlistKey {
    private String owner;

    private String superclass;

    private String address;

    private String zipcode;

    private String title;

    private LocalTime startHour;

    private LocalTime endHour;

    private String phone;

    private Integer maleStaffCount;

    private Integer femaleStaffCount;

    private Short hourlyCapacity;

    private Integer modificationDeadline;

    private Integer ntfFrequencyToEtp;

    private Integer ntfFrequencyToCst;

    private Integer pageTemplateType;

    private String etpLocationMapAPIAddress;

    private String etpLocationGuide;

    private String svcList;

    private String subclass;

    private String specialtyList;

    private String description;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSuperclass() {
        return superclass;
    }

    public void setSuperclass(String superclass) {
        this.superclass = superclass;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalTime getStartHour() {
        return startHour;
    }

    public void setStartHour(LocalTime startHour) {
        this.startHour = startHour;
    }

    public LocalTime getEndHour() {
        return endHour;
    }

    public void setEndHour(LocalTime endHour) {
        this.endHour = endHour;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getMaleStaffCount() {
        return maleStaffCount;
    }

    public void setMaleStaffCount(Integer maleStaffCount) {
        this.maleStaffCount = maleStaffCount;
    }

    public Integer getFemaleStaffCount() {
        return femaleStaffCount;
    }

    public void setFemaleStaffCount(Integer femaleStaffCount) {
        this.femaleStaffCount = femaleStaffCount;
    }

    public Short getHourlyCapacity() {
        return hourlyCapacity;
    }

    public void setHourlyCapacity(Short hourlyCapacity) {
        this.hourlyCapacity = hourlyCapacity;
    }

    public Integer getModificationDeadline() {
        return modificationDeadline;
    }

    public void setModificationDeadline(Integer modificationDeadline) {
        this.modificationDeadline = modificationDeadline;
    }

    public Integer getNtfFrequencyToEtp() {
        return ntfFrequencyToEtp;
    }

    public void setNtfFrequencyToEtp(Integer ntfFrequencyToEtp) {
        this.ntfFrequencyToEtp = ntfFrequencyToEtp;
    }

    public Integer getNtfFrequencyToCst() {
        return ntfFrequencyToCst;
    }

    public void setNtfFrequencyToCst(Integer ntfFrequencyToCst) {
        this.ntfFrequencyToCst = ntfFrequencyToCst;
    }

    public Integer getPageTemplateType() {
        return pageTemplateType;
    }

    public void setPageTemplateType(Integer pageTemplateType) {
        this.pageTemplateType = pageTemplateType;
    }

    public String getEtpLocationMapAPIAddress() {
        return etpLocationMapAPIAddress;
    }

    public void setEtpLocationMapAPIAddress(String etpLocationMapAPIAddress) {
        this.etpLocationMapAPIAddress = etpLocationMapAPIAddress;
    }

    public String getEtpLocationGuide() {
        return etpLocationGuide;
    }

    public void setEtpLocationGuide(String etpLocationGuide) {
        this.etpLocationGuide = etpLocationGuide;
    }

    public String getSvcList() {
        return svcList;
    }

    public void setSvcList(String svcList) {
        this.svcList = svcList;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public String getSpecialtyList() {
        return specialtyList;
    }

    public void setSpecialtyList(String specialtyList) {
        this.specialtyList = specialtyList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", owner=").append(owner);
        sb.append(", superclass=").append(superclass);
        sb.append(", address=").append(address);
        sb.append(", zipcode=").append(zipcode);
        sb.append(", title=").append(title);
        sb.append(", startHour=").append(startHour);
        sb.append(", endHour=").append(endHour);
        sb.append(", phone=").append(phone);
        sb.append(", maleStaffCount=").append(maleStaffCount);
        sb.append(", femaleStaffCount=").append(femaleStaffCount);
        sb.append(", hourlyCapacity=").append(hourlyCapacity);
        sb.append(", modificationDeadline=").append(modificationDeadline);
        sb.append(", ntfFrequencyToEtp=").append(ntfFrequencyToEtp);
        sb.append(", ntfFrequencyToCst=").append(ntfFrequencyToCst);
        sb.append(", pageTemplateType=").append(pageTemplateType);
        sb.append(", etpLocationMapAPIAddress=").append(etpLocationMapAPIAddress);
        sb.append(", etpLocationGuide=").append(etpLocationGuide);
        sb.append(", svcList=").append(svcList);
        sb.append(", subclass=").append(subclass);
        sb.append(", specialtyList=").append(specialtyList);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();
    }
}