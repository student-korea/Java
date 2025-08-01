
public class C0724_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[45];
		
		for(int i=0;i<45;i++) {
			num[i]=i+1;
		}
		int rnum =0;
		int temp =0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45)+1;
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		System.out.print("로또 번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
