package model.mapper;

import java.util.List;

import model.vo.Reservation;

public interface ReservationMapper {
	List<Reservation> retrieveReservations(String etpNum);
	
	Integer insertReservation(Reservation reservation);
	
	Integer changeReservationTime(Reservation reservation);
	
	Integer deleteReservation(Reservation reservation);

	int updateReservationDetailsInModal(Reservation reservation);
	
	List<Reservation> retrieveOffDays(String etpNum);
	
	Integer insertOffDays(Reservation reservation);

	Reservation retrieveReservation(Integer rsvNum);
	
	List<Reservation> couponSendList(String etpEmail);
	
	List<Reservation> retrieveReservationTime(String etpNum);
	
	Reservation retrieveReservationNumber(Reservation mobileReservation);
}
