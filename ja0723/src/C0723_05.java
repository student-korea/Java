import java.util.*;
public class C0723_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		for (i = 0;i<=100;i++) {
			sum += i;
			if (sum>=500) {
				sum = sum -i;
				i = i-1;
				break;
			}
		}
		System.out.printf("%d까지의 합 : %d\n",i,sum);
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 1:");
		int input = scan.nextInt();
		System.out.print("숫자 입력 2:");
		int input2 = scan.nextInt();
		int temp = 0;
		sum = 0;
		if (input>input2) {
			temp = input;
			input = input2;
			input2 = temp;
		}
		for (i = input;i<=input2;i++) {
			sum += i;
		}
		System.out.printf("%d 와 %d 사이의 합 : %d",input,input2,sum);
	}

}
