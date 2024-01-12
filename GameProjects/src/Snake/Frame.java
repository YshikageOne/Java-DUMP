package Snake;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	//Constructor
	Frame(){
		
		//Calling on the panel of the game
		Panel panel = new Panel();
		
		//Creating the frame
		this.add(panel);
		this.setTitle("Funny Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); //adds the components to the Frame
		this.setVisible(true);
		this.setLocationRelativeTo(null); //make the window appear in the middle of the screen
		
		
	}

}
