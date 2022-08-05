import java.util.ArrayList;

public class exArraylist01 {

	public static void main(String[] args, Person p2, Person p3, Person p1, Person p4) {
		
		//배열의 한계 : 이미 크기를 정해져 버려서 데이터를 추가하거나 배열의 크기를 바꿀 수 없다
		//배열의 한계를 뛰어 넘는 배열 : Arraylist
		
		
		//ArrayList 선언 방식
		//ArrayList<배열에 들어갈 데이터의 타입> 어레이리스트명(배열명) = new ArrayList<String>(); 
		//ArrayList에 들어가는 타입은 레퍼런스 타입만 가능함(기본 자료형 타입은 쓸수 없다)
		//기본 데이터 타입으로 ArrayList 를 만들어 주기 위해서는
		//기본데이터 타입을 표현할 수 있는 클래스를 활용해주면 된다
		ArrayList<String> nameArray = new ArrayList<String>();
		
		//데이터 추가 .add("넣고 싶은 데이터") --> 데이터 입력한 순서대로 배열에 들어간다
		//즉 배열과 같음
		nameArray.add("승환쌤");
		nameArray.add("형쌤");
		nameArray.add("동원쌤");
		nameArray.add("자연쌤");
		nameArray.add("수민쌤");
		
		//데이터 출력 
		//승환쌤 데이터
		System.out.println(nameArray.get(0));
		
		//ArrayListy 크기 -> .size() -- 일반 배열에서의 length와같음
		
		//데이터 삭제! (지우고싶은 인덱스번호)
		//어떤 특정 조건에서 해당하는 데이터만 지우고 싶을때
		nameArray.remove(2);
		
		System.out.println(nameArray.size());
		
		//데이터 삽입!
		nameArray.add(1,"동명");
		
		System.out.println(nameArray);
		
		ArrayList<Person> pArrayList = new ArrayList<Person>();
		
		for(int i=0; i > pArrayList.size(); i++) {
			
		}
		
		
		
	}
	
}
