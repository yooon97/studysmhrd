import java.util.Scanner;

public class ex예제3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("JAVA점수를 입력하세요 : ");
		int ja = sc.nextInt();
		System.out.print("Python점수를 입력하세요 : ");
		int py = sc.nextInt();
		System.out.print("Android점수를 입력하세요 : ");
		int an = sc.nextInt();
		
		int a = ja+py+an; 
		
		if((double)a/3 > 80) {
			System.out.print("합격");
		}
		
		
	}

}
