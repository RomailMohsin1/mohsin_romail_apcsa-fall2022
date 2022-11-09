//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public  class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = color.black;

	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y) {
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = color.black;
	}
	
	public Block(int x, int y, int w, int h) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = color.black;
	}
	
	public Block(int x, int y, int w, int h, Color c) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}
	

	
	
	
	
	
	
	
	
   //add the other set methods
	public void setXpos(int x) {
		xPos = x;
	}
	
	public void setYpos(int y) {
		yPos = y;
	}
   
	public void setWidth(int w) {
		width = w;
	}
	
	public void height(int h) {
		height = h;
	}

   public void setColor(Color col)
   {

	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
        window.setColor(col);
        window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Block obj)
	{
		boolean equal = true;
		if (obj.getX() != xPos) equal = false;
		if (obj.getY() != yPos) equal = false;
		if (obj.getWidth() != width) equal = false;
		if (obj.getHeight() != height) equal = false;
		return equal;



		
	}   

   //add the other get methods
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Color getColor() {
		return color;
	}
    

   //add a toString() method  - x , y , width, height, color
	public String toString(String output) {
		output = "";
		output = xPos + "" + yPos + "" + width + "" + height + "" + color + "";
		return output;
	}

@Override
public void setPos(int x, int y) {
	// TODO Auto-generated method stub
	xPos = x;
	yPos = y;
}

@Override
public void setX(int x) {
	// TODO Auto-generated method stub
	xPos = x;
}

@Override
public void setY(int y) {
	// TODO Auto-generated method stub
	yPos = y;
}
	
	
	
	
	
	
	
}