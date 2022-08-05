import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Musicmain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//노래를 Main에서 알려주려면 -> MusicVO객체 생성
		//깡 			Rain 	 100
		//Dalla Dalla 	Itzy 	 120
		//SOLO			JENNIE	 200
		
		MusicVO music1 = new MusicVO("깡", "Rain", 100, "C://music/Rain - 깡.mp3");
		MusicVO music2 = new MusicVO("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3");
//		MusicVO music3 = new MusicVO("2002", "Anne Marie", 200, "C://music/Anne Marie - 2002.mp3");
//		MusicVO music4 = new MusicVO("bad guy", "Billie Eilish", 200, "C://music/Billie Eilish - bad guy.mp3");
//		MusicVO music5 = new MusicVO("Ring Ding Dong", "SHINee", 200, "C://music/SHINee - Ring Ding Dong.mp3");
//		MusicVO music6 = new MusicVO("Circle of Life", "Carmen Twillie", 200, "C://music/Carmen Twillie, Lebo M. - Circle of Life.mp3");
//		MusicVO music7 = new MusicVO("벌써 12시", "CHUNG HA", 200, "C://music/CHUNG HA - 벌써 12시.mp3");
//		MusicVO music8 = new MusicVO("Let it go", "Indina Menzel", 200, "C://music/Idina Menzel - Let It Go.mp3");
//		MusicVO music9 = new MusicVO("A Whole New World", "Mena Massoud Naomi Scott", 200, "C://music/Mena Massoud, Naomi Scott - A Whole New World.mp3");
//		MusicVO music10 = new MusicVO("FANCY", "TWICE", 200, "C://music/TWICE - FANCY.mp3");
//		MusicVO music11 = new MusicVO("NO ONE", "이하이", 200, "C://music/이하이 - NO ONE.mp3");
//		MusicVO music12 = new MusicVO("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3");
		//음악 리스트 안에 노래를 넣고싶으면
		ArrayList<MusicVO> MusicList = new ArrayList<MusicVO>();
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
		
		
		int bun = 0;
		int cho = 0;
		//몇번째 노래인지 ? -> 인덱스로 판단 가능
		int index = 0;
	    //실질적인 MP3 플레이 기능
		MP3Player player= new MP3Player();
		
		
		
		while(true) {
			System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료 >>  ");
			int select = sc.nextInt();
			
			if(select == 5) {
				break;
			}
			else if(select == 1) {
				// 곡 정보 출력 메소드
				show(MusicList, index);
				player.play(MusicList.get(index).getPath());
			}
			else if(select == 2) {
				//정지
				System.out.println("정지");
				player.stop();
			}
			else if(select == 3) {
				//다음곡
				
				
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
				}else {
					index++;
					show(MusicList, index);
					player.play(MusicList.get(index).getPath());
					
				}
					

				}
			}
			else if(select == 4) {
				//이전곡
				
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
					else {
						index--;
					show(MusicList, index);
					player.play(MusicList.get(index).getPath());
						
					}
				}
				}
			
			}System.out.println("프로그램 종료");
			player.stop();
			
		}

	public static void show(ArrayList<MusicVO> MusicList, int index) {
		int bun;
		int cho;
		bun = MusicList.get(index).getPlayTime()/60;
		cho = MusicList.get(index).getPlayTime()%60;
		System.out.println("제목 : " +MusicList.get(index).getMusicName()+ " 가수 : " + MusicList.get(index).getSinger()+" 시간 : "+bun+"분"+ +cho+"초");
		
	}
		
		
		
		
		
		
		
		
		
	}


