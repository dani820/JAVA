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
	
	// equals() 재정의
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

	// hashCode() 재정의
	// 논리적으로 같은 학생인지 비교하는 equals() 를 재정의할 때 학번이 같으면 true 를 반환
	// 일반적으로 hashCode() 메소드 재정의 시 equals() 메소드에서 논리적으로 같다는 것 구현할 때 사용한 멤버 변수를 활용하는 것이 좋음
	@Override
	public int hashCode() {
		return studentId; // equals() 에서 사용한 멤버 변수
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
		
		// 두 학생은 논리적으로 같기 때문에 같은 해시 코드 값을 반환한다.
		System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
		System.out.println("studentSang의 hashCode : " + studentSang.hashCode());
		
		
		// System.identityHashCode(studentLee) > 실제 인스턴스 주소 값 출력
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));
		
		// studentLee 와 studentSang 은 논리적으로는 같지만, 실제로는 다른 인스턴스이다.
	}
	
	
}
