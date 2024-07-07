package LASv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class v1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the amount of Test Case: ");
		int testCase = scanner.nextInt();
		List<String> results = new ArrayList<>();
		
		//looping through each test case
		while(testCase-- > 0) {
			System.out.print("Enter the Sequence Length: ");
			int arraySize = scanner.nextInt();
			int[] sequence = new int[arraySize];
			System.out.print("Enter the Sequence: ");
			
			for(int i = 0; i < arraySize; i++) {
				sequence[i] = scanner.nextInt();
			}
			
			results.add(findLAS(sequence));
			
		}
		
		scanner.close();
		
		//printing all the results
		for(String result: results) {
			System.out.println(result);
		}
	}
	
	//LAS = Longest Alternating Subsequence
	
	private static String findLAS(int[] sequence) {
		int sequenceLength = sequence.length;
		
		if (sequenceLength == 0) return "0 ()"; //Empty array 
		
		//arrays that store the length of LAS ending at each index
		int[] increasing = new int[sequenceLength];
		int[] decreasing = new int[sequenceLength];
		
		int[] prevInc = new int[sequenceLength];
		int[] prevDec = new int[sequenceLength];
		
		//initialize all values to 1 
		//because a single element is an alternating sequence of length 1
		for(int i = 0; i < sequenceLength; i++) {
			increasing[i] = 1;
			decreasing[i] = 1;
			prevInc[i] = -1;
			prevDec[i] = -1;
		}
		
		
		//filling the arrays by comparing
		for(int i = 1; i < sequenceLength; i++) {
			for(int j = 0; j < i; j++) {
				if(sequence[i] > sequence[j] && increasing[i] < decreasing[j] + 1) {
					increasing[i] = decreasing[j] + 1;
					prevInc[i] = j;
				}else if(sequence[i] < sequence[j] && decreasing[i] < increasing[j] + 1) {
					decreasing[i] = increasing[j] + 1;
					prevDec[i] = j;
				}
			}
		}
		
		//Find the maximum value in both arrays
		int maxLength = 1;
		int maxIndex = 0;
		boolean isIncreasing = true;
		
		for(int i = 0; i < sequenceLength; i++) {
			if(increasing[i] > maxLength) {
				maxLength =increasing[i];
				maxIndex = i;
				isIncreasing = true;
			}
			if(decreasing[i] > maxLength) {
				maxLength = decreasing[i];
				maxIndex = i;
				isIncreasing = false;
			}
		}
		
		//Reconstruct the LAS
		List<Integer> subsequence = new ArrayList<>();
		int currentIndex = maxIndex;
		
		while(currentIndex != -1) {
			subsequence.add(sequence[currentIndex]);
			if(isIncreasing) {
				currentIndex = prevInc[currentIndex];
				isIncreasing = false;
			} else {
				currentIndex = prevDec[currentIndex];
				isIncreasing = true;
			}
		}
		
		//Reverse the subsequence to get the correct order
		StringBuilder result = new StringBuilder();
		result.append(maxLength).append(" (");
		
		for(int i = subsequence.size() - 1; i >= 0; i--) {
			result.append(subsequence.get(i));
			
			if(i > 0) {
				result.append(", ");
			}
		}
		
		result.append(")");
		
		return result.toString();
	}
}
