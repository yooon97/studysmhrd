import java.util.Scanner;

public class ex06배열예제3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.print((i+1)+"번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
			System.out.print("3의 배수는 : ");
		for(int i=0; i<10; i++) {
			if(arr[i]%3==0) {
			System.out.print(arr[i]+" ");
			}
		}
	}

}
