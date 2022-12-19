//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Image image;

	

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x, y, 0);
		try{
			image = ImageIO.read(new File("bullet.bmp"));
		}
		catch(Exception e)
		{
			
		}
	}

	public Ammo(int x, int y, int s)
	{
		
		setPos(x, y);
		setSpeed(s);
		try {
			image = ImageIO.read(new File("bullet.bmp"));
		}
		catch(Exception e) {
			
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
	
	
	public void move( String direction )
	{ 
		//add code to draw the ammo 
		if (direction.equals("SPACE")) {
	           setY(getY()+getSpeed());
	       }
			
			
		
	}

	public String toString()
	{
		return "Ammo" + getSpeed();
	}
}
