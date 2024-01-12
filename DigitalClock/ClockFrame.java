package DigitalClock;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class ClockFrame extends JFrame {

	private JPanel contentPane;
	JLabel time;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClockFrame frame = new ClockFrame();
					frame.setVisible(true);
					
					ClockMethods methods = new ClockMethods(frame);
					methods.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClockFrame() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 604, 124);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digital Clock");
		lblNewLabel.setBounds(142, 11, 310, 67);
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 50));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 125, 604, 316);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHour = new JLabel("Hour");
		lblHour.setBounds(110, 112, 58, 29);
		panel_1.add(lblHour);
		lblHour.setForeground(Color.BLACK);
		lblHour.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JLabel lblMinute = new JLabel("Minute");
		lblMinute.setBounds(196, 112, 82, 29);
		lblMinute.setForeground(Color.BLACK);
		lblMinute.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(lblMinute);
		
		JLabel lblSecond = new JLabel("Second");
		lblSecond.setBounds(296, 104, 131, 44);
		lblSecond.setForeground(Color.BLACK);
		lblSecond.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(lblSecond);
		
		time = new JLabel();
		time.setBounds(86, 11, 419, 130);
		time.setText("test");
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setForeground(Color.BLACK);
		time.setFont(new Font("Tahoma", Font.BOLD, 60));
		panel_1.add(time);
		
		
	}
}
