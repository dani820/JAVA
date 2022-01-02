package exception;

public class AutoCloseObjTest {

	public static void main(String[] args) {
		try (AutoCloseObj obj = new AutoCloseObj()) {
			// 강제 예외 발생
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}

}
