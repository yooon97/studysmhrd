
public class PersonMain {

	public static void main(String[] args) {
		//Person() : 생성자
		//클래스만큼의 공간을 p1(객체)에 할당해준다
		Person p1 = new Person("상윤",20,173,70);
		p1.setName("임짜장");
//		p1.name = "상윤";
//		p1.age =20;
//		p1.tall=173;
//		p1.weight=70;
//		
//		System.out.println("이름 : " + );
		
		
		Person p2 = new Person();
		p2.setName("상유");
		p2.setAge(21);
		p2.setTall(180);
		p2.setWeight(70);
		System.out.println("이름2 : " + p2.getName());
		System.out.println("나이2 : " + p2.getAge());
		System.out.println("키2 : " + p2.getTall());
		System.out.println("몸무게2 : " + p2.getWeight());
		
		p2.getData();
		
		
		
		Person p3 = new Person("동원쌤", 30, 175, 70);
		
		Person p4 = new Person("수민쌤", 21, 160, 40);
		
		
		
		//객체 배열 선언
		int[] numArray =  {10,20,30};
		
		Person[] pArray = new Person[4];
		pArray[0] = p1;
		pArray[1] = p2;
		pArray[2] = p3;
		pArray[3] = p4;
		
//		pArray[0] ==>p1
		
		p1.getTall();
		pArray[0].getTall();
		System.out.println("키 " + pArray[0].getTall());
		
		System.out.println("나이 " + pArray[1].getAge());
		
		System.out.println((pArray[0].getAge()+pArray[1].getAge()+pArray[2].getAge()+pArray[3].getAge())/4);
		int sum = 0;
		for(int i = 0; i<4; i++) {
			
			sum +=pArray[i].getAge();
			
			
			
		}System.out.println(sum/4);
	
		
	
	
	
	
	
	
	
	
	}

}
