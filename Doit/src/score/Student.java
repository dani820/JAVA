package score;

import java.util.ArrayList;

public class Student {
	int stdID; 
	String stdName;
	ArrayList<Subject> subList; // 선언
	
	
	// 생성자
	public Student(int stdID, String stdName) {
		this.stdID = stdID;
		this.stdName = stdName;
		subList = new ArrayList<Subject>(); // 생성
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		subList.add(subject);
	}
	
	public void showStdInfo() {
		int total = 0;
		
		for(Subject sub : subList) {
			total += sub.getScore();
			System.out.println(stdName + " 학생의 " + sub.getName() + " 과목의 점수는 " + sub.getScore() + " 입니다.");
		}
		System.out.println(stdName + " 학생의 총점은 " + total + " 입니다.");
		
	}
	
	
}
