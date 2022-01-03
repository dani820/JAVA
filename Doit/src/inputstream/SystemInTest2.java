package inputstream;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			// while 문에서 read() 메소드로 한 바이트를 반복해 읽기
			while((i = System.in.read()) != '\n')	
			System.out.println((char)i); // 문자 변환하여 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
