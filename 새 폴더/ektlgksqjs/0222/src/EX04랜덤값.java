import java.util.Random;
import java.util.Scanner;

public class EX04������ {

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
				}System.out.print("����Ͻðڽ��ϱ� : ");
					String	end = sc.next();
					if(end.equals("Y")) {
						continue;
					}
					else if(end.equals("N")) {
					System.out.println("����");
					System.out.println("���� ���� : " + c + " Ʋ�� ���� : " + d);
						break; 
			}
		}
	}
}

