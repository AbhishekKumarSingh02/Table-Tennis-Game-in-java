import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle {
	int id;     //for paddle1 
	int yVelocity; // for how fast paddle is moving up and down on y axis
	int speed =10;
	
	
	Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id )
	{
		super( x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
		this.id=id;
	}
	public void  keyPressed(KeyEvent e)
	{
		switch(id) {
		case 1:
		       if(e.getKeyCode()==KeyEvent.VK_Z)  // Z = move up side
		       {
		    	   setYDirection(-speed);
		    	   move();
		       }
		       if(e.getKeyCode()==KeyEvent.VK_X)  // X= move down side
		       {
		    	   setYDirection(speed);
		    	   move();
		       }
		       break;
		case 2:
		       if(e.getKeyCode()==KeyEvent.VK_UP)  // W = move up side
		       {
		    	   setYDirection(-speed);
		    	   move();
		       }
		       if(e.getKeyCode()==KeyEvent.VK_DOWN)  // S= move down side
		       {
		    	   setYDirection(speed);
		    	   move();
		       }
		       break;
		}
	}
	
	
	public void  keyReleased(KeyEvent e)
	{
		switch(id) {
		case 1:
		       if(e.getKeyCode()==KeyEvent.VK_Z)  // Z = move up side
		       {
		    	   setYDirection(0);
		    	   move();
		       }
		       if(e.getKeyCode()==KeyEvent.VK_X)  // X= move down side
		       {
		    	   setYDirection(0);
		    	   move();
		       }
		       break;
		case 2:
		       if(e.getKeyCode()==KeyEvent.VK_UP)  // W = move up side
		       {
		    	   setYDirection(0);
		    	   move();
		       }
		       if(e.getKeyCode()==KeyEvent.VK_DOWN)  // S= move down side
		       {
		    	   setYDirection(0);
		    	   move();
		       }
		       break;
		}
	}
	
	
	public void setYDirection(int yDirection) {
	    yVelocity  =  yDirection;
	    
	}
	public void move() {
		y= y +  yVelocity;
		
	}
	public void draw(Graphics g) {
		if (id==1) 
			g.setColor(Color.yellow);
		else 
			g.setColor(Color.red);
			g.fillRect(x, y, width, height);
		
	}
	

}
