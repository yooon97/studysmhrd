
public class ex02�޼ҵ忹��2 {

	public static void main(String[] args) {
		
		int num1 = 8;
		int num2 = 13;
		int result = close10(num1, num2);
		System.out.println("10�� ����� �� : " + result);
		
		
		
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
		} // ���� �Ÿ��� �´� ������ ���Ե�
		
		if(a > b) {
			result = num2;
		}
		else if(b > a) {
			result = num1;
		}
		
		return result;
		
	}




}

