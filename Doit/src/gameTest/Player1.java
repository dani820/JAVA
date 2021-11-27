package gameTest;

public class Player1 {
	private PlayerLevel1 level1;
	
	public Player1() {
		level1 = new Beginner1();
		level1.showLevelMessages();
	}
	
	public PlayerLevel1 getLevel() {
		return level1;
	}
	
	public void upgradeLevell(PlayerLevel1 level) {
		this.level1 = level;
		level1.showLevelMessages();
	}
	
	public void playing(int count) {
		level1.go(count);
	}
}
