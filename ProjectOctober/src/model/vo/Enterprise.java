package model.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Enterprise implements Serializable {
	private Component component;
	private Holiday holiday;
	private PhotoLocation photoLocation;
	private String infoPht;
	private String logoPht;
	private WorkingDays workingDays;
	private List<Review> reviews;
	private List<Notification> notifications;
	private List<Reservation> reservations;
	private List<SaleRecord> saleRecords;
	private List<Service> services;
	private List<Coupon> coupons;
	private List<PhotoLocation> photos;
	private List<Component> components;
	
    private String etpNum;
    private String etpEmail;
	private String etpOwner;
    private String etpSuperclass;
    private String etpAddress;
    private String etpZipcode;
    private String etpTitle;
    private LocalTime etpStartHour;
    private LocalTime etpEndHour;
    private String etpPhone;
    private Integer etpMaleStaff;
    private Integer etpFemaleStaff;
    private Integer etpCapacity;
    private Integer etpRsvDeadline;
    private Integer etpSelfNotification;
    private Integer etpCstNotification;
    private Integer etpTemplateType;
    private Integer etpThemeType;
    private String etpMapAddress;
    private String etpDirection;
    private String etpSvcOffered;
    private String etpSubclass;
    private String etpSpecialize;
    private String etpDescription;
    private Integer etpStatus;
    
    private String searchKeyword;    
    private String start;
    private String end;
    private LocalDate memJoinedDate;

    private static final long serialVersionUID = 1L;
    
    
    
	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public Component getComponent() {
		return component;
	}

	public Holiday getHoliday() {
		return holiday;
	}

	public PhotoLocation getPhotoLocation() {
		return photoLocation;
	}

	public WorkingDays getWorkingDays() {
		return workingDays;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public List<SaleRecord> getSaleRecords() {
		return saleRecords;
	}

	public List<Service> getServices() {
		return services;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public String getEtpNum() {
		return etpNum;
	}

	public String getEtpEmail() {
		return etpEmail;
	}

	public String getEtpOwner() {
		return etpOwner;
	}

	public String getEtpSuperclass() {
		return etpSuperclass;
	}

	public String getEtpAddress() {
		return etpAddress;
	}

	public String getEtpZipcode() {
		return etpZipcode;
	}

	public String getEtpTitle() {
		return etpTitle;
	}

	public LocalTime getEtpStartHour() {
		return etpStartHour;
	}

	public LocalTime getEtpEndHour() {
		return etpEndHour;
	}

	public String getEtpPhone() {
		return etpPhone;
	}

	public Integer getEtpMaleStaff() {
		return etpMaleStaff;
	}

	public Integer getEtpFemaleStaff() {
		return etpFemaleStaff;
	}

	public Integer getEtpCapacity() {
		return etpCapacity;
	}

	public Integer getEtpRsvDeadline() {
		return etpRsvDeadline;
	}

	public Integer getEtpSelfNotification() {
		return etpSelfNotification;
	}

	public Integer getEtpCstNotification() {
		return etpCstNotification;
	}

	public Integer getEtpTemplateType() {
		return etpTemplateType;
	}

	public String getEtpMapAddress() {
		return etpMapAddress;
	}

	public String getEtpDirection() {
		return etpDirection;
	}

	public String getEtpSvcOffered() {
		return etpSvcOffered;
	}

	public String getEtpSubclass() {
		return etpSubclass;
	}

	public String getEtpSpecialize() {
		return etpSpecialize;
	}

	public String getEtpDescription() {
		return etpDescription;
	}

	public Integer getEtpStatus() {
		return etpStatus;
	}

	public LocalDate getMemJoinedDate() {
		return memJoinedDate;
	}

	public List<PhotoLocation> getPhotos() {
		return photos;
	}

	public List<Component> getComponents() {
		return components;
	}
	
	public String getInfoPht() {
		return infoPht;
	}
	

	public String getLogoPht() {
		return logoPht;
	}

	public void setInfoPht(String infoPht) {
		this.infoPht = infoPht;
	}


	public void setLogoPht(String logoPht) {
		this.logoPht = logoPht;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public void setPhotos(List<PhotoLocation> photos) {
		this.photos = photos;
	}

	public void setMemJoinedDate(LocalDate memJoinedDate) {
		this.memJoinedDate = memJoinedDate;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public void setHoliday(Holiday holiday) {
		this.holiday = holiday;
	}

	public void setPhotoLocation(PhotoLocation photoLocation) {
		this.photoLocation = photoLocation;
	}

	public void setWorkingDays(WorkingDays workingDays) {
		this.workingDays = workingDays;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public void setSaleRecords(List<SaleRecord> saleRecords) {
		this.saleRecords = saleRecords;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public void setEtpNum(String etpNum) {
		this.etpNum = etpNum;
	}

	public void setEtpEmail(String etpEmail) {
		this.etpEmail = etpEmail;
	}

	public void setEtpOwner(String etpOwner) {
		this.etpOwner = etpOwner;
	}

	public void setEtpSuperclass(String etpSuperclass) {
		this.etpSuperclass = etpSuperclass;
	}

	public void setEtpAddress(String etpAddress) {
		this.etpAddress = etpAddress;
	}

	public void setEtpZipcode(String etpZipcode) {
		this.etpZipcode = etpZipcode;
	}

	public void setEtpTitle(String etpTitle) {
		this.etpTitle = etpTitle;
	}

	public void setEtpStartHour(LocalTime etpStartHour) {
		this.etpStartHour = etpStartHour;
	}

	public void setEtpEndHour(LocalTime etpEndHour) {
		this.etpEndHour = etpEndHour;
	}

	public void setEtpPhone(String etpPhone) {
		this.etpPhone = etpPhone;
	}

	public void setEtpMaleStaff(Integer etpMaleStaff) {
		this.etpMaleStaff = etpMaleStaff;
	}

	public void setEtpFemaleStaff(Integer etpFemaleStaff) {
		this.etpFemaleStaff = etpFemaleStaff;
	}

	public void setEtpCapacity(Integer etpCapacity) {
		this.etpCapacity = etpCapacity;
	}

	public void setEtpRsvDeadline(Integer etpRsvDeadline) {
		this.etpRsvDeadline = etpRsvDeadline;
	}

	public void setEtpSelfNotification(Integer etpSelfNotification) {
		this.etpSelfNotification = etpSelfNotification;
	}

	public void setEtpCstNotification(Integer etpCstNotification) {
		this.etpCstNotification = etpCstNotification;
	}

	public void setEtpTemplateType(Integer etpTemplateType) {
		this.etpTemplateType = etpTemplateType;
	}

	public void setEtpMapAddress(String etpMapAddress) {
		this.etpMapAddress = etpMapAddress;
	}

	public void setEtpDirection(String etpDirection) {
		this.etpDirection = etpDirection;
	}

	public void setEtpSvcOffered(String etpSvcOffered) {
		this.etpSvcOffered = etpSvcOffered;
	}
	
	public Integer getEtpThemeType() {
		return etpThemeType;
	}

	public void setEtpThemeType(Integer etpThemeType) {
		this.etpThemeType = etpThemeType;
	}

	public void setEtpSubclass(String etpSubclass) {
		this.etpSubclass = etpSubclass;
	}

	public void setEtpSpecialize(String etpSpecialize) {
		this.etpSpecialize = etpSpecialize;
	}

	public void setEtpDescription(String etpDescription) {
		this.etpDescription = etpDescription;
	}

	public void setEtpStatus(Integer etpStatus) {
		this.etpStatus = etpStatus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enterprise [component=").append(component).append(", holiday=").append(holiday)
				.append(", photoLocation=").append(photoLocation).append(", workingDays=").append(workingDays)
				.append(", reviews=").append(reviews).append(", notifications=").append(notifications)
				.append(", reservations=").append(reservations).append(", saleRecords=").append(saleRecords)
				.append(", services=").append(services).append(", coupons=").append(coupons).append(", photos=")
				.append(photos).append(", components=").append(components).append(", etpNum=").append(etpNum)
				.append(", etpEmail=").append(etpEmail).append(", etpOwner=").append(etpOwner)
				.append(", etpSuperclass=").append(etpSuperclass).append(", etpAddress=").append(etpAddress)
				.append(", etpZipcode=").append(etpZipcode).append(", etpTitle=").append(etpTitle)
				.append(", etpStartHour=").append(etpStartHour).append(", etpEndHour=").append(etpEndHour)
				.append(", etpPhone=").append(etpPhone).append(", etpMaleStaff=").append(etpMaleStaff)
				.append(", etpFemaleStaff=").append(etpFemaleStaff).append(", etpCapacity=").append(etpCapacity)
				.append(", etpRsvDeadline=").append(etpRsvDeadline).append(", etpSelfNotification=")
				.append(etpSelfNotification).append(", etpCstNotification=").append(etpCstNotification)
				.append(", etpTemplateType=").append(etpTemplateType).append(", etpThemeType=").append(etpThemeType)
				.append(", etpMapAddress=").append(etpMapAddress).append(", etpDirection=").append(etpDirection)
				.append(", etpSvcOffered=").append(etpSvcOffered).append(", etpSubclass=").append(etpSubclass)
				.append(", etpSpecialize=").append(etpSpecialize).append(", etpDescription=").append(etpDescription)
				.append(", etpStatus=").append(etpStatus).append(", searchKeyword=").append(searchKeyword)
				.append(", start=").append(start).append(", end=").append(end).append(", memJoinedDate=")
				.append(memJoinedDate).append("]");
		return builder.toString();
	}
}