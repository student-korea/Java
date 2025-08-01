
public class C03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		Ambulance ab = new Ambulance();
		Ambulance ab2 = null;
		Car car2 = new Car();
		
		fe.water();
		car = fe;
		fe2 = (FireEngine)car;
		fe2.water();
		
		fe2 = (FireEngine)car2;
		fe2.water();
		
		car = ab;
		if(car instanceof Ambulance) {
			System.out.println("Ambulance change");
		}
		if(car instanceof FireEngine) {
			System.out.println("FireEngine change");
		}
		else {
			System.out.println("FireEngine no change");
		}
		
//		if(ab instanceof Ambulance) {
//			System.out.println("Ambulance");
//		}
//		if(ab instanceof Car) {
//			System.out.println("Car Ambulance");
//		}
//		if(ab instanceof Object) {
//			System.out.println("Object Ambulance");
//		}
		fe2 = (FireEngine)car;
		
	}
}
