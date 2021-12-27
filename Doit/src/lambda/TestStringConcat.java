package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		// 1-1.
		// StringConcat 인터페이스를 구현한 StringConcatImpl 클래스를 인스턴스로 생성 
		StringConcatImpl concat1 = new StringConcatImpl();
		
		// 참조변수 concat1 을 사용해 makeString() 메소드 호출
		concat1.makeString(s1, s2);
		
		
		// 1-2.
		// 람다식으로 인터페이스 구현
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
	}

}
