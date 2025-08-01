
public class C0724_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[25];
		int[][] arr = new int[5][5];
		
		for(int i=0;i<25;i++) {
			num[i]=i+1;
		}
		
		int rnum = 0;
		int temp = 0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*25);
			temp=num[0];
			num[0]=num[rnum];
			num[rnum]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = num[5*i+j];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"\t");
			}System.out.println();
		}
	}

}
