import java.awt.Graphics;	
import java.awt.Color;

public class Clouds{

  int x, y;
  boolean night;
  Color cloud;
  int C = 255;
 
  

    public Clouds(int xL, int yL){

        x = xL;
        y = yL;
    }

    public void draw(Graphics g) {
		
		g.setColor(cloud);
		g.fillOval(x-500, y, 70, 70);
		g.fillOval(x-430, y, 70, 70);
		g.fillOval(x-465, y-20, 70, 70);
		g.fillOval(x-465, y+20, 70, 70); 
		g.fillOval(x-430, y, 70, 70);

		g.fillOval(x-350, y+50, 70, 70);
		g.fillOval(x-280, y+50, 70, 70);
		g.fillOval(x-315, y+25, 70, 70);
		g.fillOval(x-315, y+70, 70, 70); 
		g.fillOval(x-280, y+50, 70, 70);

    }
    public void move(double pixels){
      x += pixels;
		  if ((x-500) > 805) {
			  x = 50;
		  }
	}
	public void changeColor(boolean night){
		if (night == true){
			if (C > 84){
				C--;
			}
		}
		else{
			if (C < 255){
				C++;
			}
		}
		cloud = new Color(C,C,C);
	}
    
    
}