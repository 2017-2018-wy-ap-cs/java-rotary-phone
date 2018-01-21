import java.lang.*;
import java.util.*;

/* JUnit Boilerplate (copy and paste) */
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/* Note: DrJava has JUnit 4.7 bundled. (Current is 4.12) */

public class BatteryTest {
  
  @Test
  public void isChargeNonNegative() {
    Battery x = new Battery(200,1000);
    assertTrue( x.get_charge() >= 0);
  }
  
  @Test
  public void charge_ok() {
    Battery x = new Battery(200,1000);
    assertEquals(200.0, x.get_charge(), 0.01);
  }
  
  
  
  
  
  
  
  
  private Battery b;
  private Battery d;
  
  @Before
  public void setup() {
    b = new Battery(2100, 2200);
    d = new Battery(500, 2800);
  }
  
  @Test
  public void test_constructor() {
    double margin_of_error = 0.1;
    assertEquals(2100, b.get_charge(), 0.1);
    assertEquals(2200, b.get_max_charge(), 0.1);
    
    assertEquals(2800, d.get_max_charge(), 0.1);
  }
  
  @Test 
  public void is_negative_charge_ok() {
    Battery c = new Battery (-100,0);
    assertEquals(0, c.get_charge(), 0.1);
  }
  
  @Test
  public void test_recharge() {
    Battery x = new Battery(100,2200);
    assertEquals(100, x.get_charge(), 0.1);
    x.recharge();
    assertEquals(2200, x.get_charge(), 0.1);
  }
  
}