package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class CircleMorph extends Polymorph{

	Random r = new Random();
	int centerX;
	int centerY;
	int count = 0;
	int radius = r.nextInt(35)+40;
	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		centerX = x;
		centerY = y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update() {
		count++;
		if(count>64) {
			count=0;
		}
		int x = r.nextInt(500-getWidth());
		int y = r.nextInt(500-getHeight());
		double circleSpeed = Math.PI / 16;
		double radian = circleSpeed * count;
		double drawX = centerX + radius * Math.cos(radian);
		double drawY = centerY + radius * Math.sin(radian);
		setX((int)drawX);
		setY((int)drawY);
	}
}