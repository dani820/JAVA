package abstractex;

public abstract class NoteBook extends Computer {

	// 추상 클래스인 Computer 클래스를 상속받고
	// 구현은 display() 메소드만 했기 때문에
	// 결과적으로 NoteBook 클래스도 추상 클래스가 된다.
	@Override
	public void display() {
		System.out.println("NoteBook display()");
		
	}
	
}
