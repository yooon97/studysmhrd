import java.util.Scanner;

public class ex02switch����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� (1~12) �Է� : ");
		int data = sc.nextInt();
		
		switch (data) {
		case 3,4,5:
			System.out.println(data + "���� ���Դϴ�.");
			break;
			
		case 1,2,12:
			System.out.println(data + "���� �ܿ��Դϴ�.");
			break;
		case 6,7,8:
			System.out.println(data + "���� �����Դϴ�.");
			break;
		case 9,10,11:
			System.out.println(data + "���� �����Դϴ�.");
			break;
		}

	}
}
