package game;

public abstract class PlayerLevel {
	// 각 레벨마다 내용이 다르게 구현되어야 하기 때문에
	// 추상 메소드로 선언한다.
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();

	
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
