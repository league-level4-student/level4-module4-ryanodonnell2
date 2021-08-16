package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.util.Random;

public class MouseMorph extends Polymorph{

	Random r = new Random();
	
	MouseMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update(boolean mouseDown) {
		setX((int)MouseInfo.getPointerInfo().getLocation().getX()-50);
		setY((int)MouseInfo.getPointerInfo().getLocation().getY()-50);
//		System.out.println(getX());
//		System.out.println(getY());
	}

}
