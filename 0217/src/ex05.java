import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int num1 = sc.nextInt();
		
		int si = num1/3600;
		int bun = num1%3600/60;
		int cho = num1%3600%60;
		System.out.print(si+ "��");
		System.out.print(bun+ "��");
		System.out.print(cho+ "��");
		
		
	}

}
