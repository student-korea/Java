import java.util.Scanner;

public class C0729_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Product[] p = new Product[10];
		int no =1;
		
		while(true) {
			System.out.println("[스마트폰 생산]");
			System.out.println("1. 수동생산");
			System.out.println("2. 자동생산");
			System.out.println("원하는 번호를 입력");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				p[no]=new Product();
				p[no].serialNo = no+1;
				p[no].pName = "스마트폰";
				System.out.printf("생산이 완료되었습니다.");
				System.out.printf("생산 정보 : %d,%s \n",p[no].serialNo,p[no].pName);
				no++;
				break;
			case 2:
				p[no] = new Product(no+1,"스마트폰");
				break;
			}
		}
		
	}

}
