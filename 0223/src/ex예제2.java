import java.util.Scanner;

public class ex예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.print(i + " ");
		}
		
	}

}
