import java.util.*;
public class C0723_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1;i<=9;i++) {
			for(int j=2	;j<=9;j++) {
				System.out.printf("%d x %d = %d\t",j,i,i*j);
			}
			System.out.println();
		}
		
		System.out.print("숫자 입력 1:");
		int input = scan.nextInt();
		System.out.print("숫자 입력 2:");
		int input2 = scan.nextInt();
		int temp = 0;
		if (input>input2) {
			temp = input;
			input = input2;
			input2 = temp;
		}
		for (int i = input;i<=input2;i++) {
			System.out.printf("[ %d 단 ] \n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
	}

}
