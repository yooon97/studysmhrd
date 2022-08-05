
public class ex05배열예제2 {

	public static void main(String[] args) {
		
		int[] arr = {43,15,5,20,13,35,31,17,47,8};
		// arr 배열 안에서 최대값(제일 큰 값) 출력
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}System.out.println("최대값 : "+max);
		 System.out.println("최소값 : "+min);
	}

}
