package 객체지향프로그래밍ObjectOrientedProgrammingOOP;

public class PhoneMain {

	public static void main(String[] args) {
	
		int num;
		//클래스란 자료 + 기능 사용자 임의의 자료형
		Phone lollipop = new Phone(); // 객체 생성 -> 클래스에 있는 데이터와 기능을 사용 할 수 있다
		
		
		
		//데이터를 불러올때는 따로 소괄호를 사용하지 않는다.
		System.out.println("브랜드 : " +lollipop.brand);
		lollipop.Call();
		
		//lollipop으로 전화를 받을땐
		lollipop.Send();
		
		
		System.out.println("전화번호1 : " + lollipop.number);
		
		Phone magic = new Phone();
		magic.brand = "애니콜";
		magic.number = "01077777777";
		System.out.println("브랜드2 : " + magic.brand);
		System.out.println("전화번호2 : " + magic.number);
		
		Phone abc = new Phone();
		abc.brand = "samsung";
		abc.number = "01077104572";
		System.out.println("브랜드3 : " + abc.brand);
		System.out.println("전화번호3 : " + abc.number);
		
		
		
	}

}
