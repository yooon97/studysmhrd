import java.util.Scanner;

public class ex02���Ϲ����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 1;
		int d = 0;
		System.out.print("���� �����Ը� �Է��ϼ��� : ");
			a = sc.nextInt();
		System.out.print("��ǥ �����Ը� �Է��ϼ��� : ");
			b = sc.nextInt();
		while(a>=b) {
			
			System.out.print(c + "���� ������ ���� : ");
			d = sc.nextInt();
			c++;
			a-=d;
			System.out.println("���� ������ : " + a);
		}
		System.out.println(c + "���� ��ǥ ������ �޼� �����մϴ�");
		System.out.println("���� ������ : " + a );
	}
}
