import java.lang.*;
import java.util.*;

/* JUnit test boilerplate. I just copy and paste this in. */
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class CharMatrixTester
{
    public CharMatrix ex1, ex2;

    @Before
    public void build() {
        ex1 = new CharMatrix(5,9);
        ex2 = new CharMatrix(8,4,'x');
    }

    @Test
    public void testNumRowsNumCols() {
        assertEquals(5,ex1.numRows());
        assertEquals(8,ex2.numRows());
        assertEquals(9,ex1.numCols());
        assertEquals(4,ex2.numCols());
    }

    @Test
    public void testCharAt() {
        assertEquals('x',ex2.charAt(3,2));
        assertEquals(' ',ex1.charAt(1,6));
    }

    @Test
    public void testSetAndGet() {
        assertEquals('x',ex2.charAt(0,0));
        ex2.setCharAt(0,0,'w');
        assertEquals('w',ex2.charAt(0,0));
        assertEquals('x',ex2.charAt(0,1));
    }

    @Test
    public void testEmpty() {
        assertTrue(ex1.isEmpty(0,0));
        assertFalse(ex2.isEmpty(0,0));
        ex2.setCharAt(0,0,' ');
        assertTrue(ex2.isEmpty(0,0));
        assertFalse(ex2.isEmpty(0,1));
    }

    @Test
    public void testCountInRowCol() {
        assertEquals(0, ex1.countInRow(1));
        assertEquals(0, ex1.countInCol(1));
        assertEquals(8, ex2.countInRow(1));
        assertEquals(4, ex2.countInCol(1));
    }

    @Test
    public void testClearRect1() {
        ex2.clearRect(0,0,7,3);
        for (int r=0; r<4; r++) {
            assertEquals(0, ex2.countInRow(r));
        }
    }

    @Test
    public void testClearRect2() {
        ex2.clearRect(5,3,7,3);
        assertEquals(5,ex2.countInRow(6));
        assertEquals(8,ex2.countInRow(2));
        assertEquals(4,ex2.countInCol(2));
        assertEquals(3,ex2.countInCol(3));
    }

    @Test
    public void testFillRect1() {
        ex1.fillRect(4,3,5,8,'*');
        assertEquals('*',ex1.charAt(4,7));
        assertEquals(5,ex1.countInRow(4));
        assertEquals(5,ex1.countInCol(2));
        assertEquals(3,ex1.countInCol(6));
    }
}
