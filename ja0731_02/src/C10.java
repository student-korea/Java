import java.util.ArrayList;
import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int no,kor,eng,math,total,count=0;
		String name;
		double avg = 0;
		String[] title = {"번호","이름","국어","영어","수학","총합","평균","등수"};
		Stuscore s = null;
		loop:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적삭제");
			System.out.println("5. 등수처리");
			System.out.println("6. 이름정렬");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			switch(choice) {
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			case 1:
				System.out.println("------------------------------------------");
				System.out.println("         [성적입력]");
				System.out.printf("%d번 입력할 학생의 이름을 입력하세요.",count+1);
				name = scan.next();
				System.out.printf("%s학생의 국어성적을 입력하세요.",name);
				kor = scan.nextInt();
				System.out.printf("%s학생의 영어성적을 입력하세요.",name);
				eng = scan.nextInt();
				System.out.printf("%s학생의 수학성적을 입력하세요.",name);
				math = scan.nextInt();
				list.add(new Stuscore(name,kor,eng,math));
				System.out.printf("%s학생의 성적이 입력되었습니다. \n",name);
				break;
			case 2:
				System.out.println("                         [성적출력]");
				System.out.printf(""+"%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
						title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
				System.out.println("-----------------------------------------------------------");
				for(int i=0;i<list.size();i++) {
					s=(Stuscore)list.get(i);
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
				}System.out.println();
				break;
			}
		}
		
	}	

}
