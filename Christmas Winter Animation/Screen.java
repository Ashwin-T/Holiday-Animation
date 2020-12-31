import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.Random;

public class Screen extends JPanel{

  //sets varibale to dra2w
  	RandomNumber rando = new RandomNumber();
	Trees Tree1;
	Trees Tree2;
	Trees Tree3;
	BackgroundBottom bgb;
	SpaceObj moonOrSun;
	BackgroundTop bgt;
	Clouds clds;
	House build;
	GroundObj pumpOrSnoworEggorCone1;
	GroundObj pumpOrSnoworEggorCone2;
	Lake lk;
	Sled sled;
	Star star[] = new Star[12];
	Snow snow[] = new Snow[200];
	boolean nightcheck;
	//int numset[] = new int[2];

	int num = 4;
	
	
	

	
	public Screen(){
		// fall and day & night check
		
		// create objects
		bgb = new BackgroundBottom();
		bgt = new BackgroundTop();
		//Tree2 = new Trees(500,405);	
		//Tree3 = new Trees(700,415);
		moonOrSun = new SpaceObj(810, 150);
		clds = new Clouds(450,60);
		build = new House(50,375);
		pumpOrSnoworEggorCone1 = new GroundObj(400,455);
		pumpOrSnoworEggorCone2 = new GroundObj(400+50,435);
		lk = new Lake(500);
		sled = new Sled();
		nightcheck = moonOrSun.NightCheck();
		for (int i = 0; i< snow.length; i++){
			snow[i] = new Snow();
		}
		/*
		numset[0] = 0;
	
		for (int i = 1; i< numset.length; i++){
			numset[i] = 1;
		}
		*/
	
	
		
	}  

	public Dimension getPreferredSize(){
		//sets Dimension for scree
		return new Dimension(800,600);
  }
	
	public void paintComponent(Graphics g){
    
		//paints picture using variable
		super.paintComponent(g);
		bgt.draw(g);
		bgb.draw(g);
		sled.draw(g);
		int xT = 425;
		int yT = 400;
		int counterT = 1;
		int xS=50;
		int yS=150;
	
		while(counterT < 6){
		Tree1 = new Trees(xT,yT);
		Tree1.draw(g);
		counterT++;
		xT += 75;
		yT +=7;
		}
		
		for (int i = 0; i<star.length; i++ ){
			for (int j = 0; j < 12; j++){
				int xcoords[]={150,250,150,350,450,350,550,650,550,750,850,850};
				int ycoords[]={50,150,250,50,150,250,50,150,250,50,50,250};
				xS = xcoords[j];
				yS = ycoords[j];
				star[i] = new Star(xS,yS);
				star[i].draw(g, moonOrSun.NightCheck());
			}
		}
		
		clds.draw(g);
		moonOrSun.draw(g);
		for (int i = 0; i< snow.length; i++){
			if ((moonOrSun.getDays() % num == 0) || (moonOrSun.getDays() % num == 3)){
				snow[i].draw(g);
			}
			
		}

		
		
		
		build.draw(g);
		pumpOrSnoworEggorCone1.draw(g);
		pumpOrSnoworEggorCone2.draw(g);
		lk.draw(g);
	}
	
 
	public void animate(){
		while (true){
			// Safely try to wait for 10 milliseconds
			try {
				// wait 10 milliseconds
				Thread.sleep(10);	
			}
			// In case there is an error interrupting any process
			catch (InterruptedException ex) {
				System.out.println("I exited");
				Thread.currentThread().interrupt();
			}

			// Change position
			clds.changeColor(moonOrSun.NightCheck());
			clds.move(1);	
			bgt.deltacolor(moonOrSun.NightCheck());
			build.ChangeLights();
			moonOrSun.move(1);
			/*
			for (int i = 0; i< numset.length; i++){
				num = numset[i];
			}
			System.out.println(num);
			*/
			for (int i = 0; i< snow.length; i++){
				if ((moonOrSun.getDays() % num == 0) || (moonOrSun.getDays() % num == 3)) {
					snow[i].fall();
				}
			}
			sled.move();
			
			
			
			

			
			//repaints entire frame;
			repaint();

		}

	}
}
