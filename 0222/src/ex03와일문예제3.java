import java.util.Scanner;

public class ex03���Ϲ�����3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fail = 3;
		
		while(true) {
			System.out.print("���̵� : ");
			String	id = sc.next();
			System.out.print("��й�ȣ : ");
			String	pw = sc.next();
			if(id.equals("smhrd") && pw.equals("1234")) {
				System.out.println("�α��� ����!");
				break;
			}else {System.out.print("�α��� ���� ����Ͻðڽ��ϱ� : ");
			String	end = sc.next();
				if(end.equals("N")) {
				break;
				}
				else if(end.equals("Y")) {
					fail--;
				System.out.println("������ȸ : " + fail);
				}
					if(fail==0) {
						System.out.println("��ȸ����");
						break;
					}
			}
						
		}
	}
}

