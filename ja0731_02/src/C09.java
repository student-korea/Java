import java.util.*;
import java.io.*;
public class C09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("파일 생성할 이름을 입력하세요");
		String fileName = scan.next();
		System.out.println("c:/down/"+fileName);
		
		File f = new File("c:/down/"+fileName);
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}System.out.println("파일 생성");
		}else {
			System.out.println("파일 존재");
		}
	}

}
