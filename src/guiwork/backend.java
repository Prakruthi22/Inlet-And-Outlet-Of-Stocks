package guiwork;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class backend {
	
	static List<Integer> quan = new ArrayList<Integer>();
	static int hope;
	static int count=0;
		static int p()
		{  
			
			
			
			return 0;	  
		
		}  

	public static void main(String args[]) throws IOException
	
			{
	 try
	 {
	  // Open the file
	  Scanner file = new Scanner(new  FileReader("bill.txt"));
	
	 backend e= new backend();
	  List<String> names = new ArrayList<String>();
	  List<String> name1 = new ArrayList<String>();
	  int result ;
	  List<Integer> quan1 = new ArrayList<Integer>();
	  List<Integer> quan3 = new ArrayList<Integer>();
	  
	  // Skip column headings.

	  // Read each line, ensuring correct format.
	  while (file.hasNext())
	  {
	             // read and skip 'id'
	      names.add(file.next());
	      quan.add(file.nextInt()); 
	      file.nextInt();         // read and skip 'age'
	  }
	 	
			 for (String name2: names)
	 		 {
				 
				
				 System.out.println(name2 + "  " );
	 		 }
			 
			
	
			for (Integer quan4:quan)
			 {  	
			System.out.print( quan4 +"  \t ");
			 }
			
	 }  catch(FileNotFoundException e)
	 {
	  System.out.println("\nERROR : File not Found !!!");
	 }
	}
	
	
	}
