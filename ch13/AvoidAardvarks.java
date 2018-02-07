import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class AvoidAardvarks {
  public void 
    aa(ArrayList<String> input) {
    input.add(0,"avoid");
    // work
  }
  
  @Test
  public void test_1 () {
    ArrayList<String> answer = 
      new ArrayList<>();
    
    answer.add("avoid");
    answer.add("aardvark");
    
    ArrayList<String> input = 
      new ArrayList<>();
    input.add("aardvark");
    
    // call the function
    aa(input);
    
    assertArrayEquals(answer.toArray(), input.toArray());    
  }
  
}