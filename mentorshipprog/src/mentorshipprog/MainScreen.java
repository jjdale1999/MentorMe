package mentorshipprog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen("jad");
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
	public MainScreen(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 559);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, -12, 161, 554);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Logout");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				LoginForm lf = new LoginForm();
				lf.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblNewLabel.setForeground(Color.black);

			}
		});
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel.setBounds(6, 453, 137, 38);
		panel.add(lblNewLabel);
		
		JLabel lblAnnouncements = new JLabel("Announcements");
		lblAnnouncements.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Announcements a = new Announcements();
				a.setVisible(true);
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAnnouncements.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblAnnouncements.setForeground(Color.black);

			}
		});
		lblAnnouncements.setHorizontalAlignment(SwingConstants.LEFT);
		lblAnnouncements.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblAnnouncements.setBounds(6, 198, 155, 38);
		panel.add(lblAnnouncements);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(37, 142, 93, 16);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 6, 149, 131);
		panel.add(panel_1);
		
		JLabel lblViewMentors = new JLabel("View Mentors");
		lblViewMentors.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewStudentInfo vsi = new ViewStudentInfo("mentor");
				vsi.setVisible(true);
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblViewMentors.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblViewMentors.setForeground(Color.black);
			}
		});
		lblViewMentors.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewMentors.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblViewMentors.setBounds(6, 267, 155, 38);
		panel.add(lblViewMentors);
		
		JLabel lblViewMentees = new JLabel("View Mentees");
		lblViewMentees.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewStudentInfo vsi = new ViewStudentInfo("mentee");
				vsi.setVisible(true);
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblViewMentees.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblViewMentees.setForeground(Color.black);

			}
		});
		lblViewMentees.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewMentees.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblViewMentees.setBounds(6, 332, 155, 38);
		panel.add(lblViewMentees);
		
		JLabel lblComplaint = new JLabel("Complaint");
		lblComplaint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ComplaintForm cf = new ComplaintForm();
				cf.setVisible(true);
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblComplaint.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblComplaint.setForeground(Color.black);

			}
		});
		lblComplaint.setHorizontalAlignment(SwingConstants.CENTER);
		lblComplaint.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblComplaint.setBounds(6, 387, 155, 38);
		panel.add(lblComplaint);
		
		JLabel lblVersion = new JLabel("Version 1");
		lblVersion.setBounds(41, 532, 61, 16);
		panel.add(lblVersion);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 0, 0));
		panel_2.setBounds(6, 514, 149, 6);
		panel.add(panel_2);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSearch.setForeground(new Color(255, 255, 255));
		lblSearch.setBounds(682, 32, 61, 16);
		contentPane.add(lblSearch);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		textField.setBounds(739, 27, 180, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFacultyOfScience = new JLabel("Faculty of Science and Technology");
		lblFacultyOfScience.setFont(new Font(".SF NS Mono", Font.PLAIN, 17));
		lblFacultyOfScience.setForeground(new Color(255, 215, 0));
		lblFacultyOfScience.setBounds(173, 6, 377, 39);
		contentPane.add(lblFacultyOfScience);
		
		JLabel lblGuildOffice = new JLabel("Guild Office");
		lblGuildOffice.setForeground(new Color(255, 215, 0));
		lblGuildOffice.setFont(new Font(".SF NS Mono", Font.PLAIN, 17));
		lblGuildOffice.setBounds(267, 49, 151, 39);
		contentPane.add(lblGuildOffice);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME!!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setFont(new Font("Lao MN", Font.PLAIN, 88));
		lblNewLabel_2.setBounds(299, 273, 570, 80);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.setBounds(918, 27, 74, 30);
		contentPane.add(btnNewButton);
	}
}
