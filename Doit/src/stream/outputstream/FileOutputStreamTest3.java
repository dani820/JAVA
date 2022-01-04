package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		try(FileOutputStream fos = new FileOutputStream("output3.txt", true)) {
			byte[] bs = new byte[26];
			byte data = 65; // 'A'의 아스키 값
			
			// A 부터 Z 까지 배열에 넣기
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10); // 배열 3번째 위치부터 10개 바이트 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	} 

}
