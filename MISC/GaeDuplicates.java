package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class GaeDuplicates {

	public static void main(String[] args) {
		Scanner soju= new Scanner(System.in);
		
        System.out.print("");
		
		int noOfNumbers = soju.nextInt();
	if(noOfNumbers > 0 && noOfNumbers <= 100) {	
		int[] medicGaming = new int[noOfNumbers];
		
		for(int a=0;a<noOfNumbers;a++) {
			System.out.print("");
			medicGaming[a]= soju.nextInt();
	}
 		removeDup(medicGaming);
 		resultDup(medicGaming);

     }else {System.out.println("Must be less than 100 haiyaa start over...");}	
} 
 
	public static void display(int [] array) {
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i] + " ");
		} 
    }
	
	
	public static int[] addToArray(int [] array, int value) {
		int [] newArray = new int[array.length+1];
		for(int i=0; i<array.length;i++) {
			newArray[i]=array[i];
		}
		newArray[newArray.length-1] = value;
		return newArray;
	}
	

	public static void duplicateChecker(int [] array) {
		int [] dup = new int[0];
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					dup = addToArray(dup, array[i]);
				}
			}
		}
		sortDup(dup);
	
	}
	
	public static void sortDup(int [] array) {
		int temporary=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]);
				{
					temporary=array[i];
					array[i]=array[j];
					array[j]=temporary;
					
				}
			}
		}
		display(array);
	}

	public static void removeDup(int [] array) {
		int[] noDup = Arrays.stream(array).distinct().toArray();
		for(int i = 0; i<noDup.length;i++)
		{
			System.out.println("#" + (i+1) + " - " + noDup[i]);
		}
	}
	
	public static void resultDup(int [] array) {
		System.out.print("Duplicates are: "); duplicateChecker(array);
	}
  }

	

	

