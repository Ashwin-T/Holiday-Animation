import java.awt.Graphics;	
import java.awt.Color;
import java.lang.Math;

public class SpaceObj{

  private int x, y, days;
  boolean NightCheck;
	
    public SpaceObj(int xL, int yL){

        x = xL;
        y = yL;
		days = 0;
    }
	public void draw(Graphics g) {

      //draws sun 
	  if(NightCheck()){
		Color moonWhite = new Color(180,180,180);
		Color moongrey = new Color(0,0,0);
		g.setColor(moongrey);
		g.fillOval(x-5, y-5, 110, 110);
		g.setColor(moonWhite);
		g.fillOval(x, y, 100, 100);
		  
		g.setColor(moongrey);

		  //draws craters
		g.drawOval(x+25, y+25, 25, 25);
		g.drawOval(x+65, y+45, 15, 15);
		g.drawOval(x+55, y+75, 10, 10);
	  }
	  else{
		  
      Color Sunyellow = new Color(255,204,0);
      g.setColor(Sunyellow);
      g.fillOval(x, y, 175, 175);
      //x = 650
      //y = 50
	  }

    }
    public void move(double pixels){
      x -= pixels;
	  
	  y= (int)(100*(-Math.sin(x/254.0))+145.0);
	  
		  if (x<-200) {
			  x = 810;
			  y=150;
			  days++;
		  }
	}
	public boolean NightCheck(){
      if (days%2 == 1) {
        return true;
      }
      else{
        return false;
      }
    }
	public int getDays(){
		return days;
	}
	
}