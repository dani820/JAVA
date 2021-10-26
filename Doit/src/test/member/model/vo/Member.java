package test.member.model.vo;

public class Member {
	// 멤버변수 = 필드
	private String id;
	private String password;
	private String name;
	
	// 생성자
	// 객체를 생성하면서 멤버변수에 있는 값을 초기화해준다.
	public Member() {}
	public Member(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	// Member 클래스가 DB 에서 가져온 데이터를 저장하는 역할을 하기 때문에
	// 아래와 같은 메소드가 필요하다 
	// 게터,세터 (이를 통해 멤버변수에 접근을 하는 캡슐화)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// toString
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	
}
