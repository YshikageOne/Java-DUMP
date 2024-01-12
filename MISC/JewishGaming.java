package test;

import java.text.DecimalFormat;
import java.util.Scanner;
public class JewishGaming {

	public static void main(String[] args) {
		Scanner taxEvader = new Scanner(System.in);
		
		System.out.print("#1: ");
		double firstNumber = taxEvader.nextInt();
		
		System.out.print("#2: ");
		double secondNumber = taxEvader.nextInt();
		
		DecimalFormat df = new DecimalFormat(".00");
		int  sum =  (int) (firstNumber + secondNumber);
		int difference = (int) (firstNumber - secondNumber);
		int product = (int) (firstNumber * secondNumber);
		double quotient = firstNumber / secondNumber;
		System.out.println("The sum is " + sum + ".");
		System.out.println((int)firstNumber + " - " + (int)secondNumber + " = " + difference );
		System.out.println((int)firstNumber + " x " + (int)secondNumber + " = " + product);
		System.out.printf((int)firstNumber + " / " + (int)secondNumber + " = " + df.format(quotient));
		
		

	}

}
