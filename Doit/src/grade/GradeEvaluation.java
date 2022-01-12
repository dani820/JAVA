package grade;

public interface GradeEvaluation {
	// 점수에 따른 학점을 문자열로 반환해준다.
	// 학점을 산출하는 모든 클래스는 해당 인터페이스를 구현해야 한다.
	public String getGrade(int point);
}
