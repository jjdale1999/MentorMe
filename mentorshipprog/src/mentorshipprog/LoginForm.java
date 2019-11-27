package mentorshipprog;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 409);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(-11, -13, 352, 416);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), Color.DARK_GRAY, null, null));
		panel_1.setBackground(new Color(204, 102, 51));
		panel_1.setBounds(46, 41, 264, 335);
		panel.add(panel_1);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblUserName.setBounds(370, 137, 96, 16);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblPassword.setBounds(370, 179, 96, 16);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		textField.setBounds(513, 132, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		passwordField.setBounds(513, 174, 130, 26);
		contentPane.add(passwordField);
	
		
		
		JLabel lblIncorrectPasswordOr = new JLabel("Incorrect Password or Username. ");
		lblIncorrectPasswordOr.setBounds(417, 233, 289, 16);
		contentPane.add(lblIncorrectPasswordOr);
		lblIncorrectPasswordOr.setVisible(false);
		ImageIcon img =new ImageIcon("/Users/jordannedale/eclipse-workspace/Mentor_Menteesprog/icon_login_grey.png");
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginmanager lm = new Loginmanager(textField.getText(),String.valueOf(passwordField.getPassword()));
				if(lm.loadpage()) {
					setVisible(false);
				}else {
					lblIncorrectPasswordOr.setVisible(true);
				}
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Apple Color Emoji", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(0, 0, 102));
		btnNewButton.setBounds(457, 319, 117, 29);
		contentPane.add(btnNewButton);

	}
}
