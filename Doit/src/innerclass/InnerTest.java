package innerclass;

class OutClass { // 외부 클래스 
	private int num = 10; // 외부 클래스 private 변수
	private static int sNum = 20; // 외부 클래스 정적 변수 
	
	// 내부 클래스 자료형 변수 선언 
	private InClass inClass;
	
	// 외부 클래스가 생성된 후에 내부 클래스 생성 가능하므로
	// 외부 클래스의 디폴트 생성자에서 내부 클래스 생성
	public OutClass() {
		inClass = new InClass();
	}
	
	// 인스턴스 내부 클래스
	// 외부 클래스의 메소드가 호출될 때 사용 가능
	class InClass {
		int inNum = 100; // 내부 클래스의 인스턴스 변수
		// 인스턴스 내부 클래스에 정적 변수 선언 불가하다.
		// 인스턴스 내부 클래스는 외부 클래스를 생성한 이후에 사용해야 하기 때문이다.
		// 따라서 클래스 생성 상관없이 사용할 수 있는 정적 변수는
		// 인스턴스 내부 클래스에서 선언 불가
//		static int sInNum = 200;
		
		void inTest() {
			// num 과 sNum 은 private 으로 선언했지만 외부 클래스 안에 있기 때문에
			// 내부 클래스에서도 당연히 사용할 수 있다.
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
		}
		
		// 정적 메소드 또한 정의 불가능(정적 변수와 같은 이유)
//		static void sTest() {
//			
//		}
	}

	public void usingClass() {
		inClass.inTest();
	}
	
	
	// 정적 내부 클래스 예제 추가 
	static class InStaticClass { // 정적 내부 클래스의 일반 메소드
		int inNum = 100; // 정적 내부 클래스의 인스턴스 변수 
		static int sInNum = 200; // 정적 내부 클래스의 정적 변수
		 
		void inTest() { // 정적 내부 클래스의 일반 메소드 
//			num += 10; // 외부 클래스의 인스턴스 변수는 사용할 수 없다.
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
		
		static void sTest() { // 정적 내부 클래스의 정적 메소드
//			num += 10; // 외부 클래스와 내부 클래스의 인스턴스 변수는 사용할 수 없다.
//			inNum += 10;
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			
		}
	}

}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		
		System.out.println("//");
		
		// 외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성 가능
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메소드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메소드 호출");
		OutClass.InStaticClass.sTest();
	}
}
