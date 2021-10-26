package inheritance;

public class VIPCustomerBefore {
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomerBefore() {
		customerGrade = "GOLD";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgendID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "의 등급은 " + customerGrade + "이고, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
