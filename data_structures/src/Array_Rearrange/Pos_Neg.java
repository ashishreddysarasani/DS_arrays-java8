package Array_Rearrange;

public class Pos_Neg {
	public static void main(String[] args) {
		int arr[]= {45,-98,-76,-6,4,5,3,-8,0,0};
		int n=arr.length;
		posneg(arr,n);
		for(int i=0;i<n;i++) System.out.println(arr[i]);
	}
	
	private static void posneg(int[] arr,int n) {
		// TODO Auto-generated method stub
		
		int j=-1,temp=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				j++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		int pos=j+1,neg=0;
		while(neg<pos&&pos<n&&arr[neg]<0) {
			temp=arr[pos];
			arr[pos]=arr[neg];
			arr[neg]=temp;
			
			pos++;
			neg=neg+2;
		}
	}	
}

