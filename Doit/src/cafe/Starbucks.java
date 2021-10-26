package cafe;

public class Starbucks {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		
		if(money == Menu.starAmericano) {
			return "별다방 아메리카노를 마셨습니다.";
		}else if(money == Menu.starLatte) {
			return "별다방 라떼를 마셨습니다.";
		}else {
			return null;
		}
		
	}
	
}
