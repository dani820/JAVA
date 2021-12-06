package Object;

class Std {
	String studentName;
	int studentNo;
	
	Std(String studentName, int studentNo) {
		this.studentName = studentName;
		this.studentNo = studentNo;
	}
	
	@Override
	public String toString() {
		return "이름 : " + studentName + ", 학번 : " + studentNo; 
	}
}

public class Student {
	public static void main(String[] args) {
		Std std = new Std("홍길동", 342341);
		
		System.out.println(std);
	}
}
