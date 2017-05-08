import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;
import org.junit.Test;


public class CalculatorTest extends TestJPF {


    public static void main(String[] args) {
        runTestsOfThisClass(args);
    }


    @Test
    public void testAdd() {
        if (verifyNoPropertyViolation()) {
            int a = Verify.getInt(1, 2);
            int b = Verify.getInt(5, 8);
            int c = new Calculator().add(a, b);
            assertTrue(c >= 6 && c <= 10);
        }
    }

    @Test
    public void testAdd1() {
        if (verifyNoPropertyViolation()) {
            int a = Verify.getInt(1, 3);
            int b = Verify.getInt(5, 8);
            int c = new Calculator().add(a, b);
            assertTrue(c >= 6 && c <= 10);
        }
    }
}
