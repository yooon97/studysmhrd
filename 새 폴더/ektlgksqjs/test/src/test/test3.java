package test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 3�ڸ��� ������ �Է� : ");
		int money=sc.nextInt();
		int first = 1000-money;
		int a = first/100;
		int b = (first - (100*a))/50;
		int c = (first - ((100*a)+(50*b))) / 10;
		
		System.out.println(a + " " + b + " " + c);
	}

}
