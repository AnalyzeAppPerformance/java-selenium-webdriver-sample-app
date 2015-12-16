package application;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * Created by student03 on 15.12.15.
 */
public class StringOperatorTest {

    private static StringOperator stringOperator;

    @BeforeClass
    public static void setUP() {
        stringOperator = new StringOperator();
        System.out.println("Testing 'StringOperator' started\n");
        }

    @Test
    public void test() {
        Assert.assertNotNull(stringOperator);
        Assert.assertEquals("Ala", StringOperator.firstLetterToUpperCase("ala"));
        Assert.assertTrue("No number!", StringOperator.isAnyDigitCharacter("asdad1"));
    }


    @AfterClass
    public static void tearDown() {
        System.out.println("Testing 'StringOperator' finished");
    }
}
