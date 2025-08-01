import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	private int no,kor,eng,math,total;
	private double avg;
	private String name;
	private String[] title = {"번호","이름","국어","영어","수학","총점","평균","등수"};
	private Stuscore s;
	// 상단메뉴 출력
	int menu_print() {
		System.out.println("[ 학생 성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정력");
		System.out.println("0. 프로그램 종료");
		System.out.println("------------------------");
		int choice =scan.nextInt();
		return choice;
	}
	void stu_input(ArrayList list) {
		System.out.printf("%d번째 학생이름을 입력하세요.  ",list.size()+1);
		name =scan.next();
		System.out.printf("%s학생 국어점수를 입력하세요.  ",name);
		kor =scan.nextInt();
		System.out.printf("%s학생 수학점수를 입력하세요.  ",name);
		math =scan.nextInt();
		System.out.printf("%s학생 영어점수를 입력하세요.  ",name);
		eng =scan.nextInt();
		list.add(new Stuscore(name,kor,eng,math));
		System.out.printf("%s 학생 성적이 저장되었습니다. \n",name);
	}
	void stu_output(ArrayList list) {
		System.out.println("                      [ 학생 성적 출력 ]");
		System.out.printf(""+"%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1], title[2], title[3], title[4], title[5], title[6], title[7]);
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			s = (Stuscore)list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}System.out.println();
	}
}
