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
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	@SuppressWarnings({ "unchecked", "unchecked", "unchecked" })
	public SignUpForm() {
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 575);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(249, 67, 102, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmailaddress = new JLabel("EmailAddress");
		lblEmailaddress.setForeground(new Color(255, 255, 255));
		lblEmailaddress.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblEmailaddress.setBounds(505, 153, 130, 16);
		contentPane.add(lblEmailaddress);
		
		JLabel lblPhone = new JLabel("Phone #:");
		lblPhone.setForeground(new Color(255, 255, 255));
		lblPhone.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblPhone.setBounds(234, 153, 80, 16);
		contentPane.add(lblPhone);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(new Color(255, 255, 255));
		lblDepartment.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblDepartment.setBounds(234, 260, 152, 16);
		contentPane.add(lblDepartment);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setForeground(new Color(255, 255, 255));
		lblYear.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblYear.setBounds(266, 321, 61, 16);
		contentPane.add(lblYear);
		
		JLabel lblMajor = new JLabel("Major");
		lblMajor.setForeground(new Color(255, 255, 255));
		lblMajor.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblMajor.setBounds(574, 260, 61, 16);
		contentPane.add(lblMajor);
		
		JLabel lblLast = new JLabel("Last");
		lblLast.setForeground(new Color(255, 255, 255));
		lblLast.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblLast.setBounds(510, 67, 61, 16);
		contentPane.add(lblLast);
		
	
		
		JLabel lblMentee = new JLabel("Mentor");
		lblMentee.setForeground(new Color(255, 255, 255));
		lblMentee.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblMentee.setBounds(492, 20, 177, 16);
		contentPane.add(lblMentee);
		
		JCheckBox chckbxIAcceptTerms = new JCheckBox("I accept terms ....");
		chckbxIAcceptTerms.setForeground(new Color(255, 255, 255));
		chckbxIAcceptTerms.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		chckbxIAcceptTerms.setBounds(215, 438, 335, 23);
		contentPane.add(chckbxIAcceptTerms);
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setForeground(new Color(255, 255, 255));
		radioButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		radioButton.setBounds(706, 317, 61, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		radioButton_1.setForeground(new Color(255, 255, 255));
		radioButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		radioButton_1.setBounds(706, 354, 52, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("3");
		radioButton_2.setForeground(new Color(255, 255, 255));
		radioButton_2.setBounds(706, 394, 52, 23);
		contentPane.add(radioButton_2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(radioButton);
		bg.add(radioButton_1);
		bg.add(radioButton_2);
		JLabel lblNumberOfMentees = new JLabel("Number of Mentees");
		lblNumberOfMentees.setForeground(new Color(255, 255, 255));
		lblNumberOfMentees.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNumberOfMentees.setBounds(524, 321, 170, 16);
		contentPane.add(lblNumberOfMentees);
		
		fnametxt = new JTextField();
		fnametxt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		fnametxt.setBounds(326, 62, 130, 26);
		contentPane.add(fnametxt);
		fnametxt.setColumns(10);
		
		lnametxt = new JTextField();
		lnametxt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lnametxt.setText("eg.Brown");
		lnametxt.setBounds(634, 62, 130, 26);
		contentPane.add(lnametxt);
		lnametxt.setColumns(10);
		
		emailtxt = new JTextField();
		emailtxt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		emailtxt.setText("eg.brownjohn@gmail.com");
		emailtxt.setBounds(634, 148, 248, 26);
		contentPane.add(emailtxt);
		emailtxt.setColumns(10);
		
		phonenumtxt = new JTextField();
		phonenumtxt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		phonenumtxt.setText("eg.876-303-3889");
		phonenumtxt.setBounds(326, 148, 149, 26);
		contentPane.add(phonenumtxt);
		phonenumtxt.setColumns(10);
		
		JComboBox<String> deptcbox = new JComboBox<String>();
		deptcbox.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		deptcbox.setModel(new DefaultComboBoxModel<String>(new String[] {"Chemistry", "Biology", "Computing", "Mathematics", "Geography"}));
		deptcbox.setBounds(361, 256, 130, 27);
		contentPane.add(deptcbox);
		
		JComboBox<?> majorcbox = new JComboBox<Object>();
		majorcbox.setModel(new DefaultComboBoxModel(new String[] {"Comp Sci ", "Bio Chem ", "Electronics "}));
		majorcbox.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		majorcbox.setBounds(647, 256, 195, 27);
		contentPane.add(majorcbox);
		
		JComboBox<String> yearcbox = new JComboBox<String>();
		yearcbox.setModel(new DefaultComboBoxModel<String>(new String[] {"First", "Second", "Third"}));
		yearcbox.setBounds(387, 314, 88, 27);
		contentPane.add(yearcbox);
		
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCancel.setBounds(646, 521, 117, 29);
		contentPane.add(btnCancel);
		
		JLabel label_7 = new JLabel("Faculty of Science and Technology");
		label_7.setForeground(new Color(255, 215, 0));
		label_7.setFont(new Font(".SF NS Mono", Font.PLAIN, 17));
		label_7.setBounds(161, -11, 377, 39);
		contentPane.add(label_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 0));
		panel_3.setBounds(264, 223, 530, 10);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.YELLOW);
		panel_4.setBounds(264, 416, 530, 10);
		contentPane.add(panel_4);
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!fnametxt.getText().equals("")) {
					//add to text file
					
					Mentor m =new Mentor(fnametxt.getText(), lnametxt.getText(), majorcbox.getSelectedItem().toString());
					System.out.print(m.toString());
					Assignments as = new Assignments(m);
					MainScreen ms = new MainScreen("JAD");
					ms.setVisible(true);
					setVisible(false);
						
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
		btnSubmit.setBounds(771, 521, 117, 29);
		contentPane.add(btnSubmit);
	}
}
