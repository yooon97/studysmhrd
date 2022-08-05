import java.util.Scanner;

public class ex08이중for문1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("원하는 단 : ");
		int dan = sc.nextInt();
		System.out.print("원하는 수 : ");
		int su = sc.nextInt();
			for(int a = 1; a<=su; a++) {
			System.out.println(dan + "*" + a +"=" + dan*a);
			}
		}
		
		
		
		
		
		
}
