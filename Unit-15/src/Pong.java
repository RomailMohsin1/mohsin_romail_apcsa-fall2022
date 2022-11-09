//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;


	public Pong()
	{
		//set up all variables related to the game

		ball = new Ball();
		leftPaddle = new Paddle(50,10,10,50,2);
		rightPaddle = new Paddle(750,10,10,50,2);


		keys = new boolean[4];
		leftScore = 0;
		rightScore = 0;

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setxSpeed(0);
			ball.setySpeed(0);
		}
		if (ball.getX() <= 20) {
			ball.setPos(400, 300);
			rightScore++;
			String rsc = "Right Score = " + rightScore;
			graphToBack.clearRect(300, 500, 100, 100);
			graphToBack.drawString(rsc, 380, 500);
		}
		if (ball.getX() >= 780) {
			ball.setPos(400, 300);
			leftScore++;
			String lsc = "Left Score = " + leftScore;
			graphToBack.clearRect(300, 500, 100, 30);
			graphToBack.drawString(lsc, 380, 520);
		}

		
		//see if the ball hits the top or bottom wall 
		
		if(!(ball.getX()>=10 && ball.getX()<=550))
		{
			ball.setxSpeed(-ball.getxSpeed());
		}

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setySpeed(-ball.getySpeed());
		}



		//see if the ball hits the left paddle
		
		if((ball.getX() <= leftPaddle.getX()+leftPaddle.getWidth()+Math.abs(ball.getxSpeed()))
			&& (ball.getY() >= leftPaddle.getY())
			&& (ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight())
			|| (ball.getY() + ball.getHeight() >= leftPaddle.getY())
			&& (ball.getY() + ball.getHeight() <leftPaddle.getY() + leftPaddle.getHeight()))
		{
			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() -Math.abs(ball.getxSpeed())) {
				ball.setY(-1 * ball.getySpeed());
			}else ball.setX(-1 * ball.getxSpeed());
		}
		
		//see if the ball hits the right paddle
		
		if((ball.getX() <= rightPaddle.getX()+rightPaddle.getWidth()+Math.abs(ball.getxSpeed()))
				&& (ball.getY() >= rightPaddle.getY())
				&& (ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight())
				|| (ball.getY() + ball.getHeight() >= rightPaddle.getY())
				&& (ball.getY() + ball.getHeight() <rightPaddle.getY() + rightPaddle.getHeight()))
			{
				if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() -Math.abs(ball.getxSpeed())) {
					ball.setY(-1 * ball.getySpeed());
				}else ball.setX(-1 * ball.getxSpeed());
			}
		


		//see if the paddles need to be moved

		

		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveDownAndDraw(graphToBack);
			//move left paddle down and draw it on the window


		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
	











		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}