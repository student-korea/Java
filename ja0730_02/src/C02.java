
public class C02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck d = new Deck();
		
		d.card_print();
		
		// 카드섞기
		d.shuffle();
		// 전체출력
		System.out.println("[전체출력]");
		System.out.println("------------");
		d.card_print();
		// 카드 5장을 출력하시오.
		Card[] c = d.pick_5();
		System.out.println("------------");
		System.out.println("[5장출력]");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		// 31번째 카드를 출력하시오.
		Card c1 = d.pick(30);
		System.out.println("------------");
		System.out.println("[31번째 출력]");
		System.out.println(c1);
		
		// 랜덤으로 카드 한장을 출력하시오.
		Card c2 = d.pick();
		System.out.println("------------");
		System.out.println("[랜덤 출력]");
		System.out.println(c2);
	}

}
