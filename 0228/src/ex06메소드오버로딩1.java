
public class ex06�޼ҵ�����ε�1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("���1 : " + add(num1,num2));
		
		double num3 = 10.5;
		double num4 = 21.7;
		
		System.out.println("���2 : " + add(num3,num4));
		
		float num5 = 3.14f;
		float num6 = 5.89f;
		System.out.println("���3 : " + add(num5,num6));
	}
	//�޼ҵ� �����ε� : ���� �޼ҵ� �̸����� �Ű������� �ٸ��� �ؼ� �ٸ� ����� ���� ��Ű�°�
	
	
	// num1 �� num2 �� ���ؼ� ��ȯ �����ִ� add ��� �޼ҵ� �����
	
	
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
