//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import static java.lang.System.out;

import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable
{
	private Ball ball;

	public BallTestTwo()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//instantiate a new Ball
         ball = new Ball();

		//test the Ball thoroughly
         Ball one = new Ball();
 		out.println(one);
 		
 		Ball two = new Ball(100,90);
 		out.println(two);
 		
 		
 		Ball three = new Ball(100,100,30,50);
 		out.println(three);
 		
 		Ball four = new Ball(100,100,30,50,Color.BLUE);
 		out.println(four);
 		
 		Ball five = new Ball(100,100,30,50,Color.BLUE,5,6);

		//test all constructors


		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		ball.moveAndDraw(window);

		if(!(ball.getX()>=10 && ball.getX()<=550))
		{
			ball.setxSpeed(-ball.getxSpeed());
		}

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setySpeed(-ball.getxSpeed());
		}
	}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(19);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}