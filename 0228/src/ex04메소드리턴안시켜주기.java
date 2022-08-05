
public class ex04메소드리턴안시켜주기 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		powerN(base, n);
		
	}
	
	//리턴을 시켜주지 않을때는 반환타입 위치에 void를 사용해준다.
	public static void powerN(int base, int n) {
		int result = 1;
		
		for(int i=1; i<=n; i++) {
			result = result*base;
		}
		
		System.out.println("결과 확인 : " + result);
		
		
	}
	
	
}