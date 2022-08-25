//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
	}

	public void StringOddOrEven(String s)
	{
		if (s.length()%2 ==0) {
		 s = s + "is even";
	}
	else {
		word = s + "is odd";
	}
	}
	

	//public void setString(String s)
	//{  //s = word;
	
	//}

 	//public boolean isEven()
 	//{
 		
 		//if (word.length()%2 ==0);
		// word = word + "is even";
		 //return true;
	//}

 	public String toString()
 	{
 		//String output="";
 		return word;
	}
}