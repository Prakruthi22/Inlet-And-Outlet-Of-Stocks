package guiwork;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class view {

	JFrame fourframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
					window.fourframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public view()throws IOException  {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()throws IOException  {
		fourframe = new JFrame();
	
		
        
		     String filename ="pax1.txt";
		    FileReader reader;
			try {
			
				FileReader readTextFile=new FileReader("pax1.txt");

				 
				  Scanner fileReaderScan=new Scanner(readTextFile);
				  String storeAllString="";
				
				  while(fileReaderScan.hasNextLine())
				  {
				   String temp=fileReaderScan.nextLine();
				   String temp1=fileReaderScan.nextLine();
				   String temp2=fileReaderScan.nextLine();
				   
				   storeAllString=storeAllString+temp+"        \t|"+temp1+"\t|   "+temp2+"\n";
				  
				  }

				  JTextArea viewtextArea=new JTextArea(" -------------------------------------------------------------------------------------------------------------------------------------------------\n\n    Name                \t| quantity          \t| cost\n\n -------------------------------------------------------------------------------------------------------------------------------------------------\n\n"+storeAllString+" ---------------------------------------------------------------------------------------------------------------------------------------------------");
				  viewtextArea.setColumns(2);
				  viewtextArea.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 12));
				  viewtextArea.setForeground(new Color(245, 255, 250));
				  viewtextArea.setBackground(new Color(0, 0, 51));
				 
				  viewtextArea.setLineWrap(true);
				  
				  viewtextArea.setWrapStyleWord(true);
				 
				  JScrollPane scrollBarForTextArea=new JScrollPane(viewtextArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				  scrollBarForTextArea.setBounds(0, 0, 563, 553);
				  JFrame fourframe=new JFrame("Your details are");
				  fourframe.setBackground(new Color(240, 255, 255));
				  	  fourframe.getContentPane().setLayout(null);
				 
				 
				  	  fourframe.getContentPane().add(scrollBarForTextArea);
				  	  
				  	  JButton homebtn = new JButton("H\nO\nM\r\nE");
				  	  homebtn.setFont(new Font("Algerian", Font.BOLD, 14));
				  	  homebtn.setBackground(new Color(175, 238, 238));
				  	homebtn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
						
							 homepage obj;
								obj = new homepage();
								obj.secframe.setVisible(true);
								 
								fourframe.dispose();
						}
						
					});
				  	  scrollBarForTextArea.setRowHeaderView(homebtn);
				 	fourframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 
				  
				  fourframe.setSize(577,590);
				 
				  fourframe.setLocationRelativeTo(null);
				  fourframe.setVisible(true);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
		
	}

	private Container getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}
}
