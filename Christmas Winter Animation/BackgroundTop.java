import java.awt.Graphics;	//imports Graphics
import java.awt.Color; //imports colors so colors show

public class BackgroundTop{
    private int green= 204; 
    private int blue = 255;
    
    public void draw(Graphics g){
      Color sky = new Color(0, green, blue);
      g.setColor(sky);
      g.fillRect(0,0,800,600); 
  }

  public void deltacolor(boolean Nightcheck){
    if (Nightcheck){
      if (blue >= 1){
        blue--;
      } 
      if (green >= 1){
        green--;
      } 
      Color sky = new Color(0, green, blue);
    }
    else if (Nightcheck == false){
      if (blue < 254){
        blue+=2;
      } 
      if (green < 204){
        green++;
      } 
      Color sky = new Color(0, green, blue);
    }
  }   
}
