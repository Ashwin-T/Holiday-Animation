import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class House{
    
	int x, y;
	
	int red1 = 0;
	int green1 = 255;
	int red2 = 255;
	int green2 = 0;
	int timer = 1;
	
	public House(int xL, int yL){
	x = xL;
	y = yL;


	}
	

    public void draw(Graphics g){
		
		Color black = new Color(0,0,0);
		g.setColor(black);
		g.fillRect(x-4,y-4,208, 158);
		
		Color houseBirch = new Color(248,223,161);
        g.setColor(houseBirch);
        g.fillRect(x, y, 200, 150);
		
		g.setColor(black);
		Polygon polyHouseOutline = new Polygon();
        polyHouseOutline.addPoint(x+204, y-4);
        polyHouseOutline.addPoint(x+200+4, y+150+4);
        polyHouseOutline.addPoint(x+300+4, y+75+4);
		polyHouseOutline.addPoint(x+300+4, y-50-4);
        g.fillPolygon(polyHouseOutline);
		
		g.setColor(houseBirch);
		Polygon polyHouse = new Polygon();
        polyHouse.addPoint(x+200+4, y);
        polyHouse.addPoint(x+200+4, y+150);
        polyHouse.addPoint(x+300+4, y+75);
		polyHouse.addPoint(x+300+4, y-50);
        g.fillPolygon(polyHouse);
		
		g.setColor(black);
		Polygon polyRoofOutline = new Polygon();
        polyRoofOutline.addPoint(x+222, y+10);
		polyRoofOutline.addPoint(x+304+6+10, y-50+10+2);
        polyRoofOutline.addPoint(x+283, y-83);
        polyRoofOutline.addPoint(x+102, y-73);
        g.fillPolygon(polyRoofOutline);
		
		
		Color snowWhite = new Color(242, 240, 235);
		g.setColor(snowWhite);
	
		Polygon polyRoof = new Polygon();
        polyRoof.addPoint(x+220, y+7);
		polyRoof.addPoint(x+300+6+10, y-50+10);
        polyRoof.addPoint(x+280, y-80);
        polyRoof.addPoint(x+100, y-70);
        g.fillPolygon(polyRoof);
        

	
		g.setColor(black);
		Polygon poly1outline = new Polygon();
        poly1outline.addPoint(x-30, y+10);
        poly1outline.addPoint(x+100, y-75);
        poly1outline.addPoint(x+230, y+10);
        g.fillPolygon(poly1outline);
		
		Color roofSienna= new Color(160,82,45);
        g.setColor(roofSienna);
		
		Polygon poly1 = new Polygon();
        poly1.addPoint(x-20, y+7);	
        poly1.addPoint(x+100, y-70);
        poly1.addPoint(x+220, y+7);	
        g.fillPolygon(poly1);
		
		
		g.setColor(Color.black);
		g.fillRect(x+115-2, 450-2, 50+4, 75+4);
		g.setColor(Color.red);
		g.fillRect(x+115, 450, 50, 75);
		g.setColor(Color.black);
		g.fillOval(x+153, 477, 8, 8);
		
		g.fillRect(x+25-2, y+45-2, 60+4, 60+4); 
		
		
		Color windowNight = new Color(255, 252, 187);
		g.setColor(windowNight);

		
		g.fillRect(x+25, y+45, 60, 60); 
		
		g.setColor(Color.black);
		g.drawLine(x+25, y+45+30, x+25+60, y+45+30);
		g.drawLine(x+25+30, y+45, x+25+30, y+45+60);
			//christmas lights
		Color light1 = new Color(red1, green1, 0);
		g.setColor(light1);
		g.fillOval(x,y+10, 7, 7);
		g.fillOval(x+20,y+10, 7, 7);
		g.fillOval(x+40,y+10, 7, 7);
		g.fillOval(x+60,y+10, 7, 7);
		g.fillOval(x+80,y+10, 7, 7);
		g.fillOval(x+100,y+10, 7, 7);
		g.fillOval(x+120,y+10, 7, 7);
		g.fillOval(x+140,y+10, 7, 7);
		g.fillOval(x+160,y+10, 7, 7);
		g.fillOval(x+180,y+10, 7, 7);

		
		Color light2 = new Color(red2, green2, 0);
		g.setColor(light2);
		g.fillOval(x+10,y+10, 7, 7);
		g.fillOval(x+30,y+10, 7, 7);
		g.fillOval(x+50,y+10, 7, 7);
		g.fillOval(x+70,y+10, 7, 7);
		g.fillOval(x+90,y+10, 7, 7);
		g.fillOval(x+110,y+10, 7, 7);
		g.fillOval(x+130,y+10, 7, 7);
		g.fillOval(x+150,y+10, 7, 7);
		g.fillOval(x+170,y+10, 7, 7);
		g.fillOval(x+190,y+10, 7, 7);

	}
	
	public int timerChange(){
		if (timer < 201){
		  timer++;
		  return timer;
		}
		else{
		  timer = 0;
		  return timer;
		}
	}
	public void ChangeLights(){
			if (timerChange() <= 100){
				red1 = 0;
				green1 = 255;
				red2 = 255;
				green2 = 0;
				Color light2 = new Color(red2, green2, 0);
				Color light1 = new Color(red1, green1, 0);
			}
			if (timerChange() > 100){
				red1 = 255;
				green1 = 0;
				red2 = 0;
				green2 = 255;
				Color light1 = new Color(red1, green1, 0);
				Color light2 = new Color(red2, green2, 0);

			}	
			
	}
}

