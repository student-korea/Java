import java.util.*;
public class C0723_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//double ran = (int)(Math.random()*45);		
		double rnum = (int)(Math.random()*10)+1;		
		System.out.println("[ 랜덤 숫자 맞추기 ]");
		int i=1;
		while (true) {
			System.out.printf("%d. 1-10짜지의 숫자를 맞추기",i);
			i++;
			int input = scan.nextInt();
			if (rnum-input==0) {
				System.out.println("정답");
				break;
			} else {
				if (rnum-input>0) {
					System.out.println("큼");
				} else {
					System.out.println("작음");
				}
			}
		}
			
		System.out.println(rnum);
	}

}
