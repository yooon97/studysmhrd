import java.util.Scanner;

public class ex06�迭����3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.print((i+1)+"��° ���� �Է� : ");
			arr[i] = sc.nextInt();
		}
			System.out.print("3�� ����� : ");
		for(int i=0; i<10; i++) {
			if(arr[i]%3==0) {
			System.out.print(arr[i]+" ");
			}
		}
	}

}
