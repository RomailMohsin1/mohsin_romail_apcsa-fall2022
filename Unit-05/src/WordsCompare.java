//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
	}

	public void WordsCompare(String one, String two)
	{ 
		wordOne = one;
		wordTwo = two;
		compare = one.compareTo(two);
	
	}

	public void setWords(String one, String two)
	{
		//one = wordOne;
		//two = wordTwo;

	}

	public void compare()
	{
	}

	public String toString()
	{
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}