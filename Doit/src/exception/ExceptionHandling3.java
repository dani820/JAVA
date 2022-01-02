package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		}catch (FileNotFoundException e) {
			System.out.println("Exception Message : " + e);
			// 강제 return 수행 시 finally 블록 수행
			// return 수행하지 않을 경우 "여기도~" 출력문도 출력된다.
			return;
		}finally {
			if(fis != null) {
				try {
					// close 문장에서도 예외가 발생할 수 있기 때문에 예외 처리 해야 한다.
					fis.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행됩니다.");
		}
		System.out.println("여기도 수행됩니다.");
	}

}
