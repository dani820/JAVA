package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList; // Member 타입의 arrayList 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); // 기본 생성자로 arrayList 생성
	}
	
	public void addMemer(Member member) {
		arrayList.add(member);
	}
	
	public void insertMember(Member member, int index) {
		if(index < 0 || index > arrayList.size()+1) {
			System.out.println("지정된 자리에 추가할 수 없습니다.");
		}
		arrayList.add(index-1, member);
	}
	
	public boolean removeMember(int memberId) {
//		for(int i = 0; i < arrayList.size(); i++) { // for 문을 돌려서 리스트 멤버 존재 여부 확인
//			Member member = arrayList.get(i); // 각 인덱스에 해당하는 값을 member 객체에 담는다.
//			int tempId = member.getMemberId(); // member 객체의 memberId 값을 tempId 에 담아 비교
//			if(tempId == memberId) { // id가 매개변수와 일치하면
//				arrayList.remove(i); // 해당 회원 삭제
//				return true;
//			}
//		}
//		System.out.println(memberId + "가 존재하지 않습니다."); // 해당 아이디를 못 찾은 경우
//		return false;
		
		// Iterator<Member> 와 같이 제네릭 자료형으로 Iterator 가 순회할 요소의 자료형 지정
		Iterator<Member> ir = arrayList.iterator(); // Iterator 반환 
		while(ir.hasNext()) { // 요소가 있는 동안 다음 회원을 받환받는다.
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member); // member 객체 출력 시 재정의한 toString() 호출 
		}
		System.out.println();
	}
}
