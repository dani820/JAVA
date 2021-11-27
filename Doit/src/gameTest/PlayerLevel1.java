package gameTest;

public abstract class PlayerLevel1 {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessages();
	
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
