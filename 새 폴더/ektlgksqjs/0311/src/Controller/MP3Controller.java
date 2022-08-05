package Controller;

import java.util.ArrayList; 

import Controller.MP3Controller;
import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MP3Controller {

		// Controller : 모델과 뷰를 연결해 주는 역할
		// 모델이나 뷰에 대한 정보를 알아야 한다
		// 모델 또는 뷰의 변경을 인지하여 대체해야 한다.
		
	ArrayList<MusicVO> MusicList = new ArrayList<>();
	
	int index = 0; // 현재 곡 확인을 위한 변수
	
	 //실질적인 MP3 플레이 기능
	MP3Player player= new MP3Player();
	
	//1. 모든 노래 정보를 담을 수 있는 생성자 메소드 생성
		
	public MP3Controller() {
		MusicVO music1 = new MusicVO("깡", "Rain", 100, "C://music/Rain - 깡.mp3");
		MusicVO music2 = new MusicVO("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3");
		//음악 리스트 안에 노래를 넣고싶으면
		MusicList.add(music1);
		MusicList.add(music2);
		MusicList.add(new MusicVO("2002", "Anne Marie", 200, "C://music/Anne Marie - 2002.mp3"));
		MusicList.add(new MusicVO("bad guy", "Billie Eilish", 200, "C://music/Billie Eilish - bad guy.mp3"));
		MusicList.add(new MusicVO("Ring Ding Dong", "SHINee", 200, "C://music/SHINee - Ring Ding Dong.mp3"));
		MusicList.add(new MusicVO("Circle of Life", "Carmen Twillie", 200, "C://music/Carmen Twillie, Lebo M. - Circle of Life.mp3"));
		MusicList.add(new MusicVO("벌써 12시", "CHUNG HA", 200, "C://music/CHUNG HA - 벌써 12시.mp3"));
		MusicList.add(new MusicVO("Let it go", "Indina Menzel", 200, "C://music/Idina Menzel - Let It Go.mp3"));
		MusicList.add(new MusicVO("A Whole New World", "Mena Massoud Naomi Scott", 200, "C://music/Mena Massoud, Naomi Scott - A Whole New World.mp3"));
		MusicList.add(new MusicVO("FANCY", "TWICE", 200, "C://music/TWICE - FANCY.mp3"));
		MusicList.add(new MusicVO("NO ONE", "이하이", 200, "C://music/이하이 - NO ONE.mp3"));
		MusicList.add(new MusicVO("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
		
	}
	
	// 2.재생을 위한 일반 메소드 생성
	public void playing() {
		show(MusicList, index);
		player.play(MusicList.get(index).getPath());
	}
	// 3.곡 정보 출력을 위한 메소드
	public void show(ArrayList<MusicVO> MusicList, int index) {
		int bun;
		int cho;
		bun = MusicList.get(index).getPlayTime()/60;
		cho = MusicList.get(index).getPlayTime()%60;
		System.out.println("제목 : " +MusicList.get(index).getMusicName()+ " 가수 : " + MusicList.get(index).getSinger()+" 시간 : "+bun+"분"+ +cho+"초");
		
	}
	//4.노래 정지를 위한 메소드 생성
	public void stoping() {
		player.stop();
	}
	//5.다음 곡 재셍
	public void nextplay() {
		if(index>=MusicList.size()-1){
			System.out.println("다음 곡이 없습니다.");
			}
			else{
				//노래가 재생 중인지 아닌지 판단하는 기능
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
	

	
	//6.이전 곡 재생
	public void preplay() {
		if(index<=0) {
			System.out.println("이전곡이 없습니다.");
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

