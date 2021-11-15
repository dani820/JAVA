package inheritance2;

public class Subject {
	private int subjectID;
	private String subjectName;
	
	// 기본 생성자
	public Subject() {}
	
	public int getSubjectID() {
		return subjectID;
	}
	
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public void showSubjectInfo() {
		System.out.println(subjectID + ", " + subjectName);
	}
}
