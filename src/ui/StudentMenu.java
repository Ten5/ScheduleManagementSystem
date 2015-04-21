package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class StudentMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMenu window = new StudentMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("WELCOME");
		label.setBounds(136, 41, 127, 27);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("View Details");
		button.setBounds(81, 185, 229, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("View Attendance Report");
		button_1.setBounds(81, 141, 229, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("View Schedule");
		button_2.setBounds(81, 93, 229, 23);
		frame.getContentPane().add(button_2);
	}

}
