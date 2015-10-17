package controller.action;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


import com.opensymphony.xwork2.ActionSupport;

import model.common.DAOFactory;
import model.dao.EnterpriseDAO;
import model.vo.Enterprise;
import model.vo.Reservation;



public class EnterpriseAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private EnterpriseDAO etpDAO;
	private Enterprise enterprise;
	private Reservation reservation;
	private List<Reservation> reservationList;
	private List<Enterprise> enterpriseList;
	private String etpNum;
	private String etpEmail;
	
	
	public EnterpriseAction() {
		etpDAO = DAOFactory.createEnterpriseDAO();
	}
	
	public String insertReservation() throws Exception{
		if(reservation != null){
			reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart(), DateTimeFormatter.ISO_DATE_TIME));
			reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd(), DateTimeFormatter.ISO_DATE_TIME));
			//시험용!
			//svc_num 필요,
			reservation.setSvcNum(7);
			//etp_num 필요
			reservation.setEtpNum("1234567890");
			//etp_email 필요
			reservation.setEtpEmail("test1@test.com");
			//cst_email 필요
			reservation.setCstEmail("test2@test.com");
			
		}
		int result = etpDAO.insertReservation(reservation);
		
		if(result != 0) return SUCCESS;
		else return ERROR;
	}
	
	public String retrieveReservations() throws Exception{
		reservationList = etpDAO.retrieveReservations();
		if (reservationList != null) {
			for(int i = 0 ; i < reservationList.size() ; i++ ){
				reservationList.get(i).setStart(reservationList.get(i).getRsvStartDate().toString());
				reservationList.get(i).setEnd(reservationList.get(i).getRsvEndDate().toString());
				//Reservation 상태에 따라 변화
				if(reservationList.get(i).getRsvStatus() == 0){
					reservationList.get(i).setBordercolor("#DDDDDD");
				}
			}
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String changeReservationTime() throws Exception{
		reservation.setRsvStartDate(LocalDateTime.parse(reservation.getStart().substring(0, 19)));
		reservation.setRsvEndDate(LocalDateTime.parse(reservation.getEnd().substring(0, 19)));
		int result = etpDAO.changeReservationTime(reservation);
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String deleteReservation() throws Exception{
		int result = etpDAO.deleteReservation(reservation);
		if(result == 1) return SUCCESS;
		else return ERROR;
	}
	
	public String receiveServiceList() throws Exception{
		enterprise = etpDAO.receiveServiceList(etpNum);
		if(enterprise != null) return SUCCESS;
		else return ERROR;
	}
	

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public List<Reservation> getReservationList() {
		return reservationList;
	}

	public List<Enterprise> getEnterpriseList() {
		return enterpriseList;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}

	public void setEnterpriseList(List<Enterprise> enterpriseList) {
		this.enterpriseList = enterpriseList;
	}

	public String getEtpNum() {
		return etpNum;
	}

	public String getEtpEmail() {
		return etpEmail;
	}

	public void setEtpNum(String etpNum) {
		this.etpNum = etpNum;
	}

	public void setEtpEmail(String etpEmail) {
		this.etpEmail = etpEmail;
	}
}
