import java.util.Scanner;

public class ex06_if문예제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(9<age && age<20) {
			System.out.print("10대입니다");
		}
		else if(age>=20 && age<30) {
			System.out.print("20대입니다.");
		}
		else if(age>=30 && age<40) {
			System.out.println("30대 입니다.");
			}
		else if(age>=40 && age<50) {
			System.out.println("40대 입니다.");
		}
			
		else {
			System.out.println("미성년자 입니다.");
		}
		
		
		
		
	}

}
