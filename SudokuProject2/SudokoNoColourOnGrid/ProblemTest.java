
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProblemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProblemTest
{
    /**
     * Default constructor for test class ProblemTest
     */
    public ProblemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Test1()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.usedInRow(0, 0));                
    }

    @Test
    public void Test2()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInRow(1, 11));                
    }

    @Test
    public void Test3()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInRow(9, 11));               
    }

    @Test
    public void Test4()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInRow(7, 25));                
    }

    @Test
    public void Test5()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInRow(1, 80));                
    }

    @Test
    public void Test6()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInRow(4, 1));                
    }

    @Test
    public void Test7()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.usedInRow(0, 40));                
    }

    @Test
    public void Test8()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInRow(1, 81));                
    }

    @Test
    public void Test9()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInRow(9, -1));               
    }

    @Test
    public void Test10()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.usedInCol(0, 0));                
    }

    @Test
    public void Test11()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInCol(1, 11));                
    }

    @Test
    public void Test12()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInCol(9, 11));               
    }

    @Test
    public void Test13()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInCol(7, 25));                
    }

    @Test
    public void Test14()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.usedInCol(0, 80));                
    }

    @Test
    public void Test15()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInCol(4, 1));                
    }

    @Test
    public void Test16()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.usedInCol(0, 40));                
    }

    @Test
    public void Test17()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInCol(1, 81));                
    }

    @Test
    public void Test18()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.usedInBlock(0, 0));                
    }

    @Test
    public void Test19()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInBlock(1, 11));                
    }

    @Test
    public void Test20()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInBlock(9, 11));               
    }

    @Test
    public void Test21()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInBlock(7, 25));                
    }

    @Test
    public void Test22()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInBlock(1, 80));                
    }

    @Test
    public void Test23()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInBlock(4, 1));                
    }

    @Test
    public void Test24()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.usedInBlock(0, 40));                
    }

    @Test
    public void Test25()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInBlock(1, 81));                
    }

    @Test
    public void Test26()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.usedInBlock(0, 0));                
    }

    @Test
    public void Test27()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.usedInBlock(1, 11));                
    }

    @Test
    public void Test28()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.numberNotUsed(9, 11));               
    }

    @Test
    public void Test29()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.numberNotUsed(7, 25));                
    }

    @Test
    public void Test30()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.numberNotUsed(1, 80));                
    }

    @Test
    public void Test31()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.numberNotUsed(4, 1));                
    }

    @Test
    public void Test32()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.numberNotUsed(0, 40));                
    }

    @Test
    public void Test33()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.numberNotUsed(1, 81));                
    }

    @Test
    public void Test34()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.validEntry("1", 80));                
    }

    @Test
    public void Test35()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.validEntry("0", 50));                
    }

    @Test
    public void Test36()
    {
        Problem problem2 = new Problem();
        assertEquals(true, problem2.validEntry("5", 6));                
    }

    @Test
    public void Test37()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.validEntry("10", 10));                
    }

    @Test
    public void Test38()
    {
        Problem problem2 = new Problem();
        assertEquals(false, problem2.validEntry("-1", 10));                
    }

}
