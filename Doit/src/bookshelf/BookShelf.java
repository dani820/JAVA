package bookshelf;

// BookShelf 클래스는 Shelf 클래스를 상속받고 Queue 인터페이스를 구현한다.
public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
