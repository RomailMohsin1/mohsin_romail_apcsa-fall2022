//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private int size = 0;
	private String name = "";
	
	public Skeleton()
	{
    }
	
	public Skeleton(String nm, int sz) {
		setName(nm);
		setSize(sz);
	}
	public void setName(String nm) {
		name = nm;
	}
	public void setSize(int sz) {
		size = sz;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	
	public String toString() {
		return name + "" + size;
	}
	//add instance variables	

	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean namesTheSame(Monster other) {
		// TODO Auto-generated method stub
		return false;
	}

	//add a constructor

	//add code to implement the Monster interface

	//add a toString
}