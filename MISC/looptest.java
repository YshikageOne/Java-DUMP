package test;

import java.util.Scanner;
public class looptest {

	public static void main(String[] args) {
        Scanner deez = new Scanner(System.in);
        System.out.print("");
        int noOfLoops = deez.nextInt();

        int a = 0;
        while(a<noOfLoops) {
            System.out.print("");
            int number = deez.nextInt();
            a++;
        }

    }

}
