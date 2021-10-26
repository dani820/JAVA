package sample;

import chapter2.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		
		
		studentLee.setStudentName("이상원");
		studentLee.setStudentID(93);
		studentLee.setGrade(1);
		studentLee.setAddress("서울시 강서구");
		
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee.getStudentID());
		System.out.println(studentLee.getGrade());
		System.out.println(studentLee.getAddress());
	}
	
}
