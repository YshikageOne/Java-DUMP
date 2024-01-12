package Snake;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Panel extends JPanel implements ActionListener{
	
	//Declared variables for the Dimension of the Components
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	
	//Object size
	static final int UNIT_SIZE = 25;
	
	//The size of the whole game
	static final int GAME_SIZE = (SCREEN_WIDTH * SCREEN_HEIGHT)/UNIT_SIZE;
	static final int DELAY = 75;
	
	//Holds all of coordinates for the snake's body part
	final int x[] = new int[GAME_SIZE];
	final int y[] = new int[GAME_SIZE];
	
	//Variable that would hold the starting amount of parts the snake would have
	int bodyParts = 5;
	
	int applesEaten;
	
	//Coordinates of the apples
	int appleXCoord;
	int appleYCoord;
	
	//Variable direction of the snake
	char direction = 'R';
	
	//Boolean Variable that checks if state of the game
	boolean moving = false;
	
	Timer timer;
	Random random;
	
	//Constructor
	Panel(){
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT)); //setting the preferred size of the game
		this.setBackground(Color.BLACK);
		this.setFocusable(true);
		this.addKeyListener(new KeyboardAdapter());
		
		startGame();
	} 
	
	//Method that would start the game
	public void startGame() {
		newApple();
		moving = true;
		timer = new Timer(DELAY,this); 
		timer.start();
	}
	
	//Method that show the graphics
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		drawGraphics(graphics);
	}
	
	public void drawGraphics(Graphics graphics) {
		
		if(moving) {
			/*
			//for loop that would make a grid along the panel with each square be the size of the UNIT_SIZE
			for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {
				graphics.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
				graphics.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
			}
		    */	
			
			// Draw checkerboard pattern
	        for (int row = 0; row < SCREEN_HEIGHT / UNIT_SIZE; row++) {
	            for (int col = 0; col < SCREEN_WIDTH / UNIT_SIZE; col++) {
	                if ((row + col) % 2 == 0) {
	                    graphics.setColor(Color.decode("#aad751"));
	                } else {
	                    graphics.setColor(Color.decode("#a2d149"));
	                }
	                graphics.fillRect(col * UNIT_SIZE, row * UNIT_SIZE, UNIT_SIZE, UNIT_SIZE);
	            }
	        }
			
			//Draw the apple
			graphics.setColor(Color.RED);
			graphics.fillOval(appleXCoord, appleYCoord, UNIT_SIZE, UNIT_SIZE);
			
			
			//Draw the snake
			for(int i = 0; i < bodyParts; i++) {
				//Head
				if(i == 0) {
					graphics.setColor(Color.GREEN);
					graphics.fillRect(x[i], y[i], UNIT_SIZE,UNIT_SIZE);
				}else { //Body
					graphics.setColor(new Color(45,180,0));
					graphics.fillRect(x[i], y[i], UNIT_SIZE,UNIT_SIZE);
				}
			}
			
			//Score
			graphics.setColor(Color.RED);
			graphics.setFont(new Font("Tahoma", Font.PLAIN, 25));
			FontMetrics metrics = getFontMetrics(graphics.getFont());
			graphics.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten))/2, graphics.getFont().getSize());
			
		}
		else {
			gameOver(graphics);
		}
	}
	
	//Method that would put the apples in the game at random
	public void newApple() {
		appleXCoord = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		appleYCoord = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
		
	}
	
	//Method that would make the snake move
	public void snakeMove() {
		for(int i = bodyParts; i>0; i--) {
			x[i] = x[i-1]; //shifting the coordinates of the array by one
			y[i] = y[i-1]; 
		}
		
		//switch case that would change the direction of the snake 
		switch(direction) {
		//UP
		case 'U':
			y[0] = y[0] - UNIT_SIZE;
			break;
			
		//DOWN
		case 'D':
			y[0] = y[0] + UNIT_SIZE;
			break;
			
		//LEFT
		case 'L':
			x[0] = x[0] - UNIT_SIZE;
			break;
		
		//RIGHT
		case 'R':
			x[0] = x[0] + UNIT_SIZE;
			break;
		}
	
	}
	
	//Method that would check for the apple
	public void checkForApple() {
		if((x[0] == appleXCoord) && (y[0] == appleYCoord)) {
			bodyParts++;
			applesEaten++;
			newApple();
		}
	}
	
	//Method that would check for collisions
	public void collisionCheck() {
		
		//Checks if the head of the snake collides with the body
		for(int i = bodyParts; i>0; i--) {
			if((x[0] == x[i]) &&(y[0] == y[i])) {
				moving = false;
			}
		}
		
		//Checks if the head of the snake collides with the border of the game (LEFT)
		if(x[0] < 0) {
			moving = false;
		}
		
		//Checks if the head of the snake collides with the border of the game (RIGHT)
		if(x[0] > SCREEN_WIDTH) {
			moving = false;
		}
		
		//Checks if the head of the snake collides with the border of the game (TOP)
		if(y[0] < 0) {
			moving = false;
		}
		
		//Checks if the head of the snake collides with the border of the game (BOTTOM)
		if(y[0] > SCREEN_WIDTH) {
			moving = false;
		}
		
		if(!moving) {
			timer.stop();
		}
	}
	
	//Method for game over
	public void gameOver(Graphics graphics) {
		//Score
		//Score
		graphics.setColor(Color.RED);
		graphics.setFont(new Font("Ink Free", Font.BOLD, 40));
		FontMetrics metrics = getFontMetrics(graphics.getFont());
		graphics.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten))/2, graphics.getFont().getSize());
		//Game over text
		graphics.setColor(Color.RED);
		graphics.setFont(new Font("Ink Free", Font.BOLD, 40));
		FontMetrics metrics1 = getFontMetrics(graphics.getFont());
		graphics.drawString("Game OVERR Skill ISSUE", (SCREEN_WIDTH - metrics1.stringWidth("Game OVERR Skill ISSUE"))/2, SCREEN_HEIGHT/2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(moving) {
			snakeMove();
			checkForApple();
			collisionCheck();
		}
		repaint();
		
	}
	
	//Innerclass that would take care of the controls of the snake
	public class KeyboardAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent event) {
			switch(event.getKeyCode()) {
			//the if statement checks if the current direction is the opposite of the current direction
			//basically making the snake only turn 90 degrees
			case KeyEvent.VK_A:
				if(direction != 'R') {
					direction = 'L';
				}
				break;
			
			case KeyEvent.VK_D:
				if(direction != 'L') {
					direction = 'R';
				}
				break;
			
			case KeyEvent.VK_W:
				if(direction != 'D') {
					direction = 'U';
				}
				break;
			
			case KeyEvent.VK_S:
				if(direction != 'U') {
					direction = 'D';
				}
				break;
			}
		}
	}

}
