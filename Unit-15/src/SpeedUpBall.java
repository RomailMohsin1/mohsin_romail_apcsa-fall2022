//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends BlinkyBall
{
	int xPos;
	int yPos;
	int xSpeed;
	int ySpeed;
    Color color;
    int width;
    int height;
   //instance variables

   public SpeedUpBall()
   {


   }

   public SpeedUpBall(int x, int y)
   {
	   xPos = x;
	   yPos = y;

   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   xPos = x;
	   yPos = y;
	   xSpeed = xSpd;
	   ySpeed = ySpd;

   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   xPos = x;
	   yPos = y;
	   xSpeed = xSpd;
	   ySpeed = ySpd;
	   width = wid;
	   height = ht;

   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   xPos = x;
	   yPos = y;
	   xSpeed = xSpd;
	   ySpeed = ySpd;
	   width = wid;
	   height = ht;
	   color = Color.black;



   }

   public void setXSpeed( int xSpd )
   {
        super.setxSpeed(xSpd +1);



   }

   public void setYSpeed( int ySpd )
   {

	   super.setySpeed(ySpd +1);


   }
}

