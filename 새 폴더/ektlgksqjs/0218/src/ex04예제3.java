import java.util.Scanner;

public class ex04예제3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("볼 개수 입력 : ");
		int ball = sc.nextInt();
		
		int box = ball%5 == 0 ? ball/5 : (ball/5)+1;
		
		System.out.println("필요한 박스는" + box + "개 입니다.");
		
		
		
		
		
		
		
	}

}
