//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		sort();
	}

	public void sort()
	{
		int size = wordRay.length;
		int counted = 0;
		String [] sorted = new String[size];
		
		for (int i = 0; i < wordRay.length; i++) {
			for (int j  = i + 1; j < wordRay.length; j++) {
				if (wordRay[i].compareTo(wordRay[j])>0) {
					//String temp = wordRay[i];
					//wordRay[i] = wordRay[j];
					wordRay[i] =  sorted[counted];
					wordRay[i] = wordRay[j];
					counted++;
				}
			}
		}
		System.out.println(Arrays.toString(wordRay));
	}

	public String toString()
	{
		//System.out.println(Arrays.toString(wordRay));
		String output="";
		return output+"\n\n";
		
	}
}