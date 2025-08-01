import java.util.Scanner;
public class C0723_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] s= new int[100];
		for(int i=1;i<=5;i++) {
			System.out.print("숫자를 입력하세요");
			int input = scan.nextInt();
			s[i-1]=input;
		}for(int i=1;i<=5;i++) {
			System.out.print(s[i-1]+" ");
		}
	}

}
