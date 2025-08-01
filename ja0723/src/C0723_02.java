import java.util.Scanner;
public class C0723_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월을 입력하세요.>> ");
		int input = scan.nextInt();
		
		if(3<= input && input<= 5) {
			System.out.println("봄");
		}else if(6<= input && input <=8) {
			System.out.println("여름");
		}else if(9<= input && input <=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		switch(input) {
			case 1: case 2: case 12:
				System.out.println("겨울");
				break;
			case 3: case 4: case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				break;
			case 9: case 10: case 11:
				System.out.println("가을");
				break;
			
			default:
				break;
		}
		System.out.println("입력 : "+input);
		
		System.out.println("점수를 입력하세요.>> ");
		int score = scan.nextInt();

		String result = "";
		if(score>=90) {
			result = "A";
			if(score>=97) {
				result += "+";
			}else if(score<=93){
				result += "-";
			}
		}else if(score>=80) {
			result = "B";
			if(score>=87) {
				result += "+";
			}else if(score<=83){
				result += "-";
			}
		}else if(score>=70) {
			result = "C";
			if(score>=77) {
				result += "+";
			}else if(score<=73){
				result += "-";
			}
		}else if(score>=60) {
			result = "D";
			if(score>=67) {
				result += "+";
			}else if(score<=63){
				result += "-";
			}
		}else {
			result = "F";
		}
		
		System.out.println("결과 : "+result);
	}

}
