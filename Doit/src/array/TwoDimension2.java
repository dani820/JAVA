package array;

public class TwoDimension2 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			
			// 2차원 배열을 선언만 하고 초기화 하지 않았기 때문에 모두 0으로 자동 초기화된 결과가 나타난다.
			System.out.println();
			
		}
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
	} 
}
