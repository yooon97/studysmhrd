
public class ex06메소드오버로딩1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("결과1 : " + add(num1,num2));
		
		double num3 = 10.5;
		double num4 = 21.7;
		
		System.out.println("결과2 : " + add(num3,num4));
		
		float num5 = 3.14f;
		float num6 = 5.89f;
		System.out.println("결과3 : " + add(num5,num6));
	}
	//메소드 오버로딩 : 같은 메소드 이름으로 매개변수를 다르게 해서 다른 기능을 수행 시키는것
	
	
	// num1 과 num2 를 더해서 반환 시켜주는 add 라는 메소드 만들기
	
	
	public static int  add(int num1, int num2) {
		return  num1 + num2;
	}
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	public static float add(float num1, float num2) {
		return num1 + num2;
	
	}
}
