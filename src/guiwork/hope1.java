package guiwork;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;

public class hope1 {

	 JFrame secondFrame;
	private final JPanel panel_1 = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hope1 window = new hope1();
					window.secondFrame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

	/**
	 * Create the application.
	 */
	public hope1()throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()throws IOException {
		secondFrame = new JFrame();
		secondFrame.setBounds(100, 100, 1116, 737);
		secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		secondFrame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		panel_1.setBackground(SystemColor.desktop);
		panel_1.setBounds(0, 0, 1113, 689);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 139, 139));
		panel_3.setBounds(564, 11, 521, 516);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JButton Btnadd = new JButton("ADD");
		Btnadd.setBounds(113, 172, 266, 47);
		panel_3.add(Btnadd);
		Btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 hopeadd obj;
				try {
					obj = new hopeadd();
					 obj.thirdframe.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				 secondFrame.dispose();
			
			}
			
		});
		Btnadd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Btnadd.setForeground(new Color(0, 128, 0));
		Btnadd.setBackground(new Color(173, 255, 47));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(141, 439, 199, 47);
		panel_3.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\signin (2).png"));
		
		JButton view = new JButton("");
		view.setBounds(136, 315, 191, 59);
		panel_3.add(view);
		view.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\view (2).png"));
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
				
				 secondFrame.dispose();
			
			}
			
		});
		view.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\view (3).png"));
		lblNewLabel.setBounds(28, 23, 477, 655);
		panel_1.add(lblNewLabel);
		
	}
}
