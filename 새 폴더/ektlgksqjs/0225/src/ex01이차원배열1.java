
public class ex01이차원배열1 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		int sum = 1;
		
		// 이차원 배열에서 배열명.length -> 첫번째 배열의 길이를 나타냄
		for(int i = 0; i<array.length; i++) {
			
			for(int j = 0; j<array[0].length; j++) {
				
				array[i][j] = sum;
				
				sum++;
			System.out.print(array[i][j]+" "); // \t -> tab 만큼 띄어줌
			
			}System.out.println();
		}
		
		
		
	}

}
