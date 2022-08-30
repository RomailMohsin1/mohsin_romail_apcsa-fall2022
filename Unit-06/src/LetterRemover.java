//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("",' ');
		
	}

	//add in second constructor
	public LetterRemover( String sent, char ch) {
		setRemover(sent,ch);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int temp = 0;
		String cleaned="";
		while(temp < sentence.length()) {
			if (sentence.charAt(temp) != lookFor) {
				cleaned += sentence.charAt(temp);
			}
			temp++;
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + " = " + removeLetters();
	}
}