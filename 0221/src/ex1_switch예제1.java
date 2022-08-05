//import java.util.Scanner;
//
//public class ex1_switch예제1 {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("글자를 입력해주세요 : ");
//		//.next() : 스트링형태의 데이터를 입력하는 메소드.
//		String data = sc.next();
//		//String 데이터는 참조형 데이터타입 == 비교가 불가능.
////		if(data.equals("한국어")) {
////			System.out.println("안녕하세요");
////		}else if(data.equals("엉어")) {
////			System.out.println("Hello");
////		}
//		// sc.next()
//		switch (data) {
//		case "한국어":
//			System.out.println("안녕하세요");
//			break;
//			//분기문 -> break; // 여기까지 하고 빠져나와주세요 (해당 구문을 끝내주세요)
//		case "영어":
//			System.out.println("헬로");
//			break;
//		case "일본어":
//			System.out.println("곤니찌와");
//			break; 
//		case "중국어":
//			System.out.println("니하오");
//			break; 
//		
//		}
//	}
//}