package Array_searching;

public class Check_For_Majority_Element_15_16 {
	public static void main(String[] args) {
		int[] arr= {2,2,2,2,2,4,5,6,7,9};
		int n=arr.length,count=0,key=2;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		if(n%2==0&&count>n/2) System.out.println(count);
		else if(count>=n/2){ System.out.println(" ele not satisfied "+count+" else false");}
	}
}