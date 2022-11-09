//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;
   private Color color;
   public Paddle()
   {
		super(10,10);
      speed = 5;
   }


   //add the other Paddle constructors
public Paddle(int x, int y) {
	super(x,y);
}

public Paddle(int x, int y, int s) {
	super(x,y);
	speed = s;
}
public Paddle(int x, int y, int s, int w, int h) {
	super(x,y,w,h);
	speed = s;
}
public Paddle(int x, int y, int s, int w, int h, Color c) {
	super(x,y,w,h);
	speed = s;
	color = c;
}
public Paddle(int x, int y, int s, int w, Color c, int h) {
	super(x,y,w,h);
	speed = s;
	color = c;
}






   public void setSpeed (int s) {
	   speed = s;
   }



   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   super.setY(super.getY()-speed);
	   draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   super.setY(super.getY()+speed);
	   draw(window);


   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   
   //add a toString() method
  public String toString() {
	  String output = "";
	  return output;
  }
   
   
   
   
   
   
   
   
   
   
   
}