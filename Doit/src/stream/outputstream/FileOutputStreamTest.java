package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// append 디폴트 값은 false 이므로 한 번 더 실행하면 그대로 덮어씌워진다.
		// 이 때 true 로 값을 바꿔주면 기존 자료에 이어서 출력된다.
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			// write() 메소드에 따라 파일에 값을 출력하고(쓰고) 스트림을 닫는다.
			// 프로젝트를 새로고침하면 파일 확인이 가능하다.
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	} 

}
