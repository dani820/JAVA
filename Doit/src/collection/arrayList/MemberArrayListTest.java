package collection.arrayList;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMemer(memberLee);
		memberArrayList.addMemer(memberSon);
		memberArrayList.addMemer(memberPark);
		memberArrayList.addMemer(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberSon.getMemberId());
		memberArrayList.showAllMember();
		
		Member memberKang = new Member(1005, "강호동");
		memberArrayList.insertMember(memberKang, 2);
		memberArrayList.showAllMember();
		
	}
}
