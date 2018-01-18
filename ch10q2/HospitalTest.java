import java.lang.*;
import java.util.*;

/* JUnit Boilerplate (copy and paste) */
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/* Note: DrJava has JUnit 4.7 bundled. (Current is 4.13) */

@RunWith(Parameterized.class)
public class HospitalTest {
    private String data;
    private int secs;
    private int correct;
    
    public HospitalTest(String data, int secs, int correct) {
        this.data = data;
        this.secs = secs;
        this.correct = correct;
    }
    
    //@Parameterized.Parameters
    // wish DrJava did not have JUnit 4.7 ugh
    @Parameters //(name = "{index}: analyze({0},{1}) = {2}")
    public static Collection testData() {
        
        // Numbered from 0
        return Arrays.asList(new Object[][]{
          // first item is [0]
                {"hii",1,0},
                {"hihihihi",15,1},
                {"hiihiihii",10,2},
                {"iiihiiiiiiiiiiiiiiiiiiiihiiihiihiihii",15,0}
                
                // data, time(secs), state(0=good,1=yellow,2=red alert)
            });
    }
    
    @Test
    public void testHospital() {
        assertEquals(String.format("analyze(\"%s\",%d)",data,secs),
                     correct, Hospital.analyze(data,secs));
    }
}
