//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private int total;

	//add constructors
   public void perfect() {
	   setNum(0);
   }

   public void perfect (int num) {
	   setNum(num);
   }
	//add a set method
   public void setNum(int i) {
	   number = i;
	   total = 0;
   }

	public boolean isPerfect()
	{
		int temp = 1;
		while (temp < number) {
			if (number % temp == 0) {
				total += temp;
			}
			temp++;
		}
		if (total == number) return true;
		else 
		return false;
	}

	//add a toString	
	 public String toString() {
		 if (isPerfect() == true) {
			 return number + "is perfect";
			 
		 }
		 else return number + " is not perfect";
	 }
}