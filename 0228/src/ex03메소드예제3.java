
public class ex03�޼ҵ忹��3 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("��� Ȯ�� : " + result);
	}
	
	
	public static int powerN(int base, int n) {
		int result = 1;
		
		for(int i=1; i<=n; i++) {
			result = result*base;
		}
		
		
		return result;
		
	}
	
	
}
