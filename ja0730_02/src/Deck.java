
public class Deck {
	Card[] c = new Card[52];
	String[] shape = {
			"\u001B[30m♠\u001B[0m",
			"\u001B[31m♦\u001B[0m",
			"\u001B[31m♥\u001B[0m", 
	        "\u001B[30m♣\u001B[0m"
	    };
	
	Deck(){
		for(int i=0;i<52;i++) {
			c[i] = new Card(i%13+1,shape[i/13]);
		}
	}
	
	void shuffle() {
		Card temp = null;
		int rnum = 0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;
		}
	}
	
	Card pick(int index){
		return c[index];
	}
	
	Card pick() {
		int index = (int)(Math.random()*52);
		return c[index];
	}
	
	public Card[] pick_5() {
		Card[] c_5 = new Card[5];
		for(int i=0;i<c_5.length;i++) {
			c_5[i] = c[i];
		} return c_5;
	}
	
	public void card_print() {
		for(int i=0;i<52;i++) {
			System.out.println(c[i]);
		}
	}
}
