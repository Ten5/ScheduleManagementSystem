package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class AddSubject {

	private JFrame frmAddSubject;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSubject window = new AddSubject();
					window.frmAddSubject.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddSubject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddSubject = new JFrame();
		frmAddSubject.getContentPane().setBackground(new Color(255, 250, 250));
		frmAddSubject.setBackground(new Color(255, 250, 250));
		frmAddSubject.setResizable(false);
		frmAddSubject.setTitle("Add Subject");
		frmAddSubject.setBounds(100, 100, 450, 300);
		frmAddSubject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddSubject.getContentPane().setLayout(null);
		
		JLabel lblSubjectCode = new JLabel("Subject Code:");
		lblSubjectCode.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubjectCode.setBounds(41, 70, 89, 20);
		frmAddSubject.getContentPane().add(lblSubjectCode);
		
		JLabel lblName = new JLabel("Subject Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(41, 115, 89, 20);
		frmAddSubject.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(171, 70, 219, 20);
		frmAddSubject.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 115, 219, 20);
		frmAddSubject.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(41, 177, 89, 23);
		frmAddSubject.getContentPane().add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(171, 177, 89, 23);
		frmAddSubject.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(301, 177, 89, 23);
		frmAddSubject.getContentPane().add(btnDelete);
	}
}
