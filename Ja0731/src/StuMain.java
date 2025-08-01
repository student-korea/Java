import java.util.*;

public class StuMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		StuDeck sd = new StuDeck(); 
		String[] title = {"번호","이름","국어","영어","수학","총점","평균","등수"};
		Stuscore s = null;
		
		loop:while(true) {
			int choice = sd.menu_print();
			switch(choice) {
			case 1:
				sd.stu_input(list);
				break;
			case 2:
				sd.stu_output(list);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			}
		}
		
			
			
			
			
	}//main
}
