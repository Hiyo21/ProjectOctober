package controller.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.dao.DAOFactory;
import model.dao.EnterpriseDAO;
import model.vo.Reservation;

public class EnterpriseAction extends ActionSupport {
	private EnterpriseDAO etpDAO;
	private Reservation reservation;
	private List<Reservation> reservationList;
	
	public EnterpriseAction() {
		etpDAO = DAOFactory.createEnterpriseDAO();
	}
	
	public String insertEvents() throws Exception{
		int result = etpDAO.insertEvent(reservation);
		System.out.println(reservation);
		System.out.println(result);
		if(result != 0) return SUCCESS;
		else return ERROR;
	}
	
	public String retrieveEvents() throws Exception{
		System.out.println('t');
		etpDAO = new EnterpriseDAO();
		reservationList = etpDAO.retrieveEvents();
		System.out.println(2);
		return SUCCESS;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public List<Reservation> getReservationList() {
		return reservationList;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}

	
}
