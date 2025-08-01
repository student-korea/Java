
public class Card {
	private int number;
	private String kind;
	
	private String[] n_num = {
			"","A","2","3","4","5","6","7","8","9","10","J","Q","K"	
		};
	
	Card(){}
	Card(int number,String kind){
		this.number= number;
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return String.format("[%s,%s]", kind,n_num[number]);
	}

}