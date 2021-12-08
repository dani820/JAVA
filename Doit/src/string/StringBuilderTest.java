package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		// 연산 전후 메모리 주소 같다.
		
		javaStr = buffer.toString();
		System.out.println(javaStr); // toString() 메소드를 이용, 문자열로 반환 
		System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		Integer iValue = new Integer(100);
	}

}
