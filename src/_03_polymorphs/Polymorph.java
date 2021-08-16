package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    Polymorph(int x, int y,int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public int getX(){
    	return x;
    }
    
    public void setX(int value) {
    	x = value;
    }
    
    public int getY(){
    	return y;
    }
    
    public void setY(int value) {
    	y = value;
    }
    
    public int getWidth(){
    	return width;
    }
    
    public void setWidth(int value) {
    	width = value;
    }
    
    public int getHeight(){
    	return height;
    }
    
    public void setHeight(int value) {
    	height = value;
    }
    
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);

	public void update(boolean mouseDown) {
		// TODO Auto-generated method stub
		
	}
}
