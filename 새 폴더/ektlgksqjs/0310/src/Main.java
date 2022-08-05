import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// 설계도를 만들때에는 구체적인 실행이 불가능하므로 main 메소드는 만들지 않는다.
		
		// 객체 : 설계도를 통해서 실제로 만들어지는 것
		// 설계도 -> 객체화 -> 인스턴스 화
		
		
		// 객체를 생성하는 키워드 ? - > new 
		
		poketmon mon1 = new poketmon("피카츄", "전기",50,30,200);
		
		// 내가 만들고 싶은 포켓몬 내용 지정하기
		
//		mon1.setName() = "피카츄";
//		mon1.type = "전기";
//		mon1.attack = 50;
//		mon1.def = 30;
//		mon1.hp = 200;
		
		
		poketmon mon2 = new poketmon("파이리", "불", 30 ,55, 60);
		
		System.out.println("mon1 의 이름 : " + mon1.getName());
		System.out.println("mon1 의 타입 : " + mon1.getType());
		System.out.println();
		System.out.println("mon2 의 이름 : " + mon2.getName());
		System.out.println("mon2 의 타입 : " + mon2.getType());
		
		
//		mon1.type = "물";
		
		
		System.out.println("mon1 의 이름 : " + mon1.getName());
		System.out.println("mon1 의 타입 : " + mon1.getType());
		System.out.println();
		System.out.println("mon2 의 이름 : " + mon2.getName());
		System.out.println("mon2 의 타입 : " + mon2.getType());
		
		
		// 객체 배열 생성하기
		poketmon[] ball = new poketmon[2];
		ball[0] = mon1;
		ball[1] = mon2;
		
		System.out.println(ball[0].getAttack());
		
		// ArrayList : 크기가 지정되지 않은 배열 -> 가변 리스트 
		// <E> 제네릭
		ArrayList<poketmon> balls = new ArrayList<poketmon>();
		balls.add(mon1);
		balls.add(mon2);
		//데이터 추가하기
		
		
		//데이터 값 출력하기
		//mon1의 전체 데이터 출력하기
		Random rd = new Random();
		
		int num = rd.nextInt(balls.size()); // 0 혹은 1 생성
		
		
		
		
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
