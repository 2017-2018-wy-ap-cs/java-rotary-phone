import java.lang.*;
import java.util.*;

/*
 * Battery: 
 * has current charge, max charge (2200 mAh)
 * 
 * methods:
 * recharge()
 * discharge (double mAh)
 * 
 * 
 *
 */








public class Battery {
  
  private double current_charge;
  private double max_charge;

  public Battery(double current_charge, double max_charge) {
    this.current_charge = current_charge;
    this.max_charge = max_charge;
  }
  
  public double get_charge() {
    return current_charge;
  }
  
  public double get_max_charge() {
    return max_charge;
  }
  
  public void recharge() { 
    current_charge = max_charge;
  }
  
    
    
    
  
  
  
}

