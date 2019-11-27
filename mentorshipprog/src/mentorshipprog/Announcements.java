package mentorshipprog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Announcements extends JFrame {

	private JPanel contentPane;
	private JTextField totxt;
	private JTextField subjecttxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Announcements frame = new Announcements();
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
	public Announcements() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 962, 577);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton searchbtn = new JButton("Search");
		searchbtn.setBounds(889, 6, 67, 29);
		contentPane.add(searchbtn);
		
		JLabel lblComplaintQuery = new JLabel("Announcements/Reminders");
		lblComplaintQuery.setForeground(new Color(255, 255, 255));
		lblComplaintQuery.setBounds(255, 18, 130, 16);
		contentPane.add(lblComplaintQuery);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 161, 554);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Logout");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LoginForm lf = new LoginForm();
				lf.setVisible(true);
			}
		});
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
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_1.add(lblNewLabel_1);
		
		JLabel label_3 = new JLabel("View Mentors");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewStudentInfo vsi = new ViewStudentInfo("mentor");
				vsi.setVisible(true);
				setVisible(false);
			}
		});
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_3.setBounds(6, 267, 155, 38);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("View Mentees");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewStudentInfo vsi = new ViewStudentInfo("mentee");
				vsi.setVisible(true);
				setVisible(false);
				
			}
		});
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label_4.setBounds(6, 332, 155, 38);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Complaint");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				ComplaintForm cf = new ComplaintForm();
				cf.setVisible(true);
			}
		});
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
		
		
		
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTo.setBounds(200, 91, 61, 16);
		contentPane.add(lblTo);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setForeground(Color.WHITE);
		lblSubject.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSubject.setBounds(200, 125, 61, 16);
		contentPane.add(lblSubject);
		
		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setForeground(Color.WHITE);
		lblMessage.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMessage.setBounds(200, 171, 75, 29);
		contentPane.add(lblMessage);
		
		JEditorPane messagetxt = new JEditorPane();
		messagetxt.setFont(new Font("Hiragino Sans GB", Font.ITALIC, 15));
		messagetxt.setBounds(288, 207, 570, 189);
		contentPane.add(messagetxt);
		
		totxt = new JTextField();
		totxt.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		totxt.setBounds(294, 87, 547, 26);
		contentPane.add(totxt);
		totxt.setColumns(10);
		
		subjecttxt = new JTextField();
		subjecttxt.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		subjecttxt.setBounds(294, 121, 547, 26);
		contentPane.add(subjecttxt);
		subjecttxt.setColumns(10);
		

		JButton btnSend = new JButton("Send");
		
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmailTester em = new EmailTester(totxt.getText(),subjecttxt.getText(),messagetxt.getText());
				em.send();
				
			}
		});
		btnSend.setBounds(809, 503, 117, 29);
		contentPane.add(btnSend);
		
	}
}
