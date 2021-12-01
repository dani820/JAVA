package interfaceex;

public class MyClass implements MyInterface {

	@Override // X 인터페이스로부터 상속 받아 구현
	public void x() {
		System.out.println("x()");
	}

	@Override // Y 인터페이스로부터 상속 받아 구현
	public void y() {
		System.out.println("y()");
	}

	@Override // MyClass 인터페이스 구현
	public void myMethod() {
		System.out.println("myMethod()");
	}

}
