package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		test2 a = new test2();
		Scanner sc = new Scanner(System.in);
		while(a.money >= -1) {
			System.out.println("���Ͻô� ����� �������ּ���");
			System.out.println("[1] ���� [2] ����");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.print("������ �ݾ��� �Է����ּ��� : ");
				int inputmoney = sc.nextInt();
				a.deposit(inputmoney);
				a.showMoney();
				System.out.println("��� �Ͻðڽ��ϱ�? 1 = ��� 2 + ����");
				int now = sc.nextInt();
				if(now == 2) {
					break;
					
				}
			}
			else if(select==2) {
				System.out.print("����� �ݾ��� �Է����ּ��� : ");
				int outputmoney = sc.nextInt();
				a.minus(outputmoney);
				a.showMoney();
				System.out.println("��� �Ͻðڽ��ϱ�? 1 = ��� 2 + ����");
				int now = sc.nextInt();
					if(now == 2) {
					break;
					
			}
			
		}
	}System.out.println("�ܾ��� �����ϰų� �����Ͽ� ����");
}
}
//		System.out.print("������ �ݾ��� �Է����ּ��� : ");
//		int inputmoney = sc.nextInt();
//		
//		a.deposit(inputmoney);
//		
//		
//		//a.money = 20000;
//		
//		
//		a.showMoney();
//		
//		//������ �ݾ��� �Է¹޾Ƽ� �ش��ϴ� �ݾ׸�ŭ money�� ������Ű��
//		//�ܾ� ��½�Ű��
//		System.out.print("����� �ݾ��� �Է����ּ��� : ");
//		int outputmoney = sc.nextInt();
//		a.minus(outputmoney);
//		a.showMoney();
//	}
//
//}
