//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
 
{
	private int[] nums;
	
	
	public  RaySumLast() {
	   nums = new int[5];
	}
	
	public  RaySumLast(int[] ray) {
		   nums = ray;
	}
	
	
	
	public String toString(){
		String output = " ";
		int count = 0;
		int finalnum = nums[nums.length - 1];
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > finalnum) {
				count += nums[i];
			}
		}
		if (count == 0) count = -1;
		output = " " + count;
		return output;
}
}