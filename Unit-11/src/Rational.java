//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int num1 = 0;
	private int den1 = 0;
	
	//add two instance variables

	//write two constructors
	public Rational(){
		
	}
	public Rational(int num1, int den1) {
		setNum(num1);
		setDen(den1);
	}

public void setNum(int a) {
	num1 = a;
}
public void setDen(int b) {
	den1 = b;
}
public int getNum() {
	return num1;
	
}
public int getDen() {
	return den1;
}
	//write a setRational method
	public void setRational(int numerator, int denominator) {
		setNum(numerator);
		setDen(denominator);
		
		
}
	//write  a set method for numerator and denominator
	

	
	public void add(Rational  other)
	{    
		int newNum = (num1*other.getDen()) + (other.getNum()*den1);
		int newDen = den1 * other.getDen();
		num1 = newNum;
		den1 = newDen;
		reduce();
	}

	private void reduce()
	{
		int greatest = gcd(num1,den1);
		num1 /= greatest;
		den1 /= greatest;


	}

	private int gcd(int numOne, int numTwo)
	{
       int greatest = 1;
       for (int i = 2; i < den1; i++) {
    	   if (numOne % i == 0 && numTwo % i == 0) {
    		   greatest = i;
    	   }
       }

		return greatest;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{
		

		return false;
	}

	public int compareTo(Rational other)
	{
      return -1;
		
	}



	
	//write  toString() method
	public String toString() {
		
		
		
		
		return "";
	}
	
}