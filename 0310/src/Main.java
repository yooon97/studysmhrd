import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// ���赵�� ���鶧���� ��ü���� ������ �Ұ����ϹǷ� main �޼ҵ�� ������ �ʴ´�.
		
		// ��ü : ���赵�� ���ؼ� ������ ��������� ��
		// ���赵 -> ��üȭ -> �ν��Ͻ� ȭ
		
		
		// ��ü�� �����ϴ� Ű���� ? - > new 
		
		poketmon mon1 = new poketmon("��ī��", "����",50,30,200);
		
		// ���� ����� ���� ���ϸ� ���� �����ϱ�
		
//		mon1.setName() = "��ī��";
//		mon1.type = "����";
//		mon1.attack = 50;
//		mon1.def = 30;
//		mon1.hp = 200;
		
		
		poketmon mon2 = new poketmon("���̸�", "��", 30 ,55, 60);
		
		System.out.println("mon1 �� �̸� : " + mon1.getName());
		System.out.println("mon1 �� Ÿ�� : " + mon1.getType());
		System.out.println();
		System.out.println("mon2 �� �̸� : " + mon2.getName());
		System.out.println("mon2 �� Ÿ�� : " + mon2.getType());
		
		
//		mon1.type = "��";
		
		
		System.out.println("mon1 �� �̸� : " + mon1.getName());
		System.out.println("mon1 �� Ÿ�� : " + mon1.getType());
		System.out.println();
		System.out.println("mon2 �� �̸� : " + mon2.getName());
		System.out.println("mon2 �� Ÿ�� : " + mon2.getType());
		
		
		// ��ü �迭 �����ϱ�
		poketmon[] ball = new poketmon[2];
		ball[0] = mon1;
		ball[1] = mon2;
		
		System.out.println(ball[0].getAttack());
		
		// ArrayList : ũ�Ⱑ �������� ���� �迭 -> ���� ����Ʈ 
		// <E> ���׸�
		ArrayList<poketmon> balls = new ArrayList<poketmon>();
		balls.add(mon1);
		balls.add(mon2);
		//������ �߰��ϱ�
		
		
		//������ �� ����ϱ�
		//mon1�� ��ü ������ ����ϱ�
		Random rd = new Random();
		
		int num = rd.nextInt(balls.size()); // 0 Ȥ�� 1 ����
		
		
		
		
//		for(int i =0; i < balls.size(); i++) {
			System.out.println(balls.get(num).getName());
			System.out.println(balls.get(num).getAttack());
			System.out.println(balls.get(num).getType());
			System.out.println(balls.get(num).getDef());
			System.out.println(balls.get(num).getHp());
			System.out.println();
//		}
		
		
		
	}

}
