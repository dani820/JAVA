package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		int i = 100; // main 함수의 지역 변수
		// 1-1.
		// StringConcat 인터페이스를 구현한 StringConcatImpl 클래스를 인스턴스로 생성 
		StringConcatImpl concat1 = new StringConcatImpl();
		
		// 참조변수 concat1 을 사용해 makeString() 메소드 호출
		concat1.makeString(s1, s2);
		
		
		// 1-2.
		// 람다식으로 인터페이스 구현
		StringConcat concat2 = (s, v) -> {
//			i = 200;
			System.out.println(s + "," + v);
			System.out.println(i);
		};
		concat2.makeString(s1, s2);
		
		// 위와 같이 구현했을 때 아래와 같이 익명 클래스가 생성되고 이를 통해 익명 객체가 생성되는 것
		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			}
		};
	}

}
