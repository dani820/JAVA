package inheritance;

public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "GOLD"; // Customer 클래스에서 해당 변수의 접근제어자가 private 이기 때문에 오류 발생. 외부 클래스에서 사용 불가.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int)(price * saleRatio);
//	}
	
	public int getAgentID() {
		return agentID;
	}
	
//	public String showCustomerInfo() {
//		return customerName + "의 등급은 " + customerGrade + "이고, 보너스 포인트는 " + bonusPoint + "입니다.";
//	}
}
