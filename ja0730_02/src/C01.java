import java.util.Date;
import java.util.Scanner;

public class C01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time[] t = new Time[5];
		
		for(int i=0;i<5;i++) {
			t[i] = new Time(i+1,i+1,i+1);
			System.out.println(t[i]);
		}
		
		t[1].setHour(12);
		t[1].setMinute(59);
		t[1].setSecond(30);
		System.out.println(t[1]);
		
//		Time t1 = new Time(10,10,10);
//		Time t2 = new Time();
//		
//		t2.setHour(11);
//		t2.setMinute(11);
//		t2.setSecond(11);
//		System.out.println(t1);
//		System.out.println(t2);
	}	
}
