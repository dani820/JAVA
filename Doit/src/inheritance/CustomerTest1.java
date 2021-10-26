package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customLee = new Customer();
		customLee.setCustomerName("이순신");
		customLee.setCustomerID(10010);
		customLee.bonusPoint = 1000;
		System.out.println(customLee.showCustomerInfo());
		
		VIPCustomer vipKim = new VIPCustomer();
		vipKim.setCustomerName("김유신");
		vipKim.setCustomerID(10020);
		vipKim.bonusPoint = 10000;
		System.out.println(vipKim.showCustomerInfo());
		
	}
}
