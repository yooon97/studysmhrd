import java.util.Scanner;

public class ex06_if������1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		if(9<age && age<20) {
			System.out.print("10���Դϴ�");
		}
		else if(age>=20 && age<30) {
			System.out.print("20���Դϴ�.");
		}
		else if(age>=30 && age<40) {
			System.out.println("30�� �Դϴ�.");
			}
		else if(age>=40 && age<50) {
			System.out.println("40�� �Դϴ�.");
		}
			
		else {
			System.out.println("�̼����� �Դϴ�.");
		}
		
		
		
		
	}

}
