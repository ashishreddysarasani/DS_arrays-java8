package Array_orderstats;

public class Atleat2Greater {
	public static void main(String[] args) {
		
		int[] arr = {43,56,44,56,55,87,98,10,9,0};	
		int n=arr.length;
		int count =0;
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {
					count++; 
					if(count>2) System.out.println(arr[i]+" "+count);
				}
				
			}
			count =0;
			
		}
	}
}
