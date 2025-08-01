
public class C0728_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Card c = new Card();
//		c.kind = "spade";
//		c.number = 1;
//		Card c2 =new Card();
//		c2.kind = "spade";
//		c2.number = 2;
//		Card c3 =new Card();
//		c3.kind = "spade";
//		c3.number = 3;
		Card[][] card = new Card[4][13];
		String[] shape = {"spade","daimond","heart","clover"};
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				card[i][j] = new Card();
				card[i][j].kind = shape[i];
				card[i][j].number = j+1;
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				System.out.println(card[i][j].kind+" "+card[i][j].number);
			}
		}
	}

}
