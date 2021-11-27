package gameTest;

public class Beginner1 extends PlayerLevel1 {

	@Override
	public void run() {
		System.out.println("초급자 뛴다.");

	}

	@Override
	public void jump() {
		System.out.println("점프 못해");

	}

	@Override
	public void turn() {
		System.out.println("턴 못해");

	}

	@Override
	public void showLevelMessages() {
		System.out.println("초급자 레벨임");

	}

}
