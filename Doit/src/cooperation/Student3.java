package cooperation;

public class Student3 {
	private static int serialNum = 1000;
	 int studentID;
	 String studentName;
	 int grade;
	 String address;
	int studentCard;
	
	public Student3() {
		serialNum++;
		studentID = serialNum;
		studentCard = studentID + 100;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
	
}
