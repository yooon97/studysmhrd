import java.util.Scanner;

public class ex1���Ϲ����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int hol = 0;
		int hol1 = 0;
		

		while(num != -1) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			if(num%2 == 0) {
				hol1++;
			}else if(num%2 == 1) {
				hol++;
			}
		}
		System.out.println("Ȧ�� ���� : "  + hol);
		System.out.println("¦�� ���� : "  + hol1);
	}
}
