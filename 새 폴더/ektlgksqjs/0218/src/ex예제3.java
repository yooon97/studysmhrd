import java.util.Scanner;

public class ex����3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("JAVA������ �Է��ϼ��� : ");
		int ja = sc.nextInt();
		System.out.print("Python������ �Է��ϼ��� : ");
		int py = sc.nextInt();
		System.out.print("Android������ �Է��ϼ��� : ");
		int an = sc.nextInt();
		
		int a = ja+py+an; 
		
		if((double)a/3 > 80) {
			System.out.print("�հ�");
		}
		
		
	}

}
