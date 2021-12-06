package Object;

public class HashCodeTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// equals() 메소드 결과 값이 true 인 경우 동일한 해시코드 값을 반환한다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		// Integer 클래스의 hashCode() 메소드는 정수 값을 반환하도록 재정의되어 있다.
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}
}
