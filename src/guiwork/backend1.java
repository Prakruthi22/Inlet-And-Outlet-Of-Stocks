package guiwork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class backend1 {
   public static void main(String args[]) throws IOException {
      Scanner sc1 = new Scanner(new File("workk.txt"));
      Scanner sc2 = new Scanner(new File("workk1.txt"));
      Scanner sc3 = new Scanner(new File("work.txt"));
      FileWriter writer = new FileWriter("result.txt");
      String str[] = new String[3];
      while (sc1.hasNextLine()||sc2.hasNextLine()||sc3.hasNextLine()) {
         str[0] = sc1.nextLine();
         str[1] = sc2.nextLine();
         str[2] = sc3.nextLine();
         writer.append(str[0]+"\n");
         writer.append(str[1]+"\n");
         writer.append(str[2]+"\n");
      }
      
      writer.flush();
      System.out.println("Contents added ");
   }
}