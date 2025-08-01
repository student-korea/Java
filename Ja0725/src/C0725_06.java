import java.util.Scanner;
public class C0725_06 {

	public static void main(String[] args) {
//		// 배열
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[45];
		int[] myNo = new int[6];
		int[] lotto = new int[6];
		int[] okNo = new int[6];
		int count=0;
		//배열 번호입력
		for(int i=0;i<45;i++) {
			arr[i] = i+1;
		}
		
		//랜덤섞기
		int temp = 0; //임시저장번호
		int rnum = 0; //랜덤번호
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
			
		}
		
		System.arraycopy(arr, 0, lotto, 0, 6);
		
		//배열 번호출력
		for(int i=0;i<6;i++) {
			System.out.printf("%d번 번호 입력 :",i+1);
			myNo[i]=scan.nextInt();
			if (myNo[i]>45 || myNo[i] <=0) i--;
		}
		
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<myNo.length;j++) {
				if(lotto[i]==myNo[j]) {
					okNo[count]=myNo[j];
					count++;
				}
			}
		}
		
		
		//배열 번호출력
//		for(int i=0;i<6;i++) {
//			System.out.print(arr[i]+" ");
//		}System.out.println();
		
		System.out.print("로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}System.out.println();
		System.out.print("입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(myNo[i]+" ");
		}System.out.println();
		System.out.print("맞춘번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(okNo[i]+" ");
		}System.out.println();
		System.out.print("맞춘개수 : "+count);
		
		
//		for(int i=0;i<45;i++) {
//			if(i==0) {
//				System.out.print(arr[i]+"\t");
//				continue;
//			}
//			else if(i%5==0) {
//				System.out.println();
//			}
//			System.out.print(arr[i]+"\t");
//		}
		
		
		
//		int rnum = (int)(Math.random()*45)+1;
		
		// 0*10<= x*10 < 1*10
		// (int)0 <= (int)(x*10) < (int)10
		// (int)0+1 <= (int)(x*10)+1 < (int)10+1
		// 1 <= (int)(x*10)+1 <= 10
		
//		int a = (int)(Math.random()*10)+1;		
//		int a_2 = (int)(Math.random()*100)+1;		
//		int a_3 = (int)(Math.random()*50)+1;		
//		int a_4 = (int)(Math.random()*50); //0-49
//		int a_5 = (int)(Math.random()*10); //0-9
//		int a_6 = (int)(Math.random()*45); //0-44
//		int a_7 = (int)(Math.random()*45)+1; //1-45
//		
//		System.out.println(a);
		
		// 45개 배열을 생성해서 1-45까지 숫자를 입력하시오.
//		int[] arr = new int[45];
//		for(int i=0;i<45;i++) {
//			arr[i] = i+1;
//		}
//		for(int i=0;i<45;i++) {
//			System.out.println(arr[i]);
//		}
		
		
//		int[] arr = new int[5]; //배열선언
//		arr[0] = 1; //배열값입력
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		
//		int[] arr = {1,2,3,4,5}; //배열선언 직접입력
//		int[] arr = new int[] {1,2,3,4,5};
//		
//		int[] arr = new int[5];
//		for(int i=0;i<5;i++) {
//			arr[i] = i+1;
//		}
//		
//		for(int i=0;i<5;i++) {
//			System.out.println(arr[i]);
//		}

	}

}