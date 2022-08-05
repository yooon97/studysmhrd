import java.util.Scanner;

public class Ex09_if_else예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num%10 >= 5) {
			System.out.println(num/10*10+10);
		}else {
			System.out.println(num/10*10);
		}
		
		
		
		
	}

}
