package abstractex;

public abstract class Computer {
	
	// public void display() 혹은 typing() 으로 작성했을 경우,
	// 구현부가 없기 때문에 body 를 작성하거나
	// abstract 예약어를 사용해서 추상 메소드로 만들 것을 제시한다.
	// 추상 메소드를 만들어도 이번에는 클래스명까지 오류가 표시되는데,
	// 이는 메소드에서 abstract 예약어를 빼거나 추상 메소드를 포함한 추상 클래스로 만들어주어야 하기 때문에 예약어를 추가해주어야 한다.
	// 따라서 abstract 예약어를 사용하여 추상 클래스로 선언해야 최종적으로 오류가 없어진다.
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	};
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	};
	
	// 문법 상 모든 메소드를 구현했어도 abstract 를 붙여서 추상 클래스로 만들 수 있다.
	// 이 경우 상속만을 위해 만든 클래스가 되며, new 예약어로 인스턴스 생성할 수 없다.
	
}
