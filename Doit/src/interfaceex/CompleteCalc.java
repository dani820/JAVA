package interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) 
			return num1 / num2;
		else
			return Calc.ERROR;
		
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였음.");
	}

	@Override
	public int square(int num) {
		return num * num;
	}

	@Override
	public void description() {
		super.description(); // 인터페이스에 선언한 메소드
		// 위 코드를 사용하지 않을거라면 지우고 새 코드 작성하기
		// CompleteCalc 클래스로 인스턴스를 생성하여 호출하면 재정의된 메소드가 호출된다.
	}
	
	

}
