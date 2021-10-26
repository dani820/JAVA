package array;

public class CharArray {
	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0;i < alphabets.length; i++, ch++) {
			alphabets[i] = ch; // 실제 메모리에 아스키 코드로 저장된다.
		}
		
		for(int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
	}
}
