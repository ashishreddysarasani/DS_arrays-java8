package Array_rotation;

public class Rotation_array {

	public static void main(String[] args) {
		
		//int numrotates = 2;
		
		int mid = 5 / 2;
		System.out.println(mid);
	//	int[] arr = {12,34,65,87,76,35};
		//arrayrotate(arr , numrotates);
		//print(arr);
	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void arrayrotate(int[] arr,int nums) {
		// TODO Auto-generated method stub
		for(int i = 0; i < nums; i++) {
			leftrotate(arr);
		}
	}

	private static void leftrotate(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp = arr[0];
		for(int i = 0;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}
}
