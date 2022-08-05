import java.util.Scanner;

public class ex03와일문예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fail = 3;
		
		while(true) {
			System.out.print("아이디 : ");
			String	id = sc.next();
			System.out.print("비밀번호 : ");
			String	pw = sc.next();
			if(id.equals("smhrd") && pw.equals("1234")) {
				System.out.println("로그인 성공!");
				break;
			}else {System.out.print("로그인 실패 계속하시겠습니까 : ");
			String	end = sc.next();
				if(end.equals("N")) {
				break;
				}
				else if(end.equals("Y")) {
					fail--;
				System.out.println("남은기회 : " + fail);
				}
					if(fail==0) {
						System.out.println("기회종료");
						break;
					}
			}
						
		}
	}
}

