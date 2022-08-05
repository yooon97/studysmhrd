
public class Calculator {
	
	private int num1; //첫번째 정수
	private int num2; //두번째 정수
	
	//생성자 오버로딩
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public void setNum2(int num2) {
		this.num2=num2;
	}
	public int sum() {
		return num1+num2;
	}
	public int sub() {
		return num1-num2;
	}
	public int mul() {
		return num1*num2;
	}
	public double div() {
		return num1/num2;
	}
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	
}
