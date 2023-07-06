package Array_RangeQueries;

public class countEleDivideL_H {
	public static void main(String[] args) {
		int[] arr= {3,4,2,2,4,6};
	int n=arr.length;
	System.out.println("num total div in Qrange: "+count_divide_l_h(arr,n,1,4));
	System.out.println("num total div in Qrange: "+count_divide_l_h(arr,n,2,6));
	//count_divide_l_h(arr,n,1,4);

	}
static int c=0;
	private static int count_divide_l_h(int[] arr, int n, int i, int j) {
		// TODO Auto-generated method stub
		int count=0;
		int x=i-1;
		for (int f = x; f < j; f++) {
			//System.out.print(" "+f);
			int divided=0;
			for (int j2 = i-1; j2 < j; j2++) {
				//System.out.print(" "+j2);
				if(arr[j2]%arr[f]==0) {
					//System.out.println(j2+" "+f);	
					//if(arr[j2]==2&&arr[f]==2) System.out.println(++c);
					divided++;
				}
				else break;
			}
			//System.out.println(arr[f]+" "+(int)(j)+" "+(int)(i)+" "+(int)(j-i)+ " "+divided);
			if(divided==j-i+1) {
				System.out.println(arr[f]+" j:"+(int)(j)+" i:"+(int)(i)+" j-i:"+(int)(j-i)+" j-i+1:"+(int)(j-i+1)+ " divs"+divided);
	 
				count++;
			}
		}
		return count;
	}
}
