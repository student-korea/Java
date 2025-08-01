import java.util.*;
public class C0724_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		
		for(int i=0;i<5;i++) {
			System.out.print("점수를 입력하세요.");
			name[i] = scan.next();
			kor[i]=scan.nextInt();
			eng[i]=scan.nextInt();
			math[i]=scan.nextInt();
			total[i]=kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3;
		}
		for(int i=0;i<5;i++) {
			System.out.println(name[i]+" "+kor[i]+" "+eng[i]+" "+math[i]+" "+total[i]+" "+avg[i]);
		}
	}	
}
