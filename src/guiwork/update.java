package guiwork;

import java.awt.EventQueue;
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
import javax.swing.JTextField;
import javax.swing.JButton;

public class update {

	private JFrame frame;
	private JTextField name;
	private JTextField quan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update window = new update();
					window.frame.setVisible(true);
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
	public update() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		 Scanner file = new Scanner(new  FileReader("bill1.txt"));
		 PrintWriter pw = new PrintWriter(new FileWriter("workk.txt",false));
			  Scanner file2 = new Scanner(new  FileReader("pax1.txt"));
			  List<String> names = new ArrayList<String>();
			 
			  		  List<Integer> quan1 = new ArrayList<Integer>();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		name = new JTextField();
		name.setBounds(26, 68, 96, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		quan = new JTextField();
		quan.setBounds(26, 100, 96, 20);
		frame.getContentPane().add(quan);
		quan.setColumns(10);
		
		JButton update = new JButton("New button");
		update.setBounds(164, 78, 89, 23);
		frame.getContentPane().add(update);
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n =name.getText();
				int q =Integer.parseInt(quan.getText());
				
							try {  
							 while (file2.hasNext())
							  {
							if( file2.next().equalsIgnoreCase(n))
							  { 
								quan1.add(file2.nextInt());
								
							  }
							
							  } 
							
							 
							}catch(Exception e1)
							{
								System.out.println("\nERROR ");
							}
				 		 
			}
		});
		
	}
}
