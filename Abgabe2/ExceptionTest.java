import junit.framework.TestCase;
import org.junit.Test;

public class ExceptionTest extends TestCase {

    /*
    @Test (expected = IllegalArgumentException.class)
    public void testAdd() {
        Taschenrechner.add("ersteEingabe", "zweiteEinagbe");
    }
    */

    @org.junit.Test (expected = ArithmeticException.class)
    public void testDiv() {
        Taschenrechner.div(3,0);
    }

}
