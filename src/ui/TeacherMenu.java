package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class TeacherMenu {

	private JFrame frmMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherMenu window = new TeacherMenu();
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
	public TeacherMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.setResizable(false);
		frmMenu.getContentPane().setBackground(new Color(255, 250, 250));
		frmMenu.setBounds(100, 100, 450, 300);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME:");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(153, 41, 127, 27);
		frmMenu.getContentPane().add(lblWelcome);
		
		JButton button = new JButton("View Atendance Report");
		button.setBounds(102, 190, 229, 40);
		frmMenu.getContentPane().add(button);
		
		JButton button_1 = new JButton("Record Attendance");
		button_1.setBounds(102, 109, 229, 40);
		frmMenu.getContentPane().add(button_1);
		
		
	}

}
