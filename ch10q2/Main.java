import org.junit.*;
import static org.junit.Assert.*;
import junit.runner.Version;

public class Main {
  public static void main (String[] args) {
    System.err.println("You should just hit the [Test Project] button in DrJava.");
    System.err.println("JUnit version is: " + Version.id());
    org.junit.runner.JUnitCore.main("HospitalTest");
  }
// Put your code in the Hospital.java file.
}
