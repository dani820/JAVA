package collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
	// 속성
	private int memberId;
	private String memberName;
	
	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	// toString() 재정의 
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	// Object 클래스에서 논리적으로 같은 객체를 구현하기 위해 equals(), hashCode() 메소드를 재정의함
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member2) {
			Member2 member = (Member2)obj;
			if(this.memberId == member.memberId) // 매개변수로 받은 회원 아이디가 자신의 회원 아이디와 같다면 true 반환
				return true;
			else 
				return false;
		}
		return false;
	}

	// compare() 메소드 재정의
	// 전달받은 두 매개변수 비교 
	@Override
	public int compare(Member2 mem1, Member2 mem2) {
		return mem1.getMemberId() - mem2.getMemberId();
	}
	
	
}
