package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// FileNotFoundException
		// a.txt 파일이 존재하지 않는 오류가 발생할 수 있기 때문에 예외 처리 해줘야 함
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) { // e 는 다른 이름으로 바꿔 사용해도 된다.
			System.out.println(e); // 예외 클래스의 toString() 메소드 호출
		}
		
		System.out.println("여기도 수행된다.");
	}

}
