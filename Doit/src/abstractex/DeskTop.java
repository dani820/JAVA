package abstractex;

public class DeskTop extends Computer {

	// 상속받은 추상 클래스의 모든 추상 메소드를 구현했기 때문에
	// 완전한 클래스가 된다.
	@Override
	public void display() {
		System.out.println("DeskTop display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
		
	}
	
}
