package guiwork;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.TextArea;
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

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JProgressBar;

public class track {

	JFrame fifthframe;
	private JTextField textField;
	private JTextField sug;
	private JTextField sug1;
	private JTextField sug2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					track window = new track();
					window.fifthframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public track() {
		try {
			initialize();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		
		fifthframe = new JFrame();
		fifthframe.setForeground(SystemColor.menuText);
		fifthframe.setBackground(SystemColor.windowText);
		fifthframe.setBounds(100, 20, 774, 579);
		fifthframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fifthframe.getContentPane().setLayout(null);

		JTextArea nametextArea = new JTextArea();
		nametextArea.setFont(new Font("Bookman Old Style", Font.ITALIC, 17));
		nametextArea.setBackground(new Color(255, 250, 250));
		nametextArea.setBounds(414, 98, 114, 354);
		fifthframe.getContentPane().add(nametextArea);
		
		JTextArea quantextArea = new JTextArea();
		quantextArea.setFont(new Font("Bookman Old Style", Font.ITALIC, 17));
		quantextArea.setBackground(new Color(255, 250, 250));
		quantextArea.setBounds(569, 98, 114, 354);
		fifthframe.getContentPane().add(quantextArea);
		
		 Scanner file = new Scanner(new  FileReader("bill.txt"));
		 PrintWriter pw2 = new PrintWriter(new FileWriter("work.txt",false));
			  PrintWriter pw = new PrintWriter(new FileWriter("workk.txt",false));
			  PrintWriter pw1 = new PrintWriter(new FileWriter("workk1.txt",false));
			  
			  Scanner file2 = new Scanner(new  FileReader("pax1.txt"));
			  List<String> names = new ArrayList<String>();
			  List<Integer> cost = new ArrayList<Integer>();
			  List<Integer> quan = new ArrayList<Integer>();
			  List<Integer> quan1 = new ArrayList<Integer>();
			  List<String> quan3 = new ArrayList<String>();
			  
		JButton beforebillbtn = new JButton("INITIAL DATA");
		beforebillbtn.setFont(new Font("Algerian", Font.BOLD, 12));
		beforebillbtn.setBackground(new Color(255, 182, 193));
		beforebillbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			     String filename ="pax1.txt";
			    FileReader reader;
				
					FileReader readTextFile;
					try {
						readTextFile = new FileReader("pax1.txt");
					

					 
					  Scanner fileReaderScan=new Scanner(readTextFile);
					  String storeAllString="";
					  String storeAllString1="";
					  String storeAllString2="";
					  while(fileReaderScan.hasNextLine())
					  {
					   String temp=fileReaderScan.nextLine();
					   String temp1=fileReaderScan.nextLine();
					   String temp2=fileReaderScan.nextLine();
					   
					   storeAllString=storeAllString+"\n"+temp;
					   storeAllString1=storeAllString1+"\n"+temp1;
					   
					  }
					  nametextArea.setText(storeAllString+"  ");
					  quantextArea.setText(storeAllString1+"  ");
					 
					  
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		beforebillbtn.setBounds(0, 117, 175, 32);
		fifthframe.getContentPane().add(beforebillbtn);
		
		JButton afterbillbtn = new JButton("AFTER SCANNING");
		afterbillbtn.setBackground(new Color(255, 192, 203));
		afterbillbtn.setFont(new Font("Algerian", Font.BOLD, 12));
		afterbillbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hope;
				while (file.hasNext())
				  {
				            
				      names.add(file.next());
				      quan.add(file.nextInt()); 
				      cost.add(file.nextInt()); 
				              
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
							 nametextArea.setText(namework+"  ");
						//	 System.out.print(n1 + "    " ); 
							pw.println (n1 + "" );
							 
							}catch(Exception e1)
							{
								System.out.println("\nERROR ");
							}
				 		 }	
					 
					
						// System.out.println();
					//	 System.out.println();
						 String hope1 =" ";
									for (Integer q: quan)
										
									{
										
							  for (Integer quan2: quan1)
							 {       
							 
								  hope = quan2-q;
								   hope1 = hope1+"\n"+hope;
								      quantextArea.setText(hope1+"\t  ");
						          //  System.out.print( hope + "  \t"  );
						        
						          pw1.println(hope+ "");
						         
						  
							 }
						 	}
											 
									 pw.close();
								 pw1.close();
					//file2.close();
								 for (Integer c: cost)
										
									{
									 pw2.println(c+ "");
									}
								 pw2.close();
				
			}
		});
		afterbillbtn.setBounds(0, 227, 169, 32);
		fifthframe.getContentPane().add(afterbillbtn);
		
		JButton homebtn = new JButton("HOME");
		homebtn.setBackground(new Color(255, 182, 193));
		homebtn.setFont(new Font("Algerian", Font.BOLD, 14));
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 homepage obj;
					obj = new homepage();
					obj.secframe.setVisible(true);
					 
					fifthframe.dispose();
			}
			
		});
		homebtn.setBounds(10, 18, 90, 32);
		fifthframe.getContentPane().add(homebtn);
		
		JButton dataanalysis = new JButton("DATA ANALYSIS");
		dataanalysis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				 sugg obj;
					
						obj = new sugg();
					
					obj.fifth1frame.setVisible(true);
					 
					fifthframe.dispose();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		JLabel lblNewLabel = new JLabel("  NAME");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 25));
		lblNewLabel.setBounds(414, 50, 114, 37);
		fifthframe.getContentPane().add(lblNewLabel);
		
		dataanalysis.setBackground(new Color(255, 182, 193));
		dataanalysis.setForeground(new Color(0, 0, 0));
		dataanalysis.setFont(new Font("Algerian", Font.BOLD, 12));
		dataanalysis.setBounds(11, 333, 161, 23);
		fifthframe.getContentPane().add(dataanalysis);
		
		JLabel lblNewLabel_1 = new JLabel("QUANTITY");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 25));
		lblNewLabel_1.setBounds(557, 50, 126, 37);
		fifthframe.getContentPane().add(lblNewLabel_1);
		
		JLabel trackbg = new JLabel("New label");
		trackbg.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 12));
		trackbg.setBackground(new Color(230, 230, 250));
		trackbg.setIcon(new ImageIcon("C:\\Users\\prakr\\OneDrive\\Pictures\\tracking.png"));
		trackbg.setBounds(0, -75, 1113, 709);
		fifthframe.getContentPane().add(trackbg);
		
	
		
	}
}
