package test;

public class ex04 {


		public static void main(String[] args) {
			for(int a = 1; a<6; a++) {
				for(int b=1; b<6-a; b++) {
					System.out.print(" ");
				}
				for(int c = 0; c<a; c++) {
					System.out.print("*");
							
				}
				System.out.println();
			}
		}
}

