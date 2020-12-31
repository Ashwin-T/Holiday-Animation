import java.awt.Graphics;	//imports Graphics
import java.awt.Color; //imports colors so colors show
import java.util.Random;

public class Snow{
	
	public Snow(){
		
	}
	
	int x = ((int)(Math.random() * (900 - 0 + 1) + 0));
	int w = 5;
	int l = 5;
	int y = ((int)(Math.random() * (-10 - -1000 + 1) + -1000));
	

    public void draw(Graphics g){
	
		Color snowWhite = new Color(242, 240, 235);
		g.setColor(snowWhite);
		
		g.fillOval(x,y,w,l);
		
	}
	public void fall(){
		y++;
		
		if(y >= 501){
			x = (int)(Math.random() * (900 - 0 + 1) + 0);
			y = ((int)(Math.random() * (-10 - -1000 + 1) + -1000));
		}
	}
}

