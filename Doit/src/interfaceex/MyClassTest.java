package interfaceex;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		// 상위 클래스인 X 형으로 대입하면
		// X 클래스에 존재하는 메소드만 호출 가능
		X xClass = mClass;
		xClass.x();
		
		// 상위 클래스인 Y 형으로 대입하면
		// Y 클래스에 존재하는 메소드만 호출 가능
		Y yClass = mClass;
		yClass.y();
		
		// 구현한 인터페이스형으로 대입하면
		// 인터페이스가 상속한 모든 메소드 호출 가능
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}
}
