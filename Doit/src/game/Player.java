package game;

public class Player {
	private PlayerLevel level;
	
	// 디폴트 생성자
	// 처음 생성되면 beginner 레벨로 시작할 수 있도록 하고
	// 레벨에 따른 해당 메세지 출력
	public Player() {
		level = new Beginner();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	// 레벨 변경 메소드 
	// 현재 자신의 레벨을 매개변수로 받은 level 로 변경하고 레벨 메시지 출력
	// 매개변수 자료형은 모든 레벨로 변환 가능한 PlayerLevel 이다.
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	// PlayerLevel 의 템플릿 메소드 호출
	public void play(int count) {
		level.go(count);
	}
	
	
}
