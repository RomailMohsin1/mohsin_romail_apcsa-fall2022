//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;


public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private boolean bool;

	public Alien()
	{
		this(10, 10, 30, 30, 2);
	}

	public Alien(int x, int y)
	{
		this(x,y,30,30,2);
	}

	public Alien(int x, int y, int s)
	{
		this(x, y, 30, 30, s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/images/alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			e.printStackTrace();
		}
	}
	 
    public void setBool(boolean b) {
    	bool = b;
    }
    public boolean getBool() {
    	return bool;
    }
	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   if (direction.equals("UP")) {
           super.setY(super.getY() + speed);
       }
		
		if (direction.equals("DOWN")) {
           super.setY(super.getY() - speed);
       }
		
		if (direction.equals("RIGHT")) {
           super.setX(super.getX() + speed);
       }
		
		if (direction.equals("LEFT")) {
           super.setX(super.getX() - speed);
       }
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
   	
	}

	public String toString()
	{
		return "";
	}
}
