
public class ex04�޼ҵ帮�ϾȽ����ֱ� {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		powerN(base, n);
		
	}
	
	//������ �������� �������� ��ȯŸ�� ��ġ�� void�� ������ش�.
	public static void powerN(int base, int n) {
		int result = 1;
		
		for(int i=1; i<=n; i++) {
			result = result*base;
		}
		
		System.out.println("��� Ȯ�� : " + result);
		
		
	}
	
	
}