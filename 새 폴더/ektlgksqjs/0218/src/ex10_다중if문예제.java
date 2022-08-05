import java.util.Scanner;

public class ex10_다중if문예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("점수를 입력하세요. : ");
		int grade = sc.nextInt();
		
		if(grade>=90) {
			System.out.print("A학점입니다.");
		}else if(grade>=80 && grade<90) {
			System.out.print("B학점입니다.");
		}else if(grade>=70 && grade<80) {
			System.out.print("C학점입니다.");
		}else {
			System.out.println("휴학");
		}
		
		
	}

}
