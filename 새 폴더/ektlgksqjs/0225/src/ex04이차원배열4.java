
public class ex04�������迭4 {

	public static void main(String[] args) {
// Ctrl + shift + f ������ ��ü �ڵ�����
		int[][] array = new int[7][7];

		int num = 21;

		for (int i = 0; i < array.length; i++) {
			for (int j = array[0].length-1; j >= 0 ; j--) {

				array[i][j] = num;
				num++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = array[0].length-1; j >= 0 ; j--) {

				System.out.print(array[i][j] + "\t");

			}
			System.out.println();
		}
	}
}