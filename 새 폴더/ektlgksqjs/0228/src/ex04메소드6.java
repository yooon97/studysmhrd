
import java.util.Arrays;

public class ex04�޼ҵ�6 {

	public static void main(String[] args) {
		int[] array = {1,3,4,8,7,9,10};
		int num1 =10;
		arrayToString(array, num1); // �迭�ȿ� �ִ� �����͸� ��½�Ű�� �޼ҵ�
		System.out.println("���1: " + array[0]);
		System.out.println("���2: " + num1);
	
	}
	
	
	public static void arrayToString(int[] array, int num1) {
		
//		for(int i = 0; i<array.length; i++) {
//		
//			System.out.print(array[i]+ " ");	
//		}
		array[0] = 30;
		num1 = 30;
		
		System.out.println(Arrays.toString(array));
	}
}
