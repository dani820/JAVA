package nLecture.ex17.test;

public class Program {
	public static void main(String[] args) {
		
		// for문 안에서 하나의 if-else 문이 있을 때에는 중괄호를 굳이 쓸 필요 없다. (Re 부분 참고. if-else문에도 중괄호 삭제함)
		// 중괄호가 불필요하게 많이 쌓이면 가독성이 떨어지기 때문이다.
		// 대신 들여쓰기 잘 하기 
//		for(int i = 0; i < 5; i++) {
//			
//			// Mine
////			if(i < 4) {
////				System.out.printf("%c,", 'A' + i);
////			}else { 
////				System.out.printf("%c", 'A' + i);
////			}
//			
//			// Re
////			if(i == 4) 
////				System.out.printf("%c", 'A' + i);
////			else  // else를 기본로직
////				System.out.printf("%c,", 'A' + i);
////			
//			
////			System.out.println();
//			
//			// 짝수 자리 빼기, 마지막 콤마 제거 예제
//			// 맨 마지막 else 문에서 맨 위 if문으로 갈수록 조건문이 더 촘촘해지는 형태여야 한다. (우선순위; 아래로 갈수록 범용적)
//			if(i == 4) 
//				System.out.printf("%c", 'A' + i);					
//			else if(i % 2 == 0) 
//				System.out.printf("%c,", ' ');
//			else 
//				System.out.printf("%c,", 'A' + i);
//		}
		
		
//		System.out.printf("%d ", 1);
//		System.out.printf("%d ", 2);
//		System.out.printf("%d ", 3);
//		System.out.printf("%d ", 4);
//		System.out.printf("%d ", 5);
//		System.out.printf("%d ", 6);
//		System.out.printf("%d ", 7);
//		System.out.printf("%d ", 8);
//		System.out.printf("%d ", 9);
		
//		Mine
//		for(int i =0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) { 
//				System.out.printf("%d ", 3 * i + j + 1);
//			}
//			System.out.println();
//		}
		
//		Re1
//		for(int i = 0; i < 9; i++) {
//			System.out.printf("%d ", i + 1);
//
//			if(i % 3 == 2)  
//				System.out.println();
//		}
		
//		Re2
//		격자일 경우 x,y 축 2차방정식 형태로 생각하면 쉽다 ~~
		for(int y = 0; y < 3; y++) {
			for(int x = 0; x < 3; x++) {
				System.out.printf("%d ", y * 3 + x + 1);
			}
				System.out.println();
		}
		
	}
}
