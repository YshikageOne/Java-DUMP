package calculatorV2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.JButton;

public class CalculatorMethods {
	private Frame calcFrame;
	
	//Constructor
	public CalculatorMethods(Frame frame) {
		this.calcFrame = frame;
	}
	
	//Button displays
	public static void buttonDisplay(Frame frame) {
		
		//Operations
		//add
		JButton addButton = frame.btnAdd;
		
		 addButton.addActionListener((ActionListener) new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "+";
		            frame.txtCalculator.setText(currentText);
		        }
		    });
		 
		 //subract
		 JButton subtractButton = frame.btnSubtract;
		 
		 subtractButton.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "-";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
		 
		 //Multiply
		 JButton multiplyButton = frame.btnMultiply;
		 
		 multiplyButton.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "x";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
		 
		 //Divide
		 JButton divideButton = frame.btnDivide;
		 
		 divideButton.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "/";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
		 
		 
		 //Other buttons
		 //clear
		 JButton clearButton = frame.btnClear;
		 
		 clearButton.addActionListener((ActionListener) new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText = "";
		            frame.txtCalculator.setText(currentText);
		        }
		    });
		 
		 //Parenthesis
		 JButton openParentButton = frame.btnleftPar;
		 JButton closeParentButton = frame.btnrightPar;
		 
		 openParentButton.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "(";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
		 
		 closeParentButton.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += ")";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
		 
		 //Percentage
	     JButton percentButton = frame.btnPercent;
	     
	     percentButton.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "%";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     //Decimal
	     JButton pointButton = frame.btnPoint;
	     
	     pointButton.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += ".";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     //Numbers
	     JButton button0 = frame.btn0;
	     JButton button1 = frame.btn1;
	     JButton button2 = frame.btn2;
	     JButton button3 = frame.btn3;
	     JButton button4 = frame.btn4;
	     JButton button5 = frame.btn5;
	     JButton button6 = frame.btn6;
	     JButton button7 = frame.btn7;
	     JButton button8 = frame.btn8;
	     JButton button9 = frame.btn9;
	     
	     button0.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "0";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     button1.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "1";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     button2.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "2";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     button3.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "3";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     button4.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "4";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     button5.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "5";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     button6.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "6";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     button7.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "7";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     button8.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "8";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     button9.addActionListener((ActionListener) new ActionListener(){
			 public void actionPerformed(ActionEvent e) {
		            String currentText = frame.txtCalculator.getText(); // Accessing the text field directly from the Frame instance
		            currentText += "9";
		            frame.txtCalculator.setText(currentText);
		        }
		 });
	     
	     //Equal
	     JButton equalButton = frame.btnEqual;
	     
	     equalButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String expression = frame.txtCalculator.getText(); // Get the expression from the text field
					String result = calculateTime(expression); // Evaluate the expression
					frame.txtCalculator.setText(result); // Display the result in the text field
				}
			});
		 
	}
	
	
	// The magic calculation
	public static String calculateTime(String expression) {
	    try {
	        // Remove all whitespace from the expression.
	        expression = expression.replaceAll("\\s+", "");

	        // Convert percentages to fractions.
	        expression = expression.replaceAll("%", "/100");

	        // Create a stack to store the numbers.
	        Stack<Double> numbers = new Stack<>();

	        // Create a stack to store the operators.
	        Stack<Character> operators = new Stack<>();

	        // Iterate over each character in the expression.
	        for (int i = 0; i < expression.length(); i++) {
	            char ch = expression.charAt(i);

	            // If the character is a digit or a decimal point, build the number.
	            if (Character.isDigit(ch) || ch == '.') {

	                // Create a StringBuilder to store the number.
	                StringBuilder sb = new StringBuilder();

	                // While the current character is a digit or a decimal point, append it to the StringBuilder.
	                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
	                    sb.append(expression.charAt(i));
	                    i++;
	                }

	                // Convert the StringBuilder to a double and push it onto the numbers stack.
	                numbers.push(Double.parseDouble(sb.toString()));

	                // Decrement i so that the next iteration will not process the character that was just processed.
	                i--;
	            } else if (ch == '(') {
	            	
	                // Push the opening parenthesis onto the operators stack.
	                operators.push(ch);
	                
	            } else if (ch == ')') {

	                // Evaluate the expression inside parentheses.
	                while (!operators.isEmpty() && operators.peek() != '(') {

	                    // Pop the top operator from the operators stack.
	                    char op1 = operators.pop();

	                    // Pop the top two numbers from the numbers stack.
	                    double b = numbers.pop();
	                    double a = numbers.pop();

	                    // Apply the operator to the operands and push the result onto the numbers stack.
	                    numbers.push(applyOperator(op1, b, a));
	                }

	                // If the operators stack is not empty and the top element is an opening parenthesis, pop it.
	                if (!operators.isEmpty() && operators.peek() == '(') {
	                    operators.pop();
	                }
	            } else if (isOperator(ch)) {

	                // Handle the operators.
	                while (!operators.isEmpty() && hasPrecedence(ch, operators.peek())) {

	                    // Pop the top operator from the operators stack.
	                    char op1 = operators.pop();

	                    // Pop the top two numbers from the numbers stack.
	                    double b = numbers.pop();
	                    double a = numbers.pop();

	                    // Apply the operator to the operands and push the result onto the numbers stack.
	                    numbers.push(applyOperator(op1, b, a));
	                }

	                // Push the current operator onto the operators stack.
	                operators.push(ch);
	            }
	        }

	        // Evaluate the remaining operators.
	        while (!operators.isEmpty()) {

	            // Pop the top operator from the operators stack.
	            char op1 = operators.pop();

	            // Pop the top two numbers from the numbers stack.
	            double b = numbers.pop();
	            double a = numbers.pop();

	            // Apply the operator to the operands and push the result onto the numbers stack.
	            numbers.push(applyOperator(op1, b, a));
	        }

	        // If the numbers stack is not empty, return the top element.
	        if (!numbers.isEmpty()) {
	            return numbers.pop().toString();
	        } else {
	            // Otherwise, return an error message.
	            return "Error: Invalid expression";
	        }
	    } catch (Exception ex) {
	        // Handle any error that occurs during evaluation.
	        return "Error: " + ex.getMessage();
	    }
	}

	// Check if a character is an operator.
	private static boolean isOperator(char ch) {
	    return ch == '+' || ch == '-' || ch == 'x' || ch == '/';
	}

	// Check if op2 has higher or equal precedence than op1.
	private static boolean hasPrecedence(char op1, char op2) {
	    if (op2 == '(' || op2 == ')') {
	        return false;
	    }
	    return (op1 == 'x' || op1 == '/') && (op2 == '+' || op2 == '-');
	}

	// Apply the operator to the operands.
	private static double applyOperator(char operator, double b, double a) {
	    switch (operator) {
	        case '+':
	            return a + b;
	        case '-':
	            return a - b;
	        case 'x':
	            return a * b;
	        case '/':
	            if (b == 0) {
	                throw new ArithmeticException("Division by zero");
	            }
	            return a / b;
	        default:
	            throw new IllegalArgumentException("Invalid operator");
	    }
	}
}
