package V1;

//TokenizerV1 just splits a text into tokens

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Tokenizer {
	
	// Delimiters separated into punctuation, spaces, and symbols
    private static final List<Character> punctuations = List.of('.', ',', '!', '?', ':', ';', '"', '<', '>', '/');
    private static final List<Character> spaces = List.of(' ', '\n', '\t');
    private static final List<Character> symbols = List.of('+', '=', '-', '_', '(', ')', '{', '}', '[', ']', '|', '`', '~', '@', '#', '$', '%', '^', '&', '*', '…');
    private static final List<Character> delimiters = new ArrayList<>();
    
    
    //Adding all of the delimiters
    static {
        delimiters.addAll(spaces);
        delimiters.addAll(punctuations);
        delimiters.addAll(symbols);
    }
    
    //Tokenizer Method
    public static List<Token> tokenize(String input){
    	
    	//List that contains all of the tokens
    	List<Token> tokens = new ArrayList<>();
    	
    	//Contains all of the values for a token
    	StringBuilder token = new StringBuilder();
    	
    	for (char c : input.toCharArray()) {
    		if(delimiters.contains(c)) {
    			if(token.length() > 0) { //If the token is not empty
    				String tokenValue = token.toString();
    				if(isNumeric(tokenValue)) {
    					tokens.add(new Token(tokenValue, "Number"));
    				}else if(isAlpha(tokenValue)) {
    					tokens.add(new Token(tokenValue, "Word"));
    				}else {
    					tokens.add(new Token(tokenValue, "Symbol"));
    				}
    				
    				token.setLength(0); //reset the token
    			}
    			
    			//Categorize the delimiters into their own types
    			if(spaces.contains(c)) {
    				tokens.add(new Token(String.valueOf(c), "Space"));
    			} else if(punctuations.contains(c)) {
    				tokens.add(new Token(String.valueOf(c), "Punctuation"));
    			} else if(symbols.contains(c)) {
    				tokens.add(new Token(String.valueOf(c), "Symbol"));
    			}	
    		} else {
    			token.append(c);
    		}
    	}
    	
    	//Checking for the last token after the loop
    	if(token.length() > 0) {
    		String tokenValue = token.toString();
    		if(isNumeric(tokenValue)) {
				tokens.add(new Token(tokenValue, "Number"));
			}else if(isAlpha(tokenValue)) {
				tokens.add(new Token(tokenValue, "Word"));
			}else {
				tokens.add(new Token(tokenValue, "Symbol"));
			}
    	}
    	
    	return tokens;
    }
    
    
    //Check if a string is a number or not
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
    //Checks if a string is a word
    private static boolean isAlpha(String str) {
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }

	
	
}
