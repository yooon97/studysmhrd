
public class ex05�迭����2 {

	public static void main(String[] args) {
		
		int[] arr = {43,15,5,20,13,35,31,17,47,8};
		// arr �迭 �ȿ��� �ִ밪(���� ū ��) ���
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}System.out.println("�ִ밪 : "+max);
		 System.out.println("�ּҰ� : "+min);
	}

}
