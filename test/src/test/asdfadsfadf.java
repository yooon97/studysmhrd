package test;

import java.util.Scanner;

public class asdfadsfadf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하쇼 : ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하쇼 : ");
		int year = sc.nextInt();
		
		if(score >= 60) {
			if(year != 4)
				System.out.println("합격");	// 전체 
		else if (score >= 70)
			System.out.println("합격"); // 4학년 점수 
		else 
			System.out.println("불합격"); // 4학년 70점미만 일경우 에 해당됨
		}			
		
	}
}


