
public class ex10_2�����迭1 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		//array��� �迭�� 1~25�� �ʱ�ȭ
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
