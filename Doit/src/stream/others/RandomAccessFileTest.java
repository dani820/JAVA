package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// 파일 모드를 반드시 설정해주어야 한다("rw")
		// 읽기 전용일 때 "r", 읽고 쓰는 것이 가능하게 할 때 "rw"를 문자열 값으로 넘겨준다.
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100); // int 4바이트 
		// getFilePointer() 는 파일포인터 위치를 반환하는 메소드
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		rf.writeDouble(3.14); // double 8바이트 
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		rf.writeUTF("안녕하세요"); // 수정된 UTF-8 사용 한글 3바이트 * 5 + null 문자 2바이트 = 17
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		// 파일 포인터 위치를 맨 처음으로 옮기고 위치를 출력
		rf.seek(0);
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());

		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		// 읽기가 끝난 후 파일 포인터 위치를 출력
		System.out.println("파일 포인터 위치 : " + rf.getFilePointer());
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
