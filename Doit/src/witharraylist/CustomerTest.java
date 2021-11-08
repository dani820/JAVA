package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
//		VIPCustomer 와 GoldCustomer 클래스 모두 Customer 클래스를 상속 받았으므로
//		Customer 형으로 배열 선언해준다.
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		// 일반회원 2명
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		// Gold 회원 2명
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoul = new GoldCustomer(10040, "이율곡");
		// VIP 회원 1명
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(customerKim);
		customerList.add(customerYoul);
		customerList.add(customerHong);
		customerList.add(customerShin);
		customerList.add(customerLee);
		
		System.out.println("=== 고객 정보 출력 ===");
		for(Customer customer : customerList) {
			// showCustomerInfo()는 재정의하지 않았기 때문에
			// Customer 클래스에 구현된 메소드가 호출될 것이다.
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("=== 할인율과 보너스 계산 ===");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + " 원을 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 포인트는 " + customer.bonusPoint + " 입니다.");
		}
		
		
	}

}

