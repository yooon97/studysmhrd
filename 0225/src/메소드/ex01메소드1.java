package �޼ҵ�;

public class ex01�޼ҵ�1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1,num2);
		System.out.println("���ϱ� ��� : " + result);
	
		int result2 = minus(num1,num2);
		System.out.println("���� ��� : " + result2);
		
		int result3 = mul(num1,num2);
		System.out.println("���ϱ� ��� : " + result3);

		int result4 = div(num1,num2);
		System.out.println("������ ��� : " + result4);
	
	
		int re1 = add(10,30);
		System.out.println(re1);
		int re2 = add(40,50);
		System.out.println(re2);
	}
	
	// �޼ҵ� : ���� ����ϴ� ����� ���� ������ ���� �ǹ�
	// �ʿ� �� ������ �ҷ��ͼ� ���
	// public : ���� ������ --> �� �޼ҵ带 ������ �������� ����� ���ΰ�
	// static : �����ϴ� 
	// int : ���� Ÿ�� (��ȯ Ÿ��)
	// add(int num1, num2) : �޼ҵ� �̸� - �޼ҵ��� ������ ���� �� ���̴�. (�ʿ����)
	//  {
	// �޼ҵ� ���� ����
	// return result : �����͸� ��ȯ�ϰڴ� �ڡڡ��߿�ڡڡ� ������ ����� ���� Ÿ�Կ� �°� �����͸� ��ȯ������Ѵ�
	// }	
	
	
	//���ϱ������ϴ� �޼ҵ�
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	
	}
	//���������ϴ� �޼ҵ�
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	//���ϱ����� �ϴ� �޼ҵ�
	public static int mul(int num1,int num2) {
		int result = num1 * num2;
		return result;
	}
	//���� ���� �����ִ� �޼ҵ�
	public static int div(int num1,int num2) {
		int result = num1 / num2;
		return result;
	}
	
	
	
}
