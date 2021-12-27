package lambda;

// 애노테이션은 반드시 써야하는 것은 아니다.
// 다만 함수형 인터페이스임을 명시적으로 표현할 수 있으므로
// 오류를 방지할 수 있다.
//@FunctionalInterface
public interface MyNumber {
	int getMax(int num1, int num2); // 추상 메소드 선언
}
