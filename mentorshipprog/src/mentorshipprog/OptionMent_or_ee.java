package mentorshipprog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class OptionMent_or_ee extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OptionMent_or_ee frame = new OptionMent_or_ee();
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
	public OptionMent_or_ee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnCreateAComplaint = new JButton("Create a Complaint");
		btnCreateAComplaint.setBounds(247, 95, 117, 132);
		contentPane.add(btnCreateAComplaint);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(91, 19, 287, 230);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnCreateAComplaint.setVisible(false);
				btnNewButton.setVisible(false);
				panel.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(6, 95, 117, 132);
		contentPane.add(btnNewButton);
		
		
		JLabel lblAreYouA = new JLabel("Are you a mentor or a Mentee????");
		panel.add(lblAreYouA);
		
		JButton btnNewButton_1 = new JButton("MENTOR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpForm sf = new SignUpForm();
				sf.setVisible(true);
				setVisible(false);
						
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnMentee = new JButton("Mentee");
		btnMentee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpFormMentee sfm = new SignUpFormMentee();
				sfm.setVisible(true);
				setVisible(false);
			}
		});
		panel.add(btnMentee);
		
		panel.setVisible(false);

	}
}
