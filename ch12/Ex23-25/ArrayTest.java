import java.lang.*;
import java.util.*;

/* JUnit test boilerplate. I just copy and paste this in. */
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class ArrayTest {
  
  int[] a;
  
  @Before
  public void setup() {
    a = new int[]{1,2,3,4,5,6};
  }
  
  @Test 
  public void test_rot1() {
    int b[] = {2,3,4,5,6,1};
    assertArrayEquals(b, Rotate.rotateLeft(a));
  }
  
  @Test 
  public void test_rotVoid() {
    int[] answer = {2,3,4,5,6,1};
    Rotate.rotateLeftVoid(a);
    assertArrayEquals(answer, a);
  }
}

