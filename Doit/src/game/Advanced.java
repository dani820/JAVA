package game;

public class Advanced extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달린다.");
		
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump!!");
		
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돈다!");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("고급 레벨입니다.");
		
	}

}
