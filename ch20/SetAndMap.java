import java.util.*;
import java.io.*;

public class SetAndMap {
    public static void main(String[] args)
    {
        Set<Integer> ints = new HashSet<Integer>();
        
        for (int k=0; k<20; k++) {
            ints.add( (int) (Math.random() * 1000000));
        }
        
        for (Integer x : ints) {
            System.out.println(x);
        }
            
        
        Map<String, Integer> w = new TreeMap<String,Integer>();
        
        w.put("Word one",1);
        w.put("Longer word",5);
        w.put("Immense vocabulary",10);
        w.put("Supercalifragilisticexpialidocious",100);
        
        for (String word : w.keySet()) {
            System.out.println(word + "--->" + w.get(word));
        }
        
        
    }
    
}