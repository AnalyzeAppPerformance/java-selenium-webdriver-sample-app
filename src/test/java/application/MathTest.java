package application;

/**
 * Created by student03 on 15.12.15.
 */
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class MathTest {

    private static MathProvider mathProvider;

    @BeforeClass
    public static void setUP()

    {
        mathProvider = new MathProvider();
        System.out.println("Testing started\n");
    }


    @Test
    @Parameters({"first", "second"})
    public void subtractTest(String first, String second)

    {

       Assert.assertEquals(-11, mathProvider.subtract(Integer.parseInt(first),Integer.parseInt(second)));
    }

    @Test
    @Parameters({"first", "second"})
    public void addTest(String first, String second)

    {
     Assert.assertEquals(31, mathProvider.add(Integer.parseInt(first),Integer.parseInt(second)));
    }

    @Test
    @Parameters({"first", "second"})
    public void multiplyTest(String first, String second)

    {
        Assert.assertEquals(210, mathProvider.multiply(Integer.parseInt(first),Integer.parseInt(second)));
    }
    @AfterClass
    public static void tearDown()

    {
        System.out.println("Testing finished");
    }
}

