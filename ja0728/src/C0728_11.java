import java.util.Arrays;
import java.util.Scanner;

public class C0728_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("[사칙연산 계산기]");
		System.out.println("1. 숫자맞추기");
		System.out.println("2. 로또 맞추기");
		System.out.println("3. 구구단");
		System.out.println("원하는 번호를 입력하세요.>>");
		int choice = scan.nextInt();
		Process p= new Process();
		switch(choice) {
		case 1:
			p.number();
			break;
		case 2:
			int[] myNo = new int[6];
			int[] lotto = new int[6];
			int[] okNo = new int[6];
			int count = 0;
			
			count = p.lotto(count,myNo,lotto,okNo);
			
			System.out.println("입력번호 : " + Arrays.toString(myNo));
			System.out.println("로또번호 : " + Arrays.toString(lotto));
			System.out.print("맞춘번호 : ");
			for(int i=0;i<count;i++) {				
				System.out.print(okNo[i]+" ");
			}System.out.println();
			System.out.println("맞춘개수 : "+count);
			break;
		case 3:
			p.gugudan();
			break;
		case 4:
			// 10,5 더하기,빼기,곱하기,나누기의 값을 출력
			double[] result = {0,0,0,0};
			int a = 10;
			int b = 5;
			p.resultProcess(a, b,result);
			System.out.println(Arrays.toString(result));
			
			break;
		}
	}

}
