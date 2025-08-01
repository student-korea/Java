
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time(){}
	Time(int hour,int minute,int second){
		this.hour = hour;
		this.minute= minute;
		this.second=second;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute= minute;	
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second=second;
	}
	
	public String toString() {
		return String.format("%d시 %d분 %d초 입니다.",hour,minute,second);
	}
}
