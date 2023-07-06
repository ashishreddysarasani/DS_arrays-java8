package Array_rotation;

public class Rotatedsearch {

	public static void main(String[] args) {
		int arr[] = {11, 15, 6, 8, 9, 10};
        int key = 19;
        int n = arr.length;
		System.out.println(rotatedsearc(arr,key,n));
		
	}

	private static boolean rotatedsearc(int[] arr,int key,int n) {
		// TODO Auto-generated method stub
		int l=0,h=n;
      int hi= findpivot(arr,n,l,h);
      if(hi==-1) return false;
      int lw=hi+1;
      
      while(hi!=lw) {
    	  
    	  if(arr[lw]+arr[hi] ==key) 
    		  return true;

    	  if(arr[lw]+arr[hi] <key) lw =( lw +1 )%n;
    	  else hi = (n+hi-1);
    	  
      }
      return false;
	}

	private static int findpivot(int[] arr, int n, int l, int h) {
		// TODO Auto-generated method stub
		if(h<l) return -1;
		int mid = (l+h)/2;
		if(mid<h&&arr[mid]<arr[mid+1]) return mid;
		if(mid>l&&arr[mid]<arr[mid-1]) return mid-1;
		if(arr[mid]<=arr[l])
			return findpivot(arr, n, l, mid-1);
		return findpivot(arr, n, mid+1, h);
	}
}
