package test;

import java.util.Scanner;
public class firstTask {

	public static void main(String[] args) {
		Scanner scanmode = new Scanner(System.in);
		
		System.out.print("Enter username: ");
		String username = scanmode.nextLine();
		
		System.out.print("Enter age: ");
		int age = scanmode.nextInt();
		
		System.out.print("Enter the first number: ");
		int firstNumber = scanmode.nextInt();
		
		System.out.print("Enter the second number: ");
		int secondNumber = scanmode.nextInt();
		
		int product = firstNumber * secondNumber;
		
		System.out.println("The username is " + username + " and the age is " + age);
		System.out.println("The product is " + product);
		
	}

}
