package guiwork;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class sugg {

	JFrame fifth1frame;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sugg window = new sugg();
					window.fifth1frame.setVisible(true);
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
	public sugg() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		 
			  
			  
		fifth1frame = new JFrame();
		fifth1frame.setBounds(100, 100, 479, 456);
		fifth1frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fifth1frame.getContentPane().setLayout(null);
		
		JButton back = new JButton("<- BACK");
		back.setFont(new Font("Algerian", Font.BOLD, 13));
		back.setBackground(new Color(176, 224, 230));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				track obj;
					
						obj = new track();
					
					obj.fifthframe.setVisible(true);
					 
					fifth1frame.dispose();
			}
			
		});
		back.setBounds(10, 11, 89, 23);
		fifth1frame.getContentPane().add(back);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(240, 255, 255));
		textArea.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 15));
		textArea.setBounds(22, 147, 181, 158);
		fifth1frame.getContentPane().add(textArea);
		lblNewLabel_1 = new JLabel("ACCORDING TO OUR DATA ANALYSIS");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(240, 255, 255));
		lblNewLabel_1.setBounds(22, 63, 307, 38);
		fifth1frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("THE FAST MOVING PRODUCTS OF YOUR STORE ARE:");
		lblNewLabel_2.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(240, 255, 255));
		lblNewLabel_2.setBounds(22, 98, 433, 38);
		fifth1frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("THANK YOU!!");
		lblNewLabel_3.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setForeground(new Color(224, 255, 255));
		lblNewLabel_3.setBounds(280, 338, 103, 36);
		fifth1frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\SUG.png"));
		lblNewLabel.setBounds(0, 0, 646, 620);
		fifth1frame.getContentPane().add(lblNewLabel);
		
		
		Scanner file = new Scanner(new  FileReader("bill1.txt"));
		 PrintWriter pw = new PrintWriter(new FileWriter("workk.txt",false));
			  Scanner file2 = new Scanner(new  FileReader("pax1.txt"));
			  List<String> names = new ArrayList<String>();
			 
			  List<Integer> quan = new ArrayList<Integer>();
			  List<Integer> quan1 = new ArrayList<Integer>();
		
		
				
		
		int hope;
		while (file.hasNext())
		  {
		            
		      names.add(file.next());
		      quan.add(file.nextInt()); 
		      file.nextInt();         
		  }
						  
					String namework= "";		 
			 for (String n1: names)
		 		 {
					try {  
					 while (file2.hasNext())
					  {
					if( file2.next().equalsIgnoreCase(n1))
					  { 
						quan1.add(file2.nextInt());
						
					  }
					
					  } 
					 namework=namework+"\n"+n1;
					 textArea.setText(namework+"  ");
				//	 System.out.print(n1 + "    " ); 
					pw.print(n1 + "   " );
					 
					}catch(Exception e1)
					{
						System.out.println("\nERROR ");
					}
		 		 }	
			 
			
									 
							 pw.close();
						
							
		  

	}	
}
