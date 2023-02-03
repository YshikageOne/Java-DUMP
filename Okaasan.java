package test;

import java.util.Scanner;
public class Okaasan {

	public static void main(String[] args) {
		Scanner pyro = new Scanner(System.in);
		System.out.print("");
		int number = pyro.nextInt();
		
		int num = 1;
		for(int i = 1; i <= number; i++) {
			for(int j = i; j >= 1; j--) {
				
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
