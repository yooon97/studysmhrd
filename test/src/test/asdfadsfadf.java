package test;

import java.util.Scanner;

public class asdfadsfadf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("������ �Է��ϼ� : ");
		int score = sc.nextInt();
		System.out.print("�г��� �Է��ϼ� : ");
		int year = sc.nextInt();
		
		if(score >= 60) {
			if(year != 4)
				System.out.println("�հ�");	// ��ü 
		else if (score >= 70)
			System.out.println("�հ�"); // 4�г� ���� 
		else 
			System.out.println("���հ�"); // 4�г� 70���̸� �ϰ�� �� �ش��
		}			
		
	}
}


