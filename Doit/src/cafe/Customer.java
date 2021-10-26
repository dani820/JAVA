package cafe;

public class Customer {
	String name;
	int money;
	
	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeStar(Starbucks star, int money) {
		String message = star.brewing(4000);
		
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님은 " + message);
		}
	}
	
	public void takeKong(Kong kong, int money) {
		String message = kong.brewing(4500);
		
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님은 " + message);
		}
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "입니다.");
	}
}
