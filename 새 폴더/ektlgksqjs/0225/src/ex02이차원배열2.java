
public class ex02�������迭2 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		
		int num = 21;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[0].length; j++) {
				
				array[i][j] = num;
				num++;
				
				System.out.print(array[i][j]+"\t");
			}System.out.println();
		}
	}
}
