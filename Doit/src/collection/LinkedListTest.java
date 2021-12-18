package collection;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "D"); // 링크드 리스트 첫 번째 위치에 D 추가
		System.out.println(myList);
		
		myList.addFirst("0"); // 연결 리스트의 맨 앞에 0 추가
		System.out.println(myList);
		
		// 연결 리스트의 맨 뒤 요소 삭제 후 해당 요소 출력
		System.out.println(myList.removeLast()); 
		System.out.println(myList);
	}
}
