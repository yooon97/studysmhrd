import java.util.Scanner;

public class ex02���׿���1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();
		
		int a = num1%2;
		int b = 0;
		
		System.out.println(a==b ? num1+"�� ¦���Դϴ�." : num1 + "�� Ȧ���Դϴ�.");
		
		
	}

}
