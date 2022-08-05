
public class ex11_switch_case {

	public static void main(String[] args) {

		int num = 40;
		
		//switch(기준값)
		//case value: ==> 기준값이랑 value랑 비교해서 같다면 실행시키세요
		//실행문장을 {}로 묶어주지 않는다
		//case에서 한번 true로 나온순간 밑에를 전부 true로 인식함
		switch (num) {
		case 10:
			System.out.println("10이 들어있습니다.");
			break;
			//분기문 -> break; // 여기까지 하고 빠져나와주세요 (해당 구문을 끝내주세요)
		case 20:
			System.out.println("20이 들어있습니다.");
			break;
		case 30:
			System.out.println("30이 들어있습니다.");
			break; 
		
			
		default : // 다중 if문의 else에 해당한다.
			//switch case문에 들어오면 기본으로 이건 해야한다.
			System.out.println("10 20 30이 아닙니다.");
		}
		// break -- 이쪽으로 빠져나와짐
		
		
	}

}
