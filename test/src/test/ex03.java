package test;

public class ex03 {

	public static void main(String[] args) {
	// 2~30������ ������ϱ�
		
		for(int a = 2; a < 31; a++) {
			System.out.print(a + "�� ����� = ");
			for(int b = 1; b <= a; b++) {
				if(a%b==0) {
					System.out.print(b + " ");
					
				}			
			}
				System.out.println();
		}
		}
		
		
}


