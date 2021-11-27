package abstractex;

public class MyNoteBook extends NoteBook {

	// MyNoteBook 은 모든 추상 메소드가 구현된 클래스이므로 구체적인 클래스이다.
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing()");
		
	}

}
