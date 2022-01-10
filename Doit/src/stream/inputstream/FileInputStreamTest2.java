package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("reader.txt")) {
			
			int i;
			// i 값이 -1(파일 끝)이 아닌 동안
			// read() 메소드로 한 바이트 반복해 읽기
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
