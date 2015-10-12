package model.vo;

import java.time.LocalTime;

public class Service {
    private Integer svcNum;

    private String etpNum;

    private String etpEmail;

    private String title;

    private Integer cost;

    private LocalTime time;

    private String description;

    private String category;

    private String specialty;

    private Integer svcCount;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getSvcCount() {
        return svcCount;
    }

    public void setSvcCount(Integer svcCount) {
        this.svcCount = svcCount;
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
        sb.append(", title=").append(title);
        sb.append(", cost=").append(cost);
        sb.append(", time=").append(time);
        sb.append(", description=").append(description);
        sb.append(", category=").append(category);
        sb.append(", specialty=").append(specialty);
        sb.append(", svcCount=").append(svcCount);
        sb.append("]");
        return sb.toString();
    }
}