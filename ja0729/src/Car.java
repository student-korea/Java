
public class Car {
	String color;
	String gearType;
	int door;
	int door_size;
	
	Car(){
//		color = "white";
//		gearType = "auto";
//		door = 5;
		this("white","auto",5); // this() : 다른생성자를 지정
		door = 5;
	} //기본생성자 - 자동생성
	
	Car(String color,String gearType,int door){
		// 인스턴스변수 지정
		this.color = color;  // this : 인스턴스변수
		this.gearType = gearType;
		this.door = door;
	}
	
	// 객체를 매개변수로 받음
	Car(Car c){
		//다른생성자 호출
		this(c.color,c.gearType,c.door);
//		color = c.color;
//		gearType = c.gearType;
//		door = c.door;
		
		
	}

}