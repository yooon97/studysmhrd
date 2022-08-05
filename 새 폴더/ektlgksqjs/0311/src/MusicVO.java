
public class MusicVO {
	
	//--> MVC ���� �� Model�� �ش��ϴ� Ŭ����
	// Model : �����͸� �����ϴ� ��
	// - �䳪 ��Ʈ�ѷ��� ���� ��� ������ �� �� ����.
	// - ������ ������ �Ͼ�� ó���� �� �ִ� ����� �����ؾ��Ѵ�. -> getter / setter
	
	
	// �뷡��� �����͸� ǥ�� �� �� �ִ� Ŭ����
	// ����� ���Ƿ� ���� Ŭ����  - vo Ŭ���� (value object)
	
	private String musicName;  //�뷡 ����
	private String singer; // �����̸�
	private int playTime; //play�ð�
	//�뷡 ���� ���
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
