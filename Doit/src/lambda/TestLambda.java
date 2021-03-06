package lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		// 람다식을 인터페이스형 변수에 대입하고 그 변수를 사용해 람다식 구현부 호출
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lamda_1");
		// 메소드의 매개변수로 람다식을 대입한 변수 전달
		showMyString(lambdaStr);
		
		PrintString reStr = returnString(); // 변수로 반환받기
		reStr.showString("hello "); // 메소드 호출
	}
	
	// 정적 메소드 showMyString()
	// 매개변수를 인터페이스형으로 받음
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}

	// 람다식 반환 메소드
	public static PrintString returnString() {
		PrintString str = s -> System.out.println(s + "world");
		return str;
	}
}
