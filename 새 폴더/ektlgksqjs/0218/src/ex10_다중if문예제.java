import java.util.Scanner;

public class ex10_����if������ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("������ �Է��ϼ���. : ");
		int grade = sc.nextInt();
		
		if(grade>=90) {
			System.out.print("A�����Դϴ�.");
		}else if(grade>=80 && grade<90) {
			System.out.print("B�����Դϴ�.");
		}else if(grade>=70 && grade<80) {
			System.out.print("C�����Դϴ�.");
		}else {
			System.out.println("����");
		}
		
		
	}

}
