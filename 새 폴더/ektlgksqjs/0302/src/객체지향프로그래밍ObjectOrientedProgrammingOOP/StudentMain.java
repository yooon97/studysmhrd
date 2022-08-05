package 객체지향프로그래밍ObjectOrientedProgrammingOOP;

public class StudentMain {

	public static void main(String[] args) {
		//공간을 할당 --> new
		// 생성자 --> Student()
		Student a = new Student();
		
		a.name = "상윤";
		a.number="21624";
		a.age=26;
		a.scoreJava=100;
		a.scoreWeb=100;
		a.scoreAndroid=100;
		
		System.out.println("이름은 : " + a.name);
		System.out.println("학번은 : " + a.number);
		System.out.println("나이는 : " + a.age);
		System.out.println("자바 점수는 : " + a.scoreJava);
		System.out.println("웹 점수는 : " + a.scoreWeb);
		System.out.println("안드로이드 점수는 : " + a.scoreAndroid);
	
		
		Student b = new Student();
		
		b.name = "윤댕";
		b.number="21024";
		b.age=16;
		b.scoreJava=50;
		b.scoreWeb=50;
		b.scoreAndroid=50;
		
		b.avg();
		a.avg();
		System.out.println("상윤 평균 : " + a.avg());
		System.out.println("윤댕 평균 : " + b.avg());
	
	
	}
		
	
}

