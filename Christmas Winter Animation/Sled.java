import java.awt.Color;
import java.awt.Graphics;

public class Sled{
	
	private int x, y;
	Color red = new Color (200,0,0); 
	Color green = new Color (0,94,0); 


	
	public Sled(){
		
		x = -100;
		y = 385;
		
		
		

	}
	
	public void draw(Graphics g){
		
		g.setColor(red);
		g.fillRect(x,y,15,5);
		g.fillRect(x+5,y+5,15,5);
		g.fillRect(x+10,y+10,15,25);
		g.fillRect(x+15,y+35,10,5);	
		g.fillRect(x+20,y+40,5,5);
		
		g.fillRect(x+25,y+15,5,35);
		g.fillRect(x+30,y+20,5,30);
		g.fillRect(x+35,y+25,30,30);
		g.fillRect(x+65,y+20,5,30);
		g.fillRect(x+60,y+20,20,5);
		g.fillRect(x+80,y+25,5,5);
		g.fillRect(x+75,y+30,5,5);
		
		g.setColor(green);
		g.fillRect(x,y+60,75, 5);	
		g.fillRect(x+25,y+50,5,10);	
		g.fillRect(x+25,y+50,5,10);	
		g.fillRect(x+60,y+55,5,5);		
		g.fillRect(x+75,y+50,5,10);	
		g.fillRect(x+80,y+45,5,5);	



		

		
	}
	
	public void move(){
		x += 2;
		
		if (x > 2000){
			x = -100;
		}
	}
	

}