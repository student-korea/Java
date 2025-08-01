import java.util.Scanner;

public class C0723_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String [] name = new String[5];
		int [] kor = new int[5];
		int [] eng = new int[5];
		int [] math = new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("name?");
			name[0] = scan.next();
			System.out.print("kor?");
			kor[0] = scan.nextInt();
			System.out.print("eng?");
			eng[0] = scan.nextInt();
			System.out.print("math?");
			math[0] = scan.nextInt();
		}
		System.out.print("입력이름 : ");
		for(int i=0;i<5;i++) {
			System.out.print(name[i]+" ");
		}
		System.out.print("국어점수 : ");
		for(int i=0;i<5;i++) {
			System.out.print(name[i]+" ");
		}
		System.out.print("영어점수 : ");
		for(int i=0;i<5;i++) {
			System.out.print(name[i]+" ");
		}
		System.out.print("입력이름 : ");
		for(int i=0;i<5;i++) {
			System.out.print(name[i]+" ");
		}
	}

}
