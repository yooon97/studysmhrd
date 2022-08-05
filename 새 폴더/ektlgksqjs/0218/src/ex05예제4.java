import java.util.Scanner;

public class ex05예제4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("노동시간을 입력하세요 : ");
		int time = sc.nextInt();
		int money = 0;
		
		//int money = time<9 ? time*9000 : (int)8*9000+(time-8)*9000*1.5;
		if(time<9) {
			money = (time*9000);
		
		
		}else {
			money = (int)(8*9000+(time-8)*9000*1.5);
		
	
	}
			System.out.println("총 임금은" + money + "입니다.");
	}	
}