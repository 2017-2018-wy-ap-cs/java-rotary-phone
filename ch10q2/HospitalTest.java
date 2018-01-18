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
          //    { data, secs, correct_answer }
                {"hii",1,0}, // 60 bpm, iv rate 2 = good
                {"hi",60,2},     // one beat per minute?!
                {"hhii",2,1},   // 60 bpm, but iv rate is 1.0 = too low
                {"iihiih",2,0}, // 60 bpm, iv rate 2 = good
                {"hhiii",2,0},   // 60 bpm, iv rate 1.5 = good
                {"hhhiiii",2,1}, // iv rate is 4/3 about 1.3 = too low
                {"hihihihihi",5,1}, // 60bpm, iv rate 1 = too low
                {"hihihihi",5,2}, // 48bpm = alert!
                {"hiihiihiihii",6,2}, // 40 bpm = alert!
                {"hiii",1,0}, // 60 bpm, iv rate 3 = ok
                {"iiihiiiiiiiiiiiiiiiiiiiihiiihiihiihiihii",4,0}, // 60bpm,iv 2
                {"hiiiihhiiii",1,0}, // "hii" 60bpm, iv 2 = good
                {"iiihhiiihhiiihhiii",2,1}, // "hh" 60 mpb iv 0 = yellow alert
                // data, time(secs), state(0=good,1=yellow,2=red alert)
            });
    }
    
    @Test
    public void testHospital() {
        assertEquals(String.format("analyze(\"%s\",%d)",data,secs),
                     correct, Hospital.analyze(data,secs));
    }
}
