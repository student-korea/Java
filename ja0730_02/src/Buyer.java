
public class Buyer {
	String id;
	String pw;
	String BuyerName;
	String address;
	String tel;
	int money = 10000000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		money-=p.price;
		bonusPoint += p.bonusPoint;
	}
	
}


