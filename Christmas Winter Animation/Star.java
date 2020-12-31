import java.awt.Graphics;	
import java.awt.Color;
import java.awt.Polygon;

public class Star{

  int x, y;
  boolean Night;

    public Star(int xL, int yL){
        x = xL;
        y = yL;

    }

    public void draw(Graphics g, boolean Night){
		
		if (Night == true){
			Polygon Star = new Polygon();
			g.setColor(Color.yellow);
			Star.addPoint(x,y);
			Star.addPoint(x+3,y+11);
			Star.addPoint(x-6,y+4);
			Star.addPoint(x+6,y+4);
			Star.addPoint(x-3,y+11);
			g.fillPolygon(Star);
		}
		
    }
	
}