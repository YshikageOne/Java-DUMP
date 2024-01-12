package test;

import java.util.Scanner;
import java.util.Random;
public class RandomNumGen {

	public static void main(String[] args) {
		Scanner mywifeleftme = new Scanner(System.in);
		Random taxevasion = new Random();
		
		System.out.print("Enter your minimum number: ");
		int minNum = mywifeleftme.nextInt();
		
		System.out.print("Enter your maximum number: ");
		int maxNum = mywifeleftme.nextInt();
		
		System.out.print("Guess the Number: ");
		int guessNum = mywifeleftme.nextInt();
		
		int genNum = minNum+taxevasion.nextInt(maxNum);
		
		if(guessNum == genNum) {
			System.out.println("Nice you did it... have some titties Ꙭ");
		}
		else {
			System.out.println("The correct answer is " + genNum);
			System.out.println("nah bro practice sa");
		}

	}

}
