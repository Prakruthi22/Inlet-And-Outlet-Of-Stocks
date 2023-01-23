package guiwork;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class hope {

	private JFrame frame;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hope window = new hope();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hope()throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()throws IOException {
		frame = new JFrame();
		frame.setBackground(new Color(240, 255, 255));
		frame.setBounds(100, 100, 991, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 255));
		panel_1.setBounds(0, 0, 977, 614);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		panel_2.setBounds(35, 50, 902, 496);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 139));
		panel_3.setBounds(259, 46, 594, 414);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 255, 255));
		panel_4.setBounds(114, 22, 397, 75);
		panel_3.add(panel_4);
		
		JLabel title = new JLabel("THE ART GALLERY");
		title.setForeground(new Color(25, 25, 112));
		title.setFont(new Font("Times New Roman", Font.BOLD, 35));
		panel_4.add(title);
		
		username = new JTextField();
		username.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		username.setBackground(new Color(255, 255, 255));
		username.setBounds(299, 170, 212, 41);
		panel_3.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setForeground(new Color(0, 0, 0));
		password.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		password.setBounds(299, 238, 212, 41);
		panel_3.add(password);
		password.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setForeground(new Color(240, 248, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(114, 173, 146, 38);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setForeground(new Color(230, 230, 250));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(114, 238, 146, 41);
		panel_3.add(lblNewLabel_1);
		
		JButton btnlogin = new JButton("LOGIN!!");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String uname =username.getText();
			String pass =password.getText();
			if (uname.equals("name")&& pass.equals("pass"))
			{
				//JOptionPane.showMessageDialog(frame, "Happy Working!!");
				 hope1 obj;
				try {
					obj = new hope1();
					obj.secondFrame.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
				frame.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(frame, "Please try again!!");
			}
			
			}
		});
		btnlogin.setBackground(new Color(224, 255, 255));
		btnlogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnlogin.setForeground(new Color(47, 79, 79));
		btnlogin.setBounds(272, 332, 129, 38);
		panel_3.add(btnlogin);
		
	}
}
