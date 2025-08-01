
public class C0728_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stuscore[] s = new Stuscore[3];
		s[0] = new Stuscore();
		s[0].name = "홍길동";
		s[0].kor = 100;
		s[0].eng = 100;
		s[0].math = 100;
		s[1] = new Stuscore();
		s[1].name = "유관순";
		s[1].kor = 90;
		s[1].eng = 90;
		s[1].math = 90;
		s[2] = new Stuscore();
		s[2].name = "이순신";
		s[2].kor = 80;
		s[2].eng = 80;
		s[2].math = 80;
		for(int i=0;i<3;i++) {
			s[i].stuTotal();
			s[i].stuAvg();
			System.out.printf("%s %d %d %d %d %.1f \n",s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
		}
	}

}
