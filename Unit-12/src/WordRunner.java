//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\mohsinr2745\\Desktop\\apcsa_fall\\mohsin_romail_apcsa-fall2022\\Unit-12\\src\\words.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word[] arr = new Word[size];
		for (int i = 0; i < size; i++) {
			arr[i] = new Word(file.nextLine());
		}
	
		
      sort(arr);
      
      for (int i = 0; i < size; i++) {
    	  System.out.println(arr[i].getWord());
      }
	}
public static void sort(Word[] arr) {
	for (int i = 0; i < arr.length; i++) {
		for ( int j = 0; j < arr.length-1; j++) {
			if ( arr[j].compareTo(arr[j+1])> 0) {
				Word temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
	}
}
	

}








	}
}