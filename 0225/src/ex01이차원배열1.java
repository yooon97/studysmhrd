
public class ex01�������迭1 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		int sum = 1;
		
		// ������ �迭���� �迭��.length -> ù��° �迭�� ���̸� ��Ÿ��
		for(int i = 0; i<array.length; i++) {
			
			for(int j = 0; j<array[0].length; j++) {
				
				array[i][j] = sum;
				
				sum++;
			System.out.print(array[i][j]+" "); // \t -> tab ��ŭ �����
			
			}System.out.println();
		}
		
		
		
	}

}
