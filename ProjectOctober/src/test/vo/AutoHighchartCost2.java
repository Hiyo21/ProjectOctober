package test.vo;

public class AutoHighchartCost2 {
	private String timeSet;
	private int countNum;
	private int cnt;//내사업체
	private String timeset;//내사업체
	
	public String getTimeSet() {
		return timeSet;
	}
	public void setTimeSet(String timeSet) {
		this.timeSet = timeSet;
	}
	public int getCountNum() {
		return countNum;
	}
	public void setCountNum(int countNum) {
		this.countNum = countNum;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getTimeset() {
		return timeset;
	}
	public void setTimeset(String timeset) {
		this.timeset = timeset;
	}
	@Override
	public String toString() {
		return "AutoHighchartCost2 [timeSet=" + timeSet + ", countNum=" + countNum + ", cnt=" + cnt + ", timeset="
				+ timeset + "]";
	}
	
}

