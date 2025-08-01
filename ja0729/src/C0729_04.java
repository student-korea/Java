
public class C0729_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();
		d1.value = 50;
		Data2 d2 = new Data2(5,7);
	}

}

class Data1{
	Data1(){}
	int value;
}
class Data2{
	int value;
	Data2(int x,int y){
		value = x;
	}
}