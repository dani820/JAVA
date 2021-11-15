package nLecture.ex16.star;

public class Program {
	public static void main (String args[]) {
		// 행 
		for(int i = 0; i < 10; i++) {
			// 열 
			for(int j = 0; j < 10; j++) { // 이 부분 중괄호 안 써도 원하는대로 10 x 10으로 출력 가능
				System.out.printf("%c", '♡');				
			}
			System.out.println(); // 바깥쪽 for 문에 종속 
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i+1; j++) 
				System.out.printf("%c", '♡');				
				
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10-i; j++) {
				System.out.printf("%c", '♡');				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.printf("%d,", 1);
		System.out.printf("%d,", 6);
		System.out.printf("%d,", 11);
		System.out.printf("%d,", 16);
		System.out.printf("%d,", 21); // 공차수열의 법칙 
		System.out.println();
		
		for(int z = 0; z < 5; z++) {
			System.out.printf("%d,", 1 + (z + 1 - 1) * 5); 
		}
		
		System.out.println();
		System.out.println("why?");
		
		// 보통은 0부터 시작하고 i 를 쓰지만
		// 수학적인 내용을 들여와서 1부터 시작하고 n(number)을 쓰는 방법도 있다.
		for(int n = 1; n <= 5; n++) {
			System.out.printf("%d,", 1 + (n-1) * 5); // 코드의 가독성을 위해 어떤 법칙을 쓴 것인지 명확하게 보이도록 작성
		}
	
		
	}
}
