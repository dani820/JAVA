package exercise;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {

	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport(); // 성적 결과 생성
		System.out.println(report);
	}
	
	public void createSubject() {
		korean = new Subject(Define.KOREAN, "국어");
		math = new Subject(Define.MATH, "수학");
		dance = new Subject(Define.DANCE, "방송 댄스");
		
		dance.setGradeType(Define.PF_TYPE); // 학점 평가 정책 지정
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addSubject(dance);
	}
	
	public void createStudent() {
		Student std1 = new Student(181213, "안성원", korean);
		Student std2 = new Student(181518, "오태훈", math);
		Student std3 = new Student(171230, "이동호", korean);
		Student std4 = new Student(171255, "조성욱", korean);
		Student std5 = new Student(171590, "최태평", math);
		
		goodSchool.addStudent(std1);
		goodSchool.addStudent(std2);
		goodSchool.addStudent(std3);
		goodSchool.addStudent(std4);
		goodSchool.addStudent(std5);
		
		korean.register(std1);
		korean.register(std2);
		korean.register(std3);
		korean.register(std4);
		korean.register(std5);
		
		math.register(std1);
		math.register(std2);
		math.register(std3);
		math.register(std4);
		math.register(std5);
		
		dance.register(std1);
		dance.register(std2);
		dance.register(std3);
		
		addScoreForStudent(std1, korean, 95);
		addScoreForStudent(std1, math, 56);
		
		addScoreForStudent(std2, korean, 95);
		addScoreForStudent(std2, math, 95);
		
		addScoreForStudent(std3, korean, 100);
		addScoreForStudent(std3, math, 88);
		
		addScoreForStudent(std4, korean, 89);
		addScoreForStudent(std4, math, 95);
		
		addScoreForStudent(std5, korean, 85);
		addScoreForStudent(std5, math, 56);
		
		addScoreForStudent(std1, dance, 95);
		addScoreForStudent(std2, dance, 85);
		addScoreForStudent(std3, dance, 55);
	}

	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		System.out.println(score.toString());
		student.addSubjectScore(score);
	}
}
