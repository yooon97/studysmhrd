package view;
import java.util.ArrayList; 
import java.util.Scanner;

import Controller.MP3Controller;
import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class Musicmain {

	public static void main(String[] args) {
		
		// view : ����ڰ� ����ϴ� ���, �ð������� Ȯ���� �� �� �ִ� �뵵�θ� ���δ�.
		// - Model�� ������ �ִ� �����͸� �������� �ʴ´�.
		// - �ܼ��� ǥ�ø� �ϴ� ����� ���´�.
		
		Scanner sc = new Scanner(System.in);
		
		// Controller ��ü ����
		MP3Controller controller = new MP3Controller();
		
		//�뷡�� Main���� �˷��ַ��� -> MusicVO��ü ����
		//�� 			Rain 	 100
		//Dalla Dalla 	Itzy 	 120
		//SOLO			JENNIE	 200
		
		while(true) {
			System.out.print("1.��� 2.���� 3.������ 4.������ 5.���� >>  ");
			int select = sc.nextInt();
			
			if(select == 5) {
				break;
			}
			else if(select == 1) {
				// �� ���� ��� �޼ҵ�
				controller.playing();
			}
			else if(select == 2) {
				//����
				System.out.println("����");
				controller.stoping();
			}
			else if(select == 3) {
				//������
				controller.nextplay();
			}
			else if(select == 4) {
				//������
				controller.preplay();
			}
			
		}System.out.println("���α׷� ����");
			controller.stoping();
}
}

