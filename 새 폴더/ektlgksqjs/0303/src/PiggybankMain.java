import java.util.Scanner;

public class PiggybankMain {

	public static void main(String[] args) {
		Piggybank a = new Piggybank();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ݾ��� �Է����ּ��� : ");
		int inputmoney = sc.nextInt();
		
		a.deposit(inputmoney);
		
		
		//a.money = 20000;
		
		
		a.showMoney();
		
		//������ �ݾ��� �Է¹޾Ƽ� �ش��ϴ� �ݾ׸�ŭ money�� ������Ű��
		//�ܾ� ��½�Ű��
		System.out.print("����� �ݾ��� �Է����ּ��� : ");
		int outputmoney = sc.nextInt();
		a.minus(outputmoney);
		a.showMoney();
	}

}
