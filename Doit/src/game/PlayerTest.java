package game;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.play(1);
		
		Intermediate iLevel = new Intermediate();
		p1.upgradeLevel(iLevel);
		p1.play(2);
		
		Advanced aLevel = new Advanced();
		p1.upgradeLevel(aLevel);
		p1.play(3);
	}
}
