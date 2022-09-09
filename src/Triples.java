//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{

        setNum(num);
	}

	public void setNum(int num)
	{

     number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		for ( int i =1; i <= a && i <=b && i<= c; i++) {
			if (a % i == 0 & b % i == 0 && c % i == 0) {
				max = i;
			}
		}
     


		return max;
	}
   private boolean test(int a, int b, int c) {
	   if (greatestCommonFactor(a,b,c) <= 1) {
		   if ((double)(Math.pow( a,2)) + (double)(Math.pow(b, 2)) == (double)(Math.pow(c, 2))) {
			   if (a < b) {
				   if (c % 2 == 1) {
					   if (a % 2 == 0 && b% 2 == 1) {
						   return true;
						   
					   }
					   if (a % 2 == 1 && b % 2 ==0) {
						   return true;
					   }
				   }
			   }
		   }
	   }
	   return false;
   }
   
   
   
   
   
	public String toString()
	{
		String output="";
		int a,b,c;
		for (a = 1; a < number; a++) {
			for (b = 1; b < number; b++) {
				for (c = 1; c < number; c++) {
					if (test(a,b,c) == true) output += "" + a + "" + b +"" + c + "\n";
				}
			}
		}






		return output+"\n";
	}
}