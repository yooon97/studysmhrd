import java.util.Scanner;

public class ex07배열예제4 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		//입력부
		for (int i = 0; i<arr.length; i++) {
			System.out.print((i + 1) + "번째 점수 입력 : ");
			arr[i] = sc.nextInt();
		}
		//출력부
		int max = 0; // 최고점수
		int min = arr[0]; // 최저점수
		
		System.out.print("입력된 점수 : ");
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
		System.out.println("\n최대값 : "+max);
		 System.out.println("최소값 : "+min);
		 System.out.println("총합 : " + sum);
		 System.out.println("평균 : " + (double)sum/arr.length);
		}
}
