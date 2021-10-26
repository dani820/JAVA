package cafe;

public class Kong {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		
		if(money == Menu.kongAmericano) {
			return "콩다방 아메리카노를 마셨습니다.";
		}else if(money == Menu.kongLatte) {
			return "콩다방 라떼를 마셨습니다.";
		}else {
			return null;
		}
	}
}
