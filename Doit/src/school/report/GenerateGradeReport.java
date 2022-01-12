package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

public class GenerateGradeReport {
	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름 | 학번 |필수과목| 점수  \n";
	public static final String LINE = "========================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		
		for(Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		
		return buffer.toString(); // String 으로 변환 
	}
	
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}
	
	public void makeBody(Subject subject) {
		ArrayList<Student> stdList = subject.getStdList();
		
		for(int i = 0; i < stdList.size(); i++) {
			Student student = stdList.get(i);
			
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			// getSubjectName() 을 쓸 수 있는 이유는 
			// getMajorSubject() 로 가져온 majorSubject 변수가 Subject 형이기 때문에 
			buffer.append(student.getMajorSubject().getSubjectName() + "\t");
			buffer.append(" | ");
			
			// 학생별 수강 과목 학점 계산
			getScoreGrade(student, subject.getSubjectId());
			
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	public void getScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajorSubject().getSubjectId();
		
		// 학점 평가 클래스 배열 정의 
		// GradeEvaluation 형으로 선언하여 인스턴스 생성
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};
		
		for(int i = 0; i < scoreList.size(); i++) {
			Score score = scoreList.get(i);
			if(score.getSubject().getSubjectId() == subjectId) { // 학점 산출할 과목
				String grade;
				if(score.getSubject().getSubjectId() == majorId) { // 필수 과목인 경우
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
				}else {
					grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
				}
				
				buffer.append(score.getPoint());
				buffer.append(" : ");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
	}
	
	public void makeFooter() {
		buffer.append("\n");
	}
} 
