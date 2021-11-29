package interfaceex;

public interface Calc {
	// interface 에서는 public abstract 예약어를 명시적으로 쓰지 않아도
	// 컴파일 과정에서 모든 메소드는 자동으로 추상 메소드로 변환된다.
	// 변수도 마찬가지로 public static final 예약어를 쓰지 않아도 자동으로 상수로 변환된다.
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	
	// 디폴트 메소드
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	// 정적 메소드
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		
		return total;
	}
}
