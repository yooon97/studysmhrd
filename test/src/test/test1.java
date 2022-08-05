package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		test2 a = new test2();
		Scanner sc = new Scanner(System.in);
		while(a.money >= -1) {
			System.out.println("원하시는 기능을 선택해주세요");
			System.out.println("[1] 저금 [2] 인출");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.print("저금할 금액을 입력해주세요 : ");
				int inputmoney = sc.nextInt();
				a.deposit(inputmoney);
				a.showMoney();
				System.out.println("계속 하시겠습니까? 1 = 계속 2 + 종료");
				int now = sc.nextInt();
				if(now == 2) {
					break;
					
				}
			}
			else if(select==2) {
				System.out.print("출력할 금액을 입력해주세요 : ");
				int outputmoney = sc.nextInt();
				a.minus(outputmoney);
				a.showMoney();
				System.out.println("계속 하시겠습니까? 1 = 계속 2 + 종료");
				int now = sc.nextInt();
					if(now == 2) {
					break;
					
			}
			
		}
	}System.out.println("잔액이 부족하거나 선택하여 종료");
}
}
//		System.out.print("저금할 금액을 입력해주세요 : ");
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
//		//인출할 금액을 입력받아서 해당하는 금액만큼 money를 차감시키기
//		//잔액 출력시키기
//		System.out.print("출력할 금액을 입력해주세요 : ");
//		int outputmoney = sc.nextInt();
//		a.minus(outputmoney);
//		a.showMoney();
//	}
//
//}
