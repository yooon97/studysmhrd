
public class poketmon {
	
	// ���赵 -> ���ϸ� ����
	
	
	
	
	
	
	
	
	// ����, Ÿ��, �̸�, ������ȣ, ���ݷ�, Ű, ü��, ������ ��
	// --> �̸�, Ÿ��, ���ݷ�, ü��, ����
	
	private String name;
	private String type;
	private int attack;
	private int hp;
	int def;
	
	// ������ �޼ҵ�
	// 1. ���� Ÿ���� ����. -> void Ÿ�Ե� ������ �ʴ´�.
	// 2. Ŭ������ �̸��� �޼ҵ��� �̸��� �����ϴ�.
	// 3. 
	
	public poketmon() {
		
	}
	public poketmon(String name,String type,int attack,int def,int hp) {
		this.name = name;
		this.type =type;
		this.attack= attack;
		this.def =def;
		this.hp =def;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	
	
	
	
	
	
}
