
public class Piggybank {
	
	
	private int money;
	
	
	
public void showMoney() {
	System.out.println("잔액은 : " +money + " 입니다.");
}
public void deposit(int inputmoney) {
	money += inputmoney;
	
}
public void minus(int outputmoney) {
	money -= outputmoney;
}




}

