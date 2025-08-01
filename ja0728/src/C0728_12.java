
public class C0728_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		
		C0728_12.change(d);
		System.out.println("d.x : "+d.x);
	}

	static void change(Data d) {
		d.x = 1000;
		System.out.println("d.x : "+d.x);
	}
}


class Data{
	int x;
}
