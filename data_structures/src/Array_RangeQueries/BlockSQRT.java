package Array_RangeQueries;

public class BlockSQRT {
	static int[] block=new int[10];
	static int bs=0;
	public static void main(String[] args) {
		int[] arr = {43,56,44,56,55,87,98,10,9};	
		int n=arr.length;
		
		preprocess(arr,n);
		System.out.println(query(arr,n,0,2));
		System.out.println(query(arr,n,3,5));
		System.out.println(query(arr,n,6,8));
		System.out.print("blockArray: ");

		for (int i = 0; i < block.length; i++) {
			System.out.print(" ");
			System.out.print(block[i]);
			//System.out.println(" ");
			//System.out.print(" "+arr[i]);

		}
		System.out.println("");
		update(arr,n,6,66);
		System.out.println(query(arr,n,6,8));
		System.out.print("blockArray: ");

		for (int i = 0; i < block.length; i++) {
			System.out.print(" ");
			System.out.print(block[i]);
		//	System.out.print(" ");
			//System.out.print(arr[i]);
		}

	}
	private static void update(int[] arr, int n, int i, int j) {
		// TODO Auto-generated method stub
		arr[i]=j;
		
		preprocess(arr, n);
		//block[i/bs]+=j;
	//	block[i/bs]-=arr[i];
	//	arr[i]=j;

	}
	private static int query(int[] arr, int n,int f,int l) {
		// TODO Auto-generated method stub
		int sum=0;
		while(f<=l&&f%bs!=0) {
			sum+=arr[f];
			f++;
		}
		int i=f+bs;
		System.out.println("fir:"+f+" last:"+l+" blk_size:"+bs+" f+blk_size:"+i+" last+1:"+(int)(l+1));
		while(f+bs<=l+1) {
			sum+=block[f/bs];
			f=f+bs;
			System.out.println("in full block");
		}
		while(f<=l) {
			sum+=arr[f];
			f++;
		}
		return sum;
	}
	private static void preprocess(int[] arr,int n) {
		// TODO Auto-generated method stub
		int blk_idx=-1;
		bs=(int) Math.sqrt(n);
		for (int i = 0; i < arr.length; i++) {
			
			if(i%bs==0) {
				blk_idx++;
				block[blk_idx]=0;
			}
			block[blk_idx]+=arr[i];
		}
		
	}	
}

