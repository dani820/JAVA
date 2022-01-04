package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input2.txt")) {
			
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) {
				// 1. U ~ Y 출력 후 남은 공간에 기존 배열 자료인 QRST 가 같이 출력됨 
//				for(byte b : bs) {
//					System.out.print((char)b);
//				}
				
				// 2. i 개수만큼 출력 
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
