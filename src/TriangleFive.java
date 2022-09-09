//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < amount; i++) {
			for( int j = amount; j > 0; j--) {
				for (int o = 0; o < j; o++) {
					if (i < j) {
						output += (char) (letter + (amount -j));
					}
				}
				output += " ";
			}
			output += "\n";
		}
		return output;
	}
}