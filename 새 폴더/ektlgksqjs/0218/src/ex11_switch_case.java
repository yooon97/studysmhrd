
public class ex11_switch_case {

	public static void main(String[] args) {

		int num = 40;
		
		//switch(���ذ�)
		//case value: ==> ���ذ��̶� value�� ���ؼ� ���ٸ� �����Ű����
		//���๮���� {}�� �������� �ʴ´�
		//case���� �ѹ� true�� ���¼��� �ؿ��� ���� true�� �ν���
		switch (num) {
		case 10:
			System.out.println("10�� ����ֽ��ϴ�.");
			break;
			//�б⹮ -> break; // ������� �ϰ� ���������ּ��� (�ش� ������ �����ּ���)
		case 20:
			System.out.println("20�� ����ֽ��ϴ�.");
			break;
		case 30:
			System.out.println("30�� ����ֽ��ϴ�.");
			break; 
		
			
		default : // ���� if���� else�� �ش��Ѵ�.
			//switch case���� ������ �⺻���� �̰� �ؾ��Ѵ�.
			System.out.println("10 20 30�� �ƴմϴ�.");
		}
		// break -- �������� ����������
		
		
	}

}
