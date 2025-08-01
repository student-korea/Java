
public class C0725_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[25];
		
		for(int i=0;i<25;i++) {
			arr[i]=i+1;
		}
		
		int temp=0;
		int rnum=0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*25);
			temp=arr[0];
			arr[0] = arr[rnum];
			arr[rnum]=temp;
		}
		
		for(int i=0;i<25;i++) {
			if(i%5==0 && i!=0) {System.out.println();}
			System.out.print(arr[i]+"\t");
		}
	}

}
