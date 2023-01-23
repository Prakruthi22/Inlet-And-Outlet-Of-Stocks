package guiwork;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JCheckBox;

public class login {

	JFrame mainframe;
	private JTextField usertextField;
	private JTextField passtextField;
	private JRadioButton rdbtnNewRadioButton;
	private JButton signinbtn;
	private JTextField txtWelcome;
	private JCheckBox agreecheckbox;
	private JLabel login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		mainframe = new JFrame();
		mainframe.setBounds(150, 2, 977, 686);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.getContentPane().setLayout(null);
		
		usertextField = new JTextField();
		usertextField.setBounds(497, 288, 389, 26);
		mainframe.getContentPane().add(usertextField);
		usertextField.setColumns(10);
		
		passtextField = new JTextField();
		passtextField.setBounds(497, 408, 389, 32);
		mainframe.getContentPane().add(passtextField);
		passtextField.setColumns(10);
		
		JButton button = new JButton("New button");
		button.setBounds(652, 290, 89, 23);
		mainframe.getContentPane().add(button);
		
		signinbtn = new JButton("New button");
		signinbtn.setBounds(636, 553, 105, 32);
		signinbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String uname =usertextField.getText();
			String pass =passtextField.getText();
			if (uname.equals("name")&& pass.equals("pass"))
			{
				//JOptionPane.showMessageDialog(frame, "Happy Working!!");
				 homepage obj;
				obj = new homepage();
				obj.secframe.setVisible(true);
				 
				mainframe.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(mainframe, "Please try again!!");
			}
			
			}
		});
		signinbtn.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\signin (3).png"));
		mainframe.getContentPane().add(signinbtn);
		
		agreecheckbox = new JCheckBox(".");
		agreecheckbox.setBounds(566, 489, 20, 26);
		mainframe.getContentPane().add(agreecheckbox);
		
		login = new JLabel("New label");
		login.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\login.png"));
		login.setBounds(0, 0, 973, 653);
		mainframe.getContentPane().add(login);
		
	}
}
