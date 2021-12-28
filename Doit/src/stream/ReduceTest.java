package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// BinaryOperator 를 구현한 클래스 정의
class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) { // reduce() 메소드가 호출될 때 불리는 메소드
		if(s1.getBytes().length >= s2.getBytes().length) return s1; // 두 문자열 길이 비교
		else return s2;
	}
}

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = {"안녕하세요", "hello", "Good morning", "반갑습니다~!"};
		// reduce() 메소드 내에 람다식 직접 구현
		// 요소 개수만큼 반복해서 호출되고 결과적으로 가장 긴 문자열을 반환
		// 람다식 구현 부분도 익명 클래스의 인스턴스가 생성되는 것이므로 BinaryOperator와 내부적으로 동일한 구조
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;}));
		
		// BinaryOperator를 구현한 클래스 사용
		// reduce 메소드에 해당 클래스로 생성한 인스턴스를 매개변수로 전달하면
		// apply() 메소드가 자동으로 호출된다.
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}
}
