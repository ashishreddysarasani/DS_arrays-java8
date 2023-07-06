package Array_sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SortByFrequency {
public static void main(String[] args) {
	int[] arr= {5,4,6,7,13,45,6,45,7,7,13,13};
	int n=arr.length;
	HashMap<Integer, Integer> hm = new HashMap<>();
	
	for (int i = 0; i < arr.length; i++) {
		hm.put(arr[i], hm.get(arr[i])==null?1:hm.get(arr[i])+1);
	}
	int length=0;
	Entry<Integer, Integer> emax=null;
	ArrayList<Entry<Integer,Integer>> i=new ArrayList<>();
	Set<Entry<Integer,Integer>> set=  hm.entrySet();
	for (Entry<Integer, Integer> entry : set) {
		emax = emax==null?entry:emax;
		
		for (Entry<Integer, Integer> entry2 : set) {
			if(emax.getValue()<=entry2.getValue()) {
				emax=entry2;
			}
			 length+=emax.getValue();
			
		}
		i.add(emax);
	}
	
	for (int j = 0; j < arr.length; j++) {
		
	}
	
	for (int k = 0; k < set.size(); k++) {
		for (int j = 0; j < set.size(); j++) {
			
		}
	}
}
} 
