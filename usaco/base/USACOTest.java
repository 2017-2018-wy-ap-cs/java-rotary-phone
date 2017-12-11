/* See bottom for sample use code */

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.util.Collection;
import java.util.ArrayList;

public class USACOTest
{
    public String baseDir;
    public USACOProblem theProblem;
    public USACOResultLoader resultLoader;

    /* This is so clients can run @Parameterized tests easily. */
    public static Collection<Object[]> generateTestList(int highest_test)
    {
        ArrayList<Object[]> testNumbers = new ArrayList<Object[]>();
        for (int k=1; k <= highest_test; k++) {
            testNumbers.add(new Object[]{k});
        }
        return testNumbers;
    }

    public USACOTest(USACOProblem theProb)
    {
        this(theProb, new USACOResultLoaderFile());
    }

    public USACOTest(USACOProblem theProb, USACOResultLoader theResultLoader)
    {
        this(theProb, theResultLoader, "");
    }

    public USACOTest(USACOProblem theProb,
                     USACOResultLoader theResultLoader,
                     String directory)
    {
        baseDir = directory;
        theProblem = theProb;
        resultLoader = theResultLoader;
    }

    public void setDirectory (String theBase)
    {
        baseDir = theBase;
    }

    public String getDirectory()
    {
        return baseDir;
    }

    public String getInputFilename(int num)
    {
        return getDirectory() + num + ".in";
    }

    public String getExpectedFilename(int num)
    {
        return getDirectory() + num + ".out";
    }

    public int getExpected(int num) throws IOException
    {
        return resultLoader.getExpected(getExpectedFilename(num));
    }

    public void doTest(int num) throws IOException
    {
        int expected = getExpected(num);
        theProblem.readFile(getInputFilename(num));
        int actual = theProblem.computeResult();
        assertEquals("USACO Testcase #"+num,expected,actual);
    }
}

/**
// Standard
import java.io.*;
import org.junit.*;

// For Parameterized
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CrossingsTest extends USACOTest
{
    int testNumber;

    public CrossingsTest(int testNumber)
    {
        super(new TrackCrossings());
        setDirectory("Crossings-Test\\");
        this.testNumber = testNumber;
    }

    @Parameters
    public static Collection<Object[]> generateParameters() {
        return USACOTest.generateTestList(15);
    }

    @Test
    public void do_test() throws IOException
    {
        doTest(testNumber);
    }
}
*/
