package model.vo;

import java.io.Serializable;
import java.util.Arrays;

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
    
    private Integer[] dow;
    

    private static final long serialVersionUID = 1L;

    public Integer getMon() {
        return mon;
    }

    public WorkingDays setMon(Integer mon) {
        this.mon = mon;
        return this;
    }

    public Integer getTue() {
        return tue;
    }

    public WorkingDays setTue(Integer tue) {
        this.tue = tue;
        return this;
    }

    public Integer getWed() {
        return wed;
    }

    public WorkingDays setWed(Integer wed) {
        this.wed = wed;
        return this;
    }

    public Integer getThu() {
        return thu;
    }

    public WorkingDays setThu(Integer thu) {
        this.thu = thu;
        return this;
    }

    public Integer getFri() {
        return fri;
    }

    public WorkingDays setFri(Integer fri) {
        this.fri = fri;
        return this;
    }

    public Integer getSat() {
        return sat;
    }

    public WorkingDays setSat(Integer sat) {
        this.sat = sat;
        return this;
    }

    public Integer getSun() {
        return sun;
    }

    public WorkingDays setSun(Integer sun) {
        this.sun = sun;
        return this;
    }

	public String getEtpNum() {
		return etpNum;
	}

	public String getEtpEmail() {
		return etpEmail;
	}

	public WorkingDays setEtpNum(String etpNum) {
		this.etpNum = etpNum;
		return this;
	}

	public WorkingDays setEtpEmail(String etpEmail) {
		this.etpEmail = etpEmail;
		return this;
	}


	public String getTemp() {
		return temp;
	}

	public WorkingDays setTemp(String temp) {
		this.temp = temp;
		return this;
	}

	public Integer[] getDow() {
		return dow;
	}

	public void setDow(Integer[] dow) {
		this.dow = dow;
	}

	
}