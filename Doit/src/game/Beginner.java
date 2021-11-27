package game;

public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달릴 수 있습니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("jump 할 줄 모름");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 할 줄 모름");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("초급 레벨입니다.");
		
	}

}
