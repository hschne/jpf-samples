import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;
import org.junit.Test;

public class RingBufferTest extends TestJPF {

    /**
     * A simple JUnit JPF test case.
     * In order to make this fail comment, for example, line 41 in RingBuffer (N--).
     */
    @Test
    public void testRingBufferOverflow() {
        if (verifyNoPropertyViolation("search.multiple_errors=true")) {
            int capacity = 3;
            RingBuffer<Integer> ringBuffer = new RingBuffer<>(capacity);
            int i = 0;
            int enqueue = 0;
            int dequeue = 0;
            while (i < 5) {
                if (Verify.getBoolean()) {
                    //Branches known to cause exceptions are eliminated
                    Verify.ignoreIf(enqueue - dequeue >= capacity);
                    ringBuffer.enqueue(1);
                    enqueue++;
                } else {
                    //Branches known to cause exceptions are eliminated
                    Verify.ignoreIf(enqueue <= dequeue);
                    ringBuffer.dequeue();
                    dequeue++;
                }
                i++;
            }
        }
    }

}
