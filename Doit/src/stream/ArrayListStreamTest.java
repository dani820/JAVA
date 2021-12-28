package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream(); // 스트림 생성
		stream.forEach(s -> System.out.print(s + " ")); // 배열의 요소를 하나씩 출력
		System.out.println();
		
		// 스트림 새로 생성, 정렬, 요소를 하나씩 꺼내서 출력
		// sorted 메소드를 사용하려면 정렬 방식에 대한 정의가 필요하다.
		// 따라서 사용하는 자료 클래스가 Comparable 인터페이스를 구현해야 한다.
		sList.stream().sorted().forEach(s -> System.out.println(s));
	}

}
