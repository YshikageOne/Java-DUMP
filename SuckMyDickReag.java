package test;

import java.util.Scanner;
public class SuckMyDickReag {

	public static void main(String[] args) {
        Scanner jew= new Scanner(System.in);
		
		System.out.print("Input how many number you will add: ");
		
		int noOfNumbers = jew.nextInt();
		
		int[] array = new int[noOfNumbers];
		
		int i=0;
		int number = 0;
			for(int a=0;a<noOfNumbers;a++) {
				System.out.print("Please input an Integer: ");
				array[a]=jew.nextInt();
			}
		
			  System.out.println("The sum is: " + summation(array));
			
	}
	 public static int summation(int [] array) {
		  int sum = 0;
		  for(int c=0;c<array.length; c++) {
			  sum = sum + array[c];
		  }
		return sum;
	 }
	public static void display(int[] input) {
		for(int count=0; count<input.length;count++) {
			System.out.println(input[count]);
		}
	} 	  


			
	
		
	

}
