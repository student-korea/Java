
public class Cal {
	void powProcess(double input,int n,
			double[] number) {
		//반올림
		number[0] = Math.round(input * Math.pow(10, n))/Math.pow(10, n);
		//올림
		number[1] = Math.ceil(input * Math.pow(10, n))/Math.pow(10, n);
		//버림
		number[2] = Math.floor(input * Math.pow(10, n))/Math.pow(10, n);

	}
	
	void add(int a,int b) {
		System.out.printf("%d+%d = %d",a,b,a+b);
	}
	void sub(int a,int b) {
		System.out.printf("%d-%d = %d",a,b,a-b);

	}
	void mul(int a,int b) {
		System.out.printf("%dX%d = %d",a,b, a*b);

	}
	void div(int a,int b) {
		System.out.printf("%d/%d = %f",a,b,a/b);
	}
}
