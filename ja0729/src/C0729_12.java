import java.util.Scanner;

public class C0729_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Pro[] p = new Pro[10];
		
		for(int i=0;i<10;i++) {
			p[i] = new Pro("스마트폰");
		}
		for(int i=0;i<10;i++) {
			System.out.printf("%d\t%s \n",p[i].serialNo,p[i].produceName);
		}
	}

}
