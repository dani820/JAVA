package exception;

public class AutoCloseObj implements AutoCloseable {

	// AutoCloseable 인터페이스는 반드시 close() 메소드를 구현해야 한다.
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다.");
	}
}
