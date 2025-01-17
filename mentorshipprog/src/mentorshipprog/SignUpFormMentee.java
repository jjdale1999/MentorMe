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

public class SignUpFormMentee extends JFrame {

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
					SignUpFormMentee frame = new SignUpFormMentee();
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
	public SignUpFormMentee() {
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
		
	
		
		JLabel lblMentee = new JLabel("Mentee");
		lblMentee.setForeground(new Color(255, 255, 255));
		lblMentee.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblMentee.setBounds(492, 20, 177, 16);
		contentPane.add(lblMentee);
		
		JCheckBox chckbxIAcceptTerms = new JCheckBox("I accept terms agree to the terms and conditions");
		chckbxIAcceptTerms.setForeground(new Color(255, 255, 255));
		chckbxIAcceptTerms.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		chckbxIAcceptTerms.setBounds(215, 438, 429, 23);
		contentPane.add(chckbxIAcceptTerms);
		
		ButtonGroup bg = new ButtonGroup();
		
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
				Option op = new Option();
				op.setVisible(true);
				setVisible(false);
				
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

					Mentee m =new Mentee(fnametxt.getText(), lnametxt.getText(), majorcbox.getSelectedItem().toString(),phonenumtxt.getText(),emailtxt.getText(),yearcbox.getSelectedItem().toString());
					System.out.print(m.toString());
					Assignments as = new Assignments(m);
					Option op = new Option();
					op.setVisible(true);
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

		JLabel lblNewLabel_1 = new JLabel("View Terms");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Terms_Conditions tc = new Terms_Conditions();
				tc.setVisible(true);
			}
		});
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(112, 483, 91, 16);
		contentPane.add(lblNewLabel_1);
	}
}
