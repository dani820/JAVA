package inputstream;

import java.io.IOException;

public class SystemInTest1 {
	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			// 입력한 값이 변수 i 에 들어간다.
			// i 는 4바이트지만 System.in 은 바이트 단위로 읽어 들이는 InputStream 이므로 1바이트만 읽는다.
			i = System.in.read(); // read() 메소드로 한 바이트 읽기
			System.out.println(i); // 아스키코드 값으로 출력됨
			System.out.println((char)i); // 문자 변환하여 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
