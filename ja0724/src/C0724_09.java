
import java.util.Scanner;

public class C0724_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//변수 배열선언
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int count = 0; //입력된 학생수
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("----------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.(0.종료)>> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적입력 ]");
				
				no[count] = count+1;       //번호입력
				System.out.printf("%d번 학생이름을 입력하세요.(0.취소) >> \n",count+1);
				name[count] = scan.next(); //이름입력
				// 취소부분
				if(name[count].equals("0")) {
					System.out.println("이전화면으로 이동합니다.");
					System.out.println();
					break;
				}
				
				// 국어,영어,수학입력
				for(int i=0;i<score.length;i++) {
					System.out.printf("%s 점수를 입력하세요.>> \n",title[i+2]);
					score[count][i] = scan.nextInt();
				}
				total[count] = score[count][0]+score[count][1]+score[count][2];
				avg[count] = total[count]/3.0;
				System.out.printf("%d 번 학생성적이 저장되었습니다.\n",count+1);
				count++;
				System.out.println();
				break;
			case 2:
				System.out.println("[ 학생성적출력 ]");
				for(int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("--------------------------------------------");
				// 학생수만큼 출력
				for(int i=0;i<count;i++) {
					System.out.printf("%d\t",no[i]);
					System.out.printf("%s\t",name[i]);
					for(int j=0;j<score[i].length;j++) {
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.printf("%d\t",total[i]);
					System.out.printf("%.2f\t",avg[i]);
					System.out.println();
				}
				System.out.println();
				System.out.println();
				break;
			case 3: // 학생성적수정	
				System.out.println("[ 학생성적수정 ]");
				
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break loop;
			}//switch
			
		}//while
	
	}//main

}//class
