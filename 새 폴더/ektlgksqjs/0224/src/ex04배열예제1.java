
public class ex04배열예제1 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		//배열의 크기를 구해오는건 .length
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}
