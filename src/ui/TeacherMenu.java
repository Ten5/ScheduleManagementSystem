package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TeacherMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherMenu window = new TeacherMenu();
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
	public TeacherMenu() {
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
		
		JLabel label = new JLabel("WELCOME ");
		label.setBounds(134, 38, 127, 27);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("View Atendance Report");
		button.setBounds(79, 148, 229, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Record Attendance");
		button_1.setBounds(79, 99, 229, 23);
		frame.getContentPane().add(button_1);
		
		
	}

}
