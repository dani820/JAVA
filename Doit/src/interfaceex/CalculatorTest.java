package interfaceex;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// 구체적 클래스인 CompeleteCalc 클래스만 인스턴스를 생성할 수 있다.
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.square(num1));
		calc.showInfo();
		
		Calc calc1 = new CompleteCalc();
		Calc newCalc = calc1;
//		newCalc. // 메소드 소환시 Calc 에서 선언한 추상 메소드들은 있지만
		// CompleteCalc 에서 추가로 구현한 showInfo() 메소드는 없다.
		// 즉 Calc 형으로 선언한 변수에서 사용할 수 있는 메소드는
		// Calc 인터페이스에 선언한 메소드 뿐이다.
	}
}
