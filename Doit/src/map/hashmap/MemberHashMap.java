package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	// HashMap 에 회원을 추가하는 메소드
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member); // key-value 쌍으로 추가
	}
	
	// HashMap 에서 회원 삭제하는 메소드
	public boolean removeMember(int memberId) {
		// hashMap 에 매개변수로 받은 키 값인 아이디가 있다면 해당 회원 삭제
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// Iterator 사용해서 전체 회원 출력
	public void showAllMember() {
		// hashMap.keySet() 를 호출하면 모든 key 값이 Set 객체로 반환된다.
		// 반환된 Set 객체에 iterator() 메소드를 호출하면 key 를 순회할 수 있는 iterator 가 반환된다.
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { // 다음 key 가 있으면
			int key = ir.next(); // key 값을 가져와서
			Member member = hashMap.get(key); // key로부터 value 가져오기
			System.out.println(member);
		}
		System.out.println();
	}
}
