package mentorshipprog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SignUpForm extends JFrame {

	private JPanel contentPane;
	private JTextField fnametxt;
	private JTextField lnametxt;
	private JTextField emailtxt;
	private JTextField phonenumtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpForm frame = new SignUpForm();
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
	public SignUpForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(149, 100, 102, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmailaddress = new JLabel("EmailAddress");
		lblEmailaddress.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblEmailaddress.setBounds(343, 164, 130, 16);
		contentPane.add(lblEmailaddress);
		
		JLabel lblPhone = new JLabel("Phone #:");
		lblPhone.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblPhone.setBounds(42, 164, 80, 16);
		contentPane.add(lblPhone);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblDepartment.setBounds(42, 227, 152, 16);
		contentPane.add(lblDepartment);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblYear.setBounds(42, 295, 61, 16);
		contentPane.add(lblYear);
		
		JLabel lblMajor = new JLabel("Major");
		lblMajor.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblMajor.setBounds(335, 220, 61, 16);
		contentPane.add(lblMajor);
		
		JLabel lblLast = new JLabel("Last");
		lblLast.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblLast.setBounds(400, 100, 61, 16);
		contentPane.add(lblLast);
		
	
		
		JLabel lblMentee = new JLabel("Mentor");
		lblMentee.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblMentee.setBounds(311, 6, 177, 16);
		contentPane.add(lblMentee);
		
		JCheckBox chckbxIAcceptTerms = new JCheckBox("I accept terms .... blah blah blah .....");
		chckbxIAcceptTerms.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		chckbxIAcceptTerms.setBounds(29, 452, 335, 23);
		contentPane.add(chckbxIAcceptTerms);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		radioButton.setBounds(218, 368, 61, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		radioButton_1.setBounds(287, 368, 52, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setBounds(348, 368, 52, 23);
		contentPane.add(radioButton_2);
		
		JLabel lblNumberOfMentees = new JLabel("Number of Mentees");
		lblNumberOfMentees.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNumberOfMentees.setBounds(36, 372, 170, 16);
		contentPane.add(lblNumberOfMentees);
		
		fnametxt = new JTextField();
		fnametxt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		fnametxt.setBounds(206, 95, 130, 26);
		contentPane.add(fnametxt);
		fnametxt.setColumns(10);
		
		lnametxt = new JTextField();
		lnametxt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lnametxt.setText("eg.Brown");
		lnametxt.setBounds(444, 95, 130, 26);
		contentPane.add(lnametxt);
		lnametxt.setColumns(10);
		
		emailtxt = new JTextField();
		emailtxt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		emailtxt.setText("eg.brownjohn@gmail.com");
		emailtxt.setBounds(451, 159, 248, 26);
		contentPane.add(emailtxt);
		emailtxt.setColumns(10);
		
		phonenumtxt = new JTextField();
		phonenumtxt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		phonenumtxt.setText("eg.876-303-3889");
		phonenumtxt.setBounds(134, 159, 149, 26);
		contentPane.add(phonenumtxt);
		phonenumtxt.setColumns(10);
		
		JComboBox deptcbox = new JComboBox();
		deptcbox.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		deptcbox.setModel(new DefaultComboBoxModel(new String[] {"Chemistry", "Biology", "Computing", "Mathematics", "Geography"}));
		deptcbox.setBounds(149, 223, 130, 27);
		contentPane.add(deptcbox);
		
		JComboBox majorcbox = new JComboBox();
		majorcbox.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		majorcbox.setBounds(395, 216, 195, 27);
		contentPane.add(majorcbox);
		
		JComboBox yearcbox = new JComboBox();
		yearcbox.setModel(new DefaultComboBoxModel(new String[] {"First", "Second", "Third"}));
		yearcbox.setBounds(84, 291, 88, 27);
		contentPane.add(yearcbox);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!fnametxt.getText().equals("")) {
					//add to text file
					
						
				}
				if(fnametxt.getText().equals("")) {
					System.out.print("firstname field is empty");
				}
				if(lnametxt.getText().equals("")) {
					System.out.print("last name field is empty");
				}
				if(emailtxt.getText().equals("")) {
					System.out.print("email address field is empty");
				}
				
				//need to do for the rest of the fields
			}
		});
		btnSubmit.setBounds(496, 556, 117, 29);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCancel.setBounds(283, 556, 117, 29);
		contentPane.add(btnCancel);
	}
}
