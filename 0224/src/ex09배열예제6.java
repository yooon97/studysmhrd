import java.util.Scanner;

public class ex09배열예제6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,4,3,2,1};
		int[] user = new int[5];
		int sum=0;
		for(int i = 0; i<user.length; i++) {
			System.out.print((i+1) + "번째 데이터 입력 : ");
			user[i] = sc.nextInt();
		}
		for(int i=0; i<user.length; i++) {
			if(arr[i]==user[i]) {
				System.out.print("O ");
				sum += 20 ;
			}else {
				System.out.print("X ");
			}
			
		}System.out.println("총점 : " + sum);
	}
}