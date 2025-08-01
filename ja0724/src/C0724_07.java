import java.util.*;
public class C0724_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		
		for(int i=0;i<3;i++) {
			System.out.printf("%d번 이름 : ",i+1);
			name[i] = scan.next();
			System.out.printf("%d번 국어 : ",i+1);
			score[i][0] = scan.nextInt();
			System.out.printf("%d번 수학 : ",i+1);
			score[i][1] = scan.nextInt();
			System.out.printf("%d번 영어 : ",i+1);
			score[i][2] = scan.nextInt();
			total[i]=score[i][0]+score[i][1]+score[i][2];
			avg[i]=total[i]/3;
		}
		System.out.println("");
		System.out.println("--------------------------------------------");
		for(int i=0;i<6;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println("");
		System.out.println("--------------------------------------------");
		for(int i=0;i<3;i++) {
			System.out.println(name[i]+"\t"+score[i][0]+"\t"+score[i][1]+"\t"+score[i][2]+"\t"+total[i]+"\t"+avg[i]);
		}
		
	}

}
