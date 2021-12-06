package Object;

class Studentt { 
	int studentId;
	String studentName;
	
	public Studentt(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + ", " + studentName;
	}
	
	// equals 메소드 재정의
	@Override
	public boolean equals(Object obj) {
		// 비교될 객체가 Object 형 매개변수로 전달되면 원래 자료형이 Student 인지 확인
		if(obj instanceof Studentt) {
			Studentt std = (Studentt)obj;
			if(this.studentId == std.studentId)
				return true;
			else return false;
		}
		
		return false;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Studentt studentLee = new Studentt(100, "이상원");
		Studentt studentLee2 = studentLee; // 주소 복사
		Studentt studentSang = new Studentt(100, "이상원");
		
		// 동일한 두 주소의 인스턴스 비교
		if(studentLee == studentLee2) // == 기호로 비교 
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else 
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studentLee2)) // equals 메소드로 비교
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		// 동일인이지만 인스턴스 주소 다른 경우
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang은 동일합니다.");
		else
			System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
	}
	
	
}
