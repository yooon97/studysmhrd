import java.util.Scanner;

public class ex04����3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�� ���� �Է� : ");
		int ball = sc.nextInt();
		
		int box = ball%5 == 0 ? ball/5 : (ball/5)+1;
		
		System.out.println("�ʿ��� �ڽ���" + box + "�� �Դϴ�.");
		
		
		
		
		
		
		
	}

}
