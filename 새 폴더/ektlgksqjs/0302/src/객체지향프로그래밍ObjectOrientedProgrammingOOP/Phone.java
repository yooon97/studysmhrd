package 객체지향프로그래밍ObjectOrientedProgrammingOOP;

public class Phone {
	
	// 클래스란 : 사용자 임의의 자료형 이다
	// 현실에 있는 물체를 표현할 수 있는 사용자 임의의 자료형(type)이다
	// 클래스를 만들기 위해서는 추상화, 캡슐화, 라는 작업을 통해 만들어진다
	
	
	//휴대폰
	
	//1.전화를 걸다
	//2.전화를 받다
	//3.브랜드
	//4.게임
	//5.전화번호
	//위의 5가지의 역할을 하는 어떤것이 있다면 그건 휴대폰이라고 칭할 수 있다
	
	//data 와 기능을 따로 분리
	// data : 브랜드, 전화번호
	String brand;
	//(private)접근제한자 --> 해당 클래스 내에서만 접근이 가능하게끔 접근을 허용하다
	String number;
	
	//기능을 코드로 표현 --> 메소드로 만들어 주면됌
	//전화를 걸다, 받다, 게임
	//메인 클래스 외 다른 클래스 에서는 메소드를 만들때 static을 안붙여도 된다
	public void Call() {
		System.out.println("전화를 걸다");
	}
	public void Send() {
		System.out.println("전화를 받다");
	}
	public vod Game() {
		System.out.println("게임을 하다");
	}
	public String getNumber() {
		return number;
	}//우회해서 폰번호 출력하기
	
	
}
