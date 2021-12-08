package string;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // false; 인스턴스가 매번 새로 생성되기 때문에 str1 과 str2 의 주소 값이 다름
		System.out.println(str1.equals(str2)); // true
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); // true; 문자열 abc 는 상수 풀에 저장되어 있기 때문에 가리키는 주소 값이 같음 
		System.out.println(str3.equals(str4)); // true
	}
}
