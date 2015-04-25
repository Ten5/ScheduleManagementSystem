package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class StudentMenu {

	private JFrame frmMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMenu window = new StudentMenu();
					window.frmMenu.setVisible(true);
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
		frmMenu = new JFrame();
		frmMenu.setResizable(false);
		frmMenu.setTitle("Menu");
		frmMenu.getContentPane().setBackground(new Color(255, 250, 250));
		frmMenu.setBounds(100, 100, 450, 300);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME:");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWelcome.setBounds(153, 30, 127, 27);
		frmMenu.getContentPane().add(lblWelcome);
		
		JButton button = new JButton("View Details");
		button.setBounds(102, 201, 229, 27);
		frmMenu.getContentPane().add(button);
		
		JButton button_1 = new JButton("View Attendance Report");
		button_1.setBounds(102, 144, 229, 27);
		frmMenu.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("View Schedule");
		button_2.setBounds(102, 87, 229, 27);
		frmMenu.getContentPane().add(button_2);
	}

}
