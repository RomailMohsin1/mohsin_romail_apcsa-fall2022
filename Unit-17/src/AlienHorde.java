//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	

	public AlienHorde(int size)
	{
		List<Alien> aliens = new ArrayList<>();
	}

	public void add(Alien al)
	{
		
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a : aliens) {
			a.draw(window);
		}
	}
	

	public void moveEmAll()
	{
		for (Alien b : aliens) {
            if (b.getX() == 740) {
                b.setBool(true);
            }
            if (b.getX() == 0) {
                b.setBool(false);
            }
            if (b.getBool()) {
                b.move("LEFT");
            } else {
                b.move("RIGHT");
            }
        }
	}

	public void removeDeadOnes(List<Ammo> shots) {
	for (int i =0; i < shots.size(); i++) {
		for(int j = 0; j<aliens.size(); j++) {
			Ammo am = shots.get(i);
			Alien al = aliens.get(j);
			if (am.getY() > al.getX() && am.getX() < al.getX() + al.getWidth()
				&& am.getY() < al.getY() && am.getY() > al.getY() - al.getHeight()){
					aliens.remove(al);
				}
		}
	}
	
	}

	public String toString()
	{
		return "";
	}
}
