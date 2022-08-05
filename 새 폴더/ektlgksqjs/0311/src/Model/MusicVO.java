package Model;

public class MusicVO {
	
	//--> MVC 패턴 중 Model에 해당하는 클래스
	// Model : 데이터를 관리하는 곳
	// - 뷰나 컨트롤러에 대한 어떠한 정보도 알 수 없다.
	// - 데이터 변경이 일어나면 처리할 수 있는 방법을 구현해야한다. -> getter / setter
	
	
	// 노래라는 데이터를 표현 할 수 있는 클래스
	// 사용자 임의로 만든 클래스  - vo 클래스 (value object)
	
	private String musicName;  //노래 제목
	private String singer; // 가수이름
	private int playTime; //play시간
	//노래 파일 경로
	private String path;
	
	
	public   MusicVO(String musicName, String singer, int playTime, String path) {
			this.musicName = musicName;
			this.singer = singer;
			this.playTime = playTime;
			this.path = path;
	}

	public String getMusicName() {
		return musicName;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}
	public String getPath() {
		return path;
	}
}
