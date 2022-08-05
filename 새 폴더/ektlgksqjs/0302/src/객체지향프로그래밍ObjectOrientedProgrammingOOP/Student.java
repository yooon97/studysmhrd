package 객체지향프로그래밍ObjectOrientedProgrammingOOP;

public class Student {

	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;
	

	
	//평균 구하는 기능
	//다른 클래스에서 메소드를 만들때 static을 적어주지 않아도 된다.
public int avg() {
		int result = (scoreJava+scoreWeb+scoreAndroid)/3;
		return result;
		
}


}
