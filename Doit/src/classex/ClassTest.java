package classex;

public class ClassTest {
	// forName() 메소드에서 발생하는 예외를 처리. 이름과 일치하는 클래스 없을 경우 ClassNotFoundException 발생
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass(); // object 클래스의 getClass() 메소드 사용
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class; // class 파일 이름을 Class 변수에 직접 대입
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person"); // Class.forName("패키지명.클래스명") 메소드 사용 (!매개변수는 문자열. 해당 메소드 예외처리 필수)
		System.out.println(pClass3.getName());
	}
}
