import java.util.Scanner;

public class ex04_와일문예쩨 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int total = 0;
		
		
//		while(num != -1) {
//		total += num;
//		System.out.print("숫자를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		}
		while(true) {
			if(num == -1) {
				break;
			
			}
			total += num;
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			
		}
		System.out.println("누적 값은 : "  + total);
		
	}

}

