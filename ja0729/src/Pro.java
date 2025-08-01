
public class Pro {
	static int count = 0;
	int serialNo = 0;
	String produceName;
	{
		this.serialNo = ++count;
	}
	Pro(){}
	Pro(String produceName){
		this.produceName = produceName;
	}
}
