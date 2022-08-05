
public class poketmon {
	
	// 설계도 -> 포켓몬 도감
	
	
	
	
	
	
	
	
	// 성별, 타입, 이름, 도감번호, 공격력, 키, 체력, 몸무게 등
	// --> 이름, 타입, 공격력, 체력, 방어력
	
	private String name;
	private String type;
	private int attack;
	private int hp;
	int def;
	
	// 생성자 메소드
	// 1. 리턴 타입이 없다. -> void 타입도 사용되지 않는다.
	// 2. 클래스의 이름과 메소드의 이름이 동일하다.
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
