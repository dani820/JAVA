package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		// 굳이 Queue 자료형을 사용하는 이유는 뭘까
		Queue shelfQueue = new BookShelf();
		
		shelfQueue.enQueue("하루의 취향");
		shelfQueue.enQueue("말하기를 말하기");
		shelfQueue.enQueue("인간관계론"); // 순서대로 요소 추가
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue()); // 입력 순서대로 요소를 꺼내서 출력
	}
}
