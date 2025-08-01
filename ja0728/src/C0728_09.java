import java.util.Scanner;

public class C0728_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c = new Cal();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("1. +");
		c.add(a, b);
		System.out.println("2. -");
		c.sub(a, b);
		System.out.println("3. X");
		c.mul(a, b);
		System.out.println("4. /");
		c.div(a, b);
	}

}
