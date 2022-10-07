//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for ( String name : toys.split(" ")) {
			Toy i = getThatToy(name);
			if (i ==null) {
				toyList.add(new Toy(name));
				
			}
			else {
				i.setCount(i.getCount()+1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy i : toyList) {
  			if (i.getName().equals(nm)) {
  				return i;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = 0;
  		String maxName = "";
  		for (int i = 0; i < toyList.size(); i++) {
  			if ( toyList.get(i).getCount() > max) {
  				max = toyList.get(i).getCount();
  				maxName = toyList.get(i).getName();
  			}
  		}
  		return " max == " + maxName;
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> temp = new ArrayList<Toy>();
  		int size = toyList.size();
  		for ( int i = 0; i < size; i ++) {
  			int max = 0;
  			int maxi = 0;
  			for ( int j = 0; j < toyList.size(); j++) {
  				if (toyList.get(j).getCount() > max) {
  					max = toyList.get(j).getCount();
  					maxi = j;
  				}
  			}
  				temp.add(toyList.get(maxi));
  		}
  		
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}