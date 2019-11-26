package mentorshipprog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class ComplaintForm extends JFrame {

	private JPanel contentPane;
	private JTextField searchtxt;
	private JTextField createtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComplaintForm frame = new ComplaintForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComplaintForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 962, 577);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		searchtxt = new JTextField();
		searchtxt.setBounds(765, 6, 130, 26);
		contentPane.add(searchtxt);
		searchtxt.setColumns(10);
		
		JButton searchbtn = new JButton("Search");
		searchbtn.setBounds(889, 6, 67, 29);
		contentPane.add(searchbtn);
		
		JLabel lblComplaintQuery = new JLabel("Complaint / Query");
		lblComplaintQuery.setForeground(new Color(255, 255, 255));
		lblComplaintQuery.setBounds(255, 18, 130, 16);
		contentPane.add(lblComplaintQuery);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 161, 554);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Logout");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		label.setBounds(6, 453, 137, 38);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Announcements");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_1.setBounds(6, 198, 155, 38);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("UserName");
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		label_2.setBounds(37, 142, 93, 16);
		panel.add(label_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 6, 149, 131);
		panel.add(panel_1);
		
		JLabel label_3 = new JLabel("View Mentors");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_3.setBounds(6, 267, 155, 38);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("View Mentees");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_4.setBounds(6, 332, 155, 38);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Complaint");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_5.setBounds(6, 387, 155, 38);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Version 1");
		label_6.setBounds(41, 532, 61, 16);
		panel.add(label_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(6, 514, 149, 6);
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(173, 112, 61, 16);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnMentorsNeverAvaiable = new JTextPane();
		txtpnMentorsNeverAvaiable.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		ArrayList<String> hello = new ArrayList<>();
		hello.add("Mentor's never avaiable");
		hello.add("Mentee keeps making innuedos");
				hello.add("Menter's not responsive enough");
			hello.add("Mentee's always late for meetings or never shows up without a good reason");
			hello.add("Mentor is not the easiest to talk to when it comes on to explaining");
			hello.add("Mentee's not respecful");
		
		String text = "";
		for(String el : hello) {
			text+=el+'\n'+'\n';
		}
		txtpnMentorsNeverAvaiable.setText(text);
		txtpnMentorsNeverAvaiable.setBounds(183, 64, 761, 388);
		contentPane.add(txtpnMentorsNeverAvaiable);
		
		
		JLabel lblNewLabel_1 = new JLabel("Created By:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(232, 96, 92, 16);
		contentPane.add(lblNewLabel_1);
		
		createtxt = new JTextField();
		createtxt.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		createtxt.setForeground(Color.BLACK);
		createtxt.setBounds(356, 91, 130, 26);
		contentPane.add(createtxt);
		createtxt.setColumns(10);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		formattedTextField.setForeground(Color.BLACK);
		formattedTextField.setBounds(359, 158, 482, 220);
		contentPane.add(formattedTextField);
		
		JLabel lblComplaint = new JLabel("Complaint");
		lblComplaint.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblComplaint.setForeground(Color.WHITE);
		lblComplaint.setBounds(232, 147, 92, 16);
		contentPane.add(lblComplaint);
		
		
		JButton btnCreate = new JButton("Create");
		JButton savebtn = new JButton("Save");
		savebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnMentorsNeverAvaiable.setVisible(true);
				btnCreate.setVisible(true);
				
				savebtn.setVisible(false);
				lblComplaint.setVisible(false);
				formattedTextField.setVisible(false);
				
				createtxt.setVisible(false);
				hello.add(0,formattedTextField.getText());
				String text = "";
				for(String el : hello) {
					text+=el+'\n'+'\n';
				}
				txtpnMentorsNeverAvaiable.setText(text);
				formattedTextField.setText("");
				
			}
		});
		savebtn.setBounds(822, 503, 117, 29);
		contentPane.add(savebtn);
		
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnMentorsNeverAvaiable.setVisible(false);
				btnCreate.setVisible(false);
				
				savebtn.setVisible(true);
				lblComplaint.setVisible(true);
				formattedTextField.setVisible(true);
				createtxt.setVisible(true);
				
			}
		});
		btnCreate.setBounds(809, 503, 117, 29);
		contentPane.add(btnCreate);
		savebtn.setVisible(false);
		lblComplaint.setVisible(false);
		formattedTextField.setVisible(false);
		createtxt.setVisible(false);
	}
}
