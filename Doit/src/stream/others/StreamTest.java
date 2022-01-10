package stream.others;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamTest {

	public static void main(String[] args) {
		
//		try(FileOutputStream fos = new FileOutputStream("a.txt");
//			OutputStreamWriter osw = new OutputStreamWriter(fos)) {
		
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"))) {
			
			osw.write("두잇 자바 끝 ^^^^");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("a.txt 파일 열어보세요");
	}

}
