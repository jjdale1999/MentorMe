package mentorshipprog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ViewStudentInfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStudentInfo frame = new ViewStudentInfo("mentee");
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
	public ViewStudentInfo(String who) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		if(who.equals("mentee")) {
			
		}else if(who.equals("mentor")) {
			
		}
	}

}
