import java.util.Scanner;

public class PiggybankMain {

	public static void main(String[] args) {
		Piggybank a = new Piggybank();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("저금할 금액을 입력해주세요 : ");
		int inputmoney = sc.nextInt();
		
		a.deposit(inputmoney);
		
		
		//a.money = 20000;
		
		
		a.showMoney();
		
		//인출할 금액을 입력받아서 해당하는 금액만큼 money를 차감시키기
		//잔액 출력시키기
		System.out.print("출력할 금액을 입력해주세요 : ");
		int outputmoney = sc.nextInt();
		a.minus(outputmoney);
		a.showMoney();
	}

}
