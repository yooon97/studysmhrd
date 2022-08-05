package view;
import java.util.ArrayList; 
import java.util.Scanner;

import Controller.MP3Controller;
import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class Musicmain {

	public static void main(String[] args) {
		
		// view : 사용자가 사용하는 기능, 시각적으로 확인을 할 수 있는 용도로만 쓰인다.
		// - Model이 가지고 있는 데이터를 저장하지 않는다.
		// - 단순히 표시만 하는 기능을 갖는다.
		
		Scanner sc = new Scanner(System.in);
		
		// Controller 객체 생성
		MP3Controller controller = new MP3Controller();
		
		//노래를 Main에서 알려주려면 -> MusicVO객체 생성
		//깡 			Rain 	 100
		//Dalla Dalla 	Itzy 	 120
		//SOLO			JENNIE	 200
		
		while(true) {
			System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료 >>  ");
			int select = sc.nextInt();
			
			if(select == 5) {
				break;
			}
			else if(select == 1) {
				// 곡 정보 출력 메소드
				controller.playing();
			}
			else if(select == 2) {
				//정지
				System.out.println("정지");
				controller.stoping();
			}
			else if(select == 3) {
				//다음곡
				controller.nextplay();
			}
			else if(select == 4) {
				//이전곡
				controller.preplay();
			}
			
		}System.out.println("프로그램 종료");
			controller.stoping();
}
}

