import java.util.Scanner;

public class ex04���� {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է����ּ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�Է����ּ��� : ");
		int num2 = sc.nextInt();
		int a = 0 ;
		//ù��°�� ������ �ι�°�� ū��
		
		for(int i = num1; i<=num2; i++) {
			a += i;
		}
		System.out.println(a);
	}

}
