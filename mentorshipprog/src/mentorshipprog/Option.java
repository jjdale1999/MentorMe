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
import java.awt.Font;

public class Option extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Option frame = new Option();
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
	public Option() {
		setBackground(new Color(0, 0, 139));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm ls = new LoginForm();
				ls.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(11, 122, 240, 115);
		contentPane.add(btnNewButton);
		
		JButton btnMentormentee = new JButton("Mentor /Mentee");
		btnMentormentee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OptionMent_or_ee om = new OptionMent_or_ee();
				om.setVisible(true);
				setVisible(false);
			}
		});
		btnMentormentee.setBounds(264, 122, 240, 115);
		contentPane.add(btnMentormentee);
		
		JLabel label = new JLabel("Faculty of Science and Technology");
		label.setForeground(new Color(255, 215, 0));
		label.setFont(new Font(".SF NS Mono", Font.PLAIN, 17));
		label.setBounds(61, 0, 377, 39);
		contentPane.add(label);
	}
}
