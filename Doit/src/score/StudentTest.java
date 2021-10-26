package score;

public class StudentTest {
	public static void main(String[] args) {
		Student stdLee = new Student(1001, "Lee");
		Student stdKim = new Student(1002, "Kim");
		
		stdLee.addSubject("국어", 100);
		stdLee.addSubject("수학", 50);
		stdKim.addSubject("국어", 70);
		stdKim.addSubject("수학", 85);
		stdKim.addSubject("영어", 100);
		
		stdLee.showStdInfo();
		stdKim.showStdInfo();
	}
}
