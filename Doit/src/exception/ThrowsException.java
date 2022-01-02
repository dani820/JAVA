package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	// throws 이용해 예외처리를 미룸
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생 가능
		// Class 를 동적으로 로딩하여 반환
		Class c = Class.forName(className); // ClassNotFoundException 발생 가능
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		// 메소드를 호출하여 사용하는 곳에서 예외 처리 해야 한다.
		// 1. Add throws declaration
		// main() 함수 선언 부분에 thorws FileNotFouncException, ClassNotFoundException 을 추가하고 예외처리를 미룬다는 뜻
		// main() 함수에서 미룬 예외 처리는 main() 함수를 호출하는 자바 가상 머신으로 보내진다.
		// 이는 즉 예외 처리를 하는 것이 아니라 대부분의 프로그램이 비정상 종료된다. 따라서 다른 두 옵션 중 하나를 선택하는 것이 좋다.
//		test.loadClass("a.txt", "java.lang.String");
		
		// 2. Surround with try/multi-catch : 여러 예외를 한 번에 처리하기
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// 여러 예외를 한 문장으로 처리 
			e.printStackTrace();
		}
		
		// 3. Surround with try/catch : 예외 상황마다 처리하기
		// 예외 상황 수만큼 catch 문이 생성된다.
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		// Exception 클래스로 그 외 예외 상황 처리
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
