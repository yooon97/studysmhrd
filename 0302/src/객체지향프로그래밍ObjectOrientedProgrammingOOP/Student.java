package ��ü�������α׷���ObjectOrientedProgrammingOOP;

public class Student {

	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;
	

	
	//��� ���ϴ� ���
	//�ٸ� Ŭ�������� �޼ҵ带 ���鶧 static�� �������� �ʾƵ� �ȴ�.
public int avg() {
		int result = (scoreJava+scoreWeb+scoreAndroid)/3;
		return result;
		
}


}
