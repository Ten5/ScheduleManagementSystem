package ui;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JTextArea;



import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Login {

	private JFrame frame;
	private JTextField textField;
	static Statement st;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e)
		{
			
		
		}
		
		try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			st=con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(65, 91, 46, 14);
		frame.getContentPane().add(lblName);
		
		frame.setBounds(500, 500, 424, 260);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(178, 86, 99, 22);
		frame.getContentPane().add(textArea);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(63, 130, 70, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(178, 127, 99, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					st.executeUpdate("create table xyz(id number primary key,name varchar2(10))");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setBounds(116, 187, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblLogin = new JLabel("LOGIN ");
		lblLogin.setFont(new Font("Stencil", Font.BOLD, 15));
		lblLogin.setBounds(138, 11, 99, 40);
		frame.getContentPane().add(lblLogin);
	}
}
