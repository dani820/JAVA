package abstractex;

public class ComputerTest {
	public static void main(String[] args) {
//		Computer c1 = new Computer(); // 추상 클래스이기 때문에 인스턴스 생성 불가 
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook(); // 추상 클래스이기 때문에 인스턴스 생성 불가 
		Computer c4 = new MyNoteBook();
		
	}
	
}
