package bookshelf;

import java.util.ArrayList;

public class Shelf {
	// 자료를 순서대로 저장할 ArrayList 선언
	// 이름을 저장할 수 있도록 String 자료형 사용
	protected ArrayList<String> shelf;
	
	// 기본 생성자로 자료를 담을 ArrayList 생성
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
