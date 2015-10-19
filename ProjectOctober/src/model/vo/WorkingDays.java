package model.vo;

import java.io.Serializable;

public class WorkingDays implements Serializable {
	private String etpNum;

	private String etpEmail;
    
	private Integer mon;

    private Integer tue;

    private Integer wed;

    private Integer thu;

    private Integer fri;

    private Integer sat;

    private Integer sun;
    
    private String temp;

    private static final long serialVersionUID = 1L;

    public Integer getMon() {
        return mon;
    }

    public void setMon(Integer mon) {
        this.mon = mon;
    }

    public Integer getTue() {
        return tue;
    }

    public void setTue(Integer tue) {
        this.tue = tue;
    }

    public Integer getWed() {
        return wed;
    }

    public void setWed(Integer wed) {
        this.wed = wed;
    }

    public Integer getThu() {
        return thu;
    }

    public void setThu(Integer thu) {
        this.thu = thu;
    }

    public Integer getFri() {
        return fri;
    }

    public void setFri(Integer fri) {
        this.fri = fri;
    }

    public Integer getSat() {
        return sat;
    }

    public void setSat(Integer sat) {
        this.sat = sat;
    }

    public Integer getSun() {
        return sun;
    }

    public void setSun(Integer sun) {
        this.sun = sun;
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


	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WorkingDays [etpNum=").append(etpNum).append(", etpEmail=").append(etpEmail).append(", mon=")
				.append(mon).append(", tue=").append(tue).append(", wed=").append(wed).append(", thu=").append(thu)
				.append(", fri=").append(fri).append(", sat=").append(sat).append(", sun=").append(sun)
				.append(", temp=").append(temp).append("]");
		return builder.toString();
	}
}