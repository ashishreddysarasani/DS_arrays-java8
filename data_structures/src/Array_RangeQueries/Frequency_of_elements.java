package Array_RangeQueries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Frequency_of_elements {
	public static void main(String[] args) {
		
		int[] arr= {1,2,2,3,3,3};
		int n=arr.length;
		int[][] queries = {{0,1},
				{1,1},
				{0,2},
				{1,3},
				{3,5},
				{0,5}
		};
		
		for (int i = 0; i < queries.length; i++) {
			solvefrequency(arr,n,queries[i][0],queries[i][1]);
			System.out.println("after query :"+(int)(i+1)+" completed");

		}
	}

	private static void solvefrequency(int[] arr, int n, int l, int h) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm= new HashMap<>();
				for (int i = l; i <= h; i++) {
					if(hm.containsKey(arr[i])) {
						hm.put(arr[i], hm.get(arr[i])+1);
						
					}
					else {
						hm.put(arr[i], 1);
						
					}
				}
		Set<Map.Entry<Integer,Integer>> s=hm.entrySet();
		for (Map.Entry<Integer,Integer> entry : s) {
			if(entry.getKey()==entry.getValue()) {
				System.out.println("freq of val :"+entry.getValue());
				//System.out.print(entry.getValue()+" ");
				}
		}
		
		
	}
	
}