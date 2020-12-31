import java.awt.Graphics;	
import java.awt.Color;
public class Lake{

  int x;

    public Lake(int xL){
        x = xL;	
    }

    public void draw(Graphics g) {
   
		g.setColor(Color.black);
		g.fillOval(x-2, 485-2, 250+4, 100+4); 
	

		Color lakeIce = new Color(212,241,249);
		g.setColor(lakeIce);
		
		g.fillOval(x, 485, 250, 100); 

		
		//snow top
    
    }
}