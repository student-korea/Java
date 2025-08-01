import java.util.Scanner;

public class C0725_03 {

	public static void main(String[] args) {
		//콘솔창에서 입력받을때
		Scanner scanner = new Scanner(System.in);
		// nextInt(),nextLong(), nextByte(),nextShort()
		// nextDouble(), nextFloat()
		System.out.println("숫자를 입력하세요.");
		int a = scanner.nextInt();
		System.out.println("숫자 : "+a);
		
		
		
//		// 문자열 - nextLine():enter키까지 입력받음,next()-enter키 입력안받음
//		System.out.println("이름을 입력하세요.>> ");
//		String a = scanner.next();
//		scanner.nextLine();
//		System.out.println("아이디를 입력하세요>> ");
//		String b = scanner.nextLine();
//		System.out.println("이름 : "+a);
//		System.out.println("아이디 : "+b);
		
		
		
		
		// println, print, printf
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		String d = "홍길동";
//		double e = 1.12345678;
//		System.out.println("a : "+a+" b : "+b);
//		// %d :정수, %f:실수, %s:문자열, %c:문자
//		System.out.printf("이름 : %s a : %d b : %d \n",d,a,b);
//		
//		// .2 : 소수점 2자리까지 표시
//		System.out.printf("값 : %.2f \n",e);
//		
//		int h = 123;
//		System.out.printf("%5d \n",h);
//		System.out.printf("%05d \n",h);
		
		
		
//		System.out.println("a");  //자동enter키 입력
//		System.out.println("b");
//		System.out.println("c");
//		System.out.print("d \n"); //\n -> enter키 입력
//		System.out.print("e \t"); //\t -> tab키 입력
//		System.out.print("f");

	}

}