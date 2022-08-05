import java.util.Scanner;

public class ex02와일문예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 1;
		int d = 0;
		System.out.print("현재 몸무게를 입력하세요 : ");
			a = sc.nextInt();
		System.out.print("목표 몸무게를 입력하세요 : ");
			b = sc.nextInt();
		while(a>=b) {
			
			System.out.print(c + "주차 몸무게 감량 : ");
			d = sc.nextInt();
			c++;
			a-=d;
			System.out.println("현재 몸무게 : " + a);
		}
		System.out.println(c + "주차 목표 몸무게 달성 축하합니다");
		System.out.println("최종 몸무게 : " + a );
	}
}
