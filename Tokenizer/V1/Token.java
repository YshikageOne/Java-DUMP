package V1;

//TokenizerV1 just splits a text into tokens

public class Token {
	
	private String value;
	private String type;
	
	public Token(String value, String type) {
		this.value = value;
		this.type = type;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getType() {
		return type;
	}
	
}
