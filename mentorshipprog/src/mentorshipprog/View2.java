package mentorshipprog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class View2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View2 frame = new View2("jad");
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
	public View2(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("First");
		label.setBounds(155, 76, 61, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Last");
		label_1.setBounds(406, 76, 61, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("EmailAddress");
		label_2.setBounds(155, 104, 102, 16);
		contentPane.add(label_2);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(155, 142, 61, 16);
		contentPane.add(lblGender);
		
		JLabel label_4 = new JLabel("Department");
		label_4.setBounds(155, 204, 88, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Year");
		label_5.setBounds(155, 240, 61, 16);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Major");
		label_6.setBounds(449, 204, 61, 16);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Minor");
		label_7.setBounds(449, 240, 61, 16);
		contentPane.add(label_7);
		
		JLabel lblMenteesmentor = new JLabel("Mentees/Mentor:");
		lblMenteesmentor.setBounds(180, 315, 113, 16);
		contentPane.add(lblMenteesmentor);
		
		textField = new JTextField();
		textField.setBounds(303, 310, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(303, 335, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setLayout(null);
		panel.setBackground(Color.YELLOW);
		panel.setBounds(0, 6, 113, 454);
		contentPane.add(panel);
		
		JLabel label_8 = new JLabel(username);
		label_8.setBounds(16, 5, 61, 16);
		panel.add(label_8);
		
		
		
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen ms = new MainScreen(username);
				ms.setVisible(true);
				setVisible(false);

			}
		});
		btnCancel.setBounds(196, 416, 117, 29);
		contentPane.add(btnCancel);
		btnCancel.setVisible(false);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(303, 416, 117, 29);
		contentPane.add(btnSave);
		btnSave.setVisible(false);
		
		JLabel lblMentormentee = new JLabel("Mentor/Mentee");
		lblMentormentee.setBounds(256, 28, 152, 16);
		contentPane.add(lblMentormentee);
		
		JLabel lblDatecreated = new JLabel("datecreated ");
		lblDatecreated.setBounds(125, 444, 102, 16);
		contentPane.add(lblDatecreated);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(303, 384, 117, 29);
		contentPane.add(btnDelete);
		btnDelete.setVisible(false);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//WHEN CLICKED THIS SHOULD SHOW SAVE OR CANCEL BUTTONS 
				btnSave.setVisible(true);
				btnCancel.setVisible(true);
				btnDelete.setVisible(true);
				btnEdit.setVisible(false);
				
			}
		});
		btnEdit.setBounds(432, 416, 117, 29);
		contentPane.add(btnEdit);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(244, 138, 141, 23);
		contentPane.add(rdbtnFemale);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(330, 138, 141, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setBounds(408, 138, 141, 23);
		contentPane.add(rdbtnOther);
	}
}
