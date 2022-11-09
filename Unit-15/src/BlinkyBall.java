//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{
	int xPos;
	int yPos;
	int xSpeed;
	int ySpeed;
    Color color;
    int width;
    int height;

   //constructors
   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {
	   super(x,y);
	   

   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
	   super(x,y);
	   width = wid;
	   height = ht;


   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y);
	   width = wid;
	   height = ht;
	   xSpeed = xSpd;
	   ySpeed = ySpd;
	   


   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y);
	   width = wid;
	   height = ht;
	   xSpeed = xSpd;
	   ySpeed = ySpd;
	   color = col;



   }

   public Color randomColor()
   {
   	int r = 0;		//use Math.random()
 		int g = 0;
 		int b = 0;
 		r = (int)Math.random() * 20;
 		g = (int)Math.random() * 20;
 		b = (int)Math.random() * 20;
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {	
	   
	   draw(window,randomColor());

	      setX(getX()+xSpeed);
			
	      setY(getY()+ySpeed);

			
	      draw(window);



   }
}