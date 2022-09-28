//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	
	
	
	
	
	public static int go( List<Integer> ray )
	{
		int oddNum = -1;
		int evenNum = -1;
		for (int i = 0; i < ray.size(); i++) {
			if(ray.get(i) % 2 == 1) {
				oddNum = i;
				break;
			}
		}
		if (oddNum == -1) return oddNum;
		for (int k = oddNum + 1; k < ray.size(); k++) {
			if (ray.get(k) % 2 == 0) {
				evenNum = k;
			}
		}
		
		if (evenNum == -1) return evenNum;
		int finalNum = evenNum - oddNum;
		
		
		
		
		return finalNum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}