package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.MouseAdapter;

import javax.swing.JOptionPane;

public class ClickMorph extends Polymorph {
	ClickMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	public void update(boolean mouseDown) {
		if(mouseDown&&(MouseInfo.getPointerInfo().getLocation().x>getX()&&MouseInfo.getPointerInfo().getLocation().x<getX()+getWidth())&&(MouseInfo.getPointerInfo().getLocation().y>getY()&&MouseInfo.getPointerInfo().getLocation().y<getY()+getHeight())) {
			JOptionPane.showMessageDialog(null, "E?");
		}
	}
}
