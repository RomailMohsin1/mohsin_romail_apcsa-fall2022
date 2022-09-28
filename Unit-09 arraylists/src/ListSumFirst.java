//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int firstNum = ray.get(0);
		int sum = 0;
		for(int i = 0; i < ray.size(); i++) {
		sum+= ray.get(i);	
		}
		if (sum > firstNum) {
			return sum;
		}
		return -1;
	}
}