
public class Person {
	
	//�̸�
	private String name;
	 //����
    private int age;
	//Ű
	private int tall;
	//������
	private int weight;
	
	//this�� Ű����� Ŭ���� ���� �ִ� �ʵ带 ��Ȯ�� ¤���ٶ� ����ϴ� Ű����
		
	
		//������ --> Ư���� �޼ҵ� --> Ŭ���� ��ŭ�� ������ �Ҵ��Ѵ�
		//1. �޼ҵ� �̸��� ������ Ŭ���� �̸��� ���ƾ��Ѵ� -> Person�̶�� �ϴ� �޼ҵ带 ����
		//2. ��ȯ Ÿ���� ���� ���� ��ü�� ���� ����
	
		
//		public Person() {   }   --> default ������
//							Ŭ������ ���鶧 �ڵ����� �������
//							���ο� �����ڸ� ����� �ִ¼��� ������
//							���ο� �����ڸ� ����ڿ� ����ϰ� �ʹٸ� ��������Ƿ� ����� ����Ѵ�
		
		//������ �����ε�!
		
	
	
	
	
		public Person() {
			
		}
		
		public Person(String name, int age, int tall, int weight) {
		this.name = name;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
	}
		//�����͸� �޾Ƽ� �����̶�� �ʵ尪�� �����Ű�� ���
		
		
		
		
		
		
		public void getData() {
			System.out.println(name+","+age+","+tall+","+weight);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getTall() {
			return tall;
		}
		public void setTall(int tall) {
			this.tall = tall;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
	}
	
	
	
	
