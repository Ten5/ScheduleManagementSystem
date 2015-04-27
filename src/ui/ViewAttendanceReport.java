package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import oracle.jdbc.OracleTypes;

public class ViewAttendanceReport {

	private JFrame frmStudentConsolidateReport;
	private JTable studentTable;
	private JLabel lblDepartment;
	private JLabel lblCourse_1;
	private JLabel lblSemester;
	static Statement st;
	static Connection con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e) {
		}

		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			st=con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAttendanceReport window = new ViewAttendanceReport();
					window.frmStudentConsolidateReport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewAttendanceReport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {

		frmStudentConsolidateReport = new JFrame();
		frmStudentConsolidateReport.getContentPane().setBackground(new Color(255, 250, 250));
		frmStudentConsolidateReport.setBackground(new Color(255, 250, 250));
		frmStudentConsolidateReport.setResizable(false);
		frmStudentConsolidateReport.setTitle("Student Attendance Report");
		frmStudentConsolidateReport.setBounds(100, 100, 900, 491);
		frmStudentConsolidateReport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentConsolidateReport.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 169, 806, 272);
		frmStudentConsolidateReport.getContentPane().add(scrollPane);

		studentTable = new JTable();
		studentTable.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(studentTable);
		studentTable.setModel(new DefaultTableModel(
		new Object[][] {				
		},
		new String[] {
				"Class Roll No", "University Roll No", "Name", "Status"
		}
		));

		JLabel lblCourse = new JLabel("Year:");
		lblCourse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCourse.setBounds(44, 69, 89, 23);
		frmStudentConsolidateReport.getContentPane().add(lblCourse);

		lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDepartment.setBounds(44, 99, 89, 23);
		frmStudentConsolidateReport.getContentPane().add(lblDepartment);

		lblCourse_1 = new JLabel("Course:");
		lblCourse_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCourse_1.setBounds(44, 36, 89, 23);
		frmStudentConsolidateReport.getContentPane().add(lblCourse_1);

		lblSemester = new JLabel("Semester:");
		lblSemester.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSemester.setBounds(44, 133, 89, 23);
		frmStudentConsolidateReport.getContentPane().add(lblSemester);

		JComboBox course = new JComboBox();
		course.setModel(new DefaultComboBoxModel(new String[] {"B.Tech", "M.Tech"}));
		course.setBounds(143, 36, 79, 23);
		frmStudentConsolidateReport.getContentPane().add(course);

		JComboBox year = new JComboBox();
		year.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		year.setBounds(143, 69, 79, 23);
		frmStudentConsolidateReport.getContentPane().add(year);

		JComboBox department = new JComboBox();
		department.setModel(new DefaultComboBoxModel(new String[] {"CSE", "ECE", "IT"}));
		department.setBounds(143, 99, 79, 23);
		frmStudentConsolidateReport.getContentPane().add(department);

		JComboBox semester = new JComboBox();
		semester.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		semester.setBounds(143, 133, 79, 23);
		frmStudentConsolidateReport.getContentPane().add(semester);

		JCheckBox chckbxAll = new JCheckBox("All");
		chckbxAll.setFont(new Font("Tahoma", Font.BOLD, 11));
		chckbxAll.setBackground(new Color(255, 250, 250));
		chckbxAll.setBounds(244, 133, 60, 23);
		frmStudentConsolidateReport.getContentPane().add(chckbxAll);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				try {
					//st.executeQuery("select uroll,period_id,status,adate from attend");
					st.execute("create or replace procedure attendance (catCur OUT SYS_REFCURSOR) is begin open catcur for select uroll,period_id,status,adate from attend ;end;");
					
					//CallableStatement pc = con.prepareCall ("begin attendance; end;");
					
					CallableStatement pc = con.prepareCall ("{call attendance(?)}");
					pc.registerOutParameter(1, OracleTypes.CURSOR);
				     pc.execute ();
				      
				      
					ResultSet rs=(ResultSet)pc.getObject(1);
					if(rs!=null) {
						while(rs.next()) {
							/*Object row[][]=new Object[1][4];
							row[q][0]=rs.getString(1)+"";
							row[q][1]=st.getResultSet().getString(2);
							System.out.println(row[q][1]);
							row[q][2]=st.getResultSet().getString(3);
							row[q][3]=st.getResultSet().getString(4);*/
							
							Vector <Object>v=new Vector<Object>();
							for(int i=0;i<3;i++)
								v.add(i, rs.getObject(i+1));
							DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
							model.addRow(v);
						}
					}
					else
						System.out.println("no result");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});		
		btnSubmit.setBounds(391, 127, 112, 31);
		frmStudentConsolidateReport.getContentPane().add(btnSubmit);
		frmStudentConsolidateReport.setVisible(true);
	}
}
