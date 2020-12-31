import java.awt.Graphics;	
import java.awt.Color;
import java.awt.Polygon;

public class GroundObj{

  int x, y;

    public GroundObj(int xL, int yL){
        x = xL;
        y = yL;
		

    }

    public void draw(Graphics g){
		

		g.setColor (Color.black);
		g.fillOval (x-20-10-2, y+35+8-2, 15+4, 15+4);      // head
		g.fillOval (x-35-2, y+35+20+3-2, 25+4, 25+4);   // upper torso
		g.fillOval (x-50+5+4-2, y+80-2, 35+4, 35+4);  // lower torso
	
		g.setColor (Color.white);
		g.fillOval (x-20-10, y+35+8, 15, 15);      // head
		g.fillOval (x-35, y+35+20+3, 25, 25);   // upper torso
		g.fillOval (x-50+5+4, y+80, 35, 35);  // lower torso
		
		g.setColor (Color.black);
		g.fillOval (x-20-10+3, y+35+8+5, 3, 3);   
		g.fillOval (x-20-10+11, y+35+8+5, 3, 3);  

				
			
	
    }
}