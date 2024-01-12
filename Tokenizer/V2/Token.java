package V2;

public class Token {
	
	private String value;
	private String type;
	private int line;
	private int column;
	
	public Token(String value, String type, int line, int column) {
		this.value = value;
		this.type = type;
		this.line = line;
		this.column = column;
	}
	
	public String getValue() {
		return value;
	}
	
	public String getType() {
		return type;
	}
	
	public int getLine() {
		return line;
	}
	
	public int getColumn() {
		return column;
	}
}
