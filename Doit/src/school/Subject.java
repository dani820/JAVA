package school;

import java.util.ArrayList;
// 프로그램 전반에서 사용하는 상수 클래스
import utils.Define;

public class Subject {
	private int subjectId;
	private String subjectName;
	private int gradeType;
	
	// 과목을 신청한 학생 리스트. register() 메소드를 호출하면 이 리스트에 추가된다.
	private ArrayList<Student> stdList = new ArrayList<Student>();
	
	public Subject(int subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = Define.AB_TYPE;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public ArrayList<Student> getStdList() {
		return stdList;
	}
	
	public void setStdList(ArrayList<Student> stdList) {
		this.stdList = stdList;
	}
	
	public int getGradeType() {
		return gradeType;
	}
	
	public void setGradeType(int graderType) {
		this.gradeType = gradeType;
	}
	
	public void register(Student student) {
		stdList.add(student);
	}
}
