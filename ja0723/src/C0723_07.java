import java.util.*;
public class C0723_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int i = 1;
		int j = 1;
		
		System.out.print("숫자를 입력하세요");
		int input = scan.nextInt();
		System.out.print("1) 홀수 2) 짝수 3) 모두");
		int input2 = scan.nextInt();
		
		while(input2<=input) {
			if (input2==3) {
				while(input2<=input) {
					System.out.println(input2);
					input2++;
				}break;
			}
			System.out.println(input2);
			input2=input2+2;
			if (input2==3) {
				System.out.println(input2);
				input2=input2+2;
			}
		}
		
//		System.out.print("숫자를 입력하세요");
//		int input = scan.nextInt();
//		
//		while(i<=input) {
//			System.out.println(i);
//			i++;
//		}
		
//		i=1;
//		double rnum = (int)(Math.random()*100)+1;		
//		System.out.println("[ 랜덤 숫자 맞추기 ]");
//		while (i<=10) {
//			System.out.printf("%d. 1-100까지의 숫자를 맞추기",i);
//			i++;
//			input = scan.nextInt();
//			if (rnum-input==0) {
//				break;
//			} else {
//				if (rnum-input>0) {
//					System.out.printf("큼 입력 값 : %d\n",input);
//				} else {
//					System.out.printf("작음 입력 값 : %d\n",input);
//				}
//			}
//		}
//		System.out.println("정답 :"+rnum);
//		i=2;
//		while(i<=9) {
//			System.out.printf("[ %d 단 ] \n",i);
//			while(j<=9) {
//				System.out.printf("%d x %d = %d\n",i,j,i*j);
//				j++;
//			}
//			j=1;
//			i++;
//		}
//		
//		
//		i=0;
//		while(sum<=500) {
//			sum += i;
//			i=i+1;
//		}
//		System.out.printf("%d까지의 합 : %d\n",i,sum);
	}

}
