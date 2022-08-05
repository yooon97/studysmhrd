import java.util.Scanner;

public class ex02삼항예제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		int a = num1%2;
		int b = 0;
		
		System.out.println(a==b ? num1+"은 짝수입니다." : num1 + "은 홀수입니다.");
		
		
	}

}
