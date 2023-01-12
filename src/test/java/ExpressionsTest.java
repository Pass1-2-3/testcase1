
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExpressionsTest {
    static Expressions e;
    @BeforeClass
    public static void setUp(){
        e = new Expressions();
    }

    /**
     * If input is true, then returnBoolean(input) should return true.
     */
    @Test
    public void returnBooleanTest1(){
        boolean input = true;
        boolean actual = e.returnBoolean(input);
        Assert.assertTrue(actual);
    }

    /**
     * If input is false, then returnBoolean(input) should return false.
     */
    @Test
    public void returnBooleanTest2(){
        boolean input = false;
        boolean actual = e.returnBoolean(input);
        Assert.assertFalse(actual);
    }

    /**
     * If input is true, then returnNot(input) should return false.
     */
}