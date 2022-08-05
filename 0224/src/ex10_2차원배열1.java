
public class ex10_2차원배열1 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		//array라는 배열을 1~25로 초기화
		int num = 1;
		
		for(int i=0; i<array[0].length; i++) {
			for(int j=0; j<array[0].length; j++) {
				array[i][j] = num;
				num++;
		}

		}for(int i=0; i<array[0].length; i++) {
			for(int j=0; j<array[0].length; j++) {
			System.out.print(array[i][j]+" ");	
			}
		
		}
	}
}
