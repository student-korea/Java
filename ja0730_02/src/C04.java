
public class C04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		b.id = "aaa";
		b.pw = "1111";
		b.BuyerName = "Eric";
		
		b.buy(new Tv());
		System.out.println("현재 잔액 : "+b.money);
		System.out.println("현재 보너스 : "+b.bonusPoint);
		
		b.buy(new Audio());
		System.out.println("현재 잔액 : "+b.money);
		System.out.println("현재 보너스 : "+b.bonusPoint);
		
		b.buy(new Computer());
		System.out.println("현재 잔액 : "+b.money);
		System.out.println("현재 보너스 : "+b.bonusPoint);
	}	
}
