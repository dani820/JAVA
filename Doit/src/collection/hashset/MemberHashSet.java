package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; // HashSet 선언
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>(); // 기본 생성자로 HashSet 생성
	}
	
	public void addMember(Member member) {
		hashSet.add(member); // HashSet에 회원 추가 
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator(); // Iterator 활용해 순회하기 
		
		while(ir.hasNext()) {
			Member member = ir.next(); // 회원 하나씩 가져오기
			int tempId = member.getMemberId(); // 아이디 비교
			if(tempId == memberId) { // 매개변수와 아이디 같을 경우
				hashSet.remove(member); // HashSet 에서 회원 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member); // 모든 회원 출력. 재정의한 toString() 출력
		}
		System.out.println();
	}
}
