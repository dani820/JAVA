package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		long millisecond = 0;
		// FileInputStream 은 바이트 단위로 자료를 읽는 스트림
		try(FileInputStream fis = new FileInputStream("a.zip"); 
			FileOutputStream fos = new FileOutputStream("copy.zip")) {
			millisecond = System.currentTimeMillis(); // 파일 복사 시작하기 전 시간 
			int i;
			// 파일을 한 바이트씩 읽어서 변수 i 에 저장 
			while((i = fis.read()) != -1) {
				// 읽은 값을 다시 FileOutputStream 을 통해 저장 
				fos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond; // 파일 복사하는 데 걸리는 시간 계산
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데" + millisecond + " milliseconds 소요되었습니다.");
	}

}
