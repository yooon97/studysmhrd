import java.util.Scanner;

public class ex07�迭����4 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		//�Էº�
		for (int i = 0; i<arr.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� : ");
			arr[i] = sc.nextInt();
		}
		//��º�
		int max = 0; // �ְ�����
		int min = arr[0]; // ��������
		
		System.out.print("�Էµ� ���� : ");
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}if(min > arr[i]) {
				min = arr[i];
			}	
		}	
		System.out.println("\n�ִ밪 : "+max);
		 System.out.println("�ּҰ� : "+min);
		 System.out.println("���� : " + sum);
		 System.out.println("��� : " + (double)sum/arr.length);
		}
}
