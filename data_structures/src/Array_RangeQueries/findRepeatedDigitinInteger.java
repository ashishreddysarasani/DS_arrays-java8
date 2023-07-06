package Array_RangeQueries;

import java.util.HashSet;
import java.util.Set;

public class findRepeatedDigitinInteger {
public static void main(String[] args) {
	
	int digit=100,j=0;
	for (int i = 0; i <= digit; i++) {
		 j +=  findRepeatedDigit(i);
	}
	System.out.println(" total num repeated from 0-100: "+j);
}

private static int findRepeatedDigit(int i) {
	// TODO Auto-generated method stub
	Set<Integer> s = new HashSet<>();
	int key=0;
	while(i!=0) {
		key=i%10;
		if(s.contains(key)) {
			return 1;
		}
		s.add(key);
		i/=10;
	}
	return 0;
}
}
