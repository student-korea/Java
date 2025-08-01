
public class C0728_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stuscore s1 = new Stuscore();
		Stuscore s2 = new Stuscore();
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 100;
		s1.total = s1.kor+s1.eng+s1.math;
		System.out.printf("%s,%d,%d,%d,%d \n",s1.name,s1.kor,s1.eng,s1.math,s1.total);
		s2.name = "홍길동";
		s2.kor = 100;
		s2.eng = 100;
		s2.math = 100;
		s2.total = s2.kor+s2.eng+s2.math;
		System.out.printf("%s,%d,%d,%d,%d \n",s2.name,s2.kor,s2.eng,s2.math,s2.total);
	}

}
