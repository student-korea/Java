
public class C0724_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[25];
		
		for(int i=0;i<7;i++) {
			arr[i] = 1;
		}
		int rnum=0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			rnum = (int)(Math.random()*25);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" "); 
		}
	}

}
