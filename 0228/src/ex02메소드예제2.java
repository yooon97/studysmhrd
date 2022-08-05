
public class ex02메소드예제2 {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 13;
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);
		
		
		
	}

	public static int close10(int num1, int num2) {
		int result = 0;
		int a = 10 - num1;
		int b = 10 - num2;
		
		if(a<0) {
			a = -1*a;
		}
		if(b<0) {
			b = -1*b;
		} // 각각 거리에 맞는 절댓값이 들어가게됨
		
		if(a > b) {
			result = num2;
		}
		else if(b > a) {
			result = num1;
		}
		
		return result;
		
	}




}

