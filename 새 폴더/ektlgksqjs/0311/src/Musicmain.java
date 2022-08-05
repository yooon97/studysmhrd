import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Musicmain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�뷡�� Main���� �˷��ַ��� -> MusicVO��ü ����
		//�� 			Rain 	 100
		//Dalla Dalla 	Itzy 	 120
		//SOLO			JENNIE	 200
		
		MusicVO music1 = new MusicVO("��", "Rain", 100, "C://music/Rain - ��.mp3");
		MusicVO music2 = new MusicVO("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3");
//		MusicVO music3 = new MusicVO("2002", "Anne Marie", 200, "C://music/Anne Marie - 2002.mp3");
//		MusicVO music4 = new MusicVO("bad guy", "Billie Eilish", 200, "C://music/Billie Eilish - bad guy.mp3");
//		MusicVO music5 = new MusicVO("Ring Ding Dong", "SHINee", 200, "C://music/SHINee - Ring Ding Dong.mp3");
//		MusicVO music6 = new MusicVO("Circle of Life", "Carmen Twillie", 200, "C://music/Carmen Twillie, Lebo M. - Circle of Life.mp3");
//		MusicVO music7 = new MusicVO("���� 12��", "CHUNG HA", 200, "C://music/CHUNG HA - ���� 12��.mp3");
//		MusicVO music8 = new MusicVO("Let it go", "Indina Menzel", 200, "C://music/Idina Menzel - Let It Go.mp3");
//		MusicVO music9 = new MusicVO("A Whole New World", "Mena Massoud Naomi Scott", 200, "C://music/Mena Massoud, Naomi Scott - A Whole New World.mp3");
//		MusicVO music10 = new MusicVO("FANCY", "TWICE", 200, "C://music/TWICE - FANCY.mp3");
//		MusicVO music11 = new MusicVO("NO ONE", "������", 200, "C://music/������ - NO ONE.mp3");
//		MusicVO music12 = new MusicVO("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3");
		//���� ����Ʈ �ȿ� �뷡�� �ְ������
		ArrayList<MusicVO> MusicList = new ArrayList<MusicVO>();
		MusicList.add(music1);
		MusicList.add(music2);
		MusicList.add(new MusicVO("2002", "Anne Marie", 200, "C://music/Anne Marie - 2002.mp3"));
		MusicList.add(new MusicVO("bad guy", "Billie Eilish", 200, "C://music/Billie Eilish - bad guy.mp3"));
		MusicList.add(new MusicVO("Ring Ding Dong", "SHINee", 200, "C://music/SHINee - Ring Ding Dong.mp3"));
		MusicList.add(new MusicVO("Circle of Life", "Carmen Twillie", 200, "C://music/Carmen Twillie, Lebo M. - Circle of Life.mp3"));
		MusicList.add(new MusicVO("���� 12��", "CHUNG HA", 200, "C://music/CHUNG HA - ���� 12��.mp3"));
		MusicList.add(new MusicVO("Let it go", "Indina Menzel", 200, "C://music/Idina Menzel - Let It Go.mp3"));
		MusicList.add(new MusicVO("A Whole New World", "Mena Massoud Naomi Scott", 200, "C://music/Mena Massoud, Naomi Scott - A Whole New World.mp3"));
		MusicList.add(new MusicVO("FANCY", "TWICE", 200, "C://music/TWICE - FANCY.mp3"));
		MusicList.add(new MusicVO("NO ONE", "������", 200, "C://music/������ - NO ONE.mp3"));
		MusicList.add(new MusicVO("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
		
		
		int bun = 0;
		int cho = 0;
		//���° �뷡���� ? -> �ε����� �Ǵ� ����
		int index = 0;
	    //�������� MP3 �÷��� ���
		MP3Player player= new MP3Player();
		
		
		
		while(true) {
			System.out.print("1.��� 2.���� 3.������ 4.������ 5.���� >>  ");
			int select = sc.nextInt();
			
			if(select == 5) {
				break;
			}
			else if(select == 1) {
				// �� ���� ��� �޼ҵ�
				show(MusicList, index);
				player.play(MusicList.get(index).getPath());
			}
			else if(select == 2) {
				//����
				System.out.println("����");
				player.stop();
			}
			else if(select == 3) {
				//������
				
				
				if(index>=MusicList.size()-1){
				System.out.println("���� ���� �����ϴ�.");
				
				}
				else{
					//�뷡�� ��� ������ �ƴ��� �Ǵ��ϴ� ���
					if(player.isPlaying()) {
						player.stop();
						
						index++;
						show(MusicList, index);
						player.play(MusicList.get(index).getPath());
				}else {
					index++;
					show(MusicList, index);
					player.play(MusicList.get(index).getPath());
					
				}
					

				}
			}
			else if(select == 4) {
				//������
				
				if(index<=0) {
					System.out.println("�������� �����ϴ�.");
				}
				else{
					if(player.isPlaying()) {
						player.stop();
						
						index--;
				show(MusicList, index);
				player.play(MusicList.get(index).getPath());
					}
					else {
						index--;
					show(MusicList, index);
					player.play(MusicList.get(index).getPath());
						
					}
				}
				}
			
			}System.out.println("���α׷� ����");
			player.stop();
			
		}

	public static void show(ArrayList<MusicVO> MusicList, int index) {
		int bun;
		int cho;
		bun = MusicList.get(index).getPlayTime()/60;
		cho = MusicList.get(index).getPlayTime()%60;
		System.out.println("���� : " +MusicList.get(index).getMusicName()+ " ���� : " + MusicList.get(index).getSinger()+" �ð� : "+bun+"��"+ +cho+"��");
		
	}
		
		
		
		
		
		
		
		
		
	}


