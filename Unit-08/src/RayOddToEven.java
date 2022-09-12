//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	private int[] nums;
	
public RayOddToEven() {
	nums = new int[5];
}
public RayOddToEven(int[] ray) {
	nums = ray;
}

public static int looper(int[] ray) {
	int[] nums = ray;
	int oddNum = -1;
	int evenNum = -1;
	for( int i = 0; i < nums.length; i++) {
		if (nums[i] % 2 ==1) {
			oddNum = i;
			break;
		}
	}
	if (oddNum == -1) return oddNum;
	for (int o = oddNum + 1; o< nums.length; o++) {
		if (nums[o] % 2 == 0) {
			evenNum = o;
			
		}
	}
	if (evenNum == -1) return evenNum;
	int finalNum = evenNum - oddNum;
	return finalNum;
}
	
	
	
	
	
	
	//public static boolean go(int1[] ray)
	//{
		//return false;
	//}
}