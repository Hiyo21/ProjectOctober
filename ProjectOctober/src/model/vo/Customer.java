package model.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.management.Notification;

public class Customer implements Serializable {
	private List<OneclickPayment> oneclickPayments;
	private List<Reservation> reservations;
	private List<Notification> notifications;
	private List<Review> reviews;
	private List<PaymentRecord> paymentRecords;
	
    private String cstEmail;

    private String cstAddress;

    private String cstZipcode;

    private LocalDate cstBirthday;

    private String cstGender;

    private Integer cstOneclick;

    private static final long serialVersionUID = 1L;

	public List<OneclickPayment> getOneclickPayments() {
		return oneclickPayments;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public String getCstEmail() {
		return cstEmail;
	}

	public String getCstAddress() {
		return cstAddress;
	}

	public String getCstZipcode() {
		return cstZipcode;
	}

	public LocalDate getCstBirthday() {
		return cstBirthday;
	}

	public String getCstGender() {
		return cstGender;
	}

	public Integer getCstOneclick() {
		return cstOneclick;
	}

	public void setOneclickPayments(List<OneclickPayment> oneclickPayments) {
		this.oneclickPayments = oneclickPayments;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public void setCstEmail(String cstEmail) {
		this.cstEmail = cstEmail;
	}

	public void setCstAddress(String cstAddress) {
		this.cstAddress = cstAddress;
	}

	public void setCstZipcode(String cstZipcode) {
		this.cstZipcode = cstZipcode;
	}

	public void setCstBirthday(LocalDate cstBirthday) {
		this.cstBirthday = cstBirthday;
	}

	public void setCstGender(String cstGender) {
		this.cstGender = cstGender;
	}

	public void setCstOneclick(Integer cstOneclick) {
		this.cstOneclick = cstOneclick;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [oneclickPayments=").append(oneclickPayments).append(", reservations=")
				.append(reservations).append(", notifications=").append(notifications).append(", reviews=")
				.append(reviews).append(", cstEmail=").append(cstEmail).append(", cstAddress=").append(cstAddress)
				.append(", cstZipcode=").append(cstZipcode).append(", cstBirthday=").append(cstBirthday)
				.append(", cstGender=").append(cstGender).append(", cstOneclick=").append(cstOneclick).append(", paymentRecords=").append(paymentRecords).append("]");
		return builder.toString();
	}

	public List<PaymentRecord> getPaymentRecords() {
		return paymentRecords;
	}

	public void setPaymentRecords(List<PaymentRecord> paymentRecords) {
		this.paymentRecords = paymentRecords;
	}
}