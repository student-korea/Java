import java.util.Scanner;

public class C0721_09 {

	public static void main(String[] args) {
		// 두숫자를 입력받아 더한 값을 출력하시오.
		// 100+5 = 105
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.> ");
		int num = scan.nextInt();
		System.out.println("숫자2를 입력하세요.> ");
		int num2 = scan.nextInt();
		int result = num+num2;
		System.out.println("결과값 : "+result);

	}

}