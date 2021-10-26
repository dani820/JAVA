package cooperation;

public class Student2 {
	private static int serialNum = 1000;
	 int studentID;
	 String studentName;
	 int grade;
	 String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10; // 지역변수 : 메소드가 호출될 때 메모리에 생성되어 메소드가 끝나면 사라지는 변수
//		studentName = "이지원"; --> 사용불가. studentName 은 멘버 변수로 인스턴스가 생성될 때 만들어지는 인스턴스 변수이기 때문.
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
