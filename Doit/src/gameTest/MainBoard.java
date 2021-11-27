package gameTest;

public class MainBoard {
	public static void main(String[] args) {
		// 기본적으로 초급 레벨로 생성될 수 있도록 함.
		Player1 player = new Player1();
		player.playing(1);
		
		Intermediate1 iLevel1 = new Intermediate1();
		player.upgradeLevell(iLevel1);
		player.playing(2);
		
		Advanced1 aLevel1 = new Advanced1();
		player.upgradeLevell(aLevel1);
		player.playing(3);
		
		String str = new String();
	}
}
