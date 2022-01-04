package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read()); // 한 바이트씩 읽음(아스키 코드 값에 해당하는 문자 출력)
			System.out.println(fis.read()); // 아스키 코드 값으로 출력
			System.out.println(fis.read());
			
		// IOException 은 FileNotFoundException 의 상위 예외 클래스 
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close(); // 열린 스트림은 finally 블록에서 닫음
				
			// 스트림이 생성되지 않았기 때문에 NullPointerException 발생 
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
