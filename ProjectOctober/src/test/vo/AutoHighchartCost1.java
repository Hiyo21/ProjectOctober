package test.vo;

public class AutoHighchartCost1 {
	private String svcCode;
	private int Bavg;
	private int differCost;
	
	public String getSvcCode() {
		return svcCode;
	}
	public void setSvcCode(String svcCode) {
		this.svcCode = svcCode;
	}
	public int getBavg() {
		return Bavg;
	}
	public void setBavg(int bavg) {
		Bavg = bavg;
	}
	public int getDifferCost() {
		return differCost;
	}
	public void setDifferCost(int differCost) {
		this.differCost = differCost;
	}
	@Override
	public String toString() {
		return "AutoHighchartCost1 [svcCode=" + svcCode + ", Bavg=" + Bavg + ", differCost=" + differCost + "]";
	}

}
