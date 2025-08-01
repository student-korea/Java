
public class Cal2 {
	void add(int a,int b,int c) {
		int result = a+b+c;
		System.out.printf("%d+%d+%d = %d",a,b,c,result);
	}
	void sub(int a,int b,int c) {
		int result = a-b-c;
		System.out.printf("%d-%d-%d = %d",a,b,c,result);

	}
	void mul(int a,int b,int c) {
		int result = a*b*c;
		System.out.printf("%dX%dX%d = %d",a,b,c,result);

	}
	void div(int a,int b,int c) {
		double result = a/b/c;
		System.out.printf("%d/%d/%d = %f",a,b,c,result);
	}
}
