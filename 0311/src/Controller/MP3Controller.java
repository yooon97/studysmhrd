package Controller;

import java.util.ArrayList; 

import Controller.MP3Controller;
import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MP3Controller {

		// Controller : �𵨰� �並 ������ �ִ� ����
		// ���̳� �信 ���� ������ �˾ƾ� �Ѵ�
		// �� �Ǵ� ���� ������ �����Ͽ� ��ü�ؾ� �Ѵ�.
		
	ArrayList<MusicVO> MusicList = new ArrayList<>();
	
	int index = 0; // ���� �� Ȯ���� ���� ����
	
	 //�������� MP3 �÷��� ���
	MP3Player player= new MP3Player();
	
	//1. ��� �뷡 ������ ���� �� �ִ� ������ �޼ҵ� ����
		
	public MP3Controller() {
		MusicVO music1 = new MusicVO("��", "Rain", 100, "C://music/Rain - ��.mp3");
		MusicVO music2 = new MusicVO("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3");
		//���� ����Ʈ �ȿ� �뷡�� �ְ������
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
		
	}
	
	// 2.����� ���� �Ϲ� �޼ҵ� ����
	public void playing() {
		show(MusicList, index);
		player.play(MusicList.get(index).getPath());
	}
	// 3.�� ���� ����� ���� �޼ҵ�
	public void show(ArrayList<MusicVO> MusicList, int index) {
		int bun;
		int cho;
		bun = MusicList.get(index).getPlayTime()/60;
		cho = MusicList.get(index).getPlayTime()%60;
		System.out.println("���� : " +MusicList.get(index).getMusicName()+ " ���� : " + MusicList.get(index).getSinger()+" �ð� : "+bun+"��"+ +cho+"��");
		
	}
	//4.�뷡 ������ ���� �޼ҵ� ����
	public void stoping() {
		player.stop();
	}
	//5.���� �� ���
	public void nextplay() {
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
				}else 
				{
				player.stop();
				index++;
				show(MusicList, index);
				player.play(MusicList.get(index).getPath());
			}
			}
		 }
	

	
	//6.���� �� ���
	public void preplay() {
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
			else 
			{
				player.stop();
				index--;
			show(MusicList, index);
			player.play(MusicList.get(index).getPath());
				
			}
		}
		}
	
	
}

