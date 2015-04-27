package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AdminMenu {

	private JFrame frmMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu window = new AdminMenu();
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
	public AdminMenu() {
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
		
		JLabel lblWelcomeAdmin = new JLabel("WELCOME ADMIN");
		lblWelcomeAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeAdmin.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWelcomeAdmin.setBounds(159, 29, 116, 23);
		frmMenu.getContentPane().add(lblWelcomeAdmin);
		
		JButton btnAddupdatedeleteStudentDetails = new JButton("Student Corner");
		btnAddupdatedeleteStudentDetails.setBounds(102, 81, 229, 33);
		frmMenu.getContentPane().add(btnAddupdatedeleteStudentDetails);
		
		JButton btnTeacherCorner = new JButton("Teacher Corner");
		btnTeacherCorner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTeacherCorner.setBounds(102, 143, 229, 33);
		frmMenu.getContentPane().add(btnTeacherCorner);
		
		JButton btnSubjectCorner = new JButton("Subject Corner");
		btnSubjectCorner.setBounds(102, 205, 229, 33);
		frmMenu.getContentPane().add(btnSubjectCorner);
	}
}
