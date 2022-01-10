package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A'); // 문자 하나 출력
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf); // 문자 배열 출력
			fw.write("안뇽안뇽. 잘 써집니다."); // 문자열 출력
			fw.write(buf, 1, 2); // 문자 배열 buf의 2번째 글자부터 2개 출력
			fw.write("65"); // 숫자 그대로 출력
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
