package exception;

public class PasswordExceptionTest {

	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호는 null 일 수 없습니다.");
		}else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자를 포함해야 합니다.");
		}else if(password.length() <= 5) {
			throw new PasswordException("비밀번호는 6자 이상이어야 합니다.");
		}
		
		this.password = password;
	}
	
	public static void main(String[] args) {
		PasswordExceptionTest pTest = new PasswordExceptionTest();
		
		String pass1 = null;
		
		try {
			pTest.setPassword(pass1);
			System.out.println("성공");
		}catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		String pass2 = "asdfsdf";
		
		try {
			pTest.setPassword(pass2);
			System.out.println("성공");
		}catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		String pass3 = "asdf342";
		try {
			pTest.setPassword(pass3);
			System.out.println("성공");
		}catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		String pass4 = "df234";
		
		try {
			pTest.setPassword(pass4);
			System.out.println("성공");
		}catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}
