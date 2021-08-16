package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{

	Random r = new Random();
	
	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update(boolean mouseDown) {
		int x = r.nextInt(500-getWidth());
		int y = r.nextInt(500-getHeight());
		setX(x);
		setY(y);
	}

}
