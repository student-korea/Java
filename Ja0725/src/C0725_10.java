import java.util.*;
public class C0725_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int choice = 0;
		int count = 0;
		String rename;
		loop:while(true) {
			System.out.println("[학생성적프로그램]");
			System.out.println("0.종료");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.print("번호를 입력하세요.>> ");
			choice = scan.nextInt();
			switch(choice) {
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			case 1:
				no[count]=count+1;
				System.out.printf("%d번 학생 이름 입력하세요.>> ",count+1);
				name[count] = scan.next();
				System.out.printf("%d번 학생 국어 입력하세요.>> ",count+1);
				score[count][0] = scan.nextInt();
				System.out.printf("%d번 학생 영어 입력하세요.>> ",count+1);
				score[count][1] = scan.nextInt();
				System.out.printf("%d번 학생 수학 입력하세요.>> ",count+1);
				score[count][2] = scan.nextInt();
				total[count] = score[count][0]+score[count][1]+score[count][2];
				avg[count] = total[count]/3.0;
				count++;
				break;
			case 2:
				System.out.println("----------------------[학생 성적]----------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균");
				for(int i = 0;i<count;i++) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\n",no[i],name[i],score[i][0],score[i][1],score[i][2],total[i],avg[i]);
				}
				break;
			case 3:
				System.out.print("수정할 학생 입력하세요.");
				rename = scan.next();
				for(int i=0;i<count;i++) {
					if(name[i].equals(rename)) {
						System.out.print("수정할 과목 입력하세요.(국어: 0 영어: 1 수학:2) : ");
						choice = scan.nextInt();
						switch(choice) {
							case 0:
								System.out.printf("%s 학생 국어 입력하세요.>> ",name[i]);
								score[i][0] = scan.nextInt();
								break;
							case 1:
								System.out.printf("%s 학생 영어 입력하세요.>> ",name[i]);
								score[i][1] = scan.nextInt();
								break;
							case 2:
								System.out.printf("%s 학생 수학 입력하세요.>> ",name[i]);
								score[i][2] = scan.nextInt();
								break;
						}total[i] = score[i][0]+score[i][1]+score[i][2];
						avg[i] = total[i]/3.0;
						break;
					}
				}
				
				break;
			}
			
		}
	}

}
