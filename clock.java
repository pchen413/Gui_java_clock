
public class Clock {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	public Clock() {
		hour = 0;
		minute = 0;
		second = 0;
	}
	
	public Clock(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setHour(int h) {
		this.hour = h;
	}
	
	public void setMinute(int m) {
		this.minute = m;
	}
	
	public void setSecond(int s) {
		this.second = s;
	}
	
	public String toString() {
		return String.format(hour + ":" + minute + ":" + second);
	}

}
