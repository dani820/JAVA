package exception;

public class IDFormatException extends Exception {
	// 생성자의 매개변수로 예외 상황 메세지 받기 
	public IDFormatException(String message) {
		super(message);
	}
}
