import java.util.Scanner;

public class ex04_���Ϲ����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int total = 0;
		
		
//		while(num != -1) {
//		total += num;
//		System.out.print("���ڸ� �Է��ϼ��� : ");
//		num = sc.nextInt();
//		
//		}
		while(true) {
			if(num == -1) {
				break;
			
			}
			total += num;
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			
		}
		System.out.println("���� ���� : "  + total);
		
	}

}

