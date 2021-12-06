package Object;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
	
	
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		
		// 참조 변수를 넣으면 인스턴스 정보가 출력된다.
		// 이 때 자동으로 호출되는 메소드가 toString() <- Book 클래스의 메소드가 아니라 Object 클래스의 메소드
		System.out.println(book1);
		System.out.println(book1.toString());
		
		String str = new String("test");
		System.out.println(str);
		Integer i1 = new Integer(100);
		System.out.println(i1);
	}
}
