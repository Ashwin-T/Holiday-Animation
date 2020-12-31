import java.awt.Graphics;	
import java.awt.Color;
import java.awt.Polygon;

public class Trees{

  int x, y;

    public Trees(int xL, int yL){
        x = xL;
        y = yL;
		
    }

    public void draw(Graphics g) {
      //makes trunk color brown and draws trunk
        Color trunkBrown = new Color(128, 64, 0);
        g.setColor(trunkBrown);

		// Draw green top second, so it is in front
		
		g.fillRect(x,y+15,10*2,40);
		
		Color topGreen = new Color(1, 65, 35);
        g.setColor(topGreen);
		Polygon triangle1 = new Polygon();
		triangle1.addPoint(x-10,y+25);
		triangle1.addPoint(x+10,y-30+25);
		triangle1.addPoint(x+30,y+25);
		g.fillPolygon(triangle1);
		
		Polygon triangle2 = new Polygon();
		triangle2.addPoint(x-10,y+25-10);
		triangle2.addPoint(x+10,y-30+25-10);
		triangle2.addPoint(x+30,y+25-10);
		g.fillPolygon(triangle2);
		
		//snow top
		Color snowWhite = new Color(242, 240, 235);
		g.setColor(snowWhite);
		
		Polygon triangle3 = new Polygon();
		triangle3.addPoint(x-10,y+25-23);
		triangle3.addPoint(x+10,y-30+25-23);
		triangle3.addPoint(x+30,y+25-23);
		g.fillPolygon(triangle3);
		
		}
	
}