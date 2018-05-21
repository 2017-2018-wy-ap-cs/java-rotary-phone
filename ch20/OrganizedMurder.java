import java.util.*;
import java.io.*;

public class OrganizedMurder {

    public static String cleanup (String in)
    {
        String tmp = in.replaceAll("'-","");
        String out = tmp.replaceAll("[^a-zA-Z]", "");
        return out;
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        Map<String, Integer> wordcount = new HashMap<String,Integer>();
        
        Scanner s = new Scanner((new File("bayonet.txt")));
        
        while(s.hasNext())
        {
            String word = s.next().toLowerCase();
            word = cleanup(word);
           
            if ( wordcount.containsKey(word) ) {
                int oldcount = wordcount.get(word);
                wordcount.put( word, oldcount + 1);
            } else {
                wordcount.put( word, 1 );
            }
        }
        
        s.close();
        
        int k = 200;
        for ( String t : wordcount.keySet() ) {
            System.out.println( t + " : " + wordcount.get(t) );
            k--;
            if (k <= 0) break;
        }
        
    }
    
}