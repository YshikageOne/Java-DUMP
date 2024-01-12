package test;

import java.text.DecimalFormat;
import java.util.Scanner;
public class haiyaa {

    public static void main(String[] args) {
        Scanner friedRice= new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");

        System.out.print("");

        int noOfNumbers = friedRice.nextInt();

        if(noOfNumbers > 0 && noOfNumbers <= 100) {
        double[] spyGaming = new double[noOfNumbers];

        int no=1;
        for(int a=0;a<noOfNumbers;a++) {
                System.out.print("");
                spyGaming[a]= friedRice.nextDouble();
        }

        display(spyGaming);
      }
     else {System.out.println("Must be less than 100 haiyaa start over...");}
}
    public static double minimum(double [] array) {
        double minimumValue = array[0];
        for(int i=0; i < array.length; i++) {
            if(array[i]< minimumValue) {
                minimumValue = array[i];
            }

        }

        return minimumValue;
    }
     public static double maximum(double [] array) {
        double maximumValue = array[0];
        for(int i=0; i < array.length; i++) {
            if(array[i] > maximumValue) {
                maximumValue = array[i];
            }

        }

        return maximumValue;
    }

    public static double average(double [] array) {
        double averageValue = 0;
        double totalValue = 0;
        for(int i = 0; i < array.length;i++) {
            totalValue += array[i];

        }
        averageValue = totalValue/array.length;
        return averageValue;
    }

    public static void display(double [] array) {
        DecimalFormat df = new DecimalFormat(".00");
        for(int i = 0; i < array.length;i++ ) {
            System.out.println("#" + (i+1) + "-" + df.format(array[i]));
        }
        System.out.printf("Minimum = " + df.format(minimum(array)) + " , Maximum = " + df.format(maximum(array)) + " , Average = " + df.format(average(array)));
    } 



 }
 

