package ��ü�������α׷���ObjectOrientedProgrammingOOP;

public class StudentMain {

	public static void main(String[] args) {
		//������ �Ҵ� --> new
		// ������ --> Student()
		Student a = new Student();
		
		a.name = "����";
		a.number="21624";
		a.age=26;
		a.scoreJava=100;
		a.scoreWeb=100;
		a.scoreAndroid=100;
		
		System.out.println("�̸��� : " + a.name);
		System.out.println("�й��� : " + a.number);
		System.out.println("���̴� : " + a.age);
		System.out.println("�ڹ� ������ : " + a.scoreJava);
		System.out.println("�� ������ : " + a.scoreWeb);
		System.out.println("�ȵ���̵� ������ : " + a.scoreAndroid);
	
		
		Student b = new Student();
		
		b.name = "����";
		b.number="21024";
		b.age=16;
		b.scoreJava=50;
		b.scoreWeb=50;
		b.scoreAndroid=50;
		
		b.avg();
		a.avg();
		System.out.println("���� ��� : " + a.avg());
		System.out.println("���� ��� : " + b.avg());
	
	
	}
		
	
}

