package polymorphism;

public class Customer {
	protected int customerID; // protected 는 외부 클래스에서 사용할 수 없지만 하위 클래스에서는 사용할 수 있도록 지정하는 예약어
	protected String customerName;
	protected String customerGrade; 
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	// Customer 클래스를 생성하는 두 생성자에서 공통으로 사용하는 코드이므로 따로 분리하여 호출할 수 있도록 작성
	// 생성자에서만 호출하는 메소드이므로 private 으로 선언한다.
	private void initCustomer() {
		// 클래스의 멤버 변수 초기화
		customerGrade = "SILVER";
		bonusRatio = 0.01;		
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
