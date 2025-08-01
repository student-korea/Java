import java.util.Scanner;

public class Process {
	Scanner scan = new Scanner(System.in);
	void number() {
		int rnum = (int)(Math.random()*100)+1;
		for(int i =0;i<10;i++) {
			System.out.println("번호를 입력하세요.>>");
			int num = scan.nextInt();
			if (rnum == num) {
				System.out.printf("정답입니다. 번호:%d \n",rnum);
				break;
			} else if (i==9) {
				System.out.printf("틀렸습니다입니다. 번호:%d \n",rnum);
				break;
			} else {System.out.println("땡");}
		}
	}
	void gugudan() {
		System.out.println("번호를 입력하세요.>>");
		int number = scan.nextInt();
		System.out.println("--------------[구구단]------------");
		for(int i=1;i<10;i++) {
			System.out.printf("%d X %d = %d \n",number,i,number*i);
		}
	}
	void resultProcess(int a,int b,double[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
	}
	int lotto(int count,int[] myNo, int[] lotto,int[] okNo) {
		for(int i=0;i<6;i++) {
			System.out.print("입력번호 : ");
			myNo[i] = scan.nextInt();
		}
		boolean dupli;
		for(int i=0;i<6;i++) {
			do {
		        lotto[i] = (int)(Math.random() * 45) + 1;
		        dupli = false;
		        // 이미 뽑은 번호들 중에서 중복이 있는지 확인
		        for (int j = 0; j < i; j++) {
		            if (lotto[i] == lotto[j]) {
		            	dupli = true;
		                break; // 중복되면 다시 번호를 뽑기 위해 do-while문으로 돌아갑니다.
		            }
		        }
		    } while (dupli); 
		}
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==myNo[j]) {
					okNo[count]=lotto[i];
					count++;
					break;
				}
			}
		}
		return count;
	}
}	
