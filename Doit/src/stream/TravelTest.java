package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> cList = new ArrayList<>();
		
		cList.add(customerLee);
		cList.add(customerKim);
		cList.add(customerHong);
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		cList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = cList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 : " + total + "입니다");
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		cList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
	}
}
