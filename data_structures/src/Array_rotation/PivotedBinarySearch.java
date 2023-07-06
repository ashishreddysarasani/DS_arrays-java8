package Array_rotation;

public class PivotedBinarySearch {

	public static void main(String[] args) {
		
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr.length;
        int key=7;
		int p = pivotedsearch(arr,n,key);
		System.out.println("found at " + p);
	}

	private static int pivotedsearch(int[] arr, int n,int key) {
		// TODO Auto-generated method stub
		int h=n-1 ,l=0;
		int pivot = findpivot(arr , l ,h);
		System.out.println("pivot value "+  pivot);
		if(pivot == -1) return binarysearch(arr,0,n-1,key);
		if(arr[pivot]==key) return pivot;
		if(arr[0]==key) return 0;
		if(arr[0]< key) return binarysearch(arr,l,pivot,key);
		return binarysearch(arr,pivot + 1,h,key);
	}

	private static int binarysearch(int[] arr,int l,int h,int key) {
		// TODO Auto-generated method stub
		
		if(h<l) return -1;
		int mid = (l+h) /2;
		if(arr[mid]==key) return mid;
		if(arr[mid] <key ) 
			return binarysearch(arr,mid+1,h,key);
		
		return binarysearch(arr, l, mid-1, key);
	}

	private static int findpivot(int[] arr, int low ,int high) {
		// TODO Auto-generated method stub
		
		 // base cases
        if (high < low)
            return -1;
       // if (high == low)
        //    return low;
 
        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findpivot(arr, low, mid - 1);
        return findpivot(arr, mid + 1, high);
	}
}
