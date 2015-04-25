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

public class ViewStudentSchedule {

	private JFrame frmStudentSchedule;
	private JTable studentSchedule;

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
		frmStudentSchedule.setBounds(100, 100, 575, 320);
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
		datePicker.setBounds(10, 52, 216, 23);
        frmStudentSchedule.getContentPane().add(datePicker);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 539, 173);
		frmStudentSchedule.getContentPane().add(scrollPane);
		
		studentSchedule = new JTable();
		studentSchedule.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(studentSchedule);
		studentSchedule.setModel(new DefaultTableModel(
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
	}

}
