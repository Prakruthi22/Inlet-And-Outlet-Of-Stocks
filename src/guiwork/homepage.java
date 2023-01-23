package guiwork;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class homepage {

	JFrame secframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
					window.secframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		secframe = new JFrame();
		secframe.setBounds(100, 5, 1109, 670);
		secframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		secframe.getContentPane().setLayout(null);
		
		
		JButton homebtn = new JButton("Home");
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane.showMessageDialog(secframe, "Your already in the Home Page!!Please try different options");
			}
			
		});
		homebtn.setBackground(Color.LIGHT_GRAY);
		homebtn.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\home page (6).png"));
		homebtn.setBounds(492, 41, 77, 33);
		secframe.getContentPane().add(homebtn);
		
		JButton addbtn = new JButton("add");
		homebtn.setBackground(Color.LIGHT_GRAY);
		addbtn.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\home page (2).png"));
		addbtn.setBounds(613, 41, 65, 33);
		secframe.getContentPane().add(addbtn);
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 hopeadd obj;
				try {
					obj = new hopeadd();
					 obj.thirdframe.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				 secframe.dispose();
			
			}
			
		});
		
		JButton view = new JButton("view");
		view.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\home page (3).png"));
		view.setBounds(713, 41, 101 , 33);
		secframe.getContentPane().add(view);
		view.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view obj = null;
				try {
					obj = new view();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 obj.fourframe.setVisible(true);
				
				 secframe.dispose();
			
			}
			
		});
		
		JButton trackbtn = new JButton("track");
		trackbtn.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\home page (7).png"));
		trackbtn.setBounds(852, 41, 70, 33);
		secframe.getContentPane().add(trackbtn);
		trackbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				track obj = null;
				obj = new track();
				 obj.fifthframe.setVisible(true);
				
				 secframe.dispose();
			
			}
			
		});
		
		JButton loginbtn = new JButton("New button");
		loginbtn.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\LOGIN BUTTON1.png"));
		loginbtn.setBounds(945, 41, 120, 33);
		secframe.getContentPane().add(loginbtn);
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login obj = null;
				obj = new login();
				 obj.mainframe.setVisible(true);
				
				 secframe.dispose();
			
			}
			
		});
		
		JLabel userlabel = new JLabel("New label");
		userlabel.setHorizontalAlignment(SwingConstants.RIGHT);
		userlabel.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\user.jpg"));
		userlabel.setBounds(20, 19, 249, 76);
		secframe.getContentPane().add(userlabel);

		JLabel lblNewLabel = new JLabel("For Any Queries Please Contact");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(811, 508, 274, 45);
		secframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("83022 07062");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(821, 555, 157, 33);
		secframe.getContentPane().add(lblNewLabel_1);
		
		JLabel homepgllabel = new JLabel("Any Queries Please Contact");
		homepgllabel.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\home page (4).png"));
		homepgllabel.setBounds(0, 0, 1095, 633);
		secframe.getContentPane().add(homepgllabel);
		
		
		
		
		
		
	}
}
