import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{
	
	
	static final int SCREEN_WIDTH=800;
	static final int SCREEN_HEIGHT=800;
	static final int UNIT_SIZE=25;
	static final int GAME_UNITS=(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
	static final int DELAY=95;
	final int x[]=new int[GAME_UNITS];
	final int y[]=new int[GAME_UNITS];
	int bodyParts=1;
	int applesEaten;
	
	int appleX;
	int appleY;
	
	int badAppleX1;
	int badAppleY1;
	
	int badAppleX2;
	int badAppleY2;
	
	int badAppleX3;
	int badAppleY3;
	
	int badAppleX4;
	int badAppleY4;
	
	int badAppleX5;
	int badAppleY5;
	
	int badAppleX6;
	int badAppleY6;
	
	int badAppleX7;
	int badAppleY7;
	
	int badAppleX8;
	int badAppleY8;
	
	int badAppleX9;
	int badAppleY9;
	
	int badAppleX10;
	int badAppleY10;
	
	
	char direction='R';
	boolean running=false;
	Timer timer;
	Random random;
	

    GamePanel()
	{	
    	
    	
		random=new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.gray);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();	
	}

	public void startGame() {
		
		newApple();
		badApple1();
		badApple2();
		badApple3();
		badApple4();
		badApple5();
		badApple6();
		badApple7();
		badApple8();
		badApple9();
		badApple10();
		
		running=true;
		timer=new Timer(DELAY,this);
		timer.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	public void draw(Graphics g) {
		
		
		g.setColor(Color.black);
		g.fillRect(5,5,790,790);
		
		
		if(running) {
					  
			
		  
		  g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
		  g.fillOval(appleX,appleY,UNIT_SIZE,UNIT_SIZE);
		  
		  g.setColor(Color.white);
		  g.fillRect(badAppleX1,badAppleY1,UNIT_SIZE,UNIT_SIZE);
		  
		  g.setColor(Color.yellow);
		  g.fillRect(badAppleX2,badAppleY2,UNIT_SIZE,UNIT_SIZE);
		  
		  g.setColor(Color.pink);
		  g.fillRect(badAppleX3,badAppleY3,UNIT_SIZE,UNIT_SIZE);
		  
		  g.setColor(Color.blue);
		  g.fillRect(badAppleX4,badAppleY4,UNIT_SIZE,UNIT_SIZE);
		  
		  g.setColor(Color.red);
		  g.fillRect(badAppleX5,badAppleY5,UNIT_SIZE,UNIT_SIZE);
		  
		  g.setColor(Color.green);
		  g.fillRect(badAppleX6,badAppleY6,UNIT_SIZE,UNIT_SIZE);
		  
		  g.setColor(Color.white);
		  g.fillRect(badAppleX7,badAppleY7,UNIT_SIZE,UNIT_SIZE);
		  
		  g.setColor(Color.orange);
		  g.fillRect(badAppleX8,badAppleY8,UNIT_SIZE,UNIT_SIZE);
		  
		  g.setColor(Color.red);
		  g.fillRect(badAppleX9,badAppleY9,UNIT_SIZE,UNIT_SIZE);
		  
		  g.setColor(Color.green);
		  g.fillRect(badAppleX10,badAppleY10,UNIT_SIZE,UNIT_SIZE);
		  

		
		  for(int i=0;i<bodyParts;i++) {
			if(i==0)
			{
				g.setColor(Color.white);
				g.fillOval(x[i],y[i],UNIT_SIZE,UNIT_SIZE);
			}
			else {
				g.setColor(Color.green);
			    g.fillOval(x[i],y[i],UNIT_SIZE,UNIT_SIZE);
		     }
		  
		    g.setColor(Color.white);
			g.setFont(new Font("Ink Free",Font.BOLD,25));
        	g.drawString("SCORE: "+applesEaten,675,25);
					
	    }
		}
	else {
		gameOver(g);
	}
	}
	public void newApple() {
		appleX=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		appleY=random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	
	public void badApple1() {
		badAppleX1=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		badAppleY1=random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	public void badApple2() {
			badAppleX2=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
			badAppleY2=random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	
	public void badApple3() {
			badAppleX3=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
			badAppleY1=random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	public void badApple4() {
			badAppleX4=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
			badAppleY4=random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	public void badApple5() {
			badAppleX5=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
			badAppleY5=random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	public void badApple6() {
			badAppleX6=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
			badAppleY6=random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	public void badApple7() {
			badAppleX7=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
			badAppleY7=random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	
	public void badApple8() {
		badAppleX8=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		badAppleY8=random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	public void badApple9() {
			badAppleX9=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
			badAppleY9=random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	public void badApple10() {
			badAppleX10=random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
			badAppleY10=random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	
	

	public void move() {
		for(int i=bodyParts;i>0;i--)
		{
			x[i]=x[i-1];
			y[i]=y[i-1];
		}
		switch(direction)
		{
		case 'U':
			y[0]=y[0]-UNIT_SIZE;
			break;
		case 'D':
			y[0]=y[0]+UNIT_SIZE;
			break;
		case 'L':
			x[0]=x[0]-UNIT_SIZE;
			break;
		case 'R':
			x[0]=x[0]+UNIT_SIZE;
			break;
		}
	}
	public void checkApple() {
		if((x[0]==appleX) && (y[0]==appleY)) 
			{
			bodyParts++;
			applesEaten++;
			newApple();
			badApple1();
			badApple2();
			badApple3();
			badApple4();
			badApple6();
			badApple5();
			badApple7();
			badApple8();
			badApple9();
			badApple10();
			
			
		}
		if(((x[0]==badAppleX1) && (y[0]==badAppleY1)) || ((x[0]==badAppleX2) && (y[0]==badAppleY2)) || ((x[0]==badAppleX3) && (y[0]==badAppleY3)) || ((x[0]==badAppleX4) && (y[0]==badAppleY4)) || ((x[0]==badAppleX5) && (y[0]==badAppleY5)) || ((x[0]==badAppleX6) && (y[0]==badAppleY6)) || ((x[0]==badAppleX7) && (y[0]==badAppleY7)) || ((x[0]==badAppleX8) && (y[0]==badAppleY8)) || ((x[0]==badAppleX9) && (y[0]==badAppleY9)) || ((x[0]==badAppleX10) && (y[0]==badAppleY10))) {
			applesEaten--;
			newApple();
			badApple1();
			badApple2();
			badApple3();
			badApple4();
			badApple5();
			badApple6();
			badApple5();
			badApple7();
			badApple8();
			badApple9();
			badApple10();	
					
		}
		
		
	}
	public void checkCollisions() {
		
		for(int i=bodyParts;i>0;i--) {
			if((x[0]==x[i])&&(y[0]==y[i])) {
				running =false;
			}
		}
		
		if(x[0]<0) {
			running=false;
		}
		
		if(x[0]>SCREEN_WIDTH) {
			running=false;
		}
		
		if(y[0]<0) {
			running=false;
		}
		
		if(y[0]>SCREEN_HEIGHT) {
			running=false;
		}
		if(!running)
			timer.stop();
	}
	public void gameOver(Graphics g) {
		

		g.setColor(Color.red);
		g.setFont(new Font("Ink Free",Font.BOLD,50));
		FontMetrics metrics1=getFontMetrics(g.getFont());
		g.drawString("SCORE: "+applesEaten,(SCREEN_WIDTH-metrics1.stringWidth("SCORE: "+applesEaten))/2,100);

		
		g.setColor(Color.white);
		g.setFont(new Font("Ink free",Font.BOLD,75));
		FontMetrics metrics2=getFontMetrics(g.getFont());
		g.drawString("GAME OVER",(SCREEN_WIDTH-metrics2.stringWidth("GAME OVER"))/2,SCREEN_HEIGHT/2);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(running) {
			move();
			checkApple();
			checkCollisions();
			if(applesEaten<0)
				running=false;
		}
		repaint();
	}
	
	public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if(direction!='R') {
					direction='L';
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(direction!='L') {
					direction='R';
				}
				break;
			case KeyEvent.VK_UP:
				if(direction!='D') {
					direction='U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if(direction!='U') {
					direction='D';
				}
				break;
				}
			}
			}
		}
	
