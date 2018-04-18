import java.io.*;
import java.util.*;

public class MakeAFile {
 
  public static void makefile() throws Exception
  {
    File f = new File("demo1.txt");
    PrintWriter output = new PrintWriter(f);
    
    output.println("Docmo was here");
    output.close();
  }
  
  public static int countLines(File f) throws FileNotFoundException
  {
    Scanner s = new Scanner(f);
    int count = 0;
    
    while( s.hasNextLine() ) {
      String oneline = s.nextLine();
      count += 1;
    }
    return count;
  }
  
  public static void main (String[] args) throws Exception
  {
    File f = new File("numberthis.txt");
    System.out.println( countLines(f) );
  }
  
  /* ASSIGNMENT ONE:
   * Read a file, 
   * print out each line with the line number that comes with it.
   */

}