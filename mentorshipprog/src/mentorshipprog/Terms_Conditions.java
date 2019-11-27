package mentorshipprog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JScrollPane;

public class Terms_Conditions extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Terms_Conditions frame = new Terms_Conditions();
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
	public Terms_Conditions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 29, 317, 169);
		contentPane.add(scrollPane);
		
		JTextArea txtrTheMentorshipProgram = new JTextArea();
		txtrTheMentorshipProgram.setText("The mentor-ship program carried out in the 2019/2020 academic year is to make the first year experience a better one as they enter the faculty allowing them to be able to achieve holistic development. The main objectives are to create a welcoming environment to first years, to aid students entering the faculty thus increasing faculty pass rate, improve interaction among students and build long-lasting relationships among students. For this to be a successful program there are some terms and conditions that should be taken into consideration.\n3 strike rule- you will be spoken to if any complaints are made by the mentee. After 3 complaints are made you will be asked to leave the program.\nSexual Harassment- any reports made about sexual harassment, you will most definitely be asked to leave the program.\nFace to Face interactions- asking that you make yourself available to meet your mentee at least 2 times a month. Places will be made available for you to meet with your mentee. However, if the meetings are outside of public area ie dorms or households the program will consider this as a personal encounter and will not be responsible for what happens. Keep all meet ups in the designated areas to avoid any complications.\nCode of confidentiality- Any personal details shared between mentor and mentee should remain between each other unless the situation requires professional help.\nRespect- Maintain mutual respect between you and your mentee. For example the way you speak to your mentee as well as certain pass time such as smoking. Be mindful of your mentee’s space\nEvalution- your mentee will evaluate you every month so that we can keep a record of your progress in effectiveness.\n");
		scrollPane.setViewportView(txtrTheMentorshipProgram);
		
	}
}
