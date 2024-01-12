package test;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Summation {

	public static int[] addToArray(int[]array, int value) {
		
		int[] newArray = new int[array.length+1];
		for(int i=0; i<array.length; i++) {
			newArray[i] = array[i];  
		}
		newArray[newArray.length-1] = value;
 		return array;
	}
	
	public static void main(String[] args) {
		Scanner deez = new Scanner(System.in);
		
		System.out.print("Input how many number you will add: ");
		int noOfNumbers = deez.nextInt();
		
		List<Integer> numbersToAdd = new ArrayList<Integer>();
		int numbers = 0;
		int i=1;
		while(i<=noOfNumbers) {
			System.out.print("Please input an Integer: ");
			numbers = deez.nextInt();
			numbersToAdd.add(numbers);
			i++;
		}
	}	
	

	}


