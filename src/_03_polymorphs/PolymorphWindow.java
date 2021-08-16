package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    private ClickMorph clickmorph = new ClickMorph(0, 0, 0, 0);
    private ArrayList<Polymorph> morphs = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    boolean mouseDown = false;
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.addMouseListener(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 Random r = new Random();
   	 for (int i = 0; i < 50; i++) {
		int selection = r.nextInt(7);
		if(selection == 0) {
			BluePolymorph blue = new BluePolymorph(r.nextInt(450), r.nextInt(450), 50, 50);
			morphs.add(blue);
		}
		else if(selection == 1) {
			RedMorph red = new RedMorph(r.nextInt(450), r.nextInt(450), 50, 50);
			morphs.add(red);
		}
		else if(selection == 2) {
			MovingMorph moving = new MovingMorph(r.nextInt(450), r.nextInt(450), 50, 50);
			morphs.add(moving);
		}
		else if(selection == 3) {
			CircleMorph Circle = new CircleMorph(r.nextInt(350)+50, r.nextInt(350)+50, 50, 50);
			morphs.add(Circle);
		}
		else if(selection == 4) {
			MouseMorph Mouse = new MouseMorph(0,0,50,50);
			morphs.add(Mouse);
		}
		else if(selection == 5) {
//			LAGGY!!!!!!!!
//			ImageMorph image = new ImageMorph(r.nextInt(450), r.nextInt(450), 50, 50);
//			morphs.add(image);
		}
		else if(selection == 6) {
			ClickMorph click = new ClickMorph(r.nextInt(450), r.nextInt(450), 50, 50);
			morphs.add(click);
		}
	}   	
   	 	// Fixes lag!
		ImageMorph image = new ImageMorph(r.nextInt(450), r.nextInt(450), 50, 50);
		morphs.add(image);
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	 	for (Polymorph polymorph : morphs) {
   	 		polymorph.update(mouseDown);
   	 		polymorph.draw(g);
		}
   	 }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Click");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseDown = true;
		System.out.println("Mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseDown = false;
		System.out.println("Mouse Release");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Exited");
		
	}
}
