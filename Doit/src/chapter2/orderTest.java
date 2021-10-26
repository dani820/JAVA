package chapter2;

public class orderTest {

	public static void main(String[] args) {
		Order orderInfo = new Order();
		
		orderInfo.orderNum = "2018031220001";
		orderInfo.id = "abc123";
		orderInfo.orderDate = "2018년 3월 12일";
		orderInfo.name = "홍길순";
		orderInfo.productNum = "PD0345-12";
		orderInfo.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + orderInfo.getOrderNum());
		System.out.println("주문자 아이디 : " + orderInfo.getId());
		System.out.println("주문 날짜 : " + orderInfo.getOrderDate());
		System.out.println("주문자 이름 : " + orderInfo.getName());
		System.out.println("주문 상품 번호 : " + orderInfo.getProductNum());
		System.out.println("배송 주소 : " + orderInfo.getAddress());

	}

}
