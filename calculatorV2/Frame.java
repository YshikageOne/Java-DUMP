package calculatorV2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
	
	//Elements of the calculator
	JPanel contentPane;
	JTextField txtCalculator;
	JPanel buttonPanel;
	JButton btnleftPar;
	JButton btn5;
	JButton btnrightPar;
	JButton btn2;
	JButton btn3;
	JButton btn1;
	JButton btnMultiply;
	JButton btnPercent;
	JButton btn6;
	JButton btn8;
	JButton btn4;
	JButton btn9;
	JButton btnSubtract;
	JButton btnAdd;
	JButton btnClear;
	JButton btnDivide;
	JButton btn7;
	JButton btn0;
	JButton btnPoint;
	JButton btnEqual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
					
					//Setting the Calculator methods
					CalculatorMethods methods = new CalculatorMethods(frame);
					methods.buttonDisplay(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\gayur\\Desktop\\Coding stuff\\Java\\SchoolStuff\\images\\gx.jpg"));
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCalculator = new JTextField();
		txtCalculator.setEditable(false);
		txtCalculator.setFont(new Font("Arial", Font.BOLD, 28));
		txtCalculator.setBounds(0, 0, 341, 58);
		contentPane.add(txtCalculator);
		txtCalculator.setColumns(3);
		
		buttonPanel = new JPanel();
		buttonPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		buttonPanel.setBounds(0, 57, 341, 324);
		contentPane.add(buttonPanel);
		buttonPanel.setLayout(new GridLayout(5, 4, 0, 0));
		
		btnleftPar = new JButton("(");
		btnleftPar.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btnleftPar);
		
		btnrightPar = new JButton(")");
		btnrightPar.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btnrightPar);
		
		btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btnPercent);
		
		btnDivide = new JButton("/");
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btnDivide);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btn3);
		
		btnMultiply = new JButton("x");
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btnMultiply);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btn6);
		
		btnSubtract = new JButton("-");
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btnSubtract);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btn9);
		
		btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btnAdd);
		
		btnClear = new JButton("C");
		btnClear.setBackground(Color.RED);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btnClear);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btn0);
		
		btnPoint = new JButton(".");
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btnPoint);
		
		btnEqual = new JButton("=");
		btnEqual.setBackground(Color.CYAN);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonPanel.add(btnEqual);
	}
}
