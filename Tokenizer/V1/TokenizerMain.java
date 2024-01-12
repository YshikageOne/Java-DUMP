package V1;

import java.util.List;
import java.util.Scanner;

public class TokenizerMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tokenizer tokenizer = new Tokenizer();
		
		System.out.print("Enter text : ");
		String input = scan.nextLine();
		scan.close();
		
		
		List<Token> tokens = tokenizer.tokenize(input);
		
		for(Token token : tokens) {
			System.out.println("Value: " + token.getValue() + " | Type: " + token.getType());
		}
	}
}
