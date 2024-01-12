package test;

import javax.swing.*;

public class morePractice {
	
	private String color;
	private String size;
	
	public morePractice (String color, String size) {
		this.color = color;
		this.size = size;
	}
	
	public void displayDetails() {
		
		String output = ("Shirt Color: " + color +
				         "\nShirt Size: " + size);
				
		JOptionPane.showMessageDialog(null, output, "Details", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void main(String[] args) {
		
		String userColor = JOptionPane.showInputDialog(null, "What's the color of your shirt?", "Shirt Color", JOptionPane.QUESTION_MESSAGE);
		
		String userSize = JOptionPane.showInputDialog(null, "What's the size of your shirt?", "Shirt Size", JOptionPane.QUESTION_MESSAGE);
		
		morePractice myShirt = new morePractice(userColor, userSize);
		
		myShirt.displayDetails();
	}

}
