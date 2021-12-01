package bookshelf;

public interface Queue {
	void enQueue(String title); // 배열 맨 마지막에 추가
	String deQueue(); // 배열의 맨 처음 값 반환
	int getSize(); // 현재 Queue 에 있는 개수 반환 
}
