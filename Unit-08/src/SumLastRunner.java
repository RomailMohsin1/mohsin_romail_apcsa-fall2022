//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{			
		RaySumLast test = new RaySumLast(new int[] {-99,1,2,3,4,5,6,7,8,9,10,5});
		System.out.println(test);
		
		RaySumLast test1 = new RaySumLast(new int[] {10,9,8,7,6,5,4,3,2,1,-99});
		System.out.println(test1);
		
		RaySumLast test2 = new RaySumLast(new int[] {10,20,30,40,50,-11818,40,30,20,10});
		System.out.println(test2);
		
		RaySumLast test3 = new RaySumLast(new int[] {255,255});
		System.out.println(test3);
	}
}