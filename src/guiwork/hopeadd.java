package guiwork;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class hopeadd {

	JFrame thirdframe;
	private JTextField NAME;
	private JTextField QUANTITY;
	private JTextField COST;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					hopeadd window = new hopeadd();
					window.thirdframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public hopeadd() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		//PrintWriter pw = new PrintWriter(new FileWriter("temp.txt",true));
		thirdframe = new JFrame();
		thirdframe.setBounds(100, 100, 787, 473);
		thirdframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thirdframe.getContentPane().setLayout(null);
		
		JPanel detailspanel = new JPanel();
		detailspanel.setBackground(new Color(245, 245, 220));
		detailspanel.setBounds(427, 54, 300, 285);
		thirdframe.getContentPane().add(detailspanel);
		detailspanel.setLayout(null);
		
		COST = new JTextField();
		COST.setBounds(173, 172, 103, 29);
		detailspanel.add(COST);
		COST.setColumns(10);
		
		QUANTITY = new JTextField();
		QUANTITY.setBounds(173, 120, 103, 29);
		detailspanel.add(QUANTITY);
		QUANTITY.setColumns(10);
		
		 
		NAME = new JTextField();
		NAME.setBounds(173, 67, 103, 29);
		detailspanel.add(NAME);
		NAME.setColumns(10);
		
		JLabel name = new JLabel("Name");
		name.setForeground(new Color(139, 69, 19));
		name.setBounds(27, 64, 68, 29);
		detailspanel.add(name);
		name.setFont(new Font("Algerian", Font.BOLD, 20));
		
		JLabel cost = new JLabel("Cost");
		cost.setBounds(27, 169, 76, 29);
		detailspanel.add(cost);
		cost.setForeground(new Color(139, 69, 19));
		cost.setFont(new Font("Algerian", Font.BOLD, 20));
		
		JLabel quan = new JLabel("Quantity");
		quan.setForeground(new Color(139, 69, 19));
		quan.setBounds(27, 116, 114, 30);
		detailspanel.add(quan);
		quan.setFont(new Font("Algerian", Font.BOLD, 20));
		
		JButton homebtn = new JButton("HOME");
		homebtn.setBackground(new Color(255, 239, 213));
		homebtn.setForeground(new Color(102, 51, 0));
		homebtn.setFont(new Font("Algerian", Font.BOLD, 20));
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 homepage obj;
					obj = new homepage();
					obj.secframe.setVisible(true);
					 
					thirdframe.dispose();
			}
			
		});
		homebtn.setBounds(38, 34, 97, 30);
		thirdframe.getContentPane().add(homebtn);    
		  
		 
		JButton done = new JButton("DONE");
		done.setForeground(new Color(255, 248, 220));
		done.setBounds(92, 227, 133, 35);
		detailspanel.add(done);
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n =NAME.getText();
				int q =Integer.parseInt(QUANTITY.getText());
				int c =Integer.parseInt(COST.getText());
				try {
					FileWriter Writer=new FileWriter("pax1.txt",true);
					FileWriter Writer1=new FileWriter("bill.txt",true);
					Writer1.write(n+" \n "+0+"\n "+c );
					Writer1.write("\n");
		           Writer.write(n+" \n "+q+"\n "+c );
		           Writer.write("\n");
		           
		        //Writer.write(System.getProperty(line.seperator));
		           Writer1.close();
		           Writer.close();
		           JOptionPane.showMessageDialog(null,"Details entered successfully");
		           //setVisible(false);
		          /// new InsertData().setVisible(true);
				}catch (IOException e1) 
				
				{
					JOptionPane.showMessageDialog(null, "error");
				}
				
			}
		});
		
		done.setBackground(new Color(102, 0, 0));
		done.setFont(new Font("Algerian", Font.BOLD, 25));
		
		JLabel label = new JLabel("FILL IN THE DETIALS");
		label.setBackground(new Color(139, 69, 19));
		label.setForeground(new Color(139, 69, 19));
		label.setFont(new Font("Algerian", Font.BOLD, 16));
		label.setBounds(57, 11, 187, 35);
		detailspanel.add(label);
		
		JLabel addbglabel = new JLabel("New label");
		addbglabel.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\GALLERY.jpeg"));
		addbglabel.setBounds(10, 11, 760, 418);
		thirdframe.getContentPane().add(addbglabel);
		
		
		//pw.println(NAME);
		//  pw.println(QUANTITY);
		//  pw.println(COST);
		//	 pw.close();
	}
}
