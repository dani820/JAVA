package singleton;

public class Company {
	private static Company instance = new Company(); // 프로그램 전체에서 사용할 유일한 인스턴스
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
