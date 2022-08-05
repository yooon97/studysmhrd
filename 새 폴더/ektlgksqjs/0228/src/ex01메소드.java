import java.util.Scanner;

public class ex01메소드 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 24;
		
		int result = LargerNumbers(num1,num2);
		System.out.println("큰 수 확인 : " + result);
		
		
		
		
		
	}


	public static int LargerNumbers(int num1, int num2) {
		int result = 0;
		
		if(num1 > num2) {
			result = num1;
		}
		else if(num2 > num1) {
			result = num2;
		}
		return result;
		
			
	}
}
	