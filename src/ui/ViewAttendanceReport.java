package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;

import java.awt.BorderLayout;

import javax.swing.border.MatteBorder;

import java.awt.Color;

import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import javax.swing.JScrollPane;

public class ViewAttendanceReport {

	private JFrame frmStudentConsolidateReport;
	private JTable studentTable;
	private JLabel lblDepartment;
	private JLabel label_1;
	private JLabel lblSemester;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	private void initialize() {
		
		
	

		
		
		frmStudentConsolidateReport = new JFrame();
		frmStudentConsolidateReport.setTitle("Student Consolidate Report");
		frmStudentConsolidateReport.setBounds(100, 100, 900, 491);
		frmStudentConsolidateReport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentConsolidateReport.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 169, 806, 272);
		frmStudentConsolidateReport.getContentPane().add(scrollPane);
		
		studentTable = new JTable();
		scrollPane.setViewportView(studentTable);
		studentTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Class Roll No", "University Roll No", "Name", "Status"
			}
		));
		
		
		/*
		UtilDateModel model = new UtilDateModel();
		model.setDate(1990, 8, 24);
		model.setSelected(true);
		JDatePanelImpl datePanel = new JDatePanelImpl(model, null);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, null);
		datePicker.setBackground(Color.GRAY);
		datePicker.setBounds(269, 69, 79, 20);
		frmStudentConsolidateReport.getContentPane().add(datePicker);*/
		
		JLabel lblCourse = new JLabel("Year");
		lblCourse.setBounds(64, 59, 79, 41);
		frmStudentConsolidateReport.getContentPane().add(lblCourse);
		
		lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(64, 89, 79, 41);
		frmStudentConsolidateReport.getContentPane().add(lblDepartment);
		
		label_1 = new JLabel("Course");
		label_1.setBounds(64, 26, 79, 41);
		frmStudentConsolidateReport.getContentPane().add(label_1);
		
		lblSemester = new JLabel("Semester");
		lblSemester.setBounds(64, 113, 79, 50);
		frmStudentConsolidateReport.getContentPane().add(lblSemester);
		
		JComboBox course = new JComboBox();
		course.setModel(new DefaultComboBoxModel(new String[] {"B.Tech", "M.Tech"}));
		course.setBounds(169, 36, 79, 20);
		frmStudentConsolidateReport.getContentPane().add(course);
		
		JComboBox year = new JComboBox();
		year.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		year.setBounds(169, 69, 79, 20);
		frmStudentConsolidateReport.getContentPane().add(year);
		
		JComboBox department = new JComboBox();
		department.setModel(new DefaultComboBoxModel(new String[] {"CSE", "ECE", "IT"}));
		department.setBounds(169, 99, 79, 20);
		frmStudentConsolidateReport.getContentPane().add(department);
		
		JComboBox semester = new JComboBox();
		semester.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		semester.setBounds(169, 128, 79, 20);
		frmStudentConsolidateReport.getContentPane().add(semester);
		
		JCheckBox chckbxAll = new JCheckBox("All");
		chckbxAll.setBounds(361, 35, 97, 23);
		frmStudentConsolidateReport.getContentPane().add(chckbxAll);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(440, 127, 89, 23);
		frmStudentConsolidateReport.getContentPane().add(btnSubmit);
	}
}
