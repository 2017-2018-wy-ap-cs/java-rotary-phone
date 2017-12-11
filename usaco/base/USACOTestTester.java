import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class USACOTestTester
{
    @Test
    public void test_usaco_tester() throws IOException
    {
        USACOTest x = new USACOTest(new USACODummyProblem(15),
                                    new USACOResultLoaderTrivial(15));

        int want = x.getExpected(3);
        assertEquals(15,want);
        assertEquals("13.in",x.getInputFilename(13));
        assertEquals("14.out",x.getExpectedFilename(14));
        x.doTest(10);
    }

    // Failure expected
    @Test(expected = AssertionError.class)
    public void test_usaco_test_for_failures() throws IOException
    {
        USACOTest x = new USACOTest(new USACODummyProblem(15),
                                    new USACOResultLoaderTrivial(21));

        x.doTest(11);
    }

}