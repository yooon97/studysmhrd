package 메소드;

public class ex01메소드1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1,num2);
		System.out.println("더하기 결과 : " + result);
	
		int result2 = minus(num1,num2);
		System.out.println("빼기 결과 : " + result2);
		
		int result3 = mul(num1,num2);
		System.out.println("곱하기 결과 : " + result3);

		int result4 = div(num1,num2);
		System.out.println("나누기 결과 : " + result4);
	
	
		int re1 = add(10,30);
		System.out.println(re1);
		int re2 = add(40,50);
		System.out.println(re2);
	}
	
	// 메소드 : 자주 사용하는 기능을 따로 빼놓는 것을 의미
	// 필요 할 때마다 불러와서 사용
	// public : 접근 제한자 --> 이 메소드를 어디까지 사용범위를 허용할 것인가
	// static : 공유하다 
	// int : 리턴 타입 (반환 타입)
	// add(int num1, num2) : 메소드 이름 - 메소드의 내용을 수행 할 것이다. (필요재료)
	//  {
	// 메소드 실행 로직
	// return result : 데이터를 반환하겠다 ★★★중요★★★ 위에서 약속한 리턴 타입에 맞게 데이터를 반환해줘야한다
	// }	
	
	
	//더하기기능을하는 메소드
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	
	}
	//빼기기능을하는 메소드
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	//곱하기기능을 하는 메소드
	public static int mul(int num1,int num2) {
		int result = num1 * num2;
		return result;
	}
	//나눈 몫을 구해주는 메소드
	public static int div(int num1,int num2) {
		int result = num1 / num2;
		return result;
	}
	
	
	
}
