import java.util.Scanner;

public class ex04예제 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("입력해주세요 : ");
		int num2 = sc.nextInt();
		int a = 0 ;
		//첫번째가 작은수 두번째가 큰수
		
		for(int i = num1; i<=num2; i++) {
			a += i;
		}
		System.out.println(a);
	}

}
