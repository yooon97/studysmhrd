
public class ex01�޼ҵ�����ε� {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("��� 1 : " + add(num1,num2));
		float num3=5.17f;
		float num4=2.34f;
		System.out.println("��� 2 : " + add(num3,num4));
		
		//�޼ҵ� �����ε� : ���� �޼ҵ� �̸����� �Ű������� �ٸ��� �ؼ� �ٸ� ����� ���� ��Ű�°�
		// Ư¡ : 
		//1.�޼ҵ� �̸��� ���ƾ� �Ѵ�.
		//2.�޼ҵ� �̸��� �����鼭 �Ű������� �޶�߸��Ѵ� 
		// �޼ҵ� �̸��� �����鼭 ���� Ÿ���� �ٸ����� �޼ҵ� �����ε��� �ƴϴ�
	
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
