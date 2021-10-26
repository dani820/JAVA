package cooperation;

public class Taxi {
	String compnayName;
	int money;
	
	public Taxi(String compnayName) {
		this.compnayName = compnayName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("택시 " + compnayName + "의 수입은 " + money + "입니다.");
	}
}
