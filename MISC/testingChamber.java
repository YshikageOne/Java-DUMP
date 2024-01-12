package test;

import java.util.Scanner;

public class testingChamber {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter your desired grading system (in percentage) with a total of 100%\r\n");
    	
    	System.out.println("Enter the max items of each\n");
    	
    	System.out.print("Quiz - ");
    	int quizMaxItems = scanner.nextInt();
    	
    	System.out.print("Assignment - ");
    	int assignmentMaxItems = scanner.nextInt();
    	
    	System.out.print("Exam - ");
    	int examMaxItems = scanner.nextInt();
    	
    	System.out.print("Oral Recitation -");
    	int oralRecitationMaxItems = scanner.nextInt();
    	
    	System.out.println("Enter the amount\n");
    	
    	System.out.print("How many quiz? ");
    	int quizCount = scanner.nextInt();
    	
    	System.out.print("How many assignments? ");
    	int assignmentCount = scanner.nextInt();
    	
    	System.out.println("Enter the scores\n");
    	
    	
    	
    	
    }
    
}
