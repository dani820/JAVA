package inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		VIPCustomer vipKim = new VIPCustomer();
		vipKim.setCustomerName("김유신");
		vipKim.setCustomerID(10020);
		vipKim.bonusPoint = 10000;
		System.out.println(vipKim.showCustomerInfo());
		
	}
}
