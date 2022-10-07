//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		set(0,1,"jj");
		set(1,2,"m");
		set(2,3,"k");
		set(3,4,"L");
		
		
		
		
		
		
	}

	public String getNameOfOldest()
	{
		int max = pups[0].getAge();
		String oldestName = pups[0].getName();
		for ( int i = 1; i < pups.length; i++) {
			
			if ( pups[i].getAge() > max) {
				max = pups[i].getAge();
				oldestName = pups[i].getName();
			}
			
		}
		
			
			
			
			
			
			
			
			
			
			return oldestName;
	}

	public String getNameOfYoungest()
	{
		int min = pups[0].getAge();
		String youngestName = pups[0].getName();
		for (int i = 1; i <pups.length; i++) {
			if ( pups[i].getAge() < min) {
				min = pups[i].getAge();
				youngestName = pups[i].getName();
			}
		}
		return youngestName;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}