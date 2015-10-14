package model.vo;

import java.io.Serializable;

public class UnregisteredReservation implements Serializable {
    private Integer urgRsvNum;

    private Integer rsvNum;

    private Integer urgNum;

    private String urgRsvPassword;

    private static final long serialVersionUID = 1L;

    public Integer getUrgRsvNum() {
        return urgRsvNum;
    }

    public void setUrgRsvNum(Integer urgRsvNum) {
        this.urgRsvNum = urgRsvNum;
    }

    public Integer getRsvNum() {
        return rsvNum;
    }

    public void setRsvNum(Integer rsvNum) {
        this.rsvNum = rsvNum;
    }

    public Integer getUrgNum() {
        return urgNum;
    }

    public void setUrgNum(Integer urgNum) {
        this.urgNum = urgNum;
    }

    public String getUrgRsvPassword() {
        return urgRsvPassword;
    }

    public void setUrgRsvPassword(String urgRsvPassword) {
        this.urgRsvPassword = urgRsvPassword;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urgRsvNum=").append(urgRsvNum);
        sb.append(", rsvNum=").append(rsvNum);
        sb.append(", urgNum=").append(urgNum);
        sb.append(", urgRsvPassword=").append(urgRsvPassword);
        sb.append("]");
        return sb.toString();
    }
}