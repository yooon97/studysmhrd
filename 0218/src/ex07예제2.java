import java.util.Scanner;

public class ex07예제2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num%3==0 || num%5==0) {
			System.out.print("3또는 5의 배수입니다.");
		}
		
	}

} 