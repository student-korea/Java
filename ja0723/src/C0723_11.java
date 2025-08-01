import java.util.Scanner;

public class C0723_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String [] name = new String[2];
		int [] kor = new int[2];
		int [] eng = new int[2];
		int [] math = new int[2];
		int [] total = new int[2];
		double [] avg = new double[2];
		for(int i=0;i<5;i++) {
			System.out.print("name?");
			name[i] = scan.next();
			System.out.print("kor?");
			kor[i] = scan.nextInt();
			System.out.print("eng?");
			eng[i] = scan.nextInt();
			System.out.print("math?");
			math[i] = scan.nextInt();
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3;
		}
		System.out.print("입력이름 : ");
		for(int i=0;i<2;i++) {
			System.out.println(name[i]+" "+kor[i]+" "+eng[i]+" "+math[i]+" "+total[i]+" "+avg[i]);
		}
		
	}

}
