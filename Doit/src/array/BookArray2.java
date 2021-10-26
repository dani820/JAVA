package array;

public class BookArray2 {
	public static void main(String[] args) {
		// 인스턴스 생성 시 그 인스턴스를 가리키는 주소 값을 담을 공간이 생성된다. 
		Book[] library = new Book[5];
		library[0] = new Book("태", "조정래");
		
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
	}
} 
