import java.util.ArrayList;

public class exArraylist01 {

	public static void main(String[] args) {
		
		//�迭�� �Ѱ� : �̹� ũ�⸦ ������ ������ �����͸� �߰��ϰų� �迭�� ũ�⸦ �ٲ� �� ����
		//�迭�� �Ѱ踦 �پ� �Ѵ� �迭 : Arraylist
		
		
		//ArrayList ���� ���
		//ArrayList<�迭�� �� �������� Ÿ��> ��̸���Ʈ��(�迭��) = new ArrayList<String>(); 
		//ArrayList�� ���� Ÿ���� ���۷��� Ÿ�Ը� ������(�⺻ �ڷ��� Ÿ���� ���� ����)
		//�⺻ ������ Ÿ������ ArrayList �� ����� �ֱ� ���ؼ���
		//�⺻������ Ÿ���� ǥ���� �� �ִ� Ŭ������ Ȱ�����ָ� �ȴ�
		ArrayList<String> nameArray = new ArrayList<String>();
		
		//������ �߰� .add("�ְ� ���� ������") --> ������ �Է��� ������� �迭�� ����
		//�� �迭�� ����
		nameArray.add("��ȯ��");
		nameArray.add("����");
		nameArray.add("������");
		nameArray.add("�ڿ���");
		nameArray.add("���ν�");
		
		//������ ��� 
		//��ȯ�� ������
		System.out.println(nameArray.get(0));
		
		//ArrayListy ũ�� -> .size() -- �Ϲ� �迭������ length�Ͱ���
		
		//������ ����! (�������� �ε�����ȣ)
		//� Ư�� ���ǿ��� �ش��ϴ� �����͸� ����� ������
		nameArray.remove(2);
		
		System.out.println(nameArray.size());
		
		//������ ����!
		nameArray.add(1,"����");
		
		System.out.println(nameArray);
		
		ArrayList<Person> pArrayList = new ArrayList<Person>();
		pArrayList.add(p1);
		
		
		
		
		
		
		
	}
	
}
