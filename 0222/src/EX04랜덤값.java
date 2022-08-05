import java.util.Random;
import java.util.Scanner;

public class EX04랜덤값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int c = 0;
		int d = 0;
			
		while(true) {
		
				int num1 = rd.nextInt(10)+1;
				int num2 = rd.nextInt(10)+1;
		
				System.out.print(num1+"+"+num2+"=");
				int su = sc.nextInt();
				int a = num1+num2;
		
				
				if(su==a) {
					System.out.println("Success");
					c++;
				}	
				else {
					System.out.println("Fail");
					d++;
				}System.out.print("계속하시겠습니까 : ");
					String	end = sc.next();
					if(end.equals("Y")) {
						continue;
					}
					else if(end.equals("N")) {
					System.out.println("종료");
					System.out.println("맞춘 개수 : " + c + " 틀린 개수 : " + d);
						break; 
			}
		}
	}
}

