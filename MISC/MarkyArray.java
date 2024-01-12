package test;

import java.util.*;

public class MarkyArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		List<Integer> badNumbers = new ArrayList<>();
		
		System.out.println("Enter numbers in the search list:");
		int num; 
		while((num = scanner.nextInt()) != 0) {
			numbers.add(num);
		}
		
		System.out.println("Enter numbers to be excluded from the search list:");
		while((num = scanner.nextInt()) != 0) {
			badNumbers.add(num);
		}
		
		numbers.removeAll(badNumbers);
		
		String result = ("Found " + numbers.size() + " numbers:\n"
				+ numbers.toString().replaceAll("[\\[\\]]", ""));
		System.out.println(result);
	}
	
}
