package ��ü�������α׷���ObjectOrientedProgrammingOOP;

public class PhoneMain {

	public static void main(String[] args) {
	
		int num;
		//Ŭ������ �ڷ� + ��� ����� ������ �ڷ���
		Phone lollipop = new Phone(); // ��ü ���� -> Ŭ������ �ִ� �����Ϳ� ����� ��� �� �� �ִ�
		
		
		
		//�����͸� �ҷ��ö��� ���� �Ұ�ȣ�� ������� �ʴ´�.
		System.out.println("�귣�� : " +lollipop.brand);
		lollipop.Call();
		
		//lollipop���� ��ȭ�� ������
		lollipop.Send();
		
		
		System.out.println("��ȭ��ȣ1 : " + lollipop.number);
		
		Phone magic = new Phone();
		magic.brand = "�ִ���";
		magic.number = "01077777777";
		System.out.println("�귣��2 : " + magic.brand);
		System.out.println("��ȭ��ȣ2 : " + magic.number);
		
		Phone abc = new Phone();
		abc.brand = "samsung";
		abc.number = "01077104572";
		System.out.println("�귣��3 : " + abc.brand);
		System.out.println("��ȭ��ȣ3 : " + abc.number);
		
		
		
	}

}
