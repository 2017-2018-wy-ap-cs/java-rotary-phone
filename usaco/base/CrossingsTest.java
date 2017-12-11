/* Standard */
import java.io.*;
import org.junit.*;

/* For Parameterized  */
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CrossingsTest extends USACOTest
{
    int testNumber;
    private static int NUM_TESTS = 15;

    public CrossingsTest(int testNumber)
    {
        super(new TrackCrossings());
        setDirectory("data\\");
        this.testNumber = testNumber;
    }

    @Parameters
    public static Collection<Object[]> generateParameters() {
        return generateTestList(NUM_TESTS);
    }

    // Is there a way for the tests to be specified in the superclass?
    // USACOTest?
    @Test
    public void do_test() throws IOException
    {
        super.doTest(testNumber);
    }
}
