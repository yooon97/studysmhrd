import java.util.Scanner;

public class Ex09_if_else���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num%10 >= 5) {
			System.out.println(num/10*10+10);
		}else {
			System.out.println(num/10*10);
		}
		
		
		
		
	}

}
