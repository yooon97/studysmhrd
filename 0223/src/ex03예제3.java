import java.util.Scanner;

public class ex03예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("입력해주세요 : ");
		int num2 = sc.nextInt();
					
			if(num1>=num2) {
				for(int i = num2; i<=num1; i++) {
					System.out.print(i + " ");
				}
			}else if(num2>=num1) {
				for(int i = num1; i<=num2; i++) {
					System.out.print(i + " ");
			}
		
		// 삼항연산자로도 활용 가능
				//조건문 ? 참 : 거짓
				// int big = (num1 > num2) ? num1 : num2;
				// int small = (num2 > num1) ? num2 : num1;
				//for(int i = small; i<= big; i++)
				//System.out.print(i + " ");
				
		
//		for(int i = num1; i<= num2; i++) {
//				System.out.print(i + " ");
//			}
		
		
		
		
//				for(int i = 1; a!=b; i++) {
//					if(a>=b) {
//						System.out.print(a+ " ");
//						a--;
//						
//					}
//					else if(a<=b) {
//						System.out.print(b+ " ");
//						b--;
//					}
//				}
//	}

	}
	}
}
