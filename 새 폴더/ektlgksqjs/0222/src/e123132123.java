import java.util.Scanner;

public class e123132123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int hol = 0;
		int hol1 = 0;
		
			while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			if(num == -1) {
				break;
			}
			else if(num%2 == 0) {
				hol1++;
			}else if(num%2 == 1)
				hol++;
			}
		System.out.println("홀수 개수 : "  + hol);
		System.out.println("짝수 개수 : "  + hol1);
	}
}
