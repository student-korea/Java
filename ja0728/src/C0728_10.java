import java.util.Scanner;

public class C0728_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal2 c1 = new Cal2();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("[사칙연산 계산기]");
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. X");
		System.out.println("4. /");
		int choice = scan.nextInt();
		int result = 0;
		switch(choice) {
			case 1:
				c1.add(a,b,c);
				break;
			case 2:
				c1.sub(a,b,c);
				break;
			case 3:
				c1.mul(a, b,c);
				break;
			case 4:
				c1.div(a, b,c);
				break;

		}
	}

}
