package gameTest;

public class Advanced1 extends PlayerLevel1 {

	@Override
	public void run() {
		System.out.println("고급 달림");
		
	}

	@Override
	public void jump() {
		System.out.println("엄청 높이 뛸 수 있음");
		
	}

	@Override
	public void turn() {
		System.out.println("턴도 가능~~");
		
	}

	@Override
	public void showLevelMessages() {
		System.out.println("고급 레벨임");
		
	}

}
