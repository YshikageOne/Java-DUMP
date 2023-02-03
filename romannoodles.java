package test;

import java.util.ArrayList;
import java.util.Scanner;

public class romannoodles {

	public static void main(String[] args) {
		    Scanner key = new Scanner (System.in);
		    int num;

		    System.out.print("");
	        num=key.nextInt();
	        if(num > 0 && num <= 20) {
	        int[] sniperGaming = new int[num];
			
			for(int a=0;a<num;a++) {
				System.out.print("");
				sniperGaming[a]= key.nextInt();
			} 
			for(int i=0; i<sniperGaming.length;i++) {
				DecimalToRoman(sniperGaming, sniperGaming[i]);
			}
	   }else {System.out.println("Deez Nuts lolololololololo");}	
	}
	
    public static void DecimalToRoman(int [] array, int num) {
    	int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>();
 
 
       int j=0; 
       do {
    	   for(int i=0;i<values.length;i++) {
           	while(num >= values[i]) {
                   num -= values[i];
                   roman.append(romanLiterals[i]);
               }
             }
           j++;
       } while(j < array.length);     
       list.add(roman.toString());
       for(int i = 0; i < list.size();i++) {
			System.out.println(""+list.get(i));
		} 
    }   
    
} 
