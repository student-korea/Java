import java.util.*;

public class Buyer {
	String id;
	String pw;
	String name;
	String BuyerName;
	String address;
	String tel;
	int money = 10000000;
//	Product[] cart = new Product[10];
	ArrayList list = new ArrayList();
	int bonusPoint = 0;

	
	Buyer(){}
	Buyer(String id,String name,int money,int bonusPoint){
		this.id=id;
		this.name = name;
		this.money=money;
		this.bonusPoint=bonusPoint;
	}
	
	void buy(Product p) {
		money-=p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
	}
	
}