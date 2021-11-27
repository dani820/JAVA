package gameTest;

public class Intermediate1 extends PlayerLevel1 {

	@Override
	public void run() {
		System.out.println("중급자 달린다.");
		
	}

	@Override
	public void jump() {
		System.out.println("점프 가능");
		
	}

	@Override
	public void turn() {
		System.out.println("턴은 아직,,,");
		
	}

	@Override
	public void showLevelMessages() {
		System.out.println("중급 레벨임");
		
	}
	
}
