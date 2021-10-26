package cooperation;

public class Bus {
	 int busNo;
	 int passengerCount;
	 int money;
	
	public Bus (int busNo) {
		this.busNo = busNo;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNo + " 번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
	
}
