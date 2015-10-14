package model.vo;

import java.io.Serializable;
import java.util.List;

public class Unregistered implements Serializable {
    private Integer urgNum;
    private String urgName;
    private String urgEmail;
    private String urgPhone;
    private List<UnregisteredReservation> unregisteredReservations;

    private static final long serialVersionUID = 1L;

    public Integer getUrgNum() {
        return urgNum;
    }

    public void setUrgNum(Integer urgNum) {
        this.urgNum = urgNum;
    }

    public String getUrgName() {
        return urgName;
    }

    public void setUrgName(String urgName) {
        this.urgName = urgName;
    }

    public String getUrgEmail() {
        return urgEmail;
    }

    public void setUrgEmail(String urgEmail) {
        this.urgEmail = urgEmail;
    }

    public String getUrgPhone() {
        return urgPhone;
    }

    public void setUrgPhone(String urgPhone) {
        this.urgPhone = urgPhone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urgNum=").append(urgNum);
        sb.append(", urgName=").append(urgName);
        sb.append(", urgEmail=").append(urgEmail);
        sb.append(", urgPhone=").append(urgPhone);
        sb.append(", unregisteredReservations=").append(unregisteredReservations);
        sb.append("]");
        return sb.toString();
    }

	public List<UnregisteredReservation> getUnregisteredReservations() {
		return unregisteredReservations;
	}

	public void setUnregisteredReservations(List<UnregisteredReservation> unregisteredReservations) {
		this.unregisteredReservations = unregisteredReservations;
	}
}