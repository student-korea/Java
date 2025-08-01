import java.util.Scanner;

public class C0724_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		int[] lotto = new int[6];
		int[] num = new int[45];
		int rnum = 0;
		int temp = 0;
		
		for(int i=0;i<6;i++) {
			System.out.printf("%d number(1-45)",i+1);
			input[i]=scan.nextInt();
		}
		for(int i=0;i<45;i++) {
			num[i]=i+1;
		}
		
		for(int i=0;i<6;i++) {
			rnum = (int)(Math.random()*45);
			lotto[i] = num[rnum];
		}
		System.out.print("입력번호: ");
		for(int i=0;i<6;i++) {
			System.out.print(input[i] +" ");
		}
		System.out.println();
		System.out.print("로또번호: ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i] +" ");
		}
	}

}
