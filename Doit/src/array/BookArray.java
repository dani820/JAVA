package array;

public class BookArray {
	public static void main(String[] args) {
		// 인스턴스 생성 시 그 인스턴스를 가리키는 주소 값을 담을 공간이 생성된다. 
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
} 
