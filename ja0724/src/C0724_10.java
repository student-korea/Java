import java.util.Scanner;
public class C0724_10 {

	public static void main(String[] args) {
		// 1.변수배열선언
		// 2.출력구문 - while(true), switch구문
		// 3.입력부분
		// 4.취소부분추가
		// 5.출력부분
		// 6.프로그램종료부분
		Scanner scan = new Scanner(System.in);
		//변수 배열선언
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int count = 0; //입력된 학생수
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int input = 0; //수정점수
		int choice = 0; //선택번호
		
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("----------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적취소");
			System.out.println("5. 학생성적취소");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.(0.종료)>> ");
			choice = scan.nextInt();
			switch(choice) {
				case 0:
					System.out.println("프로그램 종료 합니다.");
					break loop;
				case 1:
					System.out.println("[ 학생성적입력 ]");
					no[count]=count+1;
					System.out.printf("%d번 이름 입력:",count+1);
					name[count] = scan.next();
					System.out.printf("%d번 국어 입력:",count+1);
					score[count][0] = scan.nextInt();
					System.out.printf("%d번 영어 입력:",count+1);
					score[count][1] = scan.nextInt();
					System.out.printf("%d번 수학 입력:",count+1);
					score[count][2] = scan.nextInt();
					total[count] = score[count][0]+score[count][1]+score[count][2];
					avg[count] = total[count];
					count++;
					break;
				case 2:
					System.out.println("[ 학생성적출력 ]");
					System.out.println("---------------------------------------------------");
					for(int i=0;i<7;i++) {
						System.out.print(title[i]+"\t");
					}
					System.out.println("\n"+"---------------------------------------------------");
					for(int i = 0;i<count;i++) {
						System.out.println(no[i]+"\t"+name[i]+"\t"+score[i][0]+"\t"+score[i][1]+"\t"+score[i][2]+"\t"+total[i]+"\t"+avg[i]);
					}
					System.out.println();
					break;
				case 3: // 학생성적수정	
					System.out.println("[ 학생성적수정 ]");
					System.out.println("찾고자 하는 학생이름을 입력하세요.>> ");
					String search = scan.next();
					int temp = 0;
					for(int i=0;i<count;i++) {
						if(search.equals(name[i])) {
							System.out.printf("%s 학생을 찾았습니다. \n",name[i]);
							
							System.out.println("[ 점수수정 ]");
							System.out.println("--------------------");
							System.out.println("1. 국어");
							System.out.println("2. 영어");
							System.out.println("3. 수학");
							System.out.println("0. 취소-이전화면 이동");
							System.out.println("--------------------");
							System.out.println("원하는 번호를 입력하세요.>> ");
							choice = scan.nextInt();
							
							switch(choice) {
							case 1: case 2: case 3:
								// 현재국어점수 : 100
								System.out.printf("현재%s점수 : %d \n",title[choice+1] ,score[i][choice-1]);
								System.out.println("변경점수를 입력하세요.>>");
								input = scan.nextInt();
								score[i][choice-1] = input;
								total[i] = score[i][0]+score[i][1]+score[i][2];
								avg[i] = total[i]/3.0;
								System.out.printf("%d 점으로 점수가 변경되었습니다.\n",score[i][choice-1]);
								System.out.println();
								break;
							
							case 0:
								System.out.println("점수변경을 취소했습니다.");
								System.out.println();
								break;
							}
							temp = 1; //학생이 있을시
						}
					}//for
					
					if(temp==0) {
						System.out.printf("%s 찾고자 하는 학생이 없습니다.\n",search);
						System.out.println();
					}
					
					break;
			}
		}
	}

}