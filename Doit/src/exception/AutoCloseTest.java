package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// try문 괄호 안에 사용할 리소스를 선언한다.
		// 사용할 리소스가 여러개라면 세미 콜론으로 구분한다.
		try(AutoCloseObj obj = new AutoCloseObj()) {
			
		}catch (Exception e) {
			System.out.println("예외부분입니다.");
		}
	}

}
