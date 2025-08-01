import java.util.Scanner;

public class C0729_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor,eng,math,count,n= 0;
		Stuscore[] s = new Stuscore[10]; 
		loop:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.printf("%d.name?",n+1);
				name=scan.next();
				System.out.printf("%s.kor?",name);
				kor=scan.nextInt();
				System.out.printf("%s.eng?",name);
				eng=scan.nextInt();
				System.out.printf("%s.math?",name);
				math=scan.nextInt();
				
				s[n] = new Stuscore(name,kor,eng,math);
				n++;
				System.out.println("성공했습니다.");
				break;
			case 2:
				System.out.println("\t이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("-------------------------------------------------------");
				for(int i=0;i<n;i++) {
					
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n",
						s[i].n,s[i].name,s[i].kor,s[i].eng,
						s[i].math,s[i].total,s[i].avg);
				}
				break;
			}
		}
	}

}
