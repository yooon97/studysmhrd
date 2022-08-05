package test;

public class ex03 {

	public static void main(String[] args) {
	// 2~30까지의 약수구하기
		
		for(int a = 2; a < 31; a++) {
			System.out.print(a + "의 약수는 = ");
			for(int b = 1; b <= a; b++) {
				if(a%b==0) {
					System.out.print(b + " ");
					
				}			
			}
				System.out.println();
		}
		}
		
		
}


