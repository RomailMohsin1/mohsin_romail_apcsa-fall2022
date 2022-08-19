//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.print("********************");
   }

   public void printTwentyDashes()
   {
	   out.print("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.print("\n\n");
   }
   
   public void printASmallBox()
   {	
	   printTwentyStars();
	   printTwoBlankLines();
	   printTwentyDashes();
	   printTwoBlankLines();
	   printTwentyStars();
	   printTwoBlankLines();
	   printTwentyDashes();
	   
	
   }
 
   public void printABigBox()
   { 	
	   printASmallBox();
	   printASmallBox();
   }   
}