package model.mapper;

import java.util.List;

import model.vo.Reservation;

public interface ReservationMapper {
	List<Reservation> retrieveReservations();
	
	Integer insertReservation(Reservation reservation);
	
	Integer changeReservationTime(Reservation reservation);
	
	Integer deleteReservation(Reservation reservation);
	
}
