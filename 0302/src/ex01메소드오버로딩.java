
public class ex01메소드오버로딩 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("결과 1 : " + add(num1,num2));
		float num3=5.17f;
		float num4=2.34f;
		System.out.println("결과 2 : " + add(num3,num4));
		
		//메소드 오버로딩 : 같은 메소드 이름으로 매개변수를 다르게 해서 다른 기능을 수행 시키는것
		// 특징 : 
		//1.메소드 이름이 같아야 한다.
		//2.메소드 이름이 같으면서 매개변수가 달라야만한다 
		// 메소드 이름이 같으면서 리턴 타입이 다른경우는 메소드 오버로딩이 아니다
	
	}
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	public static float add(float num3, float num4) {
		return num3+num4;
	}
	public static double add(double num5, double num6) {
		return num5+num6;
	}
	
	
	
}
