//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public  class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;
	private int Xpos;
	private int Ypos;
	private Color color;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	
public Ball(int xs, int ys) {
	xSpeed = xs;
	ySpeed = ys;
}

public Ball(int xs, int ys, int x, int y) {
	super(x,y);
	
	Xpos = x;
	Ypos = y;
}

public Ball(int xs, int ys, int x, int y, Color c) {
	super(x,y);
	xSpeed = xs;
	ySpeed = ys;
	color = c;
}
public Ball(int xs, int ys, int x, int y, Color c, int w, int h) {
	super(x,y,w,h);
	xSpeed = xs;
	ySpeed = ys;
	color = c;
}
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
   public void setxSpeed(int xs) {
	   xSpeed = xs; 
   }
   
   public void setySpeed(int ys) {
	   ySpeed = ys; 
   }
   
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window,Color.white);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);

		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		if(super.equals(other)&&getxSpeed()==other.getxSpeed()&&getySpeed()==other.getySpeed()) {
         return true;
		}



		return false;
	}   

   //add the get methods
	
	 public int getxSpeed() {
		   return xSpeed; 
	   }
	 
	 public int getySpeed() {
		   return ySpeed; 
	   }
	   

   //add a toString() method
	 
	 public String toString(String output) {
		 output = "";
		 output = "" + xSpeed + "" + ySpeed;
		 return output;
		 
	 }

@Override
public void setPos(int x, int y) {
	// TODO Auto-generated method stub
	Xpos = x;
	Ypos = y;
}

@Override
public void setX(int x) {
	// TODO Auto-generated method stub
	xSpeed = x;
}

@Override
public void setY(int y) {
	// TODO Auto-generated method stub
	ySpeed = y;
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}