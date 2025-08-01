import java.util.Scanner;
public class C0725_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] num = new String[45];
		String[][] arr = new String[9][5];
		
		for(int i=0;i<45;i++) {
			num[i]=i+1+"";
		}
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=num[5*i+j];
			}
		}
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
		System.out.println("--------------------------------------------");
		String temp = "";
		int rnum=0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=num[5*i+j];
			}
		}
		String choice;;
		while(true) {
			System.out.println("--------------------------------------------");
			for(int i=0;i<9;i++) {
				for(int j=0;j<5;j++) {
					System.out.print(arr[i][j]+"\t");
				}System.out.println();
			}System.out.print("번호 입격");
			choice = scan.next();
			loop:for(int i=0;i<9;i++) {
				for(int j=0;j<5;j++) {
					if(arr[i][j].equals(choice)) {
						arr[i][j]="X";
						break loop;
					}
				}
			} 
			
		}
		
	}

}
