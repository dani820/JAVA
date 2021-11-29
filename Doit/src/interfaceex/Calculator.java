package interfaceex;

public abstract class Calculator implements Calc {
	// 추상 메소드 times(), divide() 구현하지 않았기 때문에
	// Calculator 클래스는 추상 클래스가 된다.

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

}
