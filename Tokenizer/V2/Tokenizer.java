package V2;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
	
	public static List<Token> tokenizer(String input){
		
		char delimiter = '/';
		String punctuation = ".!?,;:";
		
		List<Token> tokens = new ArrayList<>();
		StringBuilder token = new StringBuilder();
		
		int line = 1;
		int column = 1;
		int startColumn = 1;
		
		
		for(char element : input.toCharArray()) {
			
			if(element == delimiter) {
				if(token.length() > 0) {
					tokens.add(addToken(token.toString(), line, startColumn));
					token.setLength(0); //resets the token
				}
				tokens.add(new Token(String.valueOf(delimiter), "Delimiter", line, column));
				startColumn = column + 1;
			} 
			
			else if(punctuation.indexOf(element) != -1) {
				if(token.length() > 0) {
					tokens.add(addToken(token.toString(), line, startColumn));
					token.setLength(0); //resets the token
				}
				tokens.add(new Token(String.valueOf(element), "Punctuation", line, column));
				startColumn = column + 1;
			}
			
			else if (element == '\n') {
				if(token.length() > 0) {
					tokens.add(addToken(token.toString(), line, startColumn));
					token.setLength(0); // resets the token
				}
				tokens.add(new Token(String.valueOf(element), "End of Line", line, column));
				line++;
				column = 0;
				startColumn = 1;
			}
			
			else if (Character.isWhitespace(element)) {
				if(token.length() > 0) {
					tokens.add(addToken(token.toString(), line, startColumn));
					token.setLength(0); // resets the token
				}
				startColumn = column + 1;
			}
			
			else {
				if(token.length() == 0) {
					startColumn = column;
				}
				token.append(element);
			}
			
			column++;
			
		}
		
		if(token.length() > 0) {
			tokens.add(addToken(token.toString(), line, startColumn));
		}
		
		return tokens;
	}
	
	
	private static Token addToken(String value, int line, int column) {
		if(isNumeric(value)) {
			return new Token(value, "Number" ,line, column);
		} else if(isAlpha(value)) {
			return new Token(value, "Word" ,line, column);
		} else if(value.matches("\\P{Alnum}+")) {
			return new Token(value, "Symbol", line, column);
		} else {
			return new Token(value, "Unknown", line, column);
		}
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
