//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare test = new WordsCompare();
		//add test cases
	   test.WordsCompare("abe", "ape");
	   System.out.println(test.toString());
	   
	   test.WordsCompare("giraffe", "gorilla");
	   System.out.println(test.toString());
	   
	   test.WordsCompare("fun", "funny");
	   System.out.println(test.toString());
	   
	   test.WordsCompare("123", "19");
	   System.out.println(test.toString());
	   
	   test.WordsCompare("193", "1910");
	   System.out.println(test.toString());

	}
}