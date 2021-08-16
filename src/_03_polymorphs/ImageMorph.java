package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageMorph extends Polymorph{
	ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		try {
			Image img;
			img = ImageIO.read(new File("C:\\Users\\rpodo\\git\\level4-module4-ryanodonnell2\\src\\_03_polymorphs\\test.jpg"));
			g.drawImage(img, getX(), getY(), getX()+getWidth(), getY()+getHeight(), 0, 0, 1000, 1000, null);
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}

}
