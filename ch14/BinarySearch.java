import java.util.*;

public class BinarySearch {
  
  public static int binarySearch(ArrayList<String> data, 
                                 String wanted)
    
  {
    int NOT_FOUND = -1;
    
    int left = 0;
    int right = data.size(); // note: one past the end
    int mid;
    
    boolean found = false;
    
    while (! found) {
      mid = (left + right)/2;
      
      System.out.println("Looking at ["+left+","+right+") mid = "+mid);
      
      if (right <= left) {
        return NOT_FOUND;
      }
      
      String midItem = data.get(mid);
      
      if (midItem.equals(wanted)) {
        return mid;
      }
      
      int compare = midItem.compareTo(wanted);
      
      if ( compare <  0 ) {
        // midItem is smaller than wanted
        left = mid + 1;
      } else /* ( compare > 0 ) */ {
        // midItem is larger than wanted
        right = mid;
      }
    }
    return NOT_FOUND;
  }
  
  public static void main(String[] args)
  {
    ArrayList<String> example = new ArrayList<>();
    example.add("anne");
    example.add("betty");
    example.add("clyde");
    
    System.out.println(binarySearch(example,"betty"));
    System.out.println(binarySearch(example,"anne"));
    System.out.println(binarySearch(example,"clyde"));
    System.out.println(binarySearch(example,"infinite loop"));
    System.out.println(binarySearch(example,"b hard to find infinite loop"));
    System.out.println(binarySearch(example,"aardvark is hiding"));
  }
}
