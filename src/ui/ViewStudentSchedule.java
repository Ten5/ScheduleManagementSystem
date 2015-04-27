package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import util.DateLabelFormatter;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ViewStudentSchedule {

	private JFrame frmStudentSchedule;
	private JTable studentSchedule;
	private JLabel lblCourse;
	private JLabel lblYear;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JLabel lblSemester;
	private JLabel lblSection;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JLabel lblDepartment;
	private JComboBox comboBox_4;
	private JButton btnSubmit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStudentSchedule window = new ViewStudentSchedule();
					window.frmStudentSchedule.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewStudentSchedule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentSchedule = new JFrame();
		frmStudentSchedule.getContentPane().setBackground(new Color(255, 250, 250));
		frmStudentSchedule.setBounds(100, 100, 693, 423);
		frmStudentSchedule.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentSchedule.getContentPane().setLayout(null);
		
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setDoubleClickAction(true);
		datePicker.setBounds(52, 11, 216, 23);
        frmStudentSchedule.getContentPane().add(datePicker);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 168, 539, 173);
		frmStudentSchedule.getContentPane().add(scrollPane);
		
		studentSchedule = new JTable();
		studentSchedule.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(studentSchedule);
		studentSchedule.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Day", "Period 1", "Period 2", "Period 3", "Period 4", "Period 5", "Period 6"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		lblCourse = new JLabel("Course");
		lblCourse.setBounds(52, 65, 46, 14);
		frmStudentSchedule.getContentPane().add(lblCourse);
		
		lblYear = new JLabel("Year");
		lblYear.setBounds(52, 110, 46, 14);
		frmStudentSchedule.getContentPane().add(lblYear);
		
		comboBox = new JComboBox();
		comboBox.setBounds(139, 62, 67, 20);
		frmStudentSchedule.getContentPane().add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(139, 107, 67, 20);
		frmStudentSchedule.getContentPane().add(comboBox_1);
		
		lblSemester = new JLabel("Semester");
		lblSemester.setBounds(266, 65, 46, 14);
		frmStudentSchedule.getContentPane().add(lblSemester);
		
		lblSection = new JLabel("Section");
		lblSection.setBounds(266, 110, 46, 14);
		frmStudentSchedule.getContentPane().add(lblSection);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(338, 59, 67, 20);
		frmStudentSchedule.getContentPane().add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(338, 104, 67, 20);
		frmStudentSchedule.getContentPane().add(comboBox_3);
		
		lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(471, 65, 83, 14);
		frmStudentSchedule.getContentPane().add(lblDepartment);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setBounds(551, 62, 67, 20);
		frmStudentSchedule.getContentPane().add(comboBox_4);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String month = "";
				switch(model.getMonth()) {
					case 0: month = "Jan";
							break;
					case 1: month = "Feb";
							break;
					case 2: month = "Mar";
							break;
					case 3: month = "Apr";
							break;
					case 4: month = "May";
							break;
					case 5: month = "Jun";
							break;
					case 6: month = "Jul";
							break;
					case 7: month = "Aug";
							break;
					case 8: month = "Sep";
							break;
					case 9: month = "Oct";
							break;
					case 10: month = "Nov";
							break;
					case 11: month = "Dec";
							break;
				}
				String date = model.getDay()+"-"+month+"-"+model.getYear();
			}
		});
		btnSubmit.setBounds(471, 106, 89, 23);
		frmStudentSchedule.getContentPane().add(btnSubmit);
		studentSchedule.getColumnModel().getColumn(0).setResizable(false);
		studentSchedule.getColumnModel().getColumn(1).setResizable(false);
		studentSchedule.getColumnModel().getColumn(2).setResizable(false);
		studentSchedule.getColumnModel().getColumn(3).setResizable(false);
		studentSchedule.getColumnModel().getColumn(4).setResizable(false);
		studentSchedule.getColumnModel().getColumn(5).setResizable(false);
		studentSchedule.getColumnModel().getColumn(6).setResizable(false);
	}

}
