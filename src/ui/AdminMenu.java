package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu window = new AdminMenu();
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
	public AdminMenu() {
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
		
		JLabel lblWelcomeAdmin = new JLabel("WELCOME ADMIN");
		lblWelcomeAdmin.setBounds(155, 24, 127, 27);
		frame.getContentPane().add(lblWelcomeAdmin);
		
		JButton btnAddupdatedeleteStudentDetails = new JButton("Add/Update/Delete Student Details");
		btnAddupdatedeleteStudentDetails.setBounds(100, 76, 229, 23);
		frame.getContentPane().add(btnAddupdatedeleteStudentDetails);
		
		JButton button = new JButton("Add/Update/Delete Teacher Details");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(100, 124, 229, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Add/Update/Delete Subject Details");
		button_1.setBounds(100, 168, 229, 23);
		frame.getContentPane().add(button_1);
	}
}
